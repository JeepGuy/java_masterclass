package com.jbrent;

public class Main {

    public static void main(String[] args) {
        // width of the integer is 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of a float is 32 (4 bytes)
        float myFloatValue= 5f / 3f;  //float has seven digits of precision
        // width of a double is 64 (8 bytes)
        double myDoubleValue= 5d / 3d; // double has 16 digits of precision
        System.out.println(" ");
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println(" ");

        // cast to double:  myTotalValue = (double)myFloatValue * myDoubleValue

        //Challenge
        // Convert a given number of pounds to kilgrams
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // Notes:   1 pound is equal to 0.45359237 kilograms ~ a kilogram is 2.2 pounds...

        int numOfpounds = 200;
        double poundKilogramRatio = 0.45359237d;
        double numOfKilograms;

        numOfKilograms =  poundKilogramRatio * (double) numOfpounds;

        System.out.println(numOfpounds + " pounds equals " + numOfKilograms + " kilograms.");

    }
}
