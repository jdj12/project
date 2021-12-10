package org.project.controller;

import org.project.domain.codybookVO;
import org.project.service.codybookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/basket/*")
@AllArgsConstructor
public class codybookController {

	private codybookService service;
	
	@RequestMapping("/input")
	public void input(codybookVO basket) {
		service.input(basket);
	}
}
