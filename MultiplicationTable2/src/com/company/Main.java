package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumber = scanner.nextInt();
        int nNumberTimes = scanner.nextInt();

        do{

                int result = nNumber * nNumberTimes;
                System.out.println(nNumber +" x " + nNumberTimes + " = " + result);
                nNumberTimes++;
        }while (nNumberTimes <= 10);

    }
}
