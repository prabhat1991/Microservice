package com.prabhat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboadApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboadApplication.class, args);
	}
}
