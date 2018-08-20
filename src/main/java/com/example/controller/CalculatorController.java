package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.AdditionService;

@Controller
public class CalculatorController {

	@Autowired
	AdditionService additionService;

	@GetMapping("/")
	public String calculatorPage(Model model) {
		model.addAttribute("number1", "");
		model.addAttribute("number2", "");
		model.addAttribute("sum", "");
		return "calculator";
	}

	@PostMapping("/sum")
	public String add(@RequestParam(name = "number1", required = false, defaultValue = "0") String number1,
			@RequestParam(name = "number2", required = false, defaultValue = "0") String number2, Model model) {
		model.addAttribute("number1", number1);
		model.addAttribute("number2", number2);
		model.addAttribute("sum", additionService.add(number1, number2));
		return "calculator";
	}

}
