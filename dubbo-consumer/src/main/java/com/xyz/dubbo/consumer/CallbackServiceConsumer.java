package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.service.CallbackListener;
import com.xyz.dubbo.provider.service.CallbackService;
import org.springframework.context.ApplicationContext;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 22:38
 * @description 参数回调用例
 */
public class CallbackServiceConsumer {
    public static void main(String[] args) {
        ApplicationContext context = MySpringContext.getAppContext();
        CallbackService callbackService = (CallbackService) context.getBean("callbackService");

        callbackService.addListener("foo.bar", new CallbackListener(){
            public void changed(String msg) {
                System.out.println("callback1:" + msg);
            }
        });

    }
}
