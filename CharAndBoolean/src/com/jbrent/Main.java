package com.jbrent;

public class Main {

    public static void main(String[] args) {
        // width of 16 or 2 bytes
        char myCharSimple = 'D';
        char myChar = '\u00A9';
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);
        System.out.println(" ");

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of the type char and assign it the unicode value for that symbol.
        // 3. Display it on the screen.

        char myUnicodeChar = '\u00AE';

        System.out.println(myUnicodeChar);


    }
}
