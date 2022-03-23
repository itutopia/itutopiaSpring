package com.itutopia.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: scope的取值有5种取值：
 * 1.singleton  :单例 :表明容器中创建时只存在一个实例，所有引用此bean都是单一实例。
 * 2.prototype : 多例 :表明spring容器在进行输出prototype的bean对象时，会每次都重新生成一个新的对象给请求方，虽然这种类型的对象的实例化以及属性设置等工作都是由容器负责的，但是只要准备完毕，并且对象实例返回给请求方之后，容器就不在拥有当前对象的引用，请求方需要自己负责当前对象后继生命周期的管理工作，包括该对象的销毁。也就是说，容器每次返回请求方该对象的一个新的实例之后，就由这个对象“自生自灭”，最典型的体现就是spring与struts2进行整合时，要把action的scope改为prototype。
 * 3.request
 * 4.session
 * 5.global session
 * 在Spring 2.0之前，有singleton和prototype两种；
 * 在Spring 2.0之后，为支持web应用的ApplicationContext，增强另外三种：request，session和global session类型，它们只实用于web程序，通常是和XmlWebApplicationContext共同使用。
 *
 *
 * @author: Junchao_Lee
 * @e-mail: ljch867@163.com
 * @date: 2022/3/23 00:09
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Scope {
    String value() default "";
}
