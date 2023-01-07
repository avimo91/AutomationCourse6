import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class Assignment2 {
    @Test
    public void assertionTest (){
        int x = 1;
        int y = 2;
        assertNotEquals(x,y);
    }

}
