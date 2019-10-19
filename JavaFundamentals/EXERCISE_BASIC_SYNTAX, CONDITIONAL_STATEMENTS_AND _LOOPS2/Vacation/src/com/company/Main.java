package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String personType = scanner.nextLine();
        String dayType = scanner.nextLine();

        double pricePerPerson = 0;
        double totalPrice = 0;

        if (personType.equals("Students"))
        {
            if (dayType.equals("Friday"))
            {
                pricePerPerson = 8.45;
            }else if (dayType.equals("Saturday"))
            {
                pricePerPerson = 9.80;
            }else if (dayType.equals("Sunday"))
            {
                pricePerPerson = 10.46;
            }
            if (persons >= 30)
            {
                totalPrice = ((pricePerPerson * persons) - ((15 * pricePerPerson * persons)/100));
                System.out.printf("Total price: %.2f", totalPrice);
            }else
            {
                totalPrice = pricePerPerson * persons;
                System.out.printf("Total price: %.2f", totalPrice);
            }
        }else if (personType.equals("Business"))
        {
            if (dayType.equals("Friday"))
            {
                pricePerPerson = 10.90;
            }else if (dayType.equals("Saturday"))
            {
                pricePerPerson = 15.60;
            }else if (dayType.equals("Sunday")) {
                pricePerPerson = 16.00;
            };
            if (persons >= 100)
            {
                totalPrice = (persons-10) * pricePerPerson;
                System.out.printf("Total price: %.2f", totalPrice);
            }else
            {
                totalPrice = persons * pricePerPerson;
                System.out.printf("Total price: %.2f", totalPrice);
            }
        }else if (personType.equals("Regular")) {
            if (dayType.equals("Friday")) {
                pricePerPerson = 15.00;
            } else if (dayType.equals("Saturday")) {
                pricePerPerson = 20.00;
            } else if (dayType.equals("Sunday")) {
                pricePerPerson = 22.50;
            }
            if (persons >= 10 && persons <= 20)
            {
                totalPrice = ((pricePerPerson * persons) - ((5 * pricePerPerson * persons)/100));
                System.out.printf("Total price: %.2f", totalPrice);
            }else
            {
                totalPrice = pricePerPerson * persons;
                System.out.printf("Total price: %.2f", totalPrice);
            }
        }
    }
}
