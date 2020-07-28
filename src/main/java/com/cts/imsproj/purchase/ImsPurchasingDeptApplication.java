package com.cts.imsproj.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2 
public class ImsPurchasingDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsPurchasingDeptApplication.class, args);
	}
	
	@Bean
	public Docket api() {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          .apis(RequestHandlerSelectors.basePackage("com.cts"))              
		          .paths(PathSelectors.any())                          
		          .build();
		}
}
