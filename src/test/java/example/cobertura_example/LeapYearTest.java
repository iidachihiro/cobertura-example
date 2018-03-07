package example.cobertura_example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LeapYearTest {
    
    @Rule
    public Timeout globalTimeout= new Timeout(20);
    
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
        Assert.assertTrue(new LeapYear().isLeapYear(100));
    }
    
    @Test
    public void test4() {
        Assert.assertFalse(new LeapYear().isLeapYear(1));
    }
    
    @Test
    public void test5() {
        // time out
        while(true) {
            
        }
    }
}
