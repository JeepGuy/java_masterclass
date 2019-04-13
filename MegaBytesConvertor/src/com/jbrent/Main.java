package com.jbrent;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(1025);

    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){

        if(kilobytes > 0 ){
            System.out.println("Invalid Value");
        }



    }

//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//
//        int XX = kiloBytes;
//        int YY = (kiloBytes / 1024);
//        int ZZ = (kiloBytes % 1024);
//
//        if (kiloBytes >= 0){
//            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
//        } else {
//            System.out.println("Invalid Value");

}
