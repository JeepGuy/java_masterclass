package com.jbrent;

public class Main {

    public static void main(String[] args) {

        // LeapYear Tests
        /*boolean leapYearAnswer =isLeapYear(-1600);
        System.out.println(leapYearAnswer);
        leapYearAnswer =isLeapYear(1600);
        System.out.println(leapYearAnswer);
        leapYearAnswer =isLeapYear(2017);
        System.out.println(leapYearAnswer);
        leapYearAnswer =isLeapYear(2000);
        System.out.println(leapYearAnswer);
        leapYearAnswer = isLeapYear(1800);
        System.out.println(leapYearAnswer);
        */

        int daysInMonth = getDaysInMonth(1, 2020);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("----------");

        daysInMonth = getDaysInMonth(2, 2020);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("----------");

        daysInMonth = getDaysInMonth(2, 2018);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("----------");

        daysInMonth = getDaysInMonth(-1, 2020);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("----------");

        daysInMonth = getDaysInMonth(1, -2020);
        System.out.println(daysInMonth);
        System.out.println();
        System.out.println("----------");

    }


    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }


    public static int getDaysInMonth (int month, int year){

        if((month < 1) || (month > 12) || (year < 1 ) || ( year > 9999)){
            return -1;
        }


        int returnValue = 0;

        switch (month){
            case 1:
                System.out.println("ONE");
                returnValue = 31;
                break;
            case 2  :
                boolean leapYearAnswer = isLeapYear(year);
                if (leapYearAnswer == true){
                    returnValue = 29;
                } else {
                    returnValue = 28;
                }
                break;
            case 3:
                returnValue = 31;
                break;
            case 4:
                returnValue = 30;
                break;
            case 5:
                returnValue = 31;
                break;
            case 6:
                returnValue = 30;
                break;
            case 7:
                returnValue = 31;
                break;
            case 8:
                returnValue = 31;
                break;
            case 9:
                returnValue = 30;
                break;
            case 10:
                returnValue = 31;
                break;
            case 11:
                returnValue = 30;
                break;
            case 12:
                returnValue = 31;
                break;

            default:
                returnValue = 0;

        }

        return returnValue;

    }





}
