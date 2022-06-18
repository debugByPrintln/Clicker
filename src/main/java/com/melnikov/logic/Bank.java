package com.melnikov.logic;

public class Bank {
    public static int state = 0;
    public static int plus = 1;

    public static void increment(){
        state += plus;
    }

    public static void upgrade(){
        state -= 100;
        plus += 1;
    }

    public static void majorUpgrade(){
        state -= 1000;
        plus += 10;
    }

    public static void setToDefault(){
        state = 0;
        plus = 1;
    }
}
