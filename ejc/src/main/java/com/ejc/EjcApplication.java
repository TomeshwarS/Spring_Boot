package com.ejc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ejc.controller.AppController;

@SpringBootApplication
@ComponentScan("com.ejc")
public class EjcApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(EjcApplication.class, args);

	AppController app=(AppController)ctx.getBean(AppController.class);
	
	app.welcome();
	
	
	}
	
	

}
