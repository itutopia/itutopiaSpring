package com.itutopia.spring;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 01:06
 */
public interface BeanPostProcessor {

    public Object postProcessBeforeInitialization(String beanName, Object bean);

    public Object postProcessAfterInitialization(String beanName, Object bean);
}
