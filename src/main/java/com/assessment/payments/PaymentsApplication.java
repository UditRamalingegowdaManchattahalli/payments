package com.assessment.payments;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
		
	}
		@Bean
		public Docket swaggerConfiguration() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.ant("/payments/*"))
					.apis(RequestHandlerSelectors.basePackage("com.assessment"))
					.build()
					.apiInfo(apiDetails());
		
	}
		private ApiInfo apiDetails() {
			return new ApiInfo(
			"Address book API",
			"API for Payments A User Has Made In Last 30 Days",
			"1.0",
			"Users",
			new springfox.documentation.service.Contact("Udit Ramalingegowda Manchattahalli", "https://localhost", "rmudit12@gmail.com"),
			"API License",
			"https://localhost",
			Collections.emptyList());
		}
	

}
