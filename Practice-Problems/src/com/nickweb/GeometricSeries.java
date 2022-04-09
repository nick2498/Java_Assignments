package com.nickweb;

import java.util.Scanner;

public class GeometricSeries {

    public static void main(String[] args) {
        int A, R, N;  // R(ratio)
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        R = sc.nextInt();
        N = sc.nextInt();

        int term = A * (int)(Math.pow(R, N - 1));
        System.out.println(term);
    }

}

    /*
       Nth term of GP(Geometric Progression)
       Problem Statement
    Q. Given first term A and the common ratio R of a GP (Geometric Progression) and an integer N, your
       task is to calculate its Nth term
        Input
        User Task:
        Since this will be a functional problem, you don't have to take input. You just have to complete the function
        NthGP() that takes the integer A, R and N as parameter.


        Constraints
        1 <= A, R <= 100
        1 <= N <= 10
        Output
        Return the Nth term of the given GP.

        Note: It is guaranteed that the Nth term of this GP will always fit in 10^9.
        Example
        Sample Input:
        3 2
        5

        Sample Output:-
        48

        Sample Input:-
        2 2
        10

        Sample Output:
        1024

        Explanation:-
        For Test Case 1:- 3 6 12 24 48 96.
        */