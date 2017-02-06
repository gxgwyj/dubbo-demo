package com.xinguoren.coolpen.cloud.web.app;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMqClient {
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
		Channel channel = conn.createChannel();
		// 声明转发器的类型
		channel.exchangeDeclare(EXCHANGE_NAME, "direct", true);
		//发送6条消息    
        for (int i = 0; i <TYPE.length; i++)    
        {    
            String rand = getRandom();    
            String message = rand + "_log :" + UUID.randomUUID().toString();    
            //持久化  
            channel.queueDeclare(TYPE[i], true, false, false, null);  
            //流量  
            channel.basicQos(1);  
            //将消息队列绑定到Exchange  
            channel.queueBind(TYPE[i], EXCHANGE_NAME, TYPE[i]);  
            // 发布消息至转发器，指定routingkey    
            channel.basicPublish(EXCHANGE_NAME, TYPE[i], null, message    
                    .getBytes());    
            System.out.println("队列" + TYPE[i] + "绑定成功！");    
        }    
    
        channel.close();    
        conn.close();
		
	}
	
	  /**  
     * 随机产生一种日志类型  
     *   
     * @return  
     */    
    private static String getRandom()    
    {    
        Random random = new Random();    
        int ranVal = random.nextInt(3);    
        return TYPE[ranVal];    
    }  

}
