import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {
    int x;
    int y;

    @Before
    public void setUp() {
        x = 7;
        y = 11;
    }

    @Test
    public void testAdd() {
        int result = 18;
        Assert.assertEquals("7 + 11 must be equal 18", result, MyCalculator.add(x, y));
    }

    @Test
    public void testSub() {
        int result = -4;
        Assert.assertEquals("7 - 11 must be equal -4", result, MyCalculator.sub(x, y));
    }

    @Test
    public void testMulti() {
        int result = 77;
        Assert.assertEquals("7 * 11 must be equal 18", result, MyCalculator.multi(x, y));
    }

    @Test
    public void testDiv() {
        float result = 0.6363f;
       Assert.assertEquals("7 / 11 must be equal about 0.6363", result, MyCalculator.div(x, y), 0.0001);
    }
}
