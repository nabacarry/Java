package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightSaber = lightSabersPrice*Math.ceil(countOfStudents * 1.1);
        double robes = robesPrice*countOfStudents;
        int freeBelts = countOfStudents / 6;
        double belts =  beltsPrice*(countOfStudents-freeBelts);

        double totalCost = lightSaber + robes + belts;
        double needMoney = 0;
        if(amountOfMoney >= totalCost)
        {
            System.out.printf("The money is enough - it will cost %.2f lv",totalCost);
        }else
        {
            needMoney = totalCost - amountOfMoney;
            System.out.printf("Ivan Cho will need %.2f lv more", needMoney);
        }
    }
}
