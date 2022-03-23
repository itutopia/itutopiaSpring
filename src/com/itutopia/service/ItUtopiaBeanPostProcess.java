package com.itutopia.service;

import com.itutopia.spring.BeanPostProcessor;
import com.itutopia.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 01:08
 */
@Component
public class ItUtopiaBeanPostProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
        // 批量处理

        // 单独处理
        if (beanName.equals("userService")) {
            System.out.println("----初始化之前-------");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(String beanName, Object bean) {
        if (beanName.equals("orderService")) {
            System.out.println("----初始化之后-------");
            Object proxyInstance = Proxy.newProxyInstance(ItUtopiaBeanPostProcess.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("切面逻辑");
                    return method.invoke(bean,args);
                }
            });
            return proxyInstance;
        }
        return bean;
    }
}
