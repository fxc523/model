/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	Table.java
 * @package		com.model.annotation
 * @author		fuxianchao
 * @Date		2017年11月23日 下午2:34:08
 * @version		1.0
 * @description 
 *******************************************************************************
 */
package com.model.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 建表时的表名
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午2:58:07]
 * @version 1.0
 ******************************************
 */
//表示注解加在接口、类、枚举等
@Target(ElementType.TYPE)
//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Retention(RetentionPolicy.RUNTIME)
//将此注解包含在javadoc中
@Documented
//允许子类继承父类中的注解
@Inherited
public @interface Table {

	/**
	 * 表名
	 * @return
	 */
	public String name();
}
