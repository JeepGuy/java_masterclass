package com.jbrent;

public class Main {

    public static void main(String[] args) {

        String answer = getDurationString(1, 59);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(0, 100);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(61, 0);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(200, 10);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(10);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(101);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(-1);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(4001);
        System.out.println(answer);
        System.out.println("------");

        answer = getDurationString(3601);
        System.out.println(answer);
        System.out.println("------");

    }

    private static String getDurationString(int minutes, int seconds){

        if(( minutes < 0 ) || ( seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        } else {
            // calculate hours minutes and seconds were passed.
            int hours;
            String hoursCalc;
            String mintuesCalc;
            String secondsCalc;

            hours = minutes / 60;
            hoursCalc = String.valueOf(hours);

            minutes = minutes % 60;
            mintuesCalc = String.valueOf(minutes);

            secondsCalc = String.valueOf(seconds);

            return hoursCalc+"h " + mintuesCalc + "m " + secondsCalc + "s";
        }

    }

    private static String getDurationString(int seconds){

            if ( seconds < 0 ){
                return "Invalid value";
            }else{
                int minutes = seconds / 60;
                int secondsRemainder = seconds % 60;
                return getDurationString(minutes, secondsRemainder);
            }
    }
}
