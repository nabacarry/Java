package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTrashPrice = 0;
        double mouseTrashPrice = 0;
        double keyboardTrashPrice = 0;
        double displayTrashPrice = 0;

        if (lostGames>=0 && lostGames <=1000
                && headsetPrice>=0 && headsetPrice <=1000
                &&mousePrice>=0 && mousePrice <=1000
                &&keyboardPrice>=0 && keyboardPrice <=1000
                &&displayPrice>=0 && displayPrice <=1000)
        {
            headsetTrashPrice = (double) (lostGames / 2)*headsetPrice;
            mouseTrashPrice = (double) (lostGames / 3)*mousePrice;
            keyboardTrashPrice = (double) (lostGames / 6)*keyboardPrice;
            displayTrashPrice = (double) (lostGames / 12)*displayPrice;
            double totalPriceTrash = headsetTrashPrice+mouseTrashPrice+keyboardTrashPrice+displayTrashPrice;
            System.out.printf("Rage expenses %.2f lv", totalPriceTrash);
        }else
        {
            System.out.println("Out of range");
        }

    }
}
