package com.j1635web.dao;

import java.util.List;

import com.j1635web.bean.ClassBean;

/**
 * 班级服务接口
 * 
 * @author 罗桃义
 *
 */
public interface IClassDao {
	/**
	 * 按条件查找小班集合
	 * @param className 小班名
	 * @param areaName 区域名
	 * @return 小班集合
	 * @param index 起始索引
	 * @param currentPage 当前页面
	 */
	public List<ClassBean> findByItem(String className, String areaName, int currentPage);
	/**
	 * 添加班级
	 * @param classBean 班级实体
	 */
	public void add(ClassBean classBean);
	/**
	 * 按id查找
	 * @param id 班级id
	 * @return 班级实体
	 */
	public ClassBean findById(Integer id);
	/**
	 * 修改班级信息
	 * @param id 班级id
	 * @param tel 负责人电话
	 * @param principal 负责人
	 */
	public void updateByItem(String tel, String principal, Integer id);
	/**
	 * 动态查询统计所有信息条数
	 * @param className 班级名称
	 * @param areaName 区域名称
	 * @return 返回总条数
	 */
	public int getTotalCountByItem(String className, String areaName);
	
	/**
	 * 查找所有小班
	 */
	public List<ClassBean> findAll();

}
