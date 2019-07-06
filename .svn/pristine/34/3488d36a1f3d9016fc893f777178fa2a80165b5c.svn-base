package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.PageBean;
import com.j1635web.bean.WormBean;
import com.j1635web.dao.IWormDao;
import com.j1635web.dao.impl.WormDaoImpl;
import com.j1635web.service.IWormService;

public class WormServiceImpl implements IWormService{
	private IWormDao dao=new WormDaoImpl();
	@Override
	public void add(WormBean wormBean) {
		dao.add(wormBean);
		
	}

	@Override
	public WormBean findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<WormBean> findByItem(String name, String host, Integer currentPage) {
		return dao.findByItem(name, host, currentPage);
	}

	@Override
	public int getCount(String name, String host, Integer currentPage) {
		Integer totalCount = dao.getCount(name, host);
		Integer totalPage = (totalCount + 4 - 1)/4;
		return totalPage;
	}





}
