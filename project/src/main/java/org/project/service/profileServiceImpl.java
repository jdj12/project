package org.project.service;

import org.project.domain.profileVO;
import org.project.mapper.profileMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class profileServiceImpl implements profileService {
	
	private profileMapper mapper;

	@Override
	public void insert(profileVO profile) {
		log.info("가입");
		mapper.insert(profile);
	}
	
	@Override
	public profileVO rogin(String id,String pw) {
		log.info("로그인");
		return mapper.rogin(id,pw);
	}

}
