package com.renyuanhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * flandre
 *
 * 2019年9月9日
 */
@Controller
public class StringController {
	
	@RequestMapping("check.do")
	@ResponseBody
	public boolean check(String context,String phone,String email){
		if(StringUtils.isEmpty(context)){
			System.out.println("+++++++++++++++"+context);
			System.out.println("+++++++++++++++"+phone);
			System.out.println("+++++++++++++++"+email);
			String result = StringUtils.toHtml(context);
			System.out.println(result);
			if(StringUtils.isPhone(phone)){
				System.out.println("验证成功是一个手机号");
			}else{
				System.out.println("这不是一个手机号");
			}
			
			
			
			if (StringUtils.isEmail(email)) {
				System.out.println("验证成功是一个邮箱号");
			}else{
				System.out.println("这不是一个邮箱的");
			}
			return true;
		}
		return false;
	}
}
