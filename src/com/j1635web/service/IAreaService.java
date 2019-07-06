package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.AreaBean;

/**
 * 区域持久接口
 * @author 罗义桃
 *
 */
public interface IAreaService {
	  /**
	   * 按条件查询区域信息集合,封装班级名称
	   * @param areaName 区域名
	   * @param treeKind 树种
	   * @param className 负责小班
	   * @param currentPage 当前页面
	   * @return  区域信息集合
	   */
     public List<AreaBean> findByItem(String areaName,String treeKind,String className,Integer currentPage);
     /**
      * 添加区域
      * @param areaBean 区域实体
      */
     public void add(AreaBean areaBean);
   
     /**
      * 获取动态查询的总页数
      * @param areaName 区域名
      * @param treeKind 树种
      * @param className 负责小班
      * @return 总页数
      */
     public int getTotalPageByItem(String areaName,String treeKind,String className);

     /**
  	   * 按条件查询区域信息集合,封装班级名称
  	   * @param areaName 区域名
  	   * @param treeKind 树种
  	   * @param className 负责小班
  	   * @return  区域信息集合
  	   */
    public List<AreaBean> findByIte(String areaName,String treeKind,String className);

}
