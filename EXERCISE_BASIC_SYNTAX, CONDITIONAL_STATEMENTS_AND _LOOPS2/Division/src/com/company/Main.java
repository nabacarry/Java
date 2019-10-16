package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumber = scanner.nextInt();

        if (nNumber == 0)
        {
            System.out.println("Error");
        }
        else if (nNumber % 10 == 0)
        {
            System.out.println("The number is divisible by 10");
        }else if (nNumber % 7 == 0)
        {
            System.out.println("The number is divisible by 7");
        }else if (nNumber % 6 == 0)
        {
            System.out.println("The number is divisible by 6");
        }else if(nNumber % 3 == 0)
        {
            System.out.println("The number is divisible by 3");
        }else if(nNumber % 2 == 0)
        {
            System.out.println("The number is divisible by 2");
        }else
        {
            System.out.println("Not divisible");
        }


    }
}
