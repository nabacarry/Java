package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours:");
        int hour = scanner.nextInt();
        System.out.println("Enter minutes:");
        int minutes = scanner.nextInt();
        int hourAfter;
        int minutesAfter;
        int backTime = 30;
        if(hour >= 0 && hour <= 23)
        {
            hourAfter = hour;
        }else
        {
            System.out.println("Hours have to be between 0 and 23.Hours are set to default!");
            hourAfter = 0;
        }
        if(minutes >= 0 && minutes <= 59)
        {
            minutesAfter = minutes + backTime;
            if(minutesAfter >= 60)
            {
                hourAfter++;
                minutesAfter -= 60;
            }
        }else
        {
            System.out.println("Minutes have to be between 0 and 59.Minutes are set to default!");
            minutesAfter = 0;
        }



        String printAfter = String.format("%d:%02d", hourAfter, minutesAfter);
        System.out.println(printAfter);
    }
}
