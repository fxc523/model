/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	Column.java
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
 * 建表时字段的注解
 ******************************************
 * @author fuxianchao  [2017年11月23日 下午2:34:08]
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
public @interface Column {

	/**
	 * 字段名
	 * 
	 * @return
	 */
	public String name() default "";

	/**
	 * 字段类型
	 * 
	 * @return
	 */
	public String type();

	/**
	 * 字段长度，默认是255
	 * 
	 * @return
	 */
	public int length() default 255;

	/**
	 * 小数点长度，默认是0
	 * 
	 * @return
	 */
	public int decimalLength() default 0;

	/**
	 * 是否为可以为null，true是可以，false是不可以，默认为true
	 * 
	 * @return
	 */
	public boolean isNull() default true;

	/**
	 * 是否是主键，默认false
	 * 
	 * @return
	 */
	public boolean isKey() default false;

	/**
	 * 是否自动递增，默认false 只有主键才能使用
	 * 
	 * @return
	 */
	public boolean isAutoIncrement() default false;

	/**
	 * 默认值，默认为null
	 * 
	 * @return
	 */
	public String defaultValue() default "NULL";
	
	/**
	 * 是否是唯一，默认false
	 * 
	 * @return 是否是唯一，默认false
	 */
	public boolean isUnique() default false;
}
