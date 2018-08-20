package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AdditionService;

@RestController
public class AdditionRestController {

	@Autowired
	AdditionService additionService;

	@GetMapping("/add")
	@ResponseBody
	public String add(@RequestParam(name = "number1", required = false, defaultValue = "0") String number1,
			@RequestParam(name = "number2", required = false, defaultValue = "0") String number2) {
		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);
		return additionService.add(number1, number2);
	}
}
