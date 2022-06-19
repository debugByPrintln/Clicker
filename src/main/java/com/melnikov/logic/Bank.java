package com.melnikov.logic;

import com.melnikov.GUI.MainWindow;

public class Bank {
    public static int state = 0;
    public static int plus = 1;
    public static int perSec1 = 0;
    public static int perSec2 = 0;

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
        perSec1 = 0;
        perSec2 = 0;
    }

    public static void increasePS1(){
        state -= 1000;
        perSec1 += 1;
    }

    public static void increasePS2(){
        state -= 10000;
        perSec2 += 10;
    }

    public static void timeIncrement1(){
        state += perSec1;
    }

    public static void timeIncrement2(){
        state += perSec2;
    }
}
