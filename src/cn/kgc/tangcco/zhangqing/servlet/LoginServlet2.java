package cn.kgc.tangcco.zhangqing.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kgc.tangcco.zhangqing.common.PropertiesFactory;
import cn.kgc.tangcco.zhangqing.service.UserService;

@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		String uName = request.getParameter("uName");
		String uPwd = request.getParameter("uPwd");

		//System.out.println("账号："+uName+"，密码："+uPwd);
		
		UserService us = (UserService) PropertiesFactory.getInstance("UserService2");
		int uId = us.login(uName, uPwd);

		if (uId > 0) {
			request.getSession().setAttribute("uName", uName);
			request.getSession().setAttribute("uId", uId);
		}

		response.getWriter().print(uId);
	}

}
