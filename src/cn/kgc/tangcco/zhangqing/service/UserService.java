package cn.kgc.tangcco.zhangqing.service;

public interface UserService {
	/**
	 * 登录，根据账号和密码得到uId
	 * 
	 * @param uName
	 * @param uPwd
	 * @return
	 */
	int login(String uName, String uPwd);
}
