import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int a;
    int b;

    @Before
    public void setUp() {
        a = 11;
        b = 7;
    }

    @Test
    public void testAdd() {
        int result = 18;
        Assert.assertEquals("11 + 7 must be equal 18", result, MyCalculator.add(a, b));
    }

    @Test
    public void testSub() {
        int result = 4;
        Assert.assertEquals("11 - 7 must be equal 4", result, MyCalculator.sub(a, b));
    }

    @Test
    public void testMulti() {
        int result = 77;
        Assert.assertEquals("11 * 7 must be equal 18", result, MyCalculator.multi(a, b));
    }

    @Test
    public void testDiv() {
        float result = 1.5714f;
       Assert.assertEquals("11 / 7 must be equal about 1.5714", result, MyCalculator.div(a, b), 0.0001);
    }
}
