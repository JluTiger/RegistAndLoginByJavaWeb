package com.imooc.utils;
/*
 * Cookie���ҵĹ�����
 * */

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static Cookie findCookie(Cookie[] cookies,String name) {
		if(cookies==null) {
			//˵���ͻ���û��Я��cookie
			return null;
		}else {
			// ˵���ͻ���Я��cookie
			for (Cookie cookie:cookies) {
				if (name.equals(cookie.getName())) {
					return cookie;
				}
			}
			return null;
		}
		
	}
}
