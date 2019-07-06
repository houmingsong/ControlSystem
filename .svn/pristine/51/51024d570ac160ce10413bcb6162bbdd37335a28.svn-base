package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.WormBean;

/**
 * 虫害持久层接口
 * @author 陈伟
 *
 */
public interface IWormService {
	   /**
	    * 添加虫害信息
	    * @param wormBean 虫害实体
	    */
	   public void add(WormBean wormBean);
	   /**
	    * 按id查找虫害信息
	    * @param id 虫害id
	    * @return  虫害实体
	    */
	   public WormBean findById(Integer id);
	   /**
	    * 按虫害名和寄主查找虫害信息集合
	    * @param name 虫害名
	    * @param host 寄主
	    * @param currentPage 当前页面
	    * @return  虫害信息集合
	    */
	   public List<WormBean> findByItem(String name,String host,Integer currentPage);
	   
	   public int getCount(String name,String host,Integer currentPage);

}
