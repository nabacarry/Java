package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);
        char char3 = scanner.next().charAt(0);

        String charToString = Character.toString(char1).concat(Character.toString(char2)).concat(Character.toString(char3));

        System.out.println(charToString);
    }
}
