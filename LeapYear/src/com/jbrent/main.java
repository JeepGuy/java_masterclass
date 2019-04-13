package com.jbrent;

public class main {

    public static void main(String[] args) {

    boolean leapYearAnswer =isLeapYear(-1600);
        System.out.println(leapYearAnswer);

     leapYearAnswer =isLeapYear(1600);
        System.out.println(leapYearAnswer);
     leapYearAnswer =isLeapYear(2017);
        System.out.println(leapYearAnswer);
     leapYearAnswer =isLeapYear(2000);
        System.out.println(leapYearAnswer);
	 leapYearAnswer = isLeapYear(1800);

        System.out.println(leapYearAnswer);

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

}

//public class DecimalComparator {
//
//    private static boolean areEqual;
//
//    public static void main(String[] args) {
//
//        areEqual = areEqualByThreeDecimalPlaces(1, 2);
//        System.out.println(areEqual);
//
//
//    }
//
//    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
//
//
//        if (numberOne == numberTwo){
//            areEqual = true;
//        }else{
//            areEqual = false;
//        }
//        return areEqual;
//    }
//}