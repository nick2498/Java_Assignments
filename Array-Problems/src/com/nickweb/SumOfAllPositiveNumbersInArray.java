package com.nickweb;

public class SumOfAllPositiveNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {12,34,-20,44,-10,56,-2,86,12};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                sum += arr[i];
        }
        System.out.println(sum);
    }

}

// TC: O(n)
// SC: O(1)


/*
    Q. WAP to print the sum of all the +ve integers from an array.

      INPUT: A={12,34,-20,44,-10,56,-2,86,12} OUTPUT: 244 i.e. 12+34+44+56+86+12
*/
