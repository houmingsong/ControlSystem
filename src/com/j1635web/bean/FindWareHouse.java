package com.j1635web.bean;
/**
 * 出库详情实体类
 * @author 陈川
 *
 */
public class FindWareHouse {
	/**小班名称*/
	private String className;
	/**出库人*/
	private String houseUserName;
	/**出库时间*/
	private String date;
	/**药剂名称*/
	private String instrumentName;
	/**类别*/
	private String instrumentType;
	/**防治类型*/
	private String instrumentKind;
	/**领用数量*/
	private Integer instrumentNumber;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getHouseUserName() {
		return houseUserName;
	}
	public void setHouseUserName(String houseUserName) {
		this.houseUserName = houseUserName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public String getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}
	public String getInstrumentKind() {
		return instrumentKind;
	}
	public void setInstrumentKind(String instrumentKind) {
		this.instrumentKind = instrumentKind;
	}
	public Integer getInstrumentNumber() {
		return instrumentNumber;
	}
	public void setInstrumentNumber(Integer instrumentNumber) {
		this.instrumentNumber = instrumentNumber;
	}
	public FindWareHouse() {
	}
	public FindWareHouse(String className, String houseUserName, String date, String instrumentName,
			String instrumentType, String instrumentKind, Integer instrumentNumber) {
		super();
		this.className = className;
		this.houseUserName = houseUserName;
		this.date = date;
		this.instrumentName = instrumentName;
		this.instrumentType = instrumentType;
		this.instrumentKind = instrumentKind;
		this.instrumentNumber = instrumentNumber;
	}
	
	
}
