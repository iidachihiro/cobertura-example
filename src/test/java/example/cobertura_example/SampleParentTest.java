package example.cobertura_example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SampleParentTest {
    
    LeapYear ly;
    
    @Before
    public void setUp() {
        ly = new LeapYear();
    }
    
    @Test
    public void test3() {
        Assert.assertEquals(false, ly.isLeapYear(100));
    }
    
}
