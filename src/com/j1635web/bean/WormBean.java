package com.j1635web.bean;
/**
 * 虫害实体bean
 * @author 乔荣升
 *
 */
public class WormBean {
	/**
	 * 虫害id
	 */
	private Integer id;
	/**
	 * 虫害名
	 */
	private  String name;
	/**
	 * 寄主
	 */
	private String host;
	/**
	 * 繁殖
	 */
	private String breed;
	/**
	 * 天敌
	 */
	private String enemy;
	/**
	 * 成虫图片
	 */
	private  String bigImage;
	/**
	 * 幼虫图片
	 */
	private  String smallImage;
	/**
	 * 防治措施
	 */
	private  String defend;
	/**
	 * 主要危害
	 */
	private  String  harm;
	public WormBean(Integer id, String name, String host, String breed, String enemy, String bigImage,
			String smallImage, String defend, String harm) {
		super();
		this.id = id;
		this.name = name;
		this.host = host;
		this.breed = breed;
		this.enemy = enemy;
		this.bigImage = bigImage;
		this.smallImage = smallImage;
		this.defend = defend;
		this.harm = harm;
	}
	public WormBean() {
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
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getEnemy() {
		return enemy;
	}
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	public String getBigImage() {
		return bigImage;
	}
	public void setBigImage(String bigImage) {
		this.bigImage = bigImage;
	}
	public String getSmallImage() {
		return smallImage;
	}
	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}
	public String getDefend() {
		return defend;
	}
	public void setDefend(String defend) {
		this.defend = defend;
	}
	public String getHarm() {
		return harm;
	}
	public void setHarm(String harm) {
		this.harm = harm;
	}
	@Override
	public String toString() {
		return "WormBean [id=" + id + ", name=" + name + ", host=" + host + ", breed=" + breed + ", enemy=" + enemy
				+ ", bigImage=" + bigImage + ", smallImage=" + smallImage + ", defend=" + defend + ", harm=" + harm
				+ "]";
	}
	
}
