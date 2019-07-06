package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.WormMapper;
import com.j1635web.bean.WormBean;
import com.j1635web.dao.IWormDao;
import com.j1635web.util.DBUtil;

public class WormDaoImpl  implements IWormDao {

	@Override
	public void add(WormBean wormBean) {
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			
			WormMapper wormMapper=session.getMapper(WormMapper.class);
			
			wormMapper.add(wormBean);
			session.commit();
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	@Override
	public WormBean findById(Integer id) {
		SqlSession session=null;
		WormBean wormBean=null;
		try {
			session=DBUtil.getSqlSession();
			
			WormMapper wormMapper=session.getMapper(WormMapper.class);
			
			wormBean=wormMapper.findById(id);
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		return wormBean;
	}

	@Override
	public List<WormBean> findByItem(String name, String host,  int currentPage) {
		SqlSession session=null;
		List<WormBean> list=new ArrayList<WormBean>();
		try {
			session=DBUtil.getSqlSession();
			
			WormMapper wormMapper=session.getMapper(WormMapper.class);
			
			int index=(currentPage-1)*4;
			list=wormMapper.findByItem(name, host, index, currentPage);
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public int getCount(String name, String host) {
		SqlSession session=null;
		Integer totalCount=0;
		try {
			 session=DBUtil.getSqlSession();
			 WormMapper wormMapper=session.getMapper(WormMapper.class);
			 totalCount = wormMapper.getCount(name, host);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return totalCount;
	}




}
