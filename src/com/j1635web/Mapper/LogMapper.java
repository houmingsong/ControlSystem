package com.j1635web.Mapper;

import java.util.Date;
import java.util.List;

import com.j1635web.bean.LogBean;

public interface LogMapper {
	/**
	 * 按条件查找日志信息集合
	 * @param startDate 起始日期
	 * @param endDate 结束日期
	 * @param index 起始索引
	 * @param currentPage 当前页面
	 * @return  日志信息集合
	 */
     public List<LogBean> findByItem(Date startDate,Date endDate,int index,int currentPage);
     
     
     /**
      * 添加日志
      * @param logBean 日至实体
      */
     public void add(LogBean logBean);
     /**
  	 * 动态回去总条数
  	 * @param startDate 起始日期
  	 * @param endDate 结束日期
  	 * @return 总记录数
  	 */
     public int getTotalCountByItem(Date startDate,Date endDate);
} 
