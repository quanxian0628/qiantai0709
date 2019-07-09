package cn.kgc.tangcco.zhangqing.dao;

import java.util.List;

import cn.kgc.tangcco.zhangqing.entity.Menu;

public interface MenuDao {
	/**
	 * 根据uId查询权限菜单
	 * 
	 * @return
	 */
	List<Menu> selectMenu(int uId);
}
