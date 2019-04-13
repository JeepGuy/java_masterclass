package com.jbrent;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int days = ( (int)(minutes / 60) / 24);
            int ZZ = (days % 365);
            int YY = (days / 365);

            System.out.println( minutes + " min = " + YY + " y and " + ZZ + " d");
        }

    }

}
