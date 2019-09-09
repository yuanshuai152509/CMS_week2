package com.yuanshuai.weeks2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yuanshuai.common.utils.StringUtil;
/**
 * 
 * @ClassName: HelloController 
 * @Description: git 提交
 * @author: Administrator
 * @date: 2019年9月9日 上午9:12:56
 */
@Controller
public class HelloController {
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	@PostMapping("hello")
	public String hellos(String content) {
//		(1)测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本。（4分）
		String html = StringUtil.toHtml(content);
		System.out.println(html);
		
		return "hello";
	}

}
