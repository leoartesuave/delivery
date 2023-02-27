package com.delivery.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class deliveryController {
	@GetMapping("/delivery")
	public String delivery() {
		return " delivery!!!" ;
	}

}
