package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.ExpertBean;
import com.j1635web.bean.PageBean;
import com.j1635web.dao.IExpertDao;
import com.j1635web.dao.impl.ExpertDaoImpl;
import com.j1635web.service.IExpertService;

public class ExpertServiceImpl  implements IExpertService{
     private IExpertDao dao=new ExpertDaoImpl();
	@Override
	public PageBean<ExpertBean> findExpertByCondition(String name,String expertise,String company,Integer currentPage) {
		//封装专家bean，返回web层
	    PageBean<ExpertBean> pageBean=new PageBean<ExpertBean>();
	  
	    int currentCount=4;
	    //封装当前页
	    pageBean.setCurrentPage(currentPage);
	    //封装每页显示条数
	    pageBean.setCurrentCount(currentCount);
	    //封装总条数
	    Integer totalCount=dao.getCount();
	    pageBean.setTotalCount(totalCount);
	    //分装总页数
	    Integer totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
	    pageBean.setTotalPage(totalPage);
	    //封装当前页显示的数据
	    int index=(currentPage-1)*currentCount;
	    List<ExpertBean>expertList=dao.findExpertByCondition(name, expertise, company, index, currentCount);
		 pageBean.setList(expertList);
	    return pageBean;
	}

	@Override
	public void updateById(String tel, String company, String job, String email, Integer id) {
		dao.updateById(tel, company, job, email, id);
		
	}

	@Override
	public void delById(Integer id) {
		dao.delById(id);
		
	}

	@Override
	public ExpertBean findById(Integer id) {
		
		return dao.findById(id);
	}

	@Override
	public void addExpert(ExpertBean expertBean) {
		 dao.addExpert(expertBean);
		
	}
}