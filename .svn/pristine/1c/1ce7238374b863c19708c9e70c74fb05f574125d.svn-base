package com.j1635web.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.InstrumentMapper;
import com.j1635web.bean.InstrumentBean;
import com.j1635web.dao.IInstrumentDao;
import com.j1635web.util.DBUtil;

public class InstrumentDaoImpl implements IInstrumentDao{

	@Override
	public boolean add(InstrumentBean instrumentBean) {
		SqlSession session = null;
		boolean isOk = false;
		try {
			session = DBUtil.getSqlSession();
			
			InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
			
			int as = isMapper.add(instrumentBean);
			
			session.commit();
			isOk = true;
			
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isOk;
	}
	@Override
	public InstrumentBean findByName(String name) {
		SqlSession session = null;
		InstrumentBean instrumentBean = null;
		try {
			session = DBUtil.getSqlSession();
			
			InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
			
			instrumentBean =isMapper.findByName(name);
			
			
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return instrumentBean;
	}
	@Override
	public boolean updateInstrumentBeanNumber(int id, int number) {
		SqlSession session = null;
		boolean isOk = false;
		try {
			session = DBUtil.getSqlSession();
			
			InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
			
			isMapper.updateInstrumentBeanNumber(id, number);
			
			session.commit();
			
			isOk = true;
			
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return isOk;
	}
	@Override
	public List<InstrumentBean> findByItems(String name, String type, String kind, int thispage) {
		 List<InstrumentBean> list = null;
		 SqlSession session = null;
			try {
				session = DBUtil.getSqlSession();
				
				InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
				
				list =isMapper.findByItems(name, type, kind, thispage);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		 
		return list;
	}
	@Override
	public int findCount(String name, String type, String kind) {
		 SqlSession session = null;
		 int maxpage = 0;
			try {
				session = DBUtil.getSqlSession();
				
				InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
				
				maxpage = isMapper.findCount(name, type, kind);
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		return maxpage;
	}
	@Override
	public InstrumentBean findNumberById(int id) {
		InstrumentBean ins=null;
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			InstrumentMapper isMapper = session.getMapper(InstrumentMapper.class);
			ins = isMapper.findNumberById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return ins;
	}
	
}


