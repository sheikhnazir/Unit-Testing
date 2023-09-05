package com.example.UnitTesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UnitTestingApplicationTests {

	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {

		//Expected Result
		int expected = 15;

		//Actual Result
		int actual = c.doSum(3, 6, 6);
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void doSum() {

		//Expected
		int expected = 34;

		//Actual
		int actual = c.doProduct(9, 11);
		assertThat(actual).isGreaterThan(expected);
	}

	@Test
	void doCompare() {

		Boolean actual = c.compare(3, 3);

		assertThat(actual).isTrue();
	}
}
