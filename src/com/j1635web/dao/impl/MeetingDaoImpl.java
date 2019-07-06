package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.ExpertMapper;
import com.j1635web.Mapper.MeetingMapper;
import com.j1635web.bean.MeetingBean;
import com.j1635web.dao.IMeetingDao;
import com.j1635web.util.DBUtil;

public class MeetingDaoImpl  implements IMeetingDao{

	@Override
	public List<MeetingBean> findByThingId(int thingId) {
		 SqlSession session=null;
		 List<MeetingBean> meetingList=new ArrayList<MeetingBean>();
		 try {
			 session=DBUtil.getSqlSession();
			 MeetingMapper mapper = session.getMapper(MeetingMapper.class);
			  meetingList = mapper.findByThingId(thingId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 session.close();
		}
		return meetingList;
	}

	@Override
	public void add(MeetingBean meetingBean) {
	     SqlSession session=null;
	     try {
			session=DBUtil.getSqlSession();
			MeetingMapper mapper = session.getMapper(MeetingMapper.class);
			mapper.add(meetingBean);
			session.commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	@Override
	public int getCount() {
		SqlSession session=null;
		Integer totalCount=0;
		try {
			 session=DBUtil.getSqlSession();
			 ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			  totalCount = mapper.getCount();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return totalCount;
	}

}
