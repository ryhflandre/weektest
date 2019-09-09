package com.renyuanhang.test;

import java.util.Scanner;

import com.renyuanhang.controller.StringUtils;

/**
 * flandre
 *
 * 2019年9月9日
 */
public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String result = StringUtils.toHtml(str1);
		System.out.println(result);
		
		
		String str2 = sc.next();
		if(StringUtils.isPhone(str2)){
			System.out.println("验证成功是一个手机号");
		}else{
			System.out.println("这不是一个手机号");
		}
		
		
		String str3 = sc.next();
		if (StringUtils.isEmail(str3)) {
			System.out.println("验证成功是一个邮箱号");
		}else{
			System.out.println("这不是一个邮箱");
		}
		System.out.println();
	}
}
