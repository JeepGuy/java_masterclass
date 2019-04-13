package com.jbrent;

public class TeenNumberChecker {

    private static boolean hasTeenFinalAnswer;

    public static void main(String[] args) {

        hasTeenFinalAnswer = hasTeen(9, 99, 19);
        System.out.println(hasTeenFinalAnswer);

        hasTeenFinalAnswer = hasTeen(23, 15, 42);
        System.out.println(hasTeenFinalAnswer);

        hasTeenFinalAnswer = hasTeen(22, 23, 34);
        System.out.println(hasTeenFinalAnswer);


        System.out.println();
        System.out.println(" -----");
        hasTeenFinalAnswer = hasTeen(1, 1, 1);
        System.out.println(hasTeenFinalAnswer);

    }

    public static boolean hasTeen(int one, int two, int three){

        boolean hasTeenAnswer;

        if ((one >= 13) && (one <=19)){
            hasTeenAnswer = true;
        } else if ((two >= 13) && (two <= 19)){
            hasTeenAnswer = true;
        } else if ((three >= 13) && (three <= 19)){
            hasTeenAnswer = true;
        } else {
            hasTeenAnswer= false;
        }

        return hasTeenAnswer;
    }

    // more efficient way???
        public static boolean hasTeen2(int x, int y, int z){
            return (x >=13 && x<=19) || (y >=13 && y<=19)|| (z >=13 && z<=19);
        }

}
