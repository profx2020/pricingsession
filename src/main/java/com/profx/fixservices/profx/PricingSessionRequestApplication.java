package com.profx.fixservices.profx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
@EnableEurekaClient
@EnableFeignClients

public class PricingSessionRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingSessionRequestApplication.class, args);
		
			
		      System.out.println("PricingSessionRequest");
		    
	}
	
	

}
