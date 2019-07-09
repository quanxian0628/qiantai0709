package cn.kgc.tangcco.zhangqing.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.kgc.tangcco.zhangqing.common.DBUtilC3P0;
import cn.kgc.tangcco.zhangqing.dao.UserDao;

public class UserDaoImpl implements UserDao {
	QueryRunner qr = new QueryRunner(DBUtilC3P0.getDataSource());

	@Override
	public int login(String uName, String uPwd) {
		String sql = "select uId from user where uname=? and upwd=?";
		try {
			Integer uId = qr.query(sql, new ScalarHandler<Integer>(), uName, uPwd);
			if (uId != null) {
				return uId;// 大于0，证明有此人
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;// 没有此人返回0
	}

}
