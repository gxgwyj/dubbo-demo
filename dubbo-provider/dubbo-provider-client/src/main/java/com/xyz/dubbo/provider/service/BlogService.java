package com.xyz.dubbo.provider.service;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 21:05
 * @description 文章服务
 */
public interface BlogService {
    /**
     * 获取文章
     * @param id
     * @return
     */
    public String queryBlogById(String id);
}
