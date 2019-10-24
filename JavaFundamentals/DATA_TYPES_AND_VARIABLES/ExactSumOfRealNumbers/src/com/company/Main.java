package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumbers = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        String line;
        while (nNumbers >= 1){
            line = scanner.nextLine();
            BigDecimal numbers = new BigDecimal(line);
            sum = sum.add(numbers);
            nNumbers--;
        }

        System.out.println(sum);

    }
}
