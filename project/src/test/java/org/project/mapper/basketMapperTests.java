package org.project.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.domain.basketVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class basketMapperTests {

	@Autowired
	basketMapper mapper;
	
	@Test
	public void testinput() {
		basketVO basket = new basketVO();
		basket.setId("1");
		basket.setPcode(3L);
		basket.setAmount(1L);
		basket.setColor("red");
		basket.setPname("1");
		basket.setPrice(1L);
		mapper.input(basket);
	}
}
