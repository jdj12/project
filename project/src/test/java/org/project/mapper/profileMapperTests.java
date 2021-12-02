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
		profile.setId("id7");
		profile.setPw("pw7");
		profile.setName("name7");
		profile.setPhone("phone7");
		profile.setAddress("address7");
		profile.setEmail("email7");
		mapper.insert(profile);
		
	}
	
	@Test
	public void testrogin() {
		String id="1";
		String pw="2";
		log.info(mapper.rogin(id, pw));
	}
}
