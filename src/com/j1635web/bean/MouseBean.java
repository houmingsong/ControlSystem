package com.j1635web.bean;
/**
 * 鼠害实体bean
 * @author 乔荣升
 *
 */
public class MouseBean {
	/**
	 * 鼠害id
	 */
	private Integer id;
	/**
	 * 鼠害名称
	 */
	private String name;
	/**
	 * 食物
	 */
	private String food;
	/**
	 * 繁殖
	 */
	private String breed;
	/**
	 * 天敌
	 */
	private String enemy;
	/**
	 * 图片
	 */
	private String image;
	/**
	 * 防治措施
	 */
	private String defend;
	/**
	 * 主要危害
	 */
	private String harm;
	public MouseBean(Integer id, String name, String food, String breed, String enemy, String image, String defend,
			String harm) {
		super();
		this.id = id;
		this.name = name;
		this.food = food;
		this.breed = breed;
		this.enemy = enemy;
		this.image = image;
		this.defend = defend;
		this.harm = harm;
	}
	public MouseBean() {
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
		return "MouseBean [id=" + id + ", name=" + name + ", food=" + food + ", breed=" + breed + ", enemy=" + enemy
				+ ", image=" + image + ", defend=" + defend + ", harm=" + harm + "]";
	}

}
