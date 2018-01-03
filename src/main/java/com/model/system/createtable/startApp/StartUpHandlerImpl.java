/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	StartUpHandlerImpl.java
 * @package		com.model.startApp
 * @author		fuxianchao
 * @Date		2017年12月20日 上午11:16:28
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.createtable.startApp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.model.system.createtable.mysql.SysCreateTableMysql;
import com.model.util.Log;


/**
 ******************************************
 * @author fuxianchao  [2017年12月20日 上午11:16:28]
 * @version 1.0
 ******************************************
 */
@Component
public class StartUpHandlerImpl implements StartUpHandler {
	
	
	/** 数据库类型：mysql */
	public static String MYSQL = "mysql";
	
	/** 数据库类型：oracle */
	public static String ORACLE = "oracle";
	
	/** 数据库类型：sqlserver */
	public static String SQLSERVER = "sqlserver";
	
	/** 数据库类型：postgresql */
	public static String POSTGRESQL = "postgresql";
	
	@Value("${datebase.type}")
	private String databaseType;
	
	@Autowired
	private SysCreateTableMysql sysCreateTableMysql;

	/* (non-Javadoc)
	 * @see com.model.startApp.StartUpHandler#startHandler()
	 */
	@Override
	@PostConstruct
	public void startHandler() {
		// 执行mysql的处理方法
		if (MYSQL.equals(databaseType)) {
			
			Log.BS.l().info("databaseType=mysql，开始执行mysql的处理方法");
			
			sysCreateTableMysql.createMysqlTable();
		}else if (ORACLE.equals(databaseType)) {
			
			Log.CREATETABLE.l().info("datbaseType=oracle，开始执行oracle的处理方法");
		}else if (SQLSERVER.equals(databaseType)) {
			
			Log.CREATETABLE.l().info("databaseType=sqlserver，开始执行sqlserver的处理方法");
		}else if (POSTGRESQL.equals(databaseType)) {
			
			Log.CREATETABLE.l().info("databaseType=postgresql，开始执行postgresql的处理方法");
		}else{
			
			Log.CREATETABLE.l().info("没有找到符合条件的处理方法！");
		}
	}

}
