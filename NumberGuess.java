package com.Securiter;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        // typecasting a RNG to use as the number guess
        int numbChoice= (int) (Math.random()*100)+1;

        System.out.println("I have randomly chosen a number between [1, 100]");
        System.out.println("Trt to guess it!");

        // scanner to get user input
        Scanner numbScanner = new Scanner(System.in);

        //declare and initialise  boolean variable to check WIN status
        boolean allIdoIsWin=false;

        //for loop to iterate through the 10 attemps given
        for(int xx=9;xx>=0; xx--) {

            //scanner to get
            int numbGuess = numbScanner.nextInt();
            if(xx>1) {
                System.out.println("You have " + xx + " guesses left!");
            }else if(xx==1){
                System.out.println("You have " + xx + " guess left!");
            }

            if (numbChoice<numbGuess && !(xx==0)) {
                System.out.print("It's smaller, Choose again: ");
            }
            if(numbChoice>numbGuess && !(xx==0)) {
                System.out.print("It's greater, Choose again: ");
            }

            if(numbChoice==numbGuess){
                allIdoIsWin=true;
                System.out.println("CORRECT ... YOU WIN!!! You only used "+(10-xx)+" tries!");
                System.out.println("The correct number was "+numbChoice+"!");
                break;
            }
            if(xx==0){
                System.out.println("GAME OVER, YOU FAILED!!!!");
            }

        }
    }
}
