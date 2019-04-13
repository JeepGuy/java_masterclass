package com.jbrent;

public class BarkingDog {

    public static void main(String[] args) {
        // bark(true, 23);
        bark (true, 1);
        bark (false, 2);
        bark (true, 8);
        bark (true, -1);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        boolean wakeUp;

        if (barking == false){
            wakeUp = false;
        } else if (barking == true && ((hourOfDay < 0) || (hourOfDay > 23) )){
            wakeUp = false;
        } else if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22)){
            wakeUp = true;
        } else {
            wakeUp = false;
        }

        System.out.println(wakeUp);

        return wakeUp;
    }


    public static boolean bark0(boolean barking, int hourOfDay){
        boolean wakeUp;

        if (barking == false){
            wakeUp = false;
        } else if (barking == true && ((hourOfDay < 1) || (hourOfDay > 23) )){
            wakeUp = false;
        } else if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22)){
            wakeUp = true;
        } else {
            wakeUp = false;
        }

        System.out.println(wakeUp);

        return wakeUp;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int XX = kiloBytes;
        int YY = (kiloBytes / 1024);
        int ZZ = (kiloBytes % 1024);

        if (kiloBytes >= 0){
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
