package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String startStopMachine = "";
        do {
            startStopMachine = scanner.nextLine();
        }while (!startStopMachine.equals("Start"));

        double sumCoins = 0;
        double insertCoin = 0;
        String product = "";
        do{
            startStopMachine = scanner.nextLine();
            char charCheck = startStopMachine.charAt(0);
            if (!startStopMachine.equals("End") && Character.isDigit(charCheck))
            {
                insertCoin = Double.parseDouble(startStopMachine);
                if (insertCoin == 0.1 ||
                        insertCoin == 0.2 ||
                        insertCoin == 0.5 ||
                        insertCoin == 1 ||
                        insertCoin == 2)
                {
                    sumCoins += insertCoin;
                }else{
                    System.out.printf("Cannot accept %.1f \n", insertCoin);
                }
            }else{
                if (!startStopMachine.equals("End")) {
                    product = startStopMachine;
                    switch (product.toLowerCase()) {
                        case "nuts":
                            if ((sumCoins - 2) < 0) {
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.printf("Purchased %s", product);
                                sumCoins -= 2;
                            }
                            break;
                        case "water":
                            if ((sumCoins - 0.7) < 0) {
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.printf("Purchased %s", product);
                                sumCoins -= 0.7;
                            }
                            break;
                        case "crisps":
                            if ((sumCoins - 1.5) < 0) {
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.printf("Purchased %s", product);
                                sumCoins -= 1.5;
                            }
                            break;
                        case "soda":
                            if ((sumCoins - 0.8) < 0) {
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.printf("Purchased %s", product);
                                sumCoins -= 0.8;
                            }
                            break;
                        case "coke":
                            if ((sumCoins - 1) < 0) {
                                System.out.println("Sorry, not enough money");
                            } else {
                                System.out.printf("Purchased %s", product);
                                sumCoins -= 1;
                            }
                            break;
                        default:
                            System.out.println("Invalid product");
                            break;
                    }
                }
            }

        }while(!startStopMachine.equals("End"));

        System.out.printf("Change is: %.1f", sumCoins);
    }
}
