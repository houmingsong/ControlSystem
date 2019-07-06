package com.j1635web.service;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.LogBean;
/**
 * 日志服务层接口
 * @author Administrator 侯明松
 *
 */
public interface ILogService {
	/**
	 * 按条件查找日志信息集合
	 * @param startDate 起始日期
	 * @param endDate 结束日期
	 * @param currentPage 当前页面
	 * @return  日志信息集合
	 */
     public List<LogBean> findByItem(Date startDate,Date endDate,Integer currentPage);
     /**
      * 添加日志
      * @param logBean 日至实体
      */
     public void add(LogBean logBean);
     
     /**
      * 获取动态查询的总页数
      * @param startDate 起始日期
      * @param endDate 结束日期
      * @return 总页数
      */
     public int getTotalPageByItem(Date startDate,Date endDate);
} 
