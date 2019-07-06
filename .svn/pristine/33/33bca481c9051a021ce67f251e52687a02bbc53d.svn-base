package com.j1635web.service;

import java.util.List;

import com.j1635web.bean.UserBean;

/**
 * 用户业务层接口
 * @author Administrator 罗选红
 *
 */
public interface IUserService {
	/**
	 * 添加用户信息
	 * @param userBean 用户实体
	 */
     public  void add(UserBean  userBean);
     /**
      * 删除用户信息
      * @param id 用户id
      */
     
     public void del(Integer id);
     
     /**
      * 根据id查询用户信息
      * @param id
      * @return 返回用户实体 
      */
     public UserBean findById(Integer id);
     /**
      * 修改用户信息
      * @param id 用户id
      * @param password 用户密码
      * @param userLevel 用户等级
      */
     public void update(String password,String userLevel,Integer id);
     /**
      * 按用户等级查找用户集合
      * @param userLevel 用户等级
      * @return 用户集合
      */
     public List<UserBean> findByItem(String userLevel,Integer currentPage );
 	/**
 	 * 登陆方法
 	 * @param userName 用户名
 	 * @param password 密码
 	 * @return 用户实体，如果登录成功返回用户实体对象，失败则返回空
 	 */
      public UserBean login(String userName,String password);
      /**
       * * 按用户等级查找用户集合
       * @param userLevel 用户等级
       * @return 返回总记录条数
       */
      public int getTotalCountByItem(String userLevel );
     
}
