package com.melnikov.logic;

import com.melnikov.GUI.MainWindow;

public class Bank {
    public static int state = 0;
    public static int plus = 1;
    public static int perSec = 0;

    public static void increment(){
        state += plus;
    }

    public static void upgrade(int i){
        if (i == 1){
            state -= 100;
            plus += 1;
        }
        else if (i == 10){
            state -= 1000;
            plus += 10;
        }
    }

    public static void setToDefault(){
        state = 0;
        plus = 1;
        perSec = 0;
    }

    public static void increasePS(int i){
        if (i == 1){
            state -= 1000;
            perSec += 1;
        }
        else if (i == 10){
            state -= 10000;
            perSec += 10;
        }
    }

    public static void timeIncrement(){
        state += perSec;
    }

}
