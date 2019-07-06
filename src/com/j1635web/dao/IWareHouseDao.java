package com.j1635web.dao;

import java.sql.Date;
import java.util.List;

import com.j1635web.bean.FindWareHouse;
import com.j1635web.bean.WarehouseBean;
/**
 *  药剂出库持久层接口
 * @author 陈川
 *
 */
public interface IWareHouseDao {
	/**
	 * 按条件查询药剂出库信息	
	 * @param startDate 药剂出口开始时间
	 * @param endDate 药剂出库结束时间
	 * @param className 领用小班
	 * @param thispage 当前页面
	 * @return 药剂出库集合
	 */ 
	public List<WarehouseBean> findByItem(Date startDate,Date endDate,String className,int thispage);
	
	/**
	 * 按条件查询药剂出库信息总条数	
	 * @param startDate 药剂出口开始时间
	 * @param endDate 药剂出库结束时间
	 * @param className 领用小班
	 * @return 药剂出库总条数
	 */
	public int findCount(Date startDate,Date endDate,String className);
	/**
	 * 添加出库信息
	 * @param wBean 出库信息
	 * @return 是否成功
	 */
	public boolean add(WarehouseBean wBean);
	/**
	 * 按条件查询出库详情
	 * @param classId 小班id
	 * @param HouseUserName 出库人
	 * @param date 出库时间
	 * @return 出库详情实体类集合
	 */
	public List<FindWareHouse> findFWareHouseByItem(int classId,String HouseUserName,Date date);
}
