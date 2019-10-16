package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        for(int i = 1; i <= 10 ; i++)
        {
            int result = N*i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
