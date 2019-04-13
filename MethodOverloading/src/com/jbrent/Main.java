package com.jbrent;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Jim", 500);
//        System.out.println("New Score is " + newScore);
//        newScore = calculateScore(75);
//        calculateScore();

        double centValue0 = calcFeetAndInchesToCentimeters(2, 11);
        System.out.println("Centimeter value is: " + centValue0);


        double centValue1 = calcFeetAndInchesToCentimeters(2, 13);
        System.out.println("Centimeter value is: " + centValue1);

        double centValue3 = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println("Centimeter value is: " + centValue3);

        System.out.println(" --- ");

        double centValue2 = calcFeetAndInchesToCentimeters(157);
        System.out.println("Centimeter value for inches only is: " + centValue2);

        double centValue4 = calcFeetAndInchesToCentimeters(157);
        System.out.println("Centimeter value for inches only is: " + centValue4);
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        double calcAnswer;
        if (((feet >= 0) && ((inches >= 0) && (inches <=12)))){
            double feetInch = feet * 12;
            calcAnswer = ((feetInch + inches) * 2.54) ;
        } else {
            calcAnswer = -1;
            // could use return -1; and the method would exit.
        }

        return calcAnswer;
    }

    public static double calcFeetAndInchesToCentimeters( double inches){

        double calcAnswer;
        if (inches >= 0){
            double feetValue =  ((int) (inches / 12));

            double inchValue = (inches % 12);

            calcAnswer = calcFeetAndInchesToCentimeters(feetValue, inchValue);
            // could have done a dual function as:
            // return calcFeetAndInchesToCentimeters(feetValue, inchValue);

        } else {
            calcAnswer = -1;
        }

        return calcAnswer;
    }







    /*  Lecture section   -------------------------------------------------  */

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
       return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player No score");
        return 1000;
    }










}
