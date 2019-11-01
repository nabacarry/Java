package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.next());
        int second = Integer.parseInt(scanner.next());
        int third = Integer.parseInt(scanner.next());
        int fourth = Integer.parseInt(scanner.next());

        int result = ((first + second) / third) * fourth;

        System.out.println(result);
    }
}
