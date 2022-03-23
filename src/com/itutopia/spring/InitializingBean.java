package com.itutopia.spring;

/**
 * @description: 初始化Bean接口
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 01:02
 */
public interface InitializingBean {

    public void afterPropertiesSet();
}
