package com.dothings.training.trainingregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrainingRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingRegisterApplication.class, args);

	}
}
