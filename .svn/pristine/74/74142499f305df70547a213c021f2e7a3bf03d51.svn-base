package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.InstrumentBean;
import com.j1635web.dao.IInstrumentDao;
import com.j1635web.dao.impl.InstrumentDaoImpl;
import com.j1635web.service.IInstrumentService;

public class InstrumentServiceImpl implements IInstrumentService{
	IInstrumentDao dao = new InstrumentDaoImpl();

	@Override
	public boolean add(InstrumentBean instrumentBean) {
		boolean isOk = false;
		String name = instrumentBean.getName();
		InstrumentBean ins = dao.findByName(name);
		if(ins==null) {
			dao.add(instrumentBean);
			isOk = true;
		}else {
			dao.updateInstrumentBeanNumber(ins.getId(), instrumentBean.getNumber());
			isOk = true;
		}
		return isOk;	
	}

	@Override
	public List<InstrumentBean> findByItems(String name, String type, String kind, int thispage) {
		List<InstrumentBean> list = dao.findByItems(name, type, kind, thispage);
		return list;
	}

	@Override
	public int findCount(String name, String type, String kind) {
		return dao.findCount(name, type, kind);
		
	}

	@Override
	public InstrumentBean findById(int id) {
		
		return dao.findNumberById(id);
	}

	@Override
	public boolean updateInstrumentBeanNumber(int id, int number) {
		
		return dao.updateInstrumentBeanNumber(id, number);
	}
	
}
