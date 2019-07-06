package com.j1635web.dao;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.LogBean;
/**
 * 日志服务层接口
 * @author Administrator 侯明松
 *
 */
public interface ILogDao {
	/**
	 * 按条件查找日志信息集合
	 * @param startDate 起始日期
	 * @param endDate 结束日期
	 * @param currentPage 当前页面
	 * @return  日志信息集合
	 */
     public List<LogBean> findByItem(Date startDate,Date endDate,int currentPage);
     
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
