import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int a;
    int b;

    @Before
    public void setUp() {
        a = 9;
        b = 7;
    }

    @Test
    public void testAdd() {
        int result = 16;
        Assert.assertEquals("9 + 7 must be equal 16", result, MyCalculator.add(a, b));
    }

    @Test
    public void testSub() {
        int result = 2;
        Assert.assertEquals("9 - 7 must be equal 2", result, MyCalculator.sub(a, b));
    }

    @Test
    public void testMulti() {
        int result = 63;
        Assert.assertEquals("9 * 7 must be equal 63", result, MyCalculator.mult(a, b));
    }

    @Test
    public void testDiv() {
        float result = 1.2857f;
       Assert.assertEquals("9 / 7 must be equal about 1.2857", result, MyCalculator.div(a, b), 0.0001);
    }
}
