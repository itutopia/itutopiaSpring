package com.itutopia.spring;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 01:06
 */
public interface BeanPostProcessor {
    /**
     * bean初始化方法前调用
     *
     * @param beanName
     * @param bean
     * @return
     */
    Object postProcessBeforeInitialization(String beanName, Object bean);

    /**
     * bean初始化方法后调用
     *
     * @param beanName
     * @param bean
     * @return
     */
    Object postProcessAfterInitialization(String beanName, Object bean);
}
