package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.service.AsyncService;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.CompletableFuture;

public class AsyncServiceInvoke {
    public static void main(String[] args) {
        ApplicationContext context = MySpringContext.getAppContext();
        AsyncService asyncService = context.getBean(AsyncService.class); // 获取远程服务代理
        CompletableFuture<String> result = asyncService.login("zhangsan");
        // 添加回调
        result.whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("Response: " + v);
            }
        });
        // 早于结果输出
        System.out.println("Executed before response return.");

    }
}
