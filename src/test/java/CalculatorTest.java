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

    @Test
    public void testAdd(){
        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.add(a,b);

        assertEquals(5, actual);
    }
    @Test
    public void testSub(){
        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.subtract(a,b);

        assertEquals(-1, actual);
    }

}