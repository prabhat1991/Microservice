package com.prabhat.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan("com.prabhat.*")
public class EmployeeApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EmployeeApplication.class).run(args);
	}

	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.prabhat.controller")).paths(PathSelectors.any()).build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API")
						.description("Documentation Employee API v1.0").build());
	}

}
