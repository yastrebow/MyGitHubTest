import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int m;
    int n;

    @Before
    public void setUp() {
        m = 12;
        n = 3;
    }

    @Test
    public void testAdd() {
        int result = 15;
        Assert.assertEquals("12 + 3 must be equal 15", result, MyCalculator.add(m, n));
    }

    @Test
    public void testSub() {
        int result = 9;
        Assert.assertEquals("12 - 3 must be equal 9", result, MyCalculator.sub(m, n));
    }

    @Test
    public void testMulti() {
        int result = 36;
        Assert.assertEquals("12 * 3 must be equal 36", result, MyCalculator.mult(m, n));
    }

    @Test
    public void testDiv() {
        float result = 4.0000f;
       Assert.assertEquals("12 / 3 must be equal about 4", result, MyCalculator.div(m, n), 0.0001);
    }
}
