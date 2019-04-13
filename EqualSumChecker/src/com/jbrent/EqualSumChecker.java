package com.jbrent;

public class EqualSumChecker {

    private static boolean areEqual;

    public static void main(String[] args) {

        areEqual = hasEqualSum(1, 1, 1);
        System.out.println(areEqual);

        areEqual = hasEqualSum(1,1,2);
        System.out.println(areEqual);

        areEqual = hasEqualSum(1,-1,0);
        System.out.println(areEqual);

        System.out.println(" -----");

        areEqual = hasEqualSum(1, 2, 3);
        System.out.println(areEqual);

    }

    public static boolean hasEqualSum(int a, int b, int c){

        boolean sumAnswer;

        if(a + b == c) {
            sumAnswer = true;
        } else{
            sumAnswer=false;
        }
        return sumAnswer;
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        return (int) (numberOne * 1000) == (int) (numberTwo * 1000);
    }
}
