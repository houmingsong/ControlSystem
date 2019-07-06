package com.j1635web.service.impl;

import java.util.List;
import com.j1635web.bean.UserBean;
import com.j1635web.dao.IUserDao;
import com.j1635web.dao.impl.UserDaoImpl;
import com.j1635web.service.IUserService;
/**
 * 用户业务层实现类
 * @author 罗选红
 *
 */
public class UserServiceImpl implements IUserService{
    private IUserDao user=new UserDaoImpl();
	@Override
	public void add(UserBean userBean) {
		user.add(userBean);
		
	}

	@Override
	public void del(Integer id) {
		user.del(id);
		
	}

	


	@Override
	public List<UserBean> findByItem(String userLevel, Integer currentPage) {
	
		List<UserBean> list=user.findByItem(userLevel, currentPage);
		
		return list;
		
	}

	@Override
	public UserBean login(String userName, String password) {
		// TODO Auto-generated method stub
		return user.login(userName, password);
	}

	@Override
	public UserBean findById(Integer id) {
		
		return user.findById(id);
	}


	@Override
	public void update( String password, String userLevel,Integer id) {
		user.update(password, userLevel, id);
		
	}

	@Override
	public int getTotalCountByItem(String userLevel) {
		Integer totalCount=user.getTotalCountByItem(userLevel);
		Integer totalPage=(totalCount+4-1)/4;
		return totalPage;
	}

}
