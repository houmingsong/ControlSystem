package com.j1635web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.j1635web.Mapper.ExpertMapper;
import com.j1635web.bean.ExpertBean;
import com.j1635web.dao.IExpertDao;
import com.j1635web.util.DBUtil;
/**
 * 专家持久层实现类
 * @author 乔荣升
 *
 */
public class ExpertDaoImpl  implements  IExpertDao{


	@Override
	public   List<ExpertBean> findExpertByCondition(String name,String expertise,String company,int index,int currentCount) {
		SqlSession session=null;
		 List<ExpertBean> expertList=new ArrayList<ExpertBean>();
		try {
			session=DBUtil.getSqlSession();
			   ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			     expertList = mapper.findExpertByCondition(name,expertise,company,index,currentCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return expertList;
	}

	@Override
	public void updateById(String tel, String company,String job,String email,Integer id) {
		SqlSession session=null;
		try {
			   session=DBUtil.getSqlSession();
			    ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			    mapper.updateById(tel,company,job,email,id);
			    session.commit();
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			session.close();
		}
	}

	@Override
	public void delById(Integer id) {
	     SqlSession session=null;
	     try {
	    	 session=DBUtil.getSqlSession();
			 ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			   mapper.delById(id);
			   session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	@Override
	public ExpertBean findById(Integer id) {
	    SqlSession session=null;
	    ExpertBean expertBean=new ExpertBean();
	    try {
	    	session=DBUtil.getSqlSession();
			   ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			   expertBean=mapper.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return expertBean;
	}

	@Override
	public void addExpert(ExpertBean expertBean) {
		SqlSession session=null;
		try {
			 session=DBUtil.getSqlSession();
			 ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			 mapper.addExpert(expertBean);
			 session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	@Override
	public int getCount() {
		SqlSession session=null;
		Integer totalCount=0;
		try {
			 session=DBUtil.getSqlSession();
			 ExpertMapper mapper = session.getMapper(ExpertMapper.class);
			  totalCount = mapper.getCount();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return totalCount;
	}
//public static void main(String[] args) {
// 	ExpertDaoImpl dao=new ExpertDaoImpl();

//     dao.findExpertByCondition(null,null,null,0,2);
// 	System.out.println(dao.getCount());
//    System.out.println(dao.findById(1));
//   dao.updateById("1111111", "dsds", "23", "dffd", 2);
//	dao.delById(2);
//	ExpertBean expertBean=new ExpertBean(null, "dsds", "dsfsdf1", "1996-08-03", "sdsd", "324", "dsfdfg", "3432sd", "dfdf", "fdf", "123");
//    dao.addExpert(expertBean);
// 	ExpertBean expertBean=new ExpertBean();
//    expertBean.setName("jie");
//    expertBean.setSex("男");
//    expertBean.setBirthday("1994-01-23");
//    expertBean.setExpertise("回首掏");
//    expertBean.setTel("11342354574");
//    expertBean.setAddress("sfddsf");
//    expertBean.setJob("dfdsf");
//    expertBean.setCompany("dfdsf");
//    expertBean.setEmail("dfdsfdsf");
//    expertBean.setImage("fsdrfd");
//    dao.addExpert(expertBean);
//}

}
