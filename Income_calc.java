package com.Securiter;

import java.util.Scanner;

public class Income_calc {



    public static void main(String[] args) {
        System.out.println("Which country do you live in?");
        Scanner scanCountry = new Scanner(System.in);
        String country = scanCountry.nextLine();
        System.out.println("You live in "+country);

        System.out.println("How much do you earn?");
        Scanner scanIncome = new Scanner(System.in);
        double income = scanIncome.nextDouble();
        System.out.println("So you earn: "+income);



    }
}
