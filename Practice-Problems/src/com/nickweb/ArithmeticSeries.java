package com.nickweb;

import java.util.Scanner;

public class ArithmeticSeries {

    public static void main(String[] args) {
	// write your code here
        int A, B, N, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        N = sc.nextInt();

        C = B - A;
        int last = A + (N - 1) * C;
        System.out.println(last);
    }
}

    /*
    # AP(Arithmetic Progression) Series
    - Problem Statement
    Q. Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series.
        - Input
        - User Task:
           Since this will be a functional problem, you don't have to take input. You just have to complete the function
           NthAP() that takes the integer A, B, and N as a parameter.

        - Constraints:
            -10^3 <= A <= 10^3
            -10^3 <= B <= 10^3
            1 <= N <= 10^4

        - Output
            Return the Nth term of AP series.

        # Example:
           - Sample Input:
              2 3 4

           - Sample Output:
              5

           - Sample Input:
              1 2 10

           - Sample output:
              10
      */