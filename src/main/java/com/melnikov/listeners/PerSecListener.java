package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;
import com.melnikov.logic.Prices;
import com.melnikov.logic.Upgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerSecListener implements ActionListener {
    MainWindow mainWindow;

    public PerSecListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+1$ per second. Price - " + Prices.perSecUpgrade +"$. " +
                "(" + Upgrades.perSecUpgrades + ")")) {

            if (Bank.state >= Prices.perSecUpgrade) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {
                    Bank.increasePS();
                    Upgrades.perSecUpgrade();
                    Prices.increasePerSecUpgrade();
                    mainWindow.getPerSecUpgradeButton().setText("+1$ per second. Price - " + Prices.perSecUpgrade +"$. " +
                            "(" + Upgrades.perSecUpgrades + ")");


                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                }


                else {
                    Bank.increasePS();
                    Upgrades.perSecUpgrade();
                    Prices.increasePerSecUpgrade();
                    mainWindow.getPerSecUpgradeButton().setText("+1$ per second. Price - " + Prices.perSecUpgrade +"$. " +
                            "(" + Upgrades.perSecUpgrades + ")");


                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }



        else if(e.getActionCommand().equals("+10$ per second. Price - " + Prices.majorPerSecUpgrade +"$. " +
                "(" + Upgrades.majorPerSecUpgrades + ")")) {

            if (Bank.state >= Prices.majorPerSecUpgrade) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {
                    Bank.majorIncreasePS();
                    Upgrades.majorPerSecUpgrade();
                    Prices.increaseMajorClickUpgrade();
                    mainWindow.getMajorPerSecUpgradeButton().setText("+10$ per second. Price - " + Prices.majorPerSecUpgrade +"$. " +
                            "(" + Upgrades.majorPerSecUpgrades + ")");


                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                }


                else {
                    Bank.majorIncreasePS();
                    Upgrades.majorPerSecUpgrade();
                    Prices.increaseMajorPerSecUpgrade();
                    mainWindow.getMajorPerSecUpgradeButton().setText("+10$ per second. Price - " + Prices.majorPerSecUpgrade +"$. " +
                            "(" + Upgrades.majorPerSecUpgrades + ")");


                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }
    }
}
