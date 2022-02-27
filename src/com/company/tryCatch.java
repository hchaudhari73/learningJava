package com.company;

public class tryCatch {

    public static void marks() {
        int[] marks = {65, 56, 67};

        try {
            System.out.println(marks[7]);
        } catch (Exception exception) {
            System.out.println("Maximum size of array: " + marks.length);
        }
    }
}
