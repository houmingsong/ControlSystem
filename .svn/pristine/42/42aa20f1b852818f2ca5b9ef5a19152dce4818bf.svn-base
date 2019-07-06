package com.j1635web.dao.impl;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.InstrumentMapper;
import com.j1635web.Mapper.WareHouseMapper;
import com.j1635web.bean.FindWareHouse;
import com.j1635web.bean.WarehouseBean;
import com.j1635web.dao.IWareHouseDao;
import com.j1635web.util.DBUtil;

public class WareHouseDaoImpl implements IWareHouseDao{

	@Override
	public List<WarehouseBean> findByItem(Date startDate, Date endDate, String className, int thispage) {
		SqlSession session = null;
		List<WarehouseBean> list = null;
		try {
			session = DBUtil.getSqlSession();
			
			WareHouseMapper isMapper = session.getMapper(WareHouseMapper.class);
			
			list = isMapper.findByItem(startDate, endDate, className, thispage);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public static void main(String[] args) {
		WareHouseDaoImpl a = new WareHouseDaoImpl();
		System.out.println(a.findCount(null, null, null));
	}

	@Override
	public int findCount(Date startDate, Date endDate, String className) {
		SqlSession session = null;
		int num = 0;
		try {
			session = DBUtil.getSqlSession();
			
			WareHouseMapper isMapper = session.getMapper(WareHouseMapper.class);
			
			num = isMapper.findCount(startDate, endDate, className);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		} finally {
			session.close();
		}
		return num;
	}

	@Override
	public boolean add(WarehouseBean wBean) {
		boolean isok = false;
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			WareHouseMapper isMapper = session.getMapper(WareHouseMapper.class);
			
			isMapper.add(wBean);
			
			session.commit();
			isok = true;
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return isok;
	}

	@Override
	public List<FindWareHouse> findFWareHouseByItem(int classId, String HouseUserName, Date date) {
		List<FindWareHouse> list = null;
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			
			WareHouseMapper isMapper = session.getMapper(WareHouseMapper.class);
			
			list = isMapper.findFWareHouseByItem(classId, HouseUserName, date);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
