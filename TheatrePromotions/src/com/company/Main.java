package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Day type:");
        String dayType = scanner.nextLine().toLowerCase();
        if (!dayType.equals("weekday")  && !dayType.equals("weekend") && !dayType.equals("holiday"))
        {
            System.out.println("Invalid day type");
            System.exit(0);
        }
        System.out.println("Ages:");
        int age = scanner.nextInt();
        int price = 0;


        if (dayType.equals("weekday"))
        {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122))
            {
                price = 12;
            }else if(age > 18 && age <= 64)
            {
                price = 18;
            }else
            {
                System.out.println("Error");
                System.exit(0);
            }
        }

        if (dayType.equals("weekend"))
        {
            if((age >= 0 && age <= 18) || (age > 64 && age <= 122))
            {
                price = 15;
            }else if (age > 18 && age < 64)
            {
                price = 20;
            }else
            {
                System.out.println("Error");
                System.exit(0);
            }
        }
        if(dayType.equals("holiday"))
        {
            if (age >= 0 && age <= 18)
            {
                price = 5;
            }else if (age > 18 && age <= 64)
            {
                price = 12;
            }else if (age > 64 && age <= 122)
            {
                price = 10;
            }else
            {
                System.out.println("Error");
                System.exit(0);
            }
        }

        if(price != 0)
        {
            String textDayPrice = String.format("For %s price is: %d$", dayType, price);
            System.out.println(textDayPrice);
        }

    }
}
