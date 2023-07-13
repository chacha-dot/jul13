package com.poseidon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	//board호출하면 동작할 mapper를 만들것입니다.
	
	@GetMapping("/board")
	public String board() {
		return "board";	 //jsp파일명	
	}
	

}
