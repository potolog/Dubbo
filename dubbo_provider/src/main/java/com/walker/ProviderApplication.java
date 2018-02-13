package com.walker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.walker.dao")
public class ProviderApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProviderApplication.class, args);
	}

}
