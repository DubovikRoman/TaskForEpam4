package com.dubovik.array.service;

import com.dubovik.array.entity.CustomArray;

public class ArraySortService {

    public void swap(int[] array, int i, int j){
        array[i] += array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
    public CustomArray arrayBubbleSort(CustomArray in_array){
        CustomArray custom_array = new CustomArray(in_array.getLength());
        int[] array = in_array.getArray();
        boolean is_sort_completed = false;
        while(!is_sort_completed){
            is_sort_completed = true;
            for(int i = 0; i + 1 < array.length; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                    is_sort_completed = false;
                }
            }
        }
        custom_array.setArray(array);
        return custom_array;
    }

    public CustomArray arrayInsertSort(CustomArray in_array){
        CustomArray custom_array = new CustomArray(in_array.getLength());
        int[] array = in_array.getArray();
        for(int i = 1; i < array.length; i++){
            int index_comparable = i - 1;
            int current_element = array[i];
            while(current_element < array[index_comparable]
                    && index_comparable >= 0){
                array[index_comparable + 1] = array[index_comparable];
                index_comparable--;
            }
            array[index_comparable + 1] = current_element;
        }
        custom_array.setArray(array);
        return custom_array;
    }

    public CustomArray arrayShakerSort(CustomArray in_array){   //спрсить про возврощаемое
        CustomArray custom_array = new CustomArray(in_array.getLength());
        int[] array = in_array.getArray();
        int left = 0;
        int right = array.length;
        while(left <= right){
            for(int i = left; i + 1 < right; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
            right--;

            for(int i = right; i - 1 > left; i--){
                if(array[i] < array[i - 1]){
                    swap(array, i, i - 1);
                }
            }
            left++;
        }
        custom_array.setArray(array);
        return custom_array;
    }




}
