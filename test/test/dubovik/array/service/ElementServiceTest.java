package test.dubovik.array.service;

import com.dubovik.array.service.ElementService;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ElementServiceTest {

    @Test
    public void testIsElementSimple() {
        ElementService test = new ElementService();
        boolean expected = true;
        boolean actual = test.isElementSimple(113);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testIsElementFibonacci() {
        ElementService test = new ElementService();
        boolean expected = true;
        boolean actual = test.isElementFibonacci(6765);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHasElementTwoSame() {
        ElementService test = new ElementService();
        boolean expected = true;
        boolean actual = test.hasElementTwoSame(676);
        Assert.assertEquals(actual, expected);
    }
}