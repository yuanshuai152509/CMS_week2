package com.yuanshuai.weeks2.Test;

import org.junit.Test;

import com.yuanshuai.common.utils.StringUtil;

public class Test1 {
//	测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。传一个非法的手机号码测试不通过（4分）。传一次合法的手机号码，测试通过（4分）。
	@Test
	public void isPhone() {
		String str1 = "13812345678";
		String str2 = "1381234567821";
		boolean b1 = StringUtil.isPhoneNumber(str1);
		boolean b2 = StringUtil.isPhoneNumber(str2);
		System.out.println(b1);
		System.out.println(b2);
	}
//	(3)测试StringUtil工具类中的是否为邮箱isEmail()工具方法。传一个非法的邮箱测试不通过（4分）。传一次合法的邮箱，测试通过（4分）。
	@Test
	public void isEmail() {
		String str3 = "asadsd@qqq1.com";
		String str4 = "asadsdqqq1.com";
		boolean b3 = StringUtil.isEmail(str3);
		boolean b4 = StringUtil.isEmail(str4);
		System.out.println(b3);
		System.out.println(b4);
	}

}
