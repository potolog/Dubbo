package com.walker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ConsumerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
