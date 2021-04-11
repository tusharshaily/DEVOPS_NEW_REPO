import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-6;
    private static final double DELTA1 = 1e-4;

    Calculator calculator = new Calculator();

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding square root of integer for True Positive", 4, calculator.squareroot(16), DELTA);
        assertEquals("Finding square root of double for True Positive", 3.5, calculator.squareroot(12.25), DELTA);
        assertEquals("Finding square root of negative number for True Positive", Double.NaN, calculator.squareroot(-9), DELTA);
    }
    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding square root of integer for False Positive", 6, calculator.squareroot(16), DELTA);
        assertNotEquals("Finding square root of double for False Positive", 7.45, calculator.squareroot(12.25), DELTA);
        assertNotEquals("Finding square root of negative number for False Positive", 5, calculator.squareroot(-9), DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of non-negative number for True Positive", 24, calculator.factorial(4), DELTA);
        assertEquals("Finding factorial of negative number for True Positive", -1, calculator.factorial(-9), DELTA);
    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of non-negative number for False Positive", 65, calculator.factorial(4), DELTA);
        assertNotEquals("Finding factorial of negative number for False Positive", 72, calculator.factorial(-9), DELTA);
    }

    @Test
    public void natlogTruePositive(){
        assertEquals("Finding natural logarithm of positive number for True Positive", 1.38629, calculator.natlog(4), DELTA1);
        assertEquals("Finding natural logarithm of negative number for True Positive", Double.NaN, calculator.natlog(-9), DELTA1);
        assertEquals("Finding natural logarithm of zero for True Positive", Double.NaN, calculator.natlog(0), DELTA1);
    }
    @Test
    public void natlogFalsePositive(){
        assertNotEquals("Finding natural logarithm of positive number for False Positive", 3.45, calculator.natlog(4), DELTA1);
        assertNotEquals("Finding natural logarithm of negative number for False Positive", 6.32, calculator.natlog(-9), DELTA1);
        assertNotEquals("Finding natural logarithm of zero for False Positive", 7.1, calculator.natlog(0), DELTA1);
    }
    @Test
    public void powerTruePositive(){
        assertEquals("Finding power of integer numbers for True Positive", 16, calculator.power(2, 4), DELTA);
        assertEquals("Finding power of double numbers for True Positive", 6.25, calculator.power(2.5, 2), DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power of integer numbers for False Positive", 54, calculator.power(2, 4), DELTA);
        assertNotEquals("Finding power of double numbers for False Positive", 7.3, calculator.power(2.5, 2), DELTA);
    }

}