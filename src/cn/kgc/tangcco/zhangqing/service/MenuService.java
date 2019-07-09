package cn.kgc.tangcco.zhangqing.service;

import java.util.List;

import cn.kgc.tangcco.zhangqing.entity.Menu;

public interface MenuService {
	/**
	 * 根据uId查询权限菜单
	 * 
	 * @return
	 */
	List<Menu> selectMenu(int uId);
}
