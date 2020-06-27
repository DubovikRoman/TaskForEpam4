package test.dubovik.array.service;

import com.dubovik.array.entity.CustomArray;
import com.dubovik.array.service.ArraySortService;
import org.testng.Assert;

import static org.testng.Assert.*;

public class ArraySortServiceTest {

    @org.testng.annotations.Test
    public void testArrayBubbleSort() {
        ArraySortService test = new ArraySortService();
        int[] test_array = { 1, 2 ,6, 1 , 5, 3};
        CustomArray array = new CustomArray(test_array);
        int[] expected_array  = {1, 1, 2, 3, 5, 6};
        int[] actual_array = test.arrayBubbleSort(array).getArray();
        Assert.assertEquals(actual_array, expected_array);
    }

    @org.testng.annotations.Test
    public void testArrayInsertSort() {
        ArraySortService test = new ArraySortService();
        int[] test_array = { 1, 2 ,6, 1 , 5, 3};
        CustomArray array = new CustomArray(test_array);
        int[] expected_array  = {1, 1, 2, 3, 5, 6};
        int[] actual_array = test.arrayInsertSort(array).getArray();
        Assert.assertEquals(actual_array, expected_array);
    }

    @org.testng.annotations.Test
    public void testArrayShakerSort() {
        ArraySortService test = new ArraySortService();
        int[] test_array = { 1, 2 ,6, 1 , 5, 3};
        CustomArray array = new CustomArray(test_array);
        int[] expected_array  = {1, 1, 2, 3, 5, 6};
        int[] actual_array = test.arrayShakerSort(array).getArray();
        Assert.assertEquals(actual_array, expected_array);
    }
}