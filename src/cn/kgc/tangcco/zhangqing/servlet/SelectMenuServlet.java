package cn.kgc.tangcco.zhangqing.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.kgc.tangcco.zhangqing.common.PropertiesFactory;
import cn.kgc.tangcco.zhangqing.entity.Menu;
import cn.kgc.tangcco.zhangqing.service.MenuService;

@WebServlet("/SelectMenuServlet")
public class SelectMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		// 获得用户Id
		Integer uId = (Integer) request.getSession().getAttribute("uId");
		//System.out.println("uId:" + uId);

		MenuService ms = (MenuService) PropertiesFactory.getInstance("MenuService");
		List<Menu> mList = ms.selectMenu(uId);

		String json = JSON.toJSONString(mList);

		//System.out.println(json);

		response.getWriter().print(json);

	}

}
