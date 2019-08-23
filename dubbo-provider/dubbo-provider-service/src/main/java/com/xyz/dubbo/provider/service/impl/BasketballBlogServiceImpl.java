package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 21:08
 * @description TODO
 */
@Service("basketballBlogService")
public class BasketballBlogServiceImpl implements BlogService {
    @Override
    public String queryBlogById(String id) {
        System.out.println("调用了1.0.0版本");
        return "1.0.0";
    }
}
