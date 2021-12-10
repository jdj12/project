package org.project.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.domain.codybookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class codybookMapperTests {

	@Autowired
	codybookMapper mapper;
	
	@Test
	public void testinput() {
		codybookVO basket = new codybookVO();
		basket.setId("1");
		basket.setPcode("3");
		basket.setAmount(1L);
		basket.setColor("red");
		basket.setPname("1");
		basket.setPrice(1L);
		mapper.input(basket);
	}
}
