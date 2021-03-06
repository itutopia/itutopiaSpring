package com.itutopia.spring;

/**
 * @description:
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 00:58
 */
public interface BeanNameAware {

    /**
     * 设置BeanName
     * @param beanName
     */
    public void setBeanName(String beanName);
}
