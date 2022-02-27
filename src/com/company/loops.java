package com.company;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class loops {

    public static void forLoop() {

        System.out.println("------for loop---------");
        for(int i=0; i<=5; i++) {
            System.out.println("The value of i: " + i);
        }
    }

    public static void whileLoop() {

        System.out.println("------while loop---------");
        int i = 10;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void doWhileLoop() {

        System.out.println("------do while loop---------");
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i>=1);
    }

    public static void exercise() {
        // Will take input from the use
        // until they provide a negative number.
        // If we get a negative number, we break the loop.

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number: ");
            num = sc.nextInt();        loops.forLoop();
        loops.whileLoop();

        } while (num > 0);
    }

    public static void exercise1() {
        int num = 1;
        while (num<=5) {

            // skipping num = 3
            if (num == 3) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
