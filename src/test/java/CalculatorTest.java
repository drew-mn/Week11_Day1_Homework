import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int result = calculator.add(30, 20);
        assertEquals(50, result);
    }

    @Test
    public void canSubtract() {
        int result = calculator.subtract(29, 9);
        assertEquals(20, result);
    }

    @Test
    public void canMultiply() {
        int result = calculator.multiply(25, 3);
        assertEquals(75, result);
    }

    @Test
    public void canDivide() {
        int result = calculator.divide(50, 2);
        assertEquals(25, result);
    }
}