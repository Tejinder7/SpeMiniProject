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
        System.out.println("Testing");
        assertEquals("Finding square root for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.squareRoot(36), DELTA);
    }
}
