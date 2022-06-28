package com.melnikov.logic;

public class Upgrades {
    public static int clickUpgrades = 0;
    public static int majorClickUpgrades = 0;

    public static int perSecUpgrades = 0;
    public static int majorPerSecUpgrades = 0;


    public static void clickUpgrade(){
        clickUpgrades++;
    }

    public static void majorClickUpgrade(){
        majorClickUpgrades++;
    }

    public static void perSecUpgrade(){
        perSecUpgrades++;
    }

    public static void majorPerSecUpgrade(){
        majorPerSecUpgrades++;
    }

    public static void setToDefault(){
        clickUpgrades = 0;
        majorClickUpgrades = 0;
        perSecUpgrades = 0;
        majorPerSecUpgrades = 0;
    }
}
