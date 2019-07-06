package com.j1635web.service;

import com.j1635web.bean.ExpertBean;
import com.j1635web.bean.PageBean;
/**
 * 专家业务层接口
 * @author 乔荣升
 *
 */
public interface IExpertService {

   /**
    * 按条件查找专家信息集合
    * @param expertMap  String 专家信息键 Object 专家信息值 
    * @return 专家信息集合
    */
	 public PageBean<ExpertBean> findExpertByCondition(String name,String expertise,String company,Integer currentPage);

	 public void updateById(String tel, String company,String job,String email,Integer id);
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
}
