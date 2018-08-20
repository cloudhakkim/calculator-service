package com.example.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {

	private Addition<BigDecimal> addition = (number1, number2) -> {
		return number1.add(number2);
	};

	public String add(String number1, String number2) {
		return this.addition.add(new BigDecimal(number1), new BigDecimal(number2)).toString();
	}

}
