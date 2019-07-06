package com.j1635web.service.impl;

import java.util.List;

import com.j1635web.bean.AreaBean;
import com.j1635web.dao.IAreaDao;
import com.j1635web.dao.impl.AreaDaoImpl;
import com.j1635web.service.IAreaService;

/**
 * 区域业务接口实现类
 * @author 罗义桃
 *
 */
public class AreaServiceImpl implements IAreaService{
	
	/**区域持久组件*/
	private IAreaDao dao = new AreaDaoImpl();
	
	@Override
	public List<AreaBean> findByItem(String areaName, String treeKind, String className, Integer currentPage) {

		List<AreaBean> list = dao.findByItem(areaName, treeKind, className, currentPage);
		return list;
		
	}

	@Override
	public void add(AreaBean areaBean) {
		dao.add(areaBean);
		
	}

	@Override
	public int getTotalPageByItem(String areaName, String treeKind, String className) {
		
		Integer totalCount = dao.getTotalCountByItem(areaName, treeKind, className);
		Integer totalPage = (totalCount + 4 - 1)/4;
		
		return totalPage;
	}

	@Override
	public List<AreaBean> findByIte(String areaName, String treeKind, String className) {
		
		return dao.findByIte(areaName, treeKind, className);
	}

}
