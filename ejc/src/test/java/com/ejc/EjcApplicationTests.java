package com.ejc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ejc.controller.AppController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjcApplicationTests {
	
	@Autowired
	AppController appController;

	@Test
	public void contextLoads() {
		
		appController.welcome();
	}

}