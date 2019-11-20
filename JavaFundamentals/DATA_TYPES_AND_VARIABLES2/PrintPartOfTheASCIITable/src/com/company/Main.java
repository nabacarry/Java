package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.next());
        int end = Integer.parseInt(scanner.next());

        for (int i = begin; i <= end ; i++) {
            System.out.print((char)i + " ");
        }

    }
}
