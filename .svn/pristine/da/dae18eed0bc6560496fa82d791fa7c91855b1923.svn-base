package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.MouseBean;
import com.j1635web.bean.PageBean;
import com.j1635web.dao.IMouseDao;
import com.j1635web.dao.impl.MouseDaoImpl;
import com.j1635web.service.IMouseService;

public class MouseServiceImpl implements IMouseService{
	private IMouseDao dao=new MouseDaoImpl();

	@Override
	public void add(MouseBean mouseBean) {
		dao.add(mouseBean);
		
	}

	@Override
	public MouseBean findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}



	@Override
	public List<MouseBean> findByItem(String name, Integer currentPage) {
		// TODO Auto-generated method stub
		return dao.findByItem(name, currentPage);
	}

	@Override
	public int getCount(String name, Integer currentPage) {
		Integer totalCount = dao.getCount(name);
		Integer totalPage = (totalCount + 4 - 1)/4;
		return totalPage;
	}

	
	



}
