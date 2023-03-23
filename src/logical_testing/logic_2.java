package logical_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logic_2 {
    @Test
    public void add() {
        int a = 3, b = 6;
        int c = a + b;
        Assert.assertEquals(9, c);
    }
    @Test
    public void mul(){
        int a=5, b=6;
        int c=a*b;
        Assert.assertEquals(30,c);
    }
}

