package com.j1635web.Mapper;

import java.util.List;

import com.j1635web.bean.InstrumentBean;
/**
 * 药剂器械mybatis接口
 * @author 陈川
 *
 */
public interface InstrumentMapper {
	/**
	 * 添加药剂
	 * @param instrumentBean 药剂实体
	 */
	public int add(InstrumentBean instrumentBean);
	/**
	 * 按药剂名称查询药剂
	 * @param name 药剂名称
	 * @return 药剂实体
	 */
	public InstrumentBean findByName(String name);
	/**
	 * 按药剂的id增加或减少药剂的数量
	 * @param id 药剂id
	 * @param number 增加或减少的药剂数量
	 * @return 是否修改成功
	 */
	public void updateInstrumentBeanNumber(int id,int number);
	
	 /**
     * 按条件查询药剂
     * @param name 药剂名称
     * @param type 药剂防治类型
     * @param kind 类别
     * @param thispage 当前页码
     * @return 查询到的药剂集合
     */
    public List<InstrumentBean> findByItems(String name,String type,String kind,int thispage);
    /**
     * 按条件查询药剂总条数
     * @param name 药剂名称
     * @param type 药剂防治类型
     * @param kind 类别
     * @param thispage 当前页码
     * @return 查询到的药剂总条数
     */
    public int findCount(String name,String type,String kind);
    
    /**
     * 按id查询药剂
     * @param id 药剂id
     * @return 药剂
     */
    public InstrumentBean findNumberById(int id);
}
