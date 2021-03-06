package org.project.controller;

import org.project.domain.profileVO;
import org.project.service.profileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/profile/*")
@AllArgsConstructor
public class profileController {
	
	private profileService service;
	
	@RequestMapping("/insert")
	public void insert(profileVO profile) {
		service.insert(profile);
		
	}
	
	@RequestMapping("/rogin")
	public profileVO rogin(String id,String pw) {
		return service.rogin(id, pw);
	}

}
