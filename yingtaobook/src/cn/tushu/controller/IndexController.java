package cn.tushu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tushu.service.UserService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/toIndex.do")
	public String toIndex(){
		return "index";
	}
	
	@RequestMapping("/toTop.do")
	public String toTop(){
		return "index/top";
	}
	
	@RequestMapping("/toRight.do")
	public String toRright(){
		return "right";
	}
	
	@RequestMapping("/toBody.do")
	public String toBody(){
		return "index/body";
	}
	
}
