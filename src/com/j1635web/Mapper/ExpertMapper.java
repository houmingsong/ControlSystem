package com.j1635web.Mapper;

import java.util.List;
import com.j1635web.bean.ExpertBean;
/**
 * 专家映射
 * @author Administrator 乔荣升
 *
 */
public interface ExpertMapper {

   /**
    * 按条件分页查找专家信息集合
    * @param name 专家姓名
    * @param expertise 专长
    * @param company 工作单位
    * @param index 起始索引
    * @param currentCount 每页显示记录数
    * @return
    */
	 public List<ExpertBean> findExpertByCondition(String name,String expertise,String company,int index,int currentCount);
	  /**
	     * 按id修改专家信息
	     * @param tel 专家电话
	     * @param compoany 工作单位
	     * @param job 职责
	     * @param email 邮箱
	     * @param id 专家id
	     */
	 public void updateById(String tel, String employer,String position,String email,Integer id);
	 /**
	  * 按专家id删除专家信息
	  * @param id 专家id
	  */
	 public void delById(Integer id);
	 /**
	  * 按id查看专家信息
	  * @param id  专家id
	  * @return  专家信息
	  */
	 public ExpertBean findById(Integer id);
	 /**
	  * 添加专家
	  */
	public void addExpert(ExpertBean expertBean);
	
	public int getCount();
}
