import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment3 {

    // Run once at the beginning of the test
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("BeforeClass");
    }


    @Test (priority = 3)
    public void printC() {
        System.out.println("C");
    }

    @Test (priority = 1)
    public void printA() {
        System.out.println("A");
    }

    @Test (priority = 2)
    public void printB() {
        System.out.println("B");
    }
    // Run once at the end of the test
    @AfterClass
    public void runOnceAfterClass() {
        System.out.println("@AfterClass");
    }

}