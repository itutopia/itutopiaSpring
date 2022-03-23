package com.itutopia.spring;

/**
 * @description: 定义Bean
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 00:06
 */
public class BeanDefinition {

    /**
     * bean类型
     */
    private Class classType;
    /**
     * bean是单例,还是多例
     */
    private String scope;

    public Class getClassType() {
        return classType;
    }

    public void setClassType(Class classType) {
        this.classType = classType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
