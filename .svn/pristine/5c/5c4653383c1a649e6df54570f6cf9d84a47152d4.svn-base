package com.j1635web.service.impl;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.LogBean;
import com.j1635web.dao.ILogDao;
import com.j1635web.dao.impl.LogDaoImpl;
import com.j1635web.service.ILogService;

public class LogServiceImpl implements ILogService {
	
	private ILogDao dao = new LogDaoImpl();
	
	@Override
	public List<LogBean> findByItem(Date startDate, Date endDate,Integer currentPage) {
		
	    List<LogBean> list = dao.findByItem(startDate, endDate, currentPage);

		return list;
	}

	@Override
	public void add(LogBean logBean) {
		dao.add(logBean);
		
	}
	

	@Override
	public int getTotalPageByItem(Date startDate, Date endDate) {
		
		Integer totalCount = dao.getTotalCountByItem(startDate, endDate);
		Integer totalPage = (totalCount + 4 - 1)/4;
		
		return totalPage;
	}
	
}
