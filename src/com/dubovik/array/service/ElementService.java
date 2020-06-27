package com.dubovik.array.service;

public class ElementService {

    public boolean isElementSimple(int element){
        boolean is_simple = true;
        if(element == 1){
            is_simple = false;
        }else{
            for(int i = 2; i < element - 1; i++){
                if(element % i == 0){
                    is_simple = false;
                    break;
                }
            }
        }
        return is_simple;
    }

    public boolean isElementFibonacci(int element){
        int first_number = 1;
        int second_number = 1;
        boolean is_fibonacci = false;
        while(second_number <= element){
            if(element == second_number){
                is_fibonacci = true;
            }
            int buff = second_number;
            second_number += first_number;
            first_number = buff;
        }
        return is_fibonacci;
    }

    public boolean hasElementTwoSame(int number){
        boolean is_correct = false;
        int max_three_digit = 999;
        int min_three_digit = 100;
        if(number >= min_three_digit && number <= max_three_digit){
            int first_digit = number / 100;
            int second_digit = (number / 10) % 10;
            int third_digit = number % 10;
            if(first_digit == second_digit || first_digit == third_digit
                    || second_digit == third_digit){
                is_correct = true;
            }
        }
        return is_correct;
    }
}
