package com.atguigu.clint;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class MainClint {

	public static void main(String[] args) {
		PhoneCheck phoneCheck = new PhoneCheckImplService().getPhoneCheckImplPort();
		String area = phoneCheck.checkAreaByPhoneNum(args[0]);
		String type = phoneCheck.checkTypeByPhoneNum(args[0]);
		System.out.println("地区:" + area);
		System.out.println("运营商:" + type);
	}

}
