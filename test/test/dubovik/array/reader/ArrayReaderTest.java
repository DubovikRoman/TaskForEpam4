package test.dubovik.array.reader;

import com.dubovik.array.entity.CustomArray;
import com.dubovik.array.reader.ArrayReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.*;

public class ArrayReaderTest {

    @Test
    public void testArrayConsoleReader() {
        ArrayReader reader = new ArrayReader();
        int[] expected = {1, 2, 3, 4, 5};
        CustomArray array = new CustomArray(5);
        reader.arrayConsoleReader(array);
        int[] actual = array.getArray();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testArrayFileReader() {
        ArrayReader reader = new ArrayReader();
        int[] expected = {1, 2, 3, 4, 5, 2, 3, 4, 5};
        CustomArray array = new CustomArray(9);
        reader.arrayFileReader(array, "input/input.txt");
        int[] actual = array.getArray();
        Assert.assertEquals(expected, actual);
    }
}