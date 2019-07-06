package com.j1635web.service.impl;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.ThingBean;
import com.j1635web.dao.IThingDao;
import com.j1635web.dao.impl.ThingDaoImpl;
import com.j1635web.service.IThingService;

public class ThingServiceImpl  implements IThingService{
	
   private IThingDao dao = new ThingDaoImpl();
	@Override
	public List<ThingBean> findByItem(String name, String condition, String areaName, Date startDate, Date endDate,
			Integer currentPage) {
		List<ThingBean> list = dao.findByItem(name, condition, areaName, startDate, endDate, currentPage); 
		
		return list;
	}

	@Override
	public void add(ThingBean thingBean) {
		dao.add(thingBean);
		
	}

	@Override
	public ThingBean findById(Integer id) {
		
		return dao.findById(id);
	}

	@Override
	public void updateById(String condition, String denfend,Integer id) {
		dao.updateById(condition, denfend, id);
		

}

	@Override
	public int getTotalPageByItem(String name, String condition, String areaName, Date startDate, Date endDate) {
		
		Integer totalCount = dao.getTotalCountByItem(name, condition, areaName, startDate, endDate);
		Integer totalPage = (totalCount + 4 - 1)/4;
		
		return totalPage;
	}
}