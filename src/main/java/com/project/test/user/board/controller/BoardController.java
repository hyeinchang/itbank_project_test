package com.project.test.user.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.test.cafe.dto.CafeDTO;

@Controller
@RequestMapping("/user/board")
public class BoardController {
	@RequestMapping("/writeForm")
	public String writeForm(CafeDTO cafeDTO, Model model) {
		model.addAttribute("cafeDTO", cafeDTO);
		return "user/board/writeForm";
	}
}