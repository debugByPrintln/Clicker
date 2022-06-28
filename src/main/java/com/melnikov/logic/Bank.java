package com.melnikov.logic;

import com.melnikov.GUI.MainWindow;

public class Bank {
    public static int state = 0;
    public static int plus = 1;
    public static int perSec = 0;

    public static void increment(){
        state += plus;
    }

    public static void upgrade(){
        state -= Prices.clickUpgrade;
        plus += 1;
    }

    public static void majorUpgrade(){
        state -= Prices.majorClickUpgrade;
        plus += 10;
    }

    public static void setToDefault(){
        state = 0;
        plus = 1;
        perSec = 0;
    }

    public static void increasePS(){
        state -= Prices.perSecUpgrade;
        perSec += 1;
    }

    public static void majorIncreasePS(){
        state -= Prices.majorPerSecUpgrade;
        perSec += 10;
    }

    public static void timeIncrement(){
        state += perSec;
    }

}
