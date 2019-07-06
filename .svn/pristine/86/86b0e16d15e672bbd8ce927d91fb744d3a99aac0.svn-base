package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.UserMapper;
import com.j1635web.bean.UserBean;
import com.j1635web.dao.IUserDao;
import com.j1635web.util.DBUtil;
/**
 * 用户管理持久层实现类
 * @author 罗选红
 *
 */
public class UserDaoImpl implements IUserDao{                 

	@Override
	public void add(UserBean userBean) {
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.add(userBean);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	@Override
	public void del(Integer id) {
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.del(id);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	@Override
	public void update( String password, String userLevel,Integer id) {
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.update(password, userLevel,id);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}


	@Override
	public List<UserBean> findByItem(String userLevel, int currentPage) {
		List<UserBean> list=new ArrayList<UserBean>();
		SqlSession session=null;
		try {
			Integer index=(currentPage-1)*4;
			session=DBUtil.getSqlSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.findByItem(userLevel,index,currentPage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
		
	}
	@Override
	public UserBean login(String userName, String password) {
		SqlSession session=null;
		UserBean UsurBean = new UserBean();
		try {
			session = DBUtil.getSqlSession();
			UserMapper userMapper = session.getMapper(UserMapper.class);
			UsurBean = userMapper.login(userName, password);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return UsurBean;
	}
	
	
	@Override
	public UserBean findById(Integer id) {
	
		UserBean user=new UserBean();
		SqlSession session=null;
		try {
			session=DBUtil.getSqlSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			user= mapper.findById(id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return user;
		
	}

	@Override
	public int getTotalCountByItem(String userLevel) {
		 SqlSession session=null;
		
		 try {
			 if(userLevel==null) {
				 userLevel="";
			 }
			 session=DBUtil.getSqlSession();
			 UserMapper mapper= session.getMapper(UserMapper.class);
			return mapper.getTotalCountByItem(userLevel);
			
		} catch (Exception e) {
	e.printStackTrace();
	}finally {
		session.close();
	}
		return 0;
	}

}
