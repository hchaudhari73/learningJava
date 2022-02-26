package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class variables {
    public static void primitives() {
        // byte: -128 to 127
        byte age = 90;
        System.out.println(age);

        // short: 2 bytes
        short s = 3434;
        System.out.println(s);

        // int: 4 bytes
        int phone = 123444524;
        System.out.println(phone);

        // long: 8 bytes
        long phone2 = 344343434343434L;
        System.out.println(phone2);

        // float: 8 bytes
        float pie = 3.142F;
        System.out.println(pie);

        /*
         double: 8 bytes
         less precise than `long`
        */
        double dNumber = 234_123.342_3;
        System.out.println(dNumber);

        // char: 2 bytes
        char letter = 'a';
        System.out.println(letter);

        // boolean: 1 byte
        boolean isAdult = false;
        System.out.println(isAdult);
    }

    public static void nonPrimitive() {

        // We have declare non-primitive variables using `new`

        System.out.println("String");
        /* String: Immutable
           Non-primitive datatype `String` as method
           Need to be created using `new`,
           Not compulsory.
         */
        String firstName = new String("Harshal");
        String lastName = new String("Chaudhari");

        // Concatenate
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt
        // Checking which char is present at given position
        System.out.println("Char at 0: " + fullName.charAt(0));

        // length
        System.out.println("Length of fullName = " + fullName.length());

        // replace
        // This is not an in-place operation.
        // replace will create a new string and won't change the
        // original string
        System.out.println(fullName.replace("a", "@"));

        // substring
        // semi closed
        System.out.println(fullName.substring(0, 8));

        System.out.println("-------------------------------------------");
        System.out.println("Array");

        int[] marks = new int[3];
        marks[0] = 65;
        marks[1] = 52;

        System.out.println(marks[0]);
        // We didn't put any value at 2nd index of the array.
        // But we have declared array of length 3.
        // So this will initialize variable with zero value (as it is of type int).
        System.out.println(marks[2]);

        marks[2] = 73;
        // length is a property in array
        // unlike String, in which length is a method
        System.out.println(marks.length);

        // Sorting arrays
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("Sorting array");
        Arrays.sort(marks);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // 2D arrays
        System.out.println("2D array");
        int[][] twoStudents = {{67, 54, 75}, {76, 45, 75}};
        System.out.println("Marks of first subject for first student " + twoStudents[0][0]);

        System.out.println("-------------------------------------------");
        System.out.println("Casting");
        int price = 100;
        // Implicit casting: Storing variable with a datatype with
        // less memory size int (4 byte) in a variable with a datatype
        // with larger memory size double (8 byte).
        // This is allowed in Java.
        double finalPrince = price * 1.18;
        System.out.println("Implicit casting: " + finalPrince);

        // Explicit casting: Storing a variable with a datatype with larger memory
        // size, say float to a variable with a datatype with lesser memory size.
        int p = 100;
        int fP = p + (int)18.0;
        System.out.println("Explicit casting: " + fP);

        // This will output 100 and not 118.
        // Because java will discard all the values after decimal.
        int fPP = p * (int)1.18;

        System.out.println("-------------------------------------------");
        System.out.println("Contant");

        final float PI = 3.14F;
        System.out.println(PI);
    }

}

