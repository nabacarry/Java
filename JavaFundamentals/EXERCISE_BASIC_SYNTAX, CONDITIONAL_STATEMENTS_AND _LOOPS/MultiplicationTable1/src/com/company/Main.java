package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            int result = nNumber * i;
            System.out.println(nNumber + " x " + i + " = " + result);
        }
    }
}
