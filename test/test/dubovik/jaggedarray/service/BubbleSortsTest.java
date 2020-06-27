package test.dubovik.jaggedarray.service;

import com.dubovik.jaggedarray.service.BubbleSorts;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BubbleSortsTest {

    @Test
    public void testSortFirst() {
        BubbleSorts sort = new BubbleSorts();
        int[][] matrix = new int[3][];
        int[] array1  = {1, 2, 3, 4, 5};
        matrix[0] = array1;
        int[] array2 = {0, 2, 3};
        matrix[1] = array2;
        int[] array3 = {-1, 2, 3, 0};
        matrix[2] = array3;
        int[][] expected_matrix = new int[3][];
        int[] expected_array1  = {1, 2, 3, 4, 5};
        expected_matrix[2] = array1;
        int[] expected_array2 = {0, 2, 3};
        expected_matrix[1] = array2;
        int[] expected_array3 = {-1, 2, 3, 0};
        expected_matrix[0] = expected_array3;
        sort.sort(matrix, 1);
        assertTrue(matrixEquals(matrix, expected_matrix));
    }

    @Test
    public void testSortFirstReverse() {
        BubbleSorts sort = new BubbleSorts();
        int[][] matrix = new int[3][];
        int[] array1  = {1, 2, 3, 4, 5};
        matrix[0] = array1;
        int[] array2 = {0, 2, 3};
        matrix[2] = array2;
        int[] array3 = {-1, 2, 3, 0};
        matrix[1] = array3;
        int[][] expected_matrix = new int[3][];
        int[] expected_array1  = {1, 2, 3, 4, 5};
        expected_matrix[0] = array1;
        int[] expected_array2 = {0, 2, 3};
        expected_matrix[1] = array2;
        int[] expected_array3 = {-1, 2, 3, 0};
        expected_matrix[2] = expected_array3;
        sort.sort(matrix, -1);
        assertTrue(matrixEquals(matrix, expected_matrix));
    }

    @Test
    public void testSortSecond() {
        BubbleSorts sort = new BubbleSorts();
        int[][] matrix = new int[3][];
        int[] array1  = {1, 2, 3, 4, 5};
        matrix[0] = array1;
        int[] array2 = {0, 2, 0};
        matrix[1] = array2;
        int[] array3 = {-1, 2, 3, 0};
        matrix[2] = array3;
        int[][] expected_matrix = new int[3][];
        int[] expected_array1  = {1, 2, 3, 4, 5};
        expected_matrix[2] = expected_array1;
        int[] expected_array2 = {0, 2, 0};
        expected_matrix[0] = expected_array2;
        int[] expected_array3 = {-1, 2, 3, 0};
        expected_matrix[1] = expected_array3;
        sort.sort(matrix, 2);
        assertTrue(matrixEquals(matrix, expected_matrix));
    }

    @Test
    public void testSortThird() {
        BubbleSorts sort = new BubbleSorts();
        int[][] matrix = new int[3][];
        int[] array1  = {0, 2, 3, 4, 5};
        matrix[0] = array1;
        int[] array2 = {1, 2, 1};
        matrix[1] = array2;
        int[] array3 = {-1, 2, 3, 0};
        matrix[2] = array3;
        int[][] expected_matrix = new int[3][];
        int[] expected_array1  = {0, 2, 3, 4, 5};
        expected_matrix[1] = expected_array1;
        int[] expected_array2 = {1, 2, 1};
        expected_matrix[2] = expected_array2;
        int[] expected_array3 = {-1, 2, 3, 0};
        expected_matrix[0] = expected_array3;
        sort.sort(matrix, 3);
        assertTrue(matrixEquals(matrix, expected_matrix));
    }

    private boolean matrixEquals(int[][] matrix_a, int[][] matrix_b){
        boolean is_equal = true;
        if(matrix_a.length != matrix_b.length){
            is_equal = false;
        }else{
            for(int i = 0; i < matrix_a.length; i++){
                if(matrix_a[i].length == matrix_b[i].length){
                    for(int j = 0; j < matrix_a[i].length; j++){
                        if(matrix_a[i][j] != matrix_b[i][j]){
                            is_equal = false;
                        }
                    }
                }else{
                    is_equal = false;
                }
            }
        }
        return is_equal;
    }
}