package com.j1635web.Mapper;

import java.util.List;

import com.j1635web.bean.DiseaseBean;
/**
 * 病害映射器
 * @author Administrator 陈伟
 *
 */
public interface DiseaseMapper {
	 /**
	    * 添加病害信息
	    * @param diseaseBean 病害实体
	    */
	   public void add( DiseaseBean diseaseBean);
	   /**
	    * 按id查找病害信息
	    * @param id 病害id
	    * @return  病害实体
	    */
	   public DiseaseBean findById(Integer id);
	   /**
	    * 按病害名和症状查找虫害信息集合
	    * @param name 病害名
	    * @param symptom 发病症状
	    * @param index 起始索引
	    * @param currentCount 每页显示记录数
	    * @return  病害信息集合
	    */
	   public List<DiseaseBean> findByItem(String name,String symptom,int index,int currentPage);
	   /**
		 * 得到病害总记录数
		 * @return  总记录数
		 */
		public int getCount(String name,String symptom);
}
