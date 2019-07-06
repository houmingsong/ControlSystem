package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.MeetingBean;

public interface IMeetingService {
	/*
	 * 根据事件id查找会商信息集合
	 */
	public  List<MeetingBean> findByThingId(int thingId);
	/*
	 * 添加会商信息
	 */
	public void add(MeetingBean meetingBean);
}
