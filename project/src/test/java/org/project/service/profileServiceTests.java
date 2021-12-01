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
		profile.setId("id3");
		profile.setPw("pw3");
		profile.setName("name3");
		profile.setPhone("phone3");
		profile.setAddress("address3");
		profile.setEmail("email3");
		service.insert(profile);
	}
}
