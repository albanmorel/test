import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@org.junit.jupiter.api.Test
	public void testAdd() {
		int valueA = 2;
		int valueB = 3;

		Calculator calc = new Calculator();
		int actual = calc.add(valueA, valueB);

		assertEquals(5, actual);
	}

	@org.junit.jupiter.api.Test
	public void testSub() {
		int valueA = 2;
		int valueB = 3;

		Calculator calc = new Calculator();
		int actual = calc.subtract(valueA, valueB);

		assertEquals(-1, actual);
	}

	@org.junit.jupiter.api.Test
	public void testMultiplie() {
		int valueA = 2;
		int valueB = 3;

		Calculator calc = new Calculator();
		int actual = calc.multiplie(valueA, valueB);

		assertEquals(6, actual);
	}

	@org.junit.jupiter.api.Test
	public void testDivide() {
		int valueA = 10;
		int valueB = 2;

		Calculator calc = new Calculator();
		int actual = calc.divide(valueA, valueB);

		assertEquals(5, actual);

		valueA = 10;
		valueB = 0;
		actual = calc.divide(valueA, valueB);

		assertEquals(0, actual);
	}

	@org.junit.jupiter.api.Test
	public void testIsEven() {
		int number = 2;

		Calculator calc = new Calculator();
		boolean actual = calc.isEven(number);

		assertTrue(actual);

		number = 3;
		actual = calc.isEven(number);

		assertFalse(actual);
	}

	@org.junit.jupiter.api.Test
	public void testIsPrime() {
		int number = 29;

		Calculator calc = new Calculator();
		boolean actual = calc.isPrime(number);

		assertTrue(actual);

		number = 28;
		actual = calc.isPrime(number);

		assertFalse(actual);
	}

}