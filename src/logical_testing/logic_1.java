package logical_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logic_1 {
    @Test(priority = 1)
    void evenodd() {
        int num = 4;
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("The number is odd");
    }

    @Test (priority = 2)
    void subtraction()
    {
        System.out.println("This is subtraction class");
    }
    @Test(priority = 3)
    void multiplication()
    {
        int a=3,b=4;
        Assert.assertEquals(12,a*b);
    }
}

