package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int britishPound = Integer.parseInt(scanner.nextLine());
        double dollar = 0;

        dollar = (double) britishPound * 1.31;

        System.out.printf("%.03f", dollar);
    }
}
