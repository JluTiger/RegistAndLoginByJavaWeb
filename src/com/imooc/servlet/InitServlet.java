package com.imooc.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.imooc.domain.User;

/**
 *	 �û�ע��ĳ�ʼ����servlet
 */
public class InitServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// ����һ��List�������ڱ����û�ע����Ϣ
		List<User> list=new ArrayList<User>();
		// ��List���浽ServletContext��������
		this.getServletContext().setAttribute("list", list);
	}

}
