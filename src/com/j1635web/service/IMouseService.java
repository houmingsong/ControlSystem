package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.MouseBean;

/**
 * 鼠害持久层接口
 * @author 陈伟
 *
 */
public interface IMouseService {
   /**
    * 添加鼠害信息
    * @param diseaseBean 鼠害实体
    */
   public void add(MouseBean mouseBean);
   /**
    * 按id查找鼠害信息
    * @param id 鼠害id
    * @return  鼠害实体
    */
   public MouseBean findById(Integer id);
   /**
    * 按鼠害名查找鼠害信息集合
    * @param name 鼠害名
    * @return  鼠害信息集合
    */
   public List<MouseBean> findByItem(String name,Integer currentPage);
   
   public int getCount(String name,Integer currentPage);
}
