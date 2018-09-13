package com.prabhat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getConsumersFallback")
	@GetMapping("/getConsumers")
	public List getConsumers(){
		System.out.println("Inside getConsumers() method");
		return restTemplate.getForObject("http://EMPLOYEE-SERVICE/getEmployees", List.class);
	}
	
	public List getConsumersFallback(){
		System.out.println("Inside getConsumersFallback() method");
		return new ArrayList<>();
	}
}
