package com.j1635web.dao;

import java.util.List;

import com.j1635web.bean.MouseBean;
/**
 * 鼠害持久层接口
 * @author 陈伟
 *
 */
public interface IMouseDao {
   /**
    * 添加鼠害信息
    * @param diseaseBean 鼠害实体
    */
   public void add(MouseBean mouseBean);
   /**
    * 按id查找鼠害信息
    * @param id 鼠害id
    * @return  鼠害实体
    */
   public MouseBean findById(Integer id);
   /**
    * 按鼠害名查找鼠害信息集合
    * @param name 鼠害名
	* @param index 起始索引
    * @param currentCount 每页显示记录数
    * @return  鼠害信息集合
    */
   public List<MouseBean> findByItem(String name,int currentPage);
   /**
	 * 得到鼠害总记录数
	 * @return  总记录数
	 */
	public int getCount(String name);
}
