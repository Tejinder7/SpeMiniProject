import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator;

    @Before
    public void initializeCalculator(){
        calculator= new Calculator();
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Testing square root for True Positive", 5.0, calculator.squareRoot(25), DELTA);
        assertEquals("Testing square root for True Positive", 16.0, calculator.squareRoot(256), DELTA);
        assertEquals("Testing square root for True Positive", 1.0, calculator.squareRoot(1), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Testing square root for False Positive", 2, calculator.squareRoot(9), DELTA);
        assertNotEquals("Testing square root for False Positive", 5, calculator.squareRoot(36), DELTA);
        assertNotEquals("Testing square root for False Positive", 10, calculator.squareRoot(144), DELTA);
        assertNotEquals("Testing square root for False Positive", 13, calculator.squareRoot(225), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Testing factorial for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Testing factorial for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Testing factorial for True Positive", 5040, calculator.factorial(7), DELTA);
        assertEquals("Testing factorial for True Positive", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Testing factorial for False Positive", 24, calculator.factorial(2), DELTA);
        assertNotEquals("Testing factorial for False Positive", 5040, calculator.factorial(4), DELTA);
        assertNotEquals("Testing factorial for False Positive", 36, calculator.factorial(6), DELTA);
    }


    @Test
    public void naturaLogarithmTruePositive(){
        assertEquals("Testing natural logarithm for True Positive", 0.0, calculator.naturalLog(1), DELTA);
        assertEquals("Testing natural logarithm for True Positive", 1.0986122886681098, calculator.naturalLog(3), DELTA);
        assertEquals("Testing natural logarithm for True Positive", 1.6094379124341003, calculator.naturalLog(5), DELTA);
    }

    @Test
    public void naturalLogarithmFalsePositive(){
        assertNotEquals("Testing natural logarithm for False Positive", 0.0, calculator.naturalLog(2), DELTA);
        assertNotEquals("Testing natural logarithm for False Positive", 2.0, calculator.naturalLog(4), DELTA);
    }


    @Test
    public void powerTruePositive(){
        assertEquals("Testing power function for True Positive", 4.0, calculator.power(2,2), DELTA);
        assertEquals("Testing power function for True Positive", 243.0, calculator.power(3,5), DELTA);
        assertEquals("Testing power function for True Positive", 216.0, calculator.power(6,3), DELTA);
        assertEquals("Testing power function for True Positive", 1.0, calculator.power(1,4), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Testing power function for False Positive", 5, calculator.power(2,3), DELTA);
        assertNotEquals("Testing power function for False Positive", 6, calculator.power(3,2), DELTA);
        assertNotEquals("Testing power function for False Positive", 20, calculator.power(5,4), DELTA);
        assertNotEquals("Testing power function for False Positive", 10, calculator.power(1,6), DELTA);
    }
}

