package com.nickweb;

public class LargestPairSumInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};

        System.out.println(largestPairSum(arr, arr.length));
    }

    static int largestPairSum(int[] arr, int n) {
        int j = 0;
        int max = n == 1 ? arr[0] + arr[1] : arr[0];
//        int max = arr[0];

        for (int i = 0; i < n; i++) {
            int sum = arr[j] + arr[i];
//            System.out.print(sum + " ");

            if (sum > max) {
                max = sum;

                if (arr[j] < arr[i]) {
//                    System.out.print(" J:" + arr[j]);
                    j = i;
//                    System.out.print(" I:" + arr[i]);
                }
            }
        }
        return max;
    }
}

// TC: O(n)
// SC: O(1)

/*
  Q. Given an unsorted of distinct integers, find the largest pair sum in it. For example, the largest pair sum in {12, 34, 10, 6, 40} is 74 in O(N) time-complexity.

   INPUT: {12, 34, 10, 6, 40}  OUTPUT: 74 i.e. largest pair {34, 40}
*/
