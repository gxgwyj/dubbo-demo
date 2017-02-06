package com.xinguoren.coolpen.cloud.web.app;

import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

public class ReceiveDirect {
	private static String USER_NAME = "guest";
	private static String PASS_WORD = "guest";
	private static String HOST = "182.92.99.12";
	private static int PORT = 5672;
	private static String EXCHANGE_NAME = "temp_direct";//生产者
	
	private static final String[] TYPE = { "info", "warning", "error" };  
	
	public static void main(String[] args) throws Exception, NoSuchAlgorithmException, URISyntaxException{
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUsername(USER_NAME);
		factory.setPassword(PASS_WORD);
		factory.setHost(HOST);
		factory.setPort(PORT);
		Connection conn = factory.newConnection();
		final  Channel channel = conn.createChannel();
		// 声明转发器的类型
		channel.exchangeDeclare(EXCHANGE_NAME, "direct", true);
		//发送6条消息    
        for (int i = 0; i <TYPE.length; i++)    
        {    
        	//持久化  
            channel.queueDeclare(TYPE[i], true, false, false, null);  
            //流量控制  
            channel.basicQos(1);  
            //将消息队列绑定到Exchange  
            channel.queueBind(TYPE[i], EXCHANGE_NAME, TYPE[i]);  
            System.out.println("队列" + TYPE[i] + "绑定成功！");  
        }  
        for (int i = 0; i < TYPE.length; i++) {  
            final String queue = TYPE[i];  
            new Thread(){  
              public void run() {  
                try {  
                  receive(channel, queue);  
                } catch (Exception e) {  
                  e.printStackTrace();  
                }  
              }  
            }.start();  
          }  
      }    
	private static void receive(Channel channel,String QUEUE_NAME) throws Exception {  
	    // 声明消费者  
	    QueueingConsumer consumer = new QueueingConsumer(channel);  
	    channel.basicConsume(QUEUE_NAME, false, consumer);  
	    while (true) {  
	      // 等待队列推送消息  
	      QueueingConsumer.Delivery delivery = consumer.nextDelivery();  
	      String message = new String(delivery.getBody(), "UTF-8");  
	      System.out.println(QUEUE_NAME + " Received '" + message + "'");  
	      // 反馈给服务器表示收到信息  
	      channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);  
	    }  
}  
}
