package com.itutopia.service;

import com.itutopia.spring.Autowired;
import com.itutopia.spring.BeanNameAware;
import com.itutopia.spring.Component;
import com.itutopia.spring.InitializingBean;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/22 23:27
 */
@Component
public class UserService implements BeanNameAware, InitializingBean, IUser {

    @Autowired
    private OrderService orderService;

    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void test() {
        System.out.println(orderService);
    }

    @Override
    public void afterPropertiesSet() {
        //
        System.out.println("初始化方法");
    }
}
