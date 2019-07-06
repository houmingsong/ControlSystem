package com.j1635web.bean;
/**
 * 出库信息管理实体bean
 * @author 乔荣升
 *
 */
public class WarehouseBean {
	/**
	 *出库id
	 */
	private Integer id;
	/**
	 *出库数量
	 */
	private Integer number;
	/**
	 *领用日期
	 */
	private String time;
	/**
	 *出库人
	 */
	private String userName;
	/**
	 *物品id
	 */
	private Integer instrumentId;
	/**
	 *物品名称
	 */
	private String instrumentName;
	/**
	 *物品防治类型
	 */
	private String instrumentDefendType;
	
	/**
	 *类型
	 */
	private String instrumentKind;
	/**
	 *小班id
	 */
	private Integer classId;
	/**
	 *领用小班名称
	 */
	private String className;
	public WarehouseBean(Integer id, Integer number, String time, String userName, Integer instrumentId,
			String instrumentName, String instrumentDefendType, String instrumentKind, Integer classId,
			String className) {
		super();
		this.id = id;
		this.number = number;
		this.time = time;
		this.userName = userName;
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.instrumentDefendType = instrumentDefendType;
		this.instrumentKind = instrumentKind;
		this.classId = classId;
		this.className = className;
	}
	public WarehouseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public String getInstrumentDefendType() {
		return instrumentDefendType;
	}
	public void setInstrumentDefendType(String instrumentDefendType) {
		this.instrumentDefendType = instrumentDefendType;
	}
	public String getInstrumentKind() {
		return instrumentKind;
	}
	public void setInstrumentKind(String instrumentKind) {
		this.instrumentKind = instrumentKind;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "WarehouseBean [id=" + id + ", number=" + number + ", time=" + time + ", userName=" + userName
				+ ", instrumentId=" + instrumentId + ", instrumentName=" + instrumentName + ", instrumentDefendType="
				+ instrumentDefendType + ", instrumentKind=" + instrumentKind + ", classId=" + classId + ", className="
				+ className + "]";
	}
	
}
