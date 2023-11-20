package com.mms.springCRUD001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mms.springCRUD001.annotation.LogExecutionTime;

@SpringBootApplication
public class SpringCrud001Application {


	@LogExecutionTime
	public static void main(String[] args) {
		SpringApplication.run(SpringCrud001Application.class, args);
	}

}
