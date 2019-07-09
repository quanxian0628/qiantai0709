package cn.kgc.tangcco.zhangqing.dao;

public interface UserDao {
	/**
	 * 登录，根据账号和密码得到uId
	 * @param uName
	 * @param uPwd
	 * @return
	 */
	int login(String uName, String uPwd);
}
