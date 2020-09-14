package jUnit333;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class test3798 {

	@Test
	void test() {

		System.out.println("adding test");
		Calculator calculator = new Calculator();
		assertEquals(50, calculator.multiply(10, 5));
	}

	@Test
	void additionButFails() {

		System.out.println("adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.multiply(2, 1));
	}

	@Test
	public void testAssert() {

		System.out.println("trues test");
		Calculator calculator = new Calculator();

		assertTrue(calculator.bool(100, 500));

	}

}
