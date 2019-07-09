package cn.kgc.tangcco.zhangqing.service.impl;

import cn.kgc.tangcco.zhangqing.common.PropertiesFactory;
import cn.kgc.tangcco.zhangqing.dao.UserDao;
import cn.kgc.tangcco.zhangqing.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao ud = (UserDao) PropertiesFactory.getInstance("UserDao2");

	@Override
	public int login(String uName, String uPwd) {
		return ud.login(uName, uPwd);
	}
}
