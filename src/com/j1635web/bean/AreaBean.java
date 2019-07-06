package com.j1635web.bean;

import java.io.Serializable;

/**
 * 区域实体bean
 * @author 乔荣升
 *
 */
public class AreaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 区域id
	 */
	private Integer id;

	/**
	 * 区域名称
	 */
	private String  areaName;
	/**
	 * 林种
	 */
	private String treeKind;
	/**
	 * 优势树种
	 */
	private String treeAdvantage;
	/**
	 * 地类
	 */
	private String  areaKind;
	/**
	 * 负责小班
	 */
	private String  className;
	/**
	 * 小班实体Bean
	 */
	private ClassBean classBean;
	
	@Override
	public String toString() {
		return "AreaBean [id=" + id + ", areaName=" + areaName + ", treeKind=" + treeKind + ", treeAdvantage="
				+ treeAdvantage + ", areaKind=" + areaKind + ", className=" + className
				+ ", classBean=" + classBean + "]";
	}
	public AreaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AreaBean(Integer id, String areaName, String treeKind, String treeAdvantage, String areaKind) {
		super();
		this.id = id;
		this.areaName = areaName;
		this.treeKind = treeKind;
		this.treeAdvantage = treeAdvantage;
		this.areaKind = areaKind;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getTreeKind() {
		return treeKind;
	}
	public void setTreeKind(String treeKind) {
		this.treeKind = treeKind;
	}
	public String getTreeAdvantage() {
		return treeAdvantage;
	}
	public void setTreeAdvantage(String treeAdvantage) {
		this.treeAdvantage = treeAdvantage;
	}
	public String getAreaKind() {
		return areaKind;
	}
	public void setAreaKind(String areaKind) {
		this.areaKind = areaKind;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ClassBean getClassBean() {
		return classBean;
	}
	public void setClassBean(ClassBean classBean) {
		this.classBean = classBean;
	}
	
}
