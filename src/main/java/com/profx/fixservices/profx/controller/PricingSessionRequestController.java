package com.profx.fixservices.profx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PricingSessionRequestController {
	
	
	@GetMapping("/pricingSessionRequest")
	public String getPricingSessionRequest(){
		System.out.print("PricingSessionRequest controller");
		return "PricingSessionRequest";
	}

}
