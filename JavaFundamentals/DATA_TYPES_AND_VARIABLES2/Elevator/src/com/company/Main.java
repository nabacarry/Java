package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int totalCourses = people / capacity;
        if (people % capacity != 0){
            totalCourses++;
        }

        System.out.println(totalCourses);
    }
}
