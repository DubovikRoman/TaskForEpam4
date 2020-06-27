package test.dubovik.array.service;

import com.dubovik.array.entity.CustomArray;
import com.dubovik.array.service.ArrayFindService;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFindServiceTest {

    @Test
    public void testArrayBinarySearch() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 1, 2, 3, 4, 5, 6};
        CustomArray array = new CustomArray(test_array);
        int expected = 6;
        int actual = test.arrayBinarySearch(array, 6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayMaxElementSearch() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 2 ,6, 7, 1 , 5, 3};
        CustomArray array = new CustomArray(test_array);
        int expected = 7;
        int actual = test.arrayMaxElementSearch(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayMinElementSearch() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 2 ,6, 7, 1 , 5, 3};
        CustomArray array = new CustomArray(test_array);
        int expected = 1;
        int actual = test.arrayMinElementSearch(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArraySimpleSearch() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 2, 3, 4, 5, 6, 7 };
        CustomArray array = new CustomArray(test_array);
        int[] expected = { 2, 3, 5, 7, 0, 0, 0 };
        int[] actual = test.arraySimpleSearch(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayFibonacciSearch() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 2, 3, 4, 5, 6 };
        CustomArray array = new CustomArray(test_array);
        int[] expected = { 1, 2, 3, 5, 0, 0 };
        int[] actual = test.arrayFibonacciSearch(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayFindCorrectNumbers() {
        ArrayFindService test = new ArrayFindService();
        int[] test_array = { 1, 222, 314, 432, 555, 6566 };
        CustomArray array = new CustomArray(test_array);
        int[] expected = { 222, 555, 0, 0, 0, 0 };
        int[] actual = test.arrayFindCorrectNumbers(array);
        Assert.assertEquals(expected, actual);
    }
}