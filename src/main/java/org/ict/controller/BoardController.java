package org.ict.controller;

import org.ict.domain.BoardVO;
import org.ict.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	@Autowired
	private BoardService service;

	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.list());
	}

	@RequestMapping("/get")
	public String get(Model model, Long bno) {

		model.addAttribute("get", service.get(bno));
		return "/board/get";
	}

	@GetMapping("/register")
	public String register() {

		return "/board/register";

	}

	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		service.create(board);

		return "redirect:/board/list";

	}

	@PostMapping("/delete")
	public String delete(Long bno, RedirectAttributes rttr) {
		service.drop(bno);
		rttr.addFlashAttribute("bno", bno);

		return "redirect:/board/list";
	}
}
