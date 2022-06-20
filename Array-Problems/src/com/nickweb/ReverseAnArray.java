package com.nickweb;

// 1. Using for loop (decrement)
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9, 7};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 2. Using swapping
//public class ReverseAnArray {
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 9, 7};
//        int n = arr.length;
//
//        int i = 0, j = 0, swapping = 0;
//
//        for (i = 0; i < n/2; i++) {
//            swapping = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = swapping;
//        }
//
//        for (j = 0; j < n; j++) {
//            System.out.print(arr[j] + " ");
//        }
//    }
//}

// 3. Using temp array
//public class ReverseAnArray {
//    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 9, 7};
//        int n = arr.length;
//        int[] tempArr = new int[n];
//        int t = n;
//
//        for (int i = 0; i < n; i++) {
//            tempArr[t - 1] = arr[i];
//            t = t - 1;
//        }
//
//        for (int j = 0; j < n; j++) {
//            System.out.print(tempArr[j] + " ");
//        }
//
//    }
//}



/*
    Q. WAP to print array in reverse order?

    Input: 2, 1, 4, 9, 7  Output: 7 9 4 1 2
*/









