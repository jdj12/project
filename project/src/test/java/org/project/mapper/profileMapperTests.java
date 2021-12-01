package org.project.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.domain.profileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class profileMapperTests {
	 
	@Autowired
	profileMapper mapper;
	
	@Test
	public void testInsert() {
		profileVO profile = new profileVO();
		profile.setId("id1");
		profile.setPw("pw1");
		profile.setName("name");
		profile.setPhone("phone");
		profile.setAddress("address");
		profile.setEmail("email");
		mapper.insert(profile);
		
	}
	
	@Test
	public void testRogin() {
		profileVO profile = mapper.rogin("1", "2");
		log.info(profile);
	}
	

}
