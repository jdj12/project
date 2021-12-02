package org.project.service;

import org.project.domain.basketVO;
import org.project.mapper.basketMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class basketServiceImpl implements basketService{

	private basketMapper mapper;
	
	@Override
	public void input(basketVO basket) {
		log.info("등록");
		mapper.input(basket);
	}
}
