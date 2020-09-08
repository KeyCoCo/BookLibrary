package com.keycoco.library.dao.common;

import java.util.List;


public interface CommonDao {

	/**
	 * 保存对象
	 * 
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object save(String str, Object obj) throws Exception;

	/**
	 * 修改对象
	 * 
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public int update(String str, Object obj) throws Exception;

	/**
	 * 删除对象
	 * 
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object delete(String str, Object obj) throws Exception;

	/**
	 * 查找对象
	 * 
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findForObject(String str, Object obj) throws Exception;

	/**
	 * 查找对象
	 * 
	 * @param str
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findForList(String str, Object obj) throws Exception;

	/**
	 * 查找对象封装成Map
	 * 
	 * @param s
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Object findForMap(String sql, Object obj, String key, String value)
			throws Exception;

	/**
	 * 批量更新
	 * @param string
	 * @param workDaysList
	 */
	public Object batchSave(String str, List<?> objs) throws Exception;
	
	
	/**
	 * 批量更新
	 * @param str
	 * @param objs
	 * @throws Exception
	 */
	public void batchUpdate(String str, List<?> objs) throws Exception;

}
