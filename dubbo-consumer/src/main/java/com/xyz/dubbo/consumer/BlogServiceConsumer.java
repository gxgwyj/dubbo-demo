package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.service.BlogService;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 21:19
 * @description TODO
 */
public class BlogServiceConsumer {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = MySpringContext.getAppContext();
        BlogService blogService = (BlogService) context.getBean("blogService");
        System.out.println(blogService.queryBlogById("111"));
        System.in.read(); // 按任意键退出
    }
}
