package com.xyz.dubbo.client.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xyz.dubbo.client.model.Blog;
import com.xyz.dubbo.client.service.api.BlogService;




public class LuncherConsumer  {
	public static void main(String[] args) throws InterruptedException{
		LuncherConsumer luncher=new LuncherConsumer();
		luncher.start();
	}
	
	
	void start(){
		String configLocation= "applicationContext-consumer.xml";
		ApplicationContext context =new  ClassPathXmlApplicationContext(configLocation);
		BlogService blogService= context.getBean(BlogService.class);
		String [] names=context.getBeanDefinitionNames();
		System.out.print("Beans:");
		for (String string : names) {
			System.out.print(string);
			System.out.print(",");
		}
		System.out.println();
		
		List<Blog> list = blogService.getAllBlogs();
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
	}
}

