package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.ClassMapper;
import com.j1635web.bean.ClassBean;
import com.j1635web.dao.IClassDao;
import com.j1635web.util.DBUtil;

/**
 * 小班管理持久层实现类
 * 
 * @author 罗选红
 *
 */
public class ClassDaoImpl implements IClassDao {

	@Override
	public List<ClassBean> findByItem(String className, String areaName, int currentPage) {
		List<ClassBean> list = new ArrayList<ClassBean>();
		SqlSession session = null;
		try {
			Integer index = (currentPage - 1) * 4;
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			list = mapper.findByItem(className, areaName, index, currentPage);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public void add(ClassBean classBean) {
		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			mapper.add(classBean);

			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public ClassBean findById(Integer id) {
		ClassBean b = new ClassBean();
		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			b = mapper.findById(id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return b;
	}

	@Override
	public void updateByItem(String tel, String principal, Integer id) {
		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			mapper.updateByItem(tel, principal, id);
			session.commit();

		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public int getTotalCountByItem(String className, String areaName) {
		SqlSession session = null;
		Integer totalCount = 0;
		try {
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);
			totalCount = mapper.getTotalCountByItem(className, areaName);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return totalCount;

	}

	@Override
	public List<ClassBean> findAll() {
		List<ClassBean> list = null;
		SqlSession session = null;
		try {
			session = DBUtil.getSqlSession();
			ClassMapper mapper = session.getMapper(ClassMapper.class);

			list = mapper.findAll();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
