package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.DiseaseBean;
import com.j1635web.bean.PageBean;
import com.j1635web.dao.IDiseaseDao;
import com.j1635web.dao.impl.DiseaseDaoImpl;
import com.j1635web.service.IDiseaseService;

public class DiseaseServiceImpl implements IDiseaseService{
	private IDiseaseDao dao=new DiseaseDaoImpl();

	@Override
	public void add(DiseaseBean diseaseBean) {
		dao.add(diseaseBean);
	}

	@Override
	public DiseaseBean findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}



	@Override
	public List<DiseaseBean> findByItem(String name, String symptom, Integer currentPage) {
		// TODO Auto-generated method stub
		return dao.findByItem(name, symptom, currentPage);
	}

	@Override
	public int getCount(String name, String symptom, Integer currentPage) {
		Integer totalCount = dao.getCount(name, symptom);
		Integer totalPage = (totalCount + 4 - 1)/4;
		return totalPage;
	}
	



}
