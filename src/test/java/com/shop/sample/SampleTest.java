package com.shop.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTest {
	
	@Autowired
	private Restaurent restaurent;
	
	@Test
	public void textExit() {
		
		assertNotNull(restaurent);
		
		log.info(restaurent);
		log.info("-----");
		log.info(restaurent.getChef());
	}

}
