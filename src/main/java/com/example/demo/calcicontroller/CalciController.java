package com.example.demo.calcicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.calciservices.CalciServices;

@RestController
@RequestMapping(value = "calc")
public class CalciController {

	@Autowired
	private CalciServices calcService;

	@GetMapping(value = "/addition/{value1}/{value2}")
	private Integer additionOperation(@PathVariable Integer value1, @PathVariable Integer value2) {
		return calcService.additionOperation(value1, value2);
	}

	@GetMapping(value = "/subtraction/{value1}/{value2}")
	private Integer subtractionOperation(@PathVariable Integer value1, @PathVariable Integer value2) {
		return calcService.subtractionOperation(value1, value2);

	}

	@GetMapping(value = "/multiplication/{value1}/{value2}")
	private Integer multiplicationOperation(@PathVariable Integer value1, @PathVariable Integer value2) {
		return calcService.multiplicationOperation(value1, value2);

	}

	@GetMapping(value = "/division/{value1}/{value2}")
	private Integer
	
	divisionOperation(@PathVariable Integer value1, @PathVariable Integer value2) {
		return calcService.divisionOperation(value1, value2);

	}
}
