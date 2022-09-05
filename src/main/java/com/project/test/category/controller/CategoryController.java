package com.project.test.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@GetMapping("iboard")
	public String iboard(String layout) {
		System.out.println("layout : " + layout);
		return "redirect:/";
	}
}
