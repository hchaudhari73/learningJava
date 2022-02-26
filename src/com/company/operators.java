package com.company;

public class operators {

    public static void arithmetic() {
        int a = 1;
        int b = 2;

        int sum = a + b;
        System.out.println("Sum of 1 and 2: " + sum);

        int div =  a / b;
        System.out.println("int division: " +div);

        float c = 2F;
        float d = 4F;

        float fDiv = c / d;
        System.out.println("float division: " + fDiv);
    }

    public static void comparator() {
        int a = 1;
        int b = 3;

        System.out.println("Equals to: " + (a == b));
        System.out.println("Not equals to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than equal to: " + (a >= b));
        System.out.println("Less than equal to: " + (a <= b));

    }

    public static void logicalOperators() {
        int a = 30;
        int b = 40;

        if (a < 50 && b < 50) {
            System.out.println("And");
        } else if  (a < 50 || b > 50) {
            System.out.println("OR");
        }
    }
}
