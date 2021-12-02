package org.project.mapper;

import org.apache.ibatis.annotations.Param;
import org.project.domain.profileVO;

public interface profileMapper {
	
	//회원가입
	public void insert(profileVO profile);
	
	//로그인
	public profileVO rogin(@Param("id")String id,@Param("pw")String pw);
}
