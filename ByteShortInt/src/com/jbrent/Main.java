package com.jbrent;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Fun with Bytes, Ints, and Shorts.");
        System.out.println("---------------------------------");
        System.out.println(" ");

        byte myByteValue2 = 10;
        // byte myByteValue3 = 127;

        short myShortValue2 = 20;
        // short myShortValue3 = 32767; // or 32_767 In Java 8 can use underscores to represent commas.

        int myIntValue2 = 50;

        //long myLongValue2 = 50_000 + (10 * (myByteValue2 + myShortValue2 + myIntValue2));
        // long doesn't require a cast just like int

        long myLongValue2 = 50000L + (10 * (myByteValue2 + myShortValue2 + myIntValue2));
        System.out.println(myIntValue2);
        System.out.println("myLongValue2 = " + myLongValue2);
        System.out.println(" ");
        System.out.println("---------------------------------");


        int myIntValue3 = 2_147_483_647;
        long myLongValue3 = 50000 + 10 * (myByteValue2 + myShortValue2 + myIntValue3);
        System.out.println(myIntValue3);
        System.out.println("myLongValue3 = " + myLongValue3);
        System.out.println("int myIntValue3 = 2_147_483_647; // this didn't work as the answer was: "  + myLongValue3);
        System.out.println(" ");

        int myIntValue4 = 2_000_000_000;
        long myLongValue4 = 50000L + (10 * (myByteValue2 + myShortValue2 + myIntValue4));

        System.out.println(myIntValue4);
        System.out.println("myLongValue4 = " + myLongValue4);
        System.out.println("int myIntValue4 = 2_000_000_000;  // this didn't work as the answer was: "  + myLongValue4);
        System.out.println(" ");


        int myIntValue5 = 1_000_000_000;
        long myLongValue5 = 50000L + (10 * (myByteValue2 + myShortValue2 + myIntValue5));

        System.out.println(myIntValue5);
        System.out.println("myLongValue5 = " + myLongValue5);
        System.out.println("int myIntValue5 = 1_000_000_000; // this didn't work as the answer was:  myLongValue5 = 1410115708 or from var: " + myLongValue5 );
        System.out.println(" ");
        System.out.println(" ");

        // casting an expression


        System.out.println("To cast the data type on an expression = must put parentheses around the whole expression as in: ");
        System.out.println("short myShortTotal = (short) (1000 + (10 * (myByteValue2 + myShortValue2 + myIntValue2)));");
        short myShortTotal = (short) (1000 + (10 * (myByteValue2 + myShortValue2 + myIntValue2)));
        System.out.println("myShortTotal = " + myShortTotal);




                /*
        // int datatype width of 32
        // Int myMinValue= -2147483648;   // interger datatype - 2.74 billion to + 2.7 billon is max size
        // Int myMaxValue= 2147483647;

        int myMinValue= -2_147_483_648;   // The Java 8 way of separating values instead of commas.
        int myMaxValue= 2_147_483_647;
        int mytotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte datatype width of 8        128 largest size
        // byte myMinByte = -128;
        // byte myMaxByte = 127;
        //must cast the data type to int in order to perform operations on a literal

        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short datatype width of 16
        // short myMinShort =  -32768;
        // short myMaxShort = 32767;
        //must cast the data type to int in order to perform operations on a literal
        short myNewShortValue = (short) (myShortValue /2);

        // long datatype width of 64

        //long myLongValue = 9_223_372_036_854_775_807L;

        */
        
    }
}
