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

import java.util.List;

import com.model.system.curd.manager.dao.BaseMysqlCurdManagerDao;

/**
 ******************************************
 * @author fuxianchao  [2018年1月11日 下午5:35:58]
 * @version 1.0
 ******************************************
 */
public class BaseMysqlCurdManagerImpl<T> implements BaseMysqlCurdManager<T> {
	
	private BaseMysqlCurdManagerDao baseMysqlCurdManagerDao;

	/* (non-Javadoc)
	 * @see com.model.system.curd.manager.BaseMysqlCurdManager#save(java.lang.Object)
	 */
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		
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
	public T findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
