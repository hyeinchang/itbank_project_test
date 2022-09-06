package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("")
	public String index() {
		System.out.println("찾았니??111");
		return "admin/index";
	}
	
	@GetMapping("/board/list")
	public String index2() {
		System.out.println("??");
		return "admin/board/list";
	}
}