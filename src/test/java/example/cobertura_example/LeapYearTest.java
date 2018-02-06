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
    
    @Test
    public void test3() {
        Assert.assertFalse(new LeapYear().isLeapYear(100));
    }
    
    @Test
    public void test4() {
        Assert.assertFalse(new LeapYear().isLeapYear(1));
    }
}
