package com.nickweb;

public class SumOfFirstThreePositiveNumbersInArray {
    public static void main (String[] args) {
        int[] arr = {-2,-5,-10,-91,-23,12,34,-20,44,-10,56,-2,86,12};
//        int[] arr = {12,34,-20,44,-10,56,-2,86,12};
        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }

            if (count == 3)
                break;
        }

        System.out.println(sum);
    }
}

/*
     Q. WAP to print the sum of only the first 3 +ve numbers from an array.

     1)INPUT: A={12,34,-20,44,-10,56,-2,86,12} OUTPUT: 90 i.e. 12+34+44

     2)INPUT: A={-2,-5,-10,-91,-23,12,34,-20,44,-10,56,-2,86,12} OUTPUT: 90 i.e. 12+34+44
*/
