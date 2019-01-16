package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import model.TimeEntry;

@SpringBootApplication
@ComponentScan("controller")
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
public class SpringBootDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoProjectApplication.class, args);

		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		TimeEntry t1 = new TimeEntry("test", "test");

		System.out.println(t1.getTime());
	}

}
