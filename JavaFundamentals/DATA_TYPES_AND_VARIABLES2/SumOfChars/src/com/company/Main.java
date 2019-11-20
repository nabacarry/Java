package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (n-- > 0)
        {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            sum += symbol;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
