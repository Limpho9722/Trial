import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(2,3);
    }

    @Test
    public void add() {
        int answer = calculator.calculate(4,5);
        Assert.assertEquals(33, answer);
    }



}