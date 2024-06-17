package com.spring.sInterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String getboardList(Model model) {
		
		model.addAttribute("data", "이것은 boardController에서 보낸 값입니다." );
		System.out.println("이곳은 board컨트롤러의 boardList메소드 입니다.");
		return "board/boardList";
	}
	@RequestMapping(value = "/boardInput", method = RequestMethod.GET)
	public String getBoardInput(Model model) {
		
		model.addAttribute("data", "이것은 boardController에서 보낸 값입니다." );
		System.out.println("이곳은 board컨트롤러의 boardInput메소드 입니다.");
		return "board/boardInput";
	}
	@RequestMapping(value = "/boardUpdate", method = RequestMethod.GET)
	public String getBoardUpdate(Model model) {
		
		model.addAttribute("data", "이것은 boardController에서 보낸 값입니다." );
		System.out.println("이곳은 board컨트롤러의 boardUpdate메소드 입니다.");
		return "board/boardUpdate";
	}
	
}
