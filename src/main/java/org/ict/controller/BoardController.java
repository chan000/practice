package org.ict.controller;

import org.ict.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService service;

	@RequestMapping("/list")
	public void getList(Model model) {
		model.addAttribute("list", service.get());
	}
	
	@RequestMapping("/get")
	public void get(Model model, int bno) {
		model.addAttribute("board", service.read(bno));
		
	}
	

}
