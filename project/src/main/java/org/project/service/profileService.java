package org.project.service;

import org.project.domain.profileVO;

public interface profileService {

	//로그인
	public void insert(profileVO profile);
	
	public profileVO rogin(String id,String pw);
	
}
