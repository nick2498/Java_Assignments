package com.nickweb;

import java.util.Arrays;

/*
// Linear Search
public class SearchAnElementInArray {
    static int linearSearch(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int x = 5;

        System.out.println(linearSearch(arr, x));
    }
}

// TC: O(n)
// SC: O(1)
*/


/*
// Binary Search (Recursive Method)
public class SearchAnElementInArray {
    static int binarySearch(int[] arr, int x, int low, int high) {
        Arrays.sort(arr);

        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, x, low, mid - 1);

            return binarySearch(arr, x, mid + 1,  high);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 3, 5, 7};
        int x = 5;
        int low = 0, high = arr.length - 1;

        System.out.println(binarySearch(arr, x, low, high));
    }
}

// TC: O(log n)
// SC: O(1)
*/

// Binary Search (Iterative Method)
public class SearchAnElementInArray {
    static int binarySearch(int[] arr, int x, int low, int high) {
        Arrays.sort(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 5, 2, 7};
        int x = 5;
        int low = 0, high = arr.length - 1;

        System.out.println(binarySearch(arr, x, low, high));
    }
}

// TC: O(log n)
// SC: O(1)


/*
    Q. WAP to search an element in array.

    Input: [1,3,5,7] TARGET: 5 Output: 2
*/
