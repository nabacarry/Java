package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double grade = scanner.nextDouble();
        String passOrFail;
        if (grade >=3.00 && grade <= 6.00)
        {
            passOrFail = "Passed!";
        }else if (grade <= 2.99 && grade >= 2.00)
        {
            passOrFail = "Failed!";
        }else
        {
            passOrFail = "Grade has to be between 2.00 & 6.00";
        }
        String text = String.format("Name: %s Age: %d Grade %.2f Student: %s", name, age, grade, passOrFail);
        System.out.println(text);
    }
}
