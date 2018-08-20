package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.AdditionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorServiceTest {

	@Autowired
	private AdditionService additionService;

	@Test
	public void checkAddition() throws Exception {
		assertThat(additionService.add("10.30", "20.05")).isEqualTo("30");
	}
}
