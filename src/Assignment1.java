import org.testng.annotations.*;
public class Assignment1 {
    // Run once at the beginning of the test

    @AfterClass
    public void runOnceAfterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("BeforeClass");
    }
    // Run once at the end of the test

    @Test
    public void test_method_3() {
        System.out.println("@Test - test_method_3");
    }
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }
    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

}