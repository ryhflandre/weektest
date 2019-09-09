package com.renyuanhang.controller;

/**
 * flandre
 *
 * 2019年9月9日
 */
public class StringUtils {

	public static boolean isEmpty(String str){
		if(str == null || "".equals(str) || "null".equals(str)){
			return false;
		}
		return true;
	}
	
	public static String toHtml(String context){
		if(isEmpty(context)){
			context = context.replaceAll("\\\\n\\\\r", "\\\\n");
			context = context.replaceAll("\\\\n", "<p></p>");
			context = context.replaceAll("\\\\r", "<br/>");
			return context;
		}
		return "";
	}
	
	public static boolean isPhone(String phone){
		
		return phone.matches("^(137|159|178|133|150)\\d{8}$");
	}
	
	public static boolean isEmail(String email){
		return email.matches("^\\w+\\@\\w+\\.(com|cn)$");
	}
}
