package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        BigInteger population = new BigInteger(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town ,population, area);
    }
}
