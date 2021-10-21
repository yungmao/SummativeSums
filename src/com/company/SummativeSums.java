package com.company;

public class SummativeSums {
    public static int sumArrayElements(Integer[] array){
        int sum = 0;
        for (int element : array){
            sum+=element;
        }
        return sum;
    }
}
