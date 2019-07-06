package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.MouseMapper;
import com.j1635web.bean.MouseBean;
import com.j1635web.dao.IMouseDao;
import com.j1635web.util.DBUtil;

public class MouseDaoImpl  implements IMouseDao {

	@Override
	public void add(MouseBean mouseBean) {
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			
			MouseMapper mouseMapper=session.getMapper(MouseMapper.class);
			
			mouseMapper.add(mouseBean);
			
			session.commit();
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	@Override
	public MouseBean findById(Integer id) {
		SqlSession session=null;
		MouseBean mouseBean=null;
		try {
			session=DBUtil.getSqlSession();
			
			MouseMapper mouseMapper=session.getMapper(MouseMapper.class);
			
			mouseBean=mouseMapper.findById(id);
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		return mouseBean;
	}





	@Override
	public List<MouseBean> findByItem(String name, int currentPage) {
		SqlSession session=null;
		List<MouseBean> list=new ArrayList<MouseBean>();
		try {
			
			session=DBUtil.getSqlSession();
			
			MouseMapper mouseMapper=session.getMapper(MouseMapper.class);
			
			int index=(currentPage-1)*4;
			
			list=mouseMapper.findByItem(name, index, currentPage);
		}catch (Exception e) {
			 e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public int getCount(String name) {
		SqlSession session=null;
		Integer totalCount=0;
		try {
			 session=DBUtil.getSqlSession();
			 MouseMapper mouseMapper=session.getMapper(MouseMapper.class);
			  totalCount = mouseMapper.getCount(name);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return totalCount;
	}

}
