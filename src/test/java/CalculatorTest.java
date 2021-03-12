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

}