package com.sbs.example.myBlog.controller.usr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.example.myBlog.service.ArticleService;

@Controller
public class HomeController {

	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "HI";
	}
}
