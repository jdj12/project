package org.project.service;

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
public class profileServiceTests {
	
	@Autowired
	profileService service;
	
	@Test
	public void insertTest() {
		profileVO profile = new profileVO();
		profile.setId("id2");
		profile.setPw("pw2");
		profile.setName("name2");
		profile.setPhone("phone2");
		profile.setAddress("address2");
		service.insert(profile);
	}
	
	@Test
	public void roginTest() {
		String id="id1";
		String pw="pw2";
		log.info(service.rogin(id, pw));
	}
}
