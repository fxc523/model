/*
 *******************************************************************************
 * @ProjectName mybatis create table
 * @FileName	BaseMysqlCurdManagerImpl.java
 * @package		com.model.system.curd.manager
 * @author		fuxianchao
 * @Date		2018年1月11日 下午5:35:58
 * @version		1.0
 * @Company		个人
 * @description 
 *******************************************************************************
 */
package com.model.system.curd.manager;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.annotation.Column;
import com.model.annotation.Table;
import com.model.system.curd.manager.dao.BaseMysqlCurdManagerDao;
import com.model.util.Log;

/**
 ******************************************
 * @author fuxianchao  [2018年1月11日 下午5:35:58]
 * @version 1.0
 ******************************************
 */
@Component
public class BaseMysqlCurdManagerImpl<T> implements BaseMysqlCurdManager<T> {
	
	private T t;
	
	/**
	 * BaseMysqlCurdManagerDao
	 */
	@Autowired
	private BaseMysqlCurdManagerDao baseMysqlCurdManagerDao;
	
	private static final String KEYFIELDMAP = "keyFieldMap";

	/* (non-Javadoc)
	 * @see com.model.system.curd.manager.BaseMysqlCurdManager#save(java.lang.Object)
	 */
	@Override
	public Object save(T t) {
		String keyField = "";
		boolean isSave = true;
		Table tableName = t.getClass().getAnnotation(Table.class);
		if ((tableName == null) || (tableName.name() == null || tableName.name() == "")) {
			Log.BS.l().info("必须使用model中的对象！");
			return null;
		}
		Field[] declaredFields = getAllFields(t);
		Map<Object, Map<Object, Object>> tableMap = new HashMap<Object, Map<Object, Object>>();
		Map<Object, Object> dataMap = new HashMap<Object, Object>();
		Map<String, Object> keyFieldMap = new HashMap<String, Object>();
		for (Field field : declaredFields){
			try{
				// 私有属性需要设置访问权限
				field.setAccessible(true);
				Column column = field.getAnnotation(Column.class);
				if (column == null) {
					Log.BS.l().info(field.getName()+"该field没有配置注解不是表中在字段！");
					continue;
				}

				// 如果是主键，并且不是空的时候，这时候应该是更新操作
				if (column.isKey() && field.get(t) != null && field.get(t) != "") {
					isSave = false;
					keyFieldMap.put(field.getName(), field.get(t));
					keyField = field.getName();
				}
				// 如果是自增,并且是保存的场合，不需要添加到map中做保存
				if (isSave && column.isAutoIncrement()) {
					Log.BS.l().info("字段：" + field.getName() + "是自增的不需要添加到map中");
					continue;
				}else if(column.isKey() 
						&& (field.get(t)==null || (String) field.get(t)=="")){
					//如果是主键，并且是空的时候，这时候应该是新增，设置32位的主键
					String idStr = UUID.randomUUID().toString().replace("-", "");
					dataMap.put(field.getName(), idStr);
					keyField = field.getName();
					continue;
				}

				dataMap.put(field.getName(), field.get(t));
			}catch (IllegalArgumentException e){
				e.printStackTrace();
			}catch (IllegalAccessException e){
				e.printStackTrace();
			}
		}
		if (isSave) {
			tableMap.put(tableName.name(), dataMap);
			// 执行保存操作
			baseMysqlCurdManagerDao.save(tableMap);
			return dataMap.get(keyField);
		}else{
			dataMap.put(KEYFIELDMAP, keyFieldMap);
			tableMap.put(tableName.name(), dataMap);
			// 执行更新操作根据主键
			baseMysqlCurdManagerDao.update(tableMap);
		}
		return dataMap.get(keyField);
	}
	
	/**
	 * 得到obj的所有字段
	 ******************************************
	 * @author fuxianchao [2018年1月23日 上午9:31:46]
	 * @version 1.0
	 ******************************************
	 * @param obj
	 * @return
	 */
	private Field[] getAllFields(T obj) {
		Field[] declaredFields = obj.getClass().getDeclaredFields();
		
		// 递归扫描父类的filed
		declaredFields = recursionParents(obj.getClass(), declaredFields);
		return declaredFields;
	}
	
	/**
	 * 递归扫描父类的fields
	 ******************************************
	 * @author fuxianchao [2018年1月23日 上午9:32:45]
	 * @version 1.0
	 ******************************************
	 * @param clas
	 * @param fields
	 * @return
	 */
	private Field[] recursionParents(Class<?> clas, Field[] fields) {
		if(clas.getSuperclass()!=null){
			Class<?> clsSup = clas.getSuperclass();
			fields = (Field[]) ArrayUtils.addAll(fields,clsSup.getDeclaredFields());
			fields = recursionParents(clsSup, fields);
		}
		return fields;
	}


	/* (non-Javadoc)
	 * @see com.model.system.curd.manager.BaseMysqlCurdManager#delete(java.lang.String)
	 */
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.model.system.curd.manager.BaseMysqlCurdManager#findAll()
	 */
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.model.system.curd.manager.BaseMysqlCurdManager#findOne(java.lang.String)
	 */
	@Override
	public T findOne(String id) throws Exception {
		t.getClass();
		return null;
	}

	/**
	 * 获取 t
	 * @return the t
	 */
	public T getT() {
		return t;
	}

	/**
	 * 设置 t
	 * @param t the t to set
	 */
	public void setT(T t) {
		this.t = t;
	}

	/**
	 * 获取 baseMysqlCurdManagerDao
	 * @return the baseMysqlCurdManagerDao
	 */
	public BaseMysqlCurdManagerDao getBaseMysqlCurdManagerDao() {
		return baseMysqlCurdManagerDao;
	}

	/**
	 * 设置 baseMysqlCurdManagerDao
	 * @param baseMysqlCurdManagerDao the baseMysqlCurdManagerDao to set
	 */
	public void setBaseMysqlCurdManagerDao(BaseMysqlCurdManagerDao baseMysqlCurdManagerDao) {
		this.baseMysqlCurdManagerDao = baseMysqlCurdManagerDao;
	}

}
