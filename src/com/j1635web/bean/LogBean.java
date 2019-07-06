package com.j1635web.bean;

import java.sql.Date;
/**
 * 日志信息实体bean
 * @author 乔荣升
 *
 */
public class LogBean {
	/**
	 *日志id
	 */
	private Integer id ;
	/**
	 *日志信息
	 */
	private String  info;
	/**
	 * 日期
	 */
	private Date time=new Date(System.currentTimeMillis());
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "LogBean [id=" + id + ", info=" + info + ", time=" + time + "]";
	}
	public LogBean(String info, Date time) {
		
		this.info = info;
		this.time = time;
	}
	public LogBean() {
		
	}
	
	
}
