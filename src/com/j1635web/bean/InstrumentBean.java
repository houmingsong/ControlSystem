package com.j1635web.bean;
/**
 * 药剂器械实体bean
 * @author 乔荣升
 *
 */
public class InstrumentBean {
	/**
	 * 药剂器械id
	 */
	private Integer id;
	/**
	 *名称
	 */
	private String name;
	/**
	 *类别
	 */
	private String kind;
	/**
	 *主要用途
	 */
	private String use;
	/**
	 *防止类型
	 */
	private String defendType;
	/**
	 *数量
	 */
	private Integer number;
	public InstrumentBean(Integer id, String name, String kind, String use, String defendType, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.use = use;
		this.defendType = defendType;
		this.number = number;
	}
	public InstrumentBean() {
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getDefendType() {
		return defendType;
	}
	public void setDefendType(String defendType) {
		this.defendType = defendType;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "InstrumentBean [id=" + id + ", name=" + name + ", kind=" + kind + ", use=" + use + ", defendType="
				+ defendType + ", number=" + number + "]";
	}
	
}
