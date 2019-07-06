package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.InstrumentBean;
/**
 * 药剂器械业务层接口
 * @author 陈川
 *
 */
public interface IInstrumentService {
	/**
	 * 添加药剂，如果传入的药剂实体在仓库中存在的话则执行update操作，否则执行add操作
	 * @param instrumentBean 药剂实体 
	 */
      public boolean add(InstrumentBean instrumentBean);

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
       * 通过id查询药剂信息
       * @param id 药剂id
       * @return 药剂
       */
      public InstrumentBean findById(int id);
      
      /**
  	 * 按药剂的id修改药剂的数量
  	 * @param id 药剂id
  	 * @param number 药剂数量
  	 * @return 是否修改成功
  	 */
  	public boolean updateInstrumentBeanNumber(int id,int number);
}
