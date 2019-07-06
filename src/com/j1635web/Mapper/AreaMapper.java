package com.j1635web.Mapper;

import java.util.List;

import com.j1635web.bean.AreaBean;

/**
 * 区域映射
 * 
 * @author Administrator 罗义桃
 *
 */
public interface AreaMapper {

	/**
	   * 按条件查询区域信息集合,封装班级名称
	   * @param areaName 区域名
	   * @param treeKind 树种
	   * @param className 负责小班
	   * @param index 起始索引
	   * @param currentPage 当前页面
	   * @return  区域信息集合
	   */
   public List<AreaBean> findByItem(String areaName,String treeKind,String className, int index, Integer currentPage);
   /**
    * 添加区域
    * @param areaBean 区域实体
    */
   public void add(AreaBean areaBean);
   /**
    * 按条件动态获取区域查询的总记录数
    * @param areaName 区域名
    * @param treeKind 树种
    * @param className 负责小班
    * @return 符合条件的总记录数
    */
   public int getTotalCountByItem(String areaName,String treeKind,String className);
 
   /**
	   * 按条件查询区域信息集合,封装班级名称
	   * @param areaName 区域名
	   * @param treeKind 树种
	   * @param className 负责小班
	   * @return  区域信息集合
	   */
  public List<AreaBean> findByIte(String areaName,String treeKind,String className);

}
