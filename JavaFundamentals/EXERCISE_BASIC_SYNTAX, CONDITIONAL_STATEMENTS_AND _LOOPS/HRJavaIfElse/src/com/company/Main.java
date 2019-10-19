package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N % 2 == 1)
        {
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && N>=2 && N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N % 2 == 0 && N >= 6 && N <=20)
        {
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && N > 20)
        {
            System.out.println("Not Weird");
        }
    }
}
