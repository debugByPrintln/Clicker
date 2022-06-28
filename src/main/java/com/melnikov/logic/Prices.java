package com.melnikov.logic;

public class Prices {
    public static int clickUpgrade = 100;
    public static int majorClickUpgrade = 1000;

    public static int perSecUpgrade = 1000;
    public static int majorPerSecUpgrade = 10000;

    public static void setToDefault(){
        clickUpgrade = 100;
        majorClickUpgrade = 1000;
        perSecUpgrade = 1000;
        majorPerSecUpgrade = 10000;
    }

    public static void increaseClickUpgrade(){
        clickUpgrade = (int) (clickUpgrade * 1.1);
    }

    public static void increaseMajorClickUpgrade(){
        majorClickUpgrade = (int) (majorClickUpgrade * 1.1);
    }

    public static void increasePerSecUpgrade(){
        perSecUpgrade = (int) (perSecUpgrade * 1.1);
    }

    public static void increaseMajorPerSecUpgrade(){
        majorPerSecUpgrade = (int) (majorPerSecUpgrade * 1.1);
    }
}
