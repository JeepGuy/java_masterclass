package com.jbrent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isCatPlaying(true, 10));

        System.out.println(isCatPlaying(false, 36));

        System.out.println(isCatPlaying(false, 35));

        System.out.println(isCatPlaying(true, 45));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        int upperTemp = 35;

        if(summer == true) {
            upperTemp = 35 + 10;
        }

        if ( (temperature >= 25) && (temperature <= upperTemp) ){
            return true;
        } else {
          return false;
        }
    }
}
