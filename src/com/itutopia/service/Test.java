package com.itutopia.service;

import com.itutopia.spring.ItUtopiaApplicationContext;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/22 23:26
 */
public class Test {

    public static void main(String[] args) {

        ItUtopiaApplicationContext applicationContext = new ItUtopiaApplicationContext(AppConfig.class);

        IUser userService = (IUser) applicationContext.getBean("userService");

        userService.test();

//        System.out.println(applicationContext.getBean("userService"));
//        System.out.println(applicationContext.getBean("orderService"));


    }
}
