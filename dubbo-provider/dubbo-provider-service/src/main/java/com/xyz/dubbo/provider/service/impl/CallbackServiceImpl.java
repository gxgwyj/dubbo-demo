package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.service.CallbackListener;
import com.xyz.dubbo.provider.service.CallbackService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 22:25
 * @description TODO
 */
@Service("callbackService")
public class CallbackServiceImpl implements CallbackService {
    private final Map<String, CallbackListener> listeners = new ConcurrentHashMap<String, CallbackListener>();

    /**
     * 构造方法
     */
    public CallbackServiceImpl() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                // 开一个后台线程一直监听客户端的请求参数
                while(true) {
                    try {
                        for(Map.Entry<String, CallbackListener> entry : listeners.entrySet()){
                            try {
                                entry.getValue().changed(getChanged(entry.getKey()));
                            } catch (Throwable t) {
                                listeners.remove(entry.getKey());
                            }
                        }
                        Thread.sleep(5000); // 定时触发变更通知
                    } catch (Throwable t) { // 防御容错
                        t.printStackTrace();
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void addListener(String key, CallbackListener listener) {
        listeners.put(key, listener);
        listener.changed(getChanged(key)); // 发送变更通知
    }

    private String getChanged(String key) {
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
