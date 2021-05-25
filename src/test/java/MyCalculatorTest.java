import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int n;
    int m;

    @Before
    public void setUp() {
        n = 11;
        m = 7;
    }

    @Test
    public void testAdd() {
        int result = 18;
        Assert.assertEquals("11 + 7 must be equal 18", result, MyCalculator.add(n, m));
    }

    @Test
    public void testSub() {
        int result = 4;
        Assert.assertEquals("11 - 7 must be equal 4", result, MyCalculator.sub(n, m));
    }

    @Test
    public void testMulti() {
        int result = 77;
        Assert.assertEquals("11 * 7 must be equal 18", result, MyCalculator.multi(n, m));
    }

    @Test
    public void testDiv() {
        float result = 1.5714f;
       Assert.assertEquals("11 / 7 must be equal about 1.5714", result, MyCalculator.div(n, m), 0.0001);
    }
}
