package com.company;


public class Main {
    private final static Integer[][] array_of_arrays = {
            {1, 90, -33, -55, 67, -16, 28, -55, 15},
            {999, -60, -77, 14, 160, 301},
            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                    140, 150, 160, 170, 180, 190, 200, -99}};

    public static void main(String[] args) {
        // write your code here
        for(int i=0;i< array_of_arrays.length;i++){
            int sum = SummativeSums.sumArrayElements(array_of_arrays[i]);
            System.out.println("#"+(i+1)+" Array Sum: " + sum);
        }
    }
}
