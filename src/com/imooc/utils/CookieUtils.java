package com.imooc.utils;
/*
 * Cookie查找的工具类
 * */

import javax.servlet.http.Cookie;

public class CookieUtils {

	public static Cookie findCookie(Cookie[] cookies,String name) {
		if(cookies==null) {
			//说明客户端没有携带cookie
			return null;
		}else {
			// 说明客户端携带cookie
			for (Cookie cookie:cookies) {
				if (name.equals(cookie.getName())) {
					return cookie;
				}
			}
			return null;
		}
		
	}
}
