package org.project.controller;

import org.project.domain.basketVO;
import org.project.service.basketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/basket/*")
@AllArgsConstructor
public class basketController {

	private basketService service;
	
	@RequestMapping("/input")
	public void input(basketVO basket) {
		service.input(basket);
	}
}
