package com.j1635web.Mapper;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.ThingBean;

public interface ThingMapper {
	/**
	 * 按条件查找事件信息集合
	 * @param name 事件名
	 * @param condition 灾情状态 
	 * @param areaName 区域名
	 * @param startDate  起始日期
	 * @param endDate 结束日期
	 * @param index 起始索引
	 * @param currentPage 当前页面
	 * @return 事件实体集合
	 */
   public List<ThingBean> findByItem(String name,String condition,String areaName,Date startDate,Date endDate,int index,int currentPage);
   /**
    * 添加事件
    * @param thingBean 事件实体
    */
   public void add(ThingBean thingBean);
   /**
    * 按id查找事件
    * @param id 事件id
    * @return 事件实体
    */
   public ThingBean findById(Integer id);
   /**
    * 按id修改事件信息 
    * @param id 事件id
    * @param condition 灾情状态
    * @param denfend 防治
    */
   public void updateById(String condition, String denfend,Integer id);
   /**
    * 按条件动态获取事件记录的总记录数
    * @param name
    * @param condition
    * @param areaName
    * @param startDate
    * @param endDate
    * @return
    */
   public int getTotalCountByItem(String name,String condition,String areaName,Date startDate,Date endDate);
}
