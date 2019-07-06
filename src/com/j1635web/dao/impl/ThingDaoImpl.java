package com.j1635web.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.ThingMapper;
import com.j1635web.bean.ThingBean;
import com.j1635web.dao.IThingDao;
import com.j1635web.util.DBUtil;

public class ThingDaoImpl implements IThingDao {

	@Override
	public List<ThingBean> findByItem(String name, String condition, String areaName, Date startDate, Date endDate,
			int currentPage) {
		SqlSession session = null;
		List<ThingBean> thingList = new ArrayList<ThingBean>();
		try {
			Integer index = (currentPage - 1) * 4;
			session = DBUtil.getSqlSession();
			ThingMapper mapper = session.getMapper(ThingMapper.class);
			thingList = mapper.findByItem(name, condition, areaName, startDate, endDate, index, currentPage);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return thingList;
	}

	@Override
	public void add(ThingBean thingBean) {
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			ThingMapper mapper = session.getMapper(ThingMapper.class);
			mapper.add(thingBean);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public ThingBean findById(Integer id) {
		SqlSession session = null;
		ThingBean thingBean = new ThingBean();
		try {
			session = DBUtil.getSqlSession();
			ThingMapper mapper = session.getMapper(ThingMapper.class);
			thingBean = mapper.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thingBean;
	}

	@Override
	public void updateById(String condition, String denfend, Integer id) {
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			ThingMapper mapper = session.getMapper(ThingMapper.class);
			mapper.updateById(condition, denfend, id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public int getTotalCountByItem(String name, String condition, String areaName, Date startDate, Date endDate) {
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			ThingMapper mapper = session.getMapper(ThingMapper.class);
			return mapper.getTotalCountByItem(name, condition, areaName, startDate, endDate);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

}
