package org.project.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.domain.managerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class managerServiceTest {

	@Autowired
	managerService service;
	
	@Test
	public void roginTest() {
		managerVO manager = new managerVO();
		manager.setMasterid("masterid");
		manager.setMasterpw("masterpw");
		log.info(service.rogin(manager));
	}
}
