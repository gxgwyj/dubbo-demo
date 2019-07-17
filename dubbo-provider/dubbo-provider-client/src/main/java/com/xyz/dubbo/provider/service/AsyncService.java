package com.xyz.dubbo.provider.service;

import java.util.concurrent.CompletableFuture;

/**
 * 异步调用接口
 */
public interface AsyncService {
    CompletableFuture<String> login(String name);
}
