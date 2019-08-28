package com.xyz.dubbo.provider.service.impl;

import org.apache.dubbo.rpc.service.GenericException;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.stereotype.Service;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 16:31
 * @description 服务端泛化接口的实现，主要实现dubbo提供的GenericService接口
 */
@Service("myGenericService")
public class MyGenericService implements GenericService {
    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        if ("sayHello".equals(method)) {
            return "Welcom" + args[0];
        }
        return null;
    }
}
