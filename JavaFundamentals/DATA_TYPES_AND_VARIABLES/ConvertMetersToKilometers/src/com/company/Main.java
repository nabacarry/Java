package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = 0;

        kilometers = (double) meters / 1000;

        System.out.printf("%.02f",kilometers);
    }
}
