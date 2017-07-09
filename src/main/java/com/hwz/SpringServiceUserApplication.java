package com.hwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceUserApplication.class, args);
	}
}
