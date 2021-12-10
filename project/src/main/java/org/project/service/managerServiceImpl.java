package org.project.service;

import org.project.domain.managerVO;
import org.project.mapper.managerMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@AllArgsConstructor
@Log4j
@Service
public class managerServiceImpl implements managerService {

	private managerMapper mapper;
	
	@Override
	public managerVO rogin(managerVO manager) {
		log.info("");
		return mapper.rogin(manager);
	}

}
