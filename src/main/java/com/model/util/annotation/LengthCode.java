/*
 *******************************************************************************
 * @ProjectName 中国航信  DIT(国际运价前端管理系统)
 * @FileName	LengthCode.java
 * @package		com.model.util.annotation
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:49:50
 * @version		1.0
 * @Company		中国民航信息网络股份有限公司
 * @Copyright	Copyright (c) 2017
 * @description 
 *******************************************************************************
 */
package com.model.util.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 针对数据库类型加注解，用来标记该类型需要设置几个长度
 *  例如： datetime/不需要设置 ,varchar(1)/需要1个, double(5,2)/需要两个
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午2:49:50]
 * @version 1.0
 ******************************************
 */
//该注解用于方法声明
@Target(ElementType.FIELD)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
//允许子类继承父类中的注解
@Inherited
public @interface LengthCode {

	/**
	 * 默认是1，0表示不需要设置，1表示需要设置一个，2表示需要设置两个
	 * 
	 * @return
	 */
	public int LengthCount() default 1;
}
