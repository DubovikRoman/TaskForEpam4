package com.dubovik.jaggedarray.comparators;

public class CustomComparators {

    public boolean sumElementsComparator(int[] a, int[] b){
        int sum_a = 0;
        for(int i = 0; i < a.length; i++){
            sum_a += a[i];
        }
        int sum_b = 0;
        for(int i = 0; i < b.length; i++){
            sum_b += b[i];
        }
        return sum_a > sum_b;
    }

    public boolean maxElementsComparator(int[] a, int[] b){
        int max_a = a[0];
        int max_b = b[0];
        for(int i = 1; i < a.length; i++){
            if(max_a < a[i]){
                max_a = a[i];
            }
        }
        for(int i = 1; i < b.length; i++){
            if(max_b < b[i]){
                max_b = b[i];
            }
        }
        return max_a > max_b;
    }

    public boolean minElementsComparator(int a[], int b[]){
        int min_a = a[0];
        int min_b = b[0];
        for(int i = 1; i < a.length; i++){
            if(min_a > a[i]){
                min_a = a[i];
            }
        }
        for(int i = 1; i < b.length; i++){
            if(min_b > b[i]){
                min_b = b[i];
            }
        }
        return min_a > min_b;
    }
}
