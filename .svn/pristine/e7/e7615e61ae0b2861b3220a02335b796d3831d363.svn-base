package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.ClassBean;
import com.j1635web.dao.IClassDao;
import com.j1635web.dao.impl.ClassDaoImpl;
import com.j1635web.service.IClassService;

/**
 * 小班管理业务层实现类
 * 
 * @author Administrator
 *
 */
public class ClassServiceimpl implements IClassService {
	IClassDao clas = new ClassDaoImpl();

	@Override
	public void add(ClassBean classBean) {
		clas.add(classBean);

	}

	@Override
	public ClassBean findById(Integer id) {
		// TODO Auto-generated method stub
		return clas.findById(id);
	}

	@Override
	public void updateByItem(String tel, String principal, Integer id) {
		clas.updateByItem(tel, principal, id);

	}

	@Override
	public List<ClassBean> findByItem(String className, String areaName, Integer currentPage) {
		List<ClassBean> list = clas.findByItem(className, areaName, currentPage);
		return list;

	}
	
	@Override
	public int getTotalPageByItem(String className, String areaName) {
		
		Integer totalCount=clas.getTotalCountByItem(className, areaName);
		Integer totalPage=(totalCount+4-1)/4;
		
		return totalPage;
	}

	@Override
	public List<ClassBean> findAll() {
		
		return clas.findAll();
	}

}
