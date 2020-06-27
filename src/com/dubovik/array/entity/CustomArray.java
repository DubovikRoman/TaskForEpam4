package com.dubovik.array.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int length){
        if(length > 0){
            array = new int[length];
        }
    }

    public CustomArray(int[] in_array){
        array = in_array;
    }

    public int[] getArray(){
        return array.clone();
    }

    public void setArray(int[] in_array) {
        array = in_array;
    }

    public int getLength(){
        return array.length;
    }

    public int getByIndex(int i){
        int at_index = 0;
        if(checkIndex(i)){
            at_index = array[i];
        }
        return at_index;
    }

    public boolean setByIndex(int i, int number){
        boolean is_operation_correct = false;
        if(checkIndex(i)){
            array[i] = number;
            is_operation_correct = true;
        }
        return is_operation_correct;
    }

    private boolean checkIndex(int i){
        boolean is_data_correct = false;
        if(i < array.length - 1 && i > 0){
            is_data_correct = true;
        }
        return is_data_correct;
    }

    public boolean equals(CustomArray o) {
        if (this == o){
            return true;
        }
        boolean is_equal_length = false;
        boolean is_equal_elements = true;
        if(array.length == o.array.length){
            is_equal_length = true;
            for(int i = 0; i < array.length; i++){
                if(array[i] != o.array[i]){
                    is_equal_elements = false;
                }
            }
        }
        return is_equal_elements == is_equal_length;
    }

    public int hashCode() {
        int hash_code = array.length + array[0];
        return hash_code;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray ");
        sb.append(" array= ");
        for(int i = 0; i < array.length; i++){
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}
