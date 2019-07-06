package com.j1635web.service.impl;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.FindWareHouse;
import com.j1635web.bean.WarehouseBean;
import com.j1635web.dao.IWareHouseDao;
import com.j1635web.dao.impl.WareHouseDaoImpl;
import com.j1635web.service.IWareHouseService;

public class WarehouseServiceImpl implements IWareHouseService{
	IWareHouseDao dao = new WareHouseDaoImpl();
	@Override
	public List<WarehouseBean> findByItem(Date startDate, Date endDate, String className, int thispage) {
		 
		return dao.findByItem(startDate, endDate, className, thispage);
	}
	
	@Override
	public int findCount(Date startDate, Date endDate, String className) {
		
		return dao.findCount(startDate, endDate, className);
		
	}

	@Override
	public boolean add(WarehouseBean wBean) {
		
		return dao.add(wBean);
	}

	@Override
	public List<FindWareHouse> findFWareHouseByItem(int classId, String HouseUserName, Date date) {
		
		return dao.findFWareHouseByItem(classId, HouseUserName, date);
		
	}
	
	
}
