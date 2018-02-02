package example.cobertura_example;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void test1() {
        Assert.assertTrue(new LeapYear().isLeapYear(4));
    }
    
    @Test
    public void test2() {
        Assert.assertTrue(new LeapYear().isLeapYear(400));
    }
}
