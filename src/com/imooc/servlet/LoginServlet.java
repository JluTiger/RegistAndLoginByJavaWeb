package com.imooc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.domain.User;

/**
 * 用户登录的Servlet
 */
public class LoginServlet extends HttpServlet {
	
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收数据
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		// 从ServletContext中获得保存用户信息集合
		List<User> list=(List<User>)this.getServletContext().getAttribute("list");
		for(User user:list) {
			// 判断用户名是否正确
			if(username.equals(user.getUsername())) {
				if(password.equals(user.getPassword())) {
					//登录成功
					
					//判断复选框是否勾选
					String remember=request.getParameter("remember");
					if("true".equals(remember)) {
						//记住用户名
						Cookie cookie=new Cookie("username", user.getUsername());
						// 设置有效路径和有效时间
						cookie.setPath("/reg_login");
						// 设置有效时间
						cookie.setMaxAge(60*60*24);// 保存24小时
						// 将cookie回写到浏览器
						response.addCookie(cookie);
					}
					
					// 将用户信息保存session
					request.getSession().setAttribute("user", user);
					response.sendRedirect("/reg_login/success.jsp");
					return;
				}
			}
		}
		
		// 登陆失败
		request.setAttribute("msg", "用户名或者密码错误");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
