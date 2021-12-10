package org.project.service;

import org.project.domain.codybookVO;
import org.project.mapper.codybookMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class codybookServiceImpl implements codybookService{

	private codybookMapper mapper;
	
	@Override
	public void input(codybookVO codybook) {
		log.info("�벑濡�");
		mapper.input(codybook);
	}
}
