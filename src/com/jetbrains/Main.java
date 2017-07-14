package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {
        public static int isRandom ( int userInput){

        Random randGen = new Random();
        int c = (randGen.nextInt(userInput) + 1);
        return c;
    }

    public static void main(String[] args) {

        int userInput = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.print("How many sides to your dice? ");
        userInput = scnr.nextInt();

        System.out.println("Roll 1:");

        System.out.println(isRandom(userInput));
        System.out.println(isRandom(userInput));
    }
}
