package com.manimani.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manimani.web.controller","com.manimani.web.vo"
								,"com.manimani.web.dao","com.manimani.web.service"})
public class ManiManiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiManiApplication.class, args);
	}

}
