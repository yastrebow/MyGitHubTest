import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int a;
    int b;

    @Before
    public void setUp() {
        a = 7;
        b = 11;
    }

    @Test
    public void testAdd() {
        int result = 18;
        Assert.assertEquals("7 + 11 must be equal 18", result, MyCalculator.addition(a, b));
    }

    @Test
    public void testSub() {
        int result = -4;
        Assert.assertEquals("7 - 11 must be equal -4", result, MyCalculator.subtraction(a, b));
    }

    @Test
    public void testMulti() {
        int result = 77;
        Assert.assertEquals("7 * 11 must be equal 18", result, MyCalculator.multiplication(a, b));
    }

    @Test
    public void testDiv() {
        float result = 0.6363f;
       Assert.assertEquals("7 / 11 must be equal about 0.6363", result, MyCalculator.divide(a, b), 0.0001);
    }
}
