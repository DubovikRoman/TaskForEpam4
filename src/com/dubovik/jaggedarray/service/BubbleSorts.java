package com.dubovik.jaggedarray.service;

import com.dubovik.jaggedarray.comparators.ComparatorFunction;
import com.dubovik.jaggedarray.comparators.CustomComparators;

public class BubbleSorts {

    public void swap(int[][] array, int i, int j){
        int[] buff = array[i];
        array[i] = array[j];
        array[j] = buff;
    }

    public void sortBubble(int[][] array, ComparatorFunction cmp){
        boolean is_sort_completed = false;
        while(!is_sort_completed){
            is_sort_completed = true;
            for(int i = 0; i + 1 < array.length; i++){
                if(cmp.isEqual(array[i], array[i + 1])){
                    is_sort_completed = false;
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public boolean sort(int[][] array, int comparator_number){
        CustomComparators comparators = new CustomComparators();
        boolean is_operation_complete = true;
        switch(Math.abs(comparator_number)){
            case 1:
                sortBubble(array, comparators::sumElementsComparator);
                break;
            case 2:
                sortBubble(array, comparators::maxElementsComparator);
                break;
            case 3:
                sortBubble(array, comparators::minElementsComparator);
                break;
            default:
                is_operation_complete = false;
                break;
        }
        if(is_operation_complete == true && comparator_number < 0){
            for(int i = 0; i < array.length / 2; i++){
                swap(array, i, array.length - i - 1);
            }
        }
        return is_operation_complete;
    }
}
