package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.service.AsyncService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service(value = "asyncService")
public class AsyncServiceImpl implements AsyncService {
    @Override
    public CompletableFuture<String> login(String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "async login from " + name;
        });
    }
}
