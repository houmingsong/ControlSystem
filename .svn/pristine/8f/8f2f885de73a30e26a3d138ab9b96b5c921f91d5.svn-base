package com.j1635web.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.LogMapper;
import com.j1635web.bean.LogBean;
import com.j1635web.dao.ILogDao;
import com.j1635web.util.DBUtil;

public class LogDaoImpl implements ILogDao{

	@Override
	public List<LogBean> findByItem(Date startDate, Date endDate,int currentPage) {
		List<LogBean> list = new ArrayList<LogBean>();
		SqlSession session = null;
		try {
			Integer index = (currentPage-1)*4;
			session = DBUtil.getSqlSession();
			LogMapper logMapper = session.getMapper(LogMapper.class);
			list = logMapper.findByItem(startDate, endDate, index, currentPage);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public void add(LogBean logBean) {
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			LogMapper logMapper = session.getMapper(LogMapper.class);
			logMapper.add(logBean);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	

	@Override
	public int getTotalCountByItem(Date startDate, Date endDate) {
		SqlSession session = null;
		Integer totalCount=0;
		try {
			session = DBUtil.getSqlSession();
			LogMapper logMapper = session.getMapper(LogMapper.class);
			totalCount = logMapper.getTotalCountByItem(startDate, endDate);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return totalCount;
	}
}
