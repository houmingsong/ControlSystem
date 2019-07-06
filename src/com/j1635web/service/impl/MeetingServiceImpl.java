package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.MeetingBean;
import com.j1635web.dao.IMeetingDao;
import com.j1635web.dao.impl.MeetingDaoImpl;
import com.j1635web.service.IMeetingService;

public class MeetingServiceImpl implements IMeetingService{
       private IMeetingDao dao=new MeetingDaoImpl();
	@Override
	public  List<MeetingBean> findByThingId(int thingId) {
		
	    return dao.findByThingId(thingId);
	}

	@Override
	public void add(MeetingBean meetingBean) {
		dao.add(meetingBean);
		
	}

}
