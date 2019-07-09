package cn.kgc.tangcco.zhangqing.service.impl;

import java.util.List;

import cn.kgc.tangcco.zhangqing.common.PropertiesFactory;
import cn.kgc.tangcco.zhangqing.dao.MenuDao;
import cn.kgc.tangcco.zhangqing.entity.Menu;
import cn.kgc.tangcco.zhangqing.service.MenuService;

public class MenuServiceImpl implements MenuService {
	private MenuDao md = (MenuDao) PropertiesFactory.getInstance("MenuDao");

	@Override
	public List<Menu> selectMenu(int uId) {
		return md.selectMenu(uId);
	}

}
