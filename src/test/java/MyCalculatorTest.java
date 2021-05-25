import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int m;
    int n;

    @Before
    public void setUp() {
        m = 15;
        n = 3;
    }

    @Test
    public void testAdd() {
        int result = 18;
        Assert.assertEquals("15 + 3 must be equal 18", result, MyCalculator.add(m, n));
    }

    @Test
    public void testSub() {
        int result = 12;
        Assert.assertEquals("15 - 3 must be equal 12", result, MyCalculator.sub(m, n));
    }

    @Test
    public void testMulti() {
        int result = 45;
        Assert.assertEquals("15 * 3 must be equal 45", result, MyCalculator.mult(m, n));
    }

    @Test
    public void testDiv() {
        float result = 5.0000f;
       Assert.assertEquals("15 / 3 must be equal about 5", result, MyCalculator.div(m, n), 0.0001);
    }
}
