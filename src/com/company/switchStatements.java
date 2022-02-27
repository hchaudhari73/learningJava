package com.company;

public class switchStatements {

    public static void choice() {

        // In the switch case, when the condition is match
        // the following cases will also become true and
        // will be executed.
        // So need to add break statement
        int day = 1;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }

    }
}
