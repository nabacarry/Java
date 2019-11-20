package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int begin = 97;
        int end = begin + n;

        for (int first = begin; first < end; first++) {
            for (int second = begin; second < end; second++) {
                for (int third = begin; third < end; third++) {
                    System.out.printf("%c%c%c%n",first , second, third);
                }
            }
        }
    }
}
