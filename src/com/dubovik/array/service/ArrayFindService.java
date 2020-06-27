package com.dubovik.array.service;

import com.dubovik.array.entity.CustomArray;

public class ArrayFindService {

    public int arrayBinarySearch(CustomArray in_array, int element){
        int start = 0;
        int end = in_array.getLength() - 1;
        int index_of_element = -1;
        int[] array = in_array.getArray();
        while(start <= end){
            int middle_index = (end + start) / 2;
            if(element < array[middle_index]){
                end = middle_index - 1;
            }else if(element > array[middle_index]){
                start = middle_index + 1;
            }else if(element == array[middle_index])
            {
                index_of_element = middle_index;
                break;
            }
        }
        return index_of_element;
    }

    public int arrayMaxElementSearch(CustomArray in_array){
        int[] array = in_array.getArray();
        int max_element = array[0];
        for(int i = 1; i < in_array.getLength(); i++){
            if(array[i] > max_element){
                max_element = array[i];
            }
        }
        return max_element;
    }

    public int arrayMinElementSearch(CustomArray in_array){
        int[] array = in_array.getArray();
        int min_element = array[0];
        for(int i = 1; i < in_array.getLength(); i++){
            if(array[i] < min_element){
                min_element = array[i];
            }
        }
        return min_element;
    }

    public int[] arraySimpleSearch(CustomArray in_array){
        ElementService service = new ElementService();
        int[] array = in_array.getArray();
        int[] simple_numbers = new int[array.length];
        int simple_index = 0;
        for(int i = 0; i < array.length; i++){
            if(service.isElementSimple(array[i])){
                simple_numbers[simple_index++] = array[i];
            }
        }
        return simple_numbers;
    }

    public int[] arrayFibonacciSearch(CustomArray in_array){
        ElementService service = new ElementService();
        int[] array = in_array.getArray();
        int[] fibonacci_numbers = new int[array.length];
        int fibonacci_index = 0;
        for(int i = 0; i < array.length; i++){
            if(service.isElementFibonacci(array[i])){
                fibonacci_numbers[fibonacci_index++] = array[i];
            }
        }
        return fibonacci_numbers;
    }

    public int[] arrayFindCorrectNumbers(CustomArray in_array){
        ElementService service = new ElementService();
        int[] array = in_array.getArray();
        int[] correct_numbers = new int[array.length];
        int correct_index = 0;
        for(int i = 0; i < array.length; i++){
            if(service.hasElementTwoSame(array[i])){
                correct_numbers[correct_index++] = array[i];
            }
        }
        return correct_numbers;
    }




}
