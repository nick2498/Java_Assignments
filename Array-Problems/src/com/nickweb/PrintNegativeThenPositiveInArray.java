package com.nickweb;

// Using temp array
public class PrintNegativeThenPositiveInArray {
    static void segregateElements(int[] arr, int n) {
        // Create an empty array to store result
        int[] temp = new int[n];
        // index of temp
        int j = 0;

        // Store -ve element in temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                temp[j++] = arr[i];
        }

        // If array contains all positive or all negative
        if (n == j || j == 0)
            return;

        // Store +ve element in temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                temp[j++] = arr[i];
        }

        // Copy contents of temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 7, -6, -4, 3};
        int n = arr.length;

        segregateElements(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// TC: O(n)
// SC: O(n)


/*
    Q. WAP to place all -ve value in beginning and +ve value at the end of an array?

       Input: [-1, 2, 7, -6, -4, 3] Output: -1 -6 -4 2 7 3
 */