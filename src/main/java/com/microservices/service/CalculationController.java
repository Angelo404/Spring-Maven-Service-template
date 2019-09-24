package com.microservices.service;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
	
	@GetMapping(path = "/check")
	public String uptimeCheck() {
		return "It is working";
	}
	
	@GetMapping(path = "/checkObj/{something}")
	public DTO objectCheck(@PathVariable("something") String something) {
		return new DTO(something);
	}
	
	@RequestMapping(value = "/addition", method = RequestMethod.POST)
	public void multiply(@RequestBody Map<String, Object> payload) throws Exception {
		System.out.println(payload);

	}

}
