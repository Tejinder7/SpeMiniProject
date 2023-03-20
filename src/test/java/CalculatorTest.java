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
        assertEquals("Testing square root for True Positive", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Testing square root for True Positive", 16, calculator.squareRoot(256), DELTA);
        assertEquals("Testing square root for True Positive", 1, calculator.squareRoot(1), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Testing square root for False Positive", 2, calculator.squareRoot(9), DELTA);
        assertNotEquals("Testing square root for False Positive", 5, calculator.squareRoot(36), DELTA);
        assertNotEquals("Testing square root for False Positive", 10, calculator.squareRoot(144), DELTA);
        assertNotEquals("Testing square root for False Positive", 13, calculator.squareRoot(225), DELTA);

    }
}
