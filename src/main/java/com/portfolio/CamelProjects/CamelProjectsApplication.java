package com.portfolio.CamelProjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelProjectsApplication  {

	public static final Logger log = LoggerFactory.getLogger(CamelProjectsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CamelProjectsApplication.class, args);
		System.out.println("ss");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		log.info("You can press Ctrl+C anytime to shutdown application");
//		Thread.currentThread().join();
//	}

}
