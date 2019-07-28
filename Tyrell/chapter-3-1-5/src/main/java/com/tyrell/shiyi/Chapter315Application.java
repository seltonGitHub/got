package com.tyrell.shiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tyrell.shiyi.dao")
public class Chapter315Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter315Application.class, args);
	}

}
