package com.j1635web.bean;

import java.sql.Date;
/**
 * 事件实体bean
 * @author 乔荣升
 *
 */
public class ThingBean {
	/**
	 *事件id
	 */
	private Integer id;
	/**
	 *事件名称
	 */
	private String name;
	/**
	 *灾区图片
	 */
	private String image;
	/**
	 *时间
	 */
	private Date time;
	/**
	 *灾害类型
	 */
	private String  kind;
	/**
	 *灾情状态
	 */
	private String condition;
	/**
	 *灾情描述
	 */
	private String description;
	/**
	 *发现途径
	 */
	private String find;
	/**
	 *初步损失
	 */
	private String loss;
	/**
	 *影响面积
	 */
	private Integer acreage;
	/**
	 *防治方案
	 */
	private String defend;
	/**
	 *申请会商
	 */
	private String application;
	/**
	 *区域id外键
	 */
	private Integer areaId;
	/**
	 *发生位置
	 */
	private String areaName;
	/**
	 *所在小班
	 */
	private String className;
	

	

	
	public ThingBean(Integer id, String name, String image, Date time, String kind, String condition,
			String description, String find, String loss, Integer acreage, String defend, String application,
			Integer areaId, String areaName, String className) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.time = time;
		this.kind = kind;
		this.condition = condition;
		this.description = description;
		this.find = find;
		this.loss = loss;
		this.acreage = acreage;
		this.defend = defend;
		this.application = application;
		this.areaId = areaId;
		this.areaName = areaName;
		this.className = className;
		
	}
	public ThingBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFind() {
		return find;
	}
	public void setFind(String find) {
		this.find = find;
	}
	public String getLoss() {
		return loss;
	}
	public void setLoss(String loss) {
		this.loss = loss;
	}
	public Integer getAcreage() {
		return acreage;
	}
	public void setAcreage(Integer acreage) {
		this.acreage = acreage;
	}
	public String getdefend() {
		return defend;
	}
	public void setdefend(String defend) {
		this.defend = defend;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "ThingBean [id=" + id + ", name=" + name + ", image=" + image + ", time=" + time + ", kind=" + kind
				+ ", condition=" + condition + ", description=" + description + ", find=" + find + ", loss=" + loss
				+ ", acreage=" + acreage + ", defend=" + defend + ", application=" + application + ", areaId="
				+ areaId + ", areaName=" + areaName + ", className=" + className +  "]";
	}

	
}
