import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test
    public void test_method_1() {
        int x = 13;
        int y = 5;
        Assert.assertEquals(x,y);
    }
    @Test
    public void test_method_2() {
        int x = 5;
        int y = 5;
        Assert.assertEquals(x,y);
    }
}