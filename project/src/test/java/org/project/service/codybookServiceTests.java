package org.project.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.domain.codybookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class codybookServiceTests {

	@Autowired
	codybookService service;
	
	@Test
	public void inputTest() {
		codybookVO codybook = new codybookVO();
		codybook.setId("id2");
		codybook.setPcode("1");
		codybook.setAmount(1L);
		codybook.setColor("red");
		codybook.setPname("1");
		codybook.setPrice(1L);
		service.input(codybook);
	}
}
