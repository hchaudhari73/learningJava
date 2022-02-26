package com.company;

import java.util.Scanner;

public class input {

    public static void takeInput() {
        // Creating new scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your age: ");
        float age = sc.nextFloat();
        System.out.println(age);

        System.out.println("Input your name: ");
        String name = sc.next(); // only takes first word, if a sentence is passed.
        System.out.println(name);

        // To input complete sentence
        System.out.println("Input your Fullname: ");
        String fName = sc.nextLine();
        System.out.println(fName);
    }
}
