package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;
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
        if (e.getActionCommand().equals("+1$ per second. Price - 1000$. (" + Upgrades.perSecUpgrades + ")")) {

            if (Bank.state >= 1000) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {

                    Upgrades.perSecUpgrade();
                    mainWindow.getPerSecUpgradeButton().setText("+1$ per second. Price - 1000$. (" + Upgrades.perSecUpgrades + ")");

                    Bank.increasePS();
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                }


                else {
                    Upgrades.perSecUpgrade();
                    mainWindow.getPerSecUpgradeButton().setText("+1$ per second. Price - 1000$. (" + Upgrades.perSecUpgrades + ")");

                    Bank.increasePS();
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }



        else if(e.getActionCommand().equals("+10$ per second. Price - 10000$. (" + Upgrades.majorPerSecUpgrades + ")")) {

            if (Bank.state >= 10000) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {

                    Upgrades.majorPerSecUpgrade();
                    mainWindow.getMajorPerSecUpgradeButton().setText("+10$ per second. Price - 10000$. (" + Upgrades.majorPerSecUpgrades + ")");

                    Bank.majorIncreasePS();
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                }


                else {
                    Upgrades.majorPerSecUpgrade();
                    mainWindow.getMajorPerSecUpgradeButton().setText("+10$ per second. Price - 10000$. (" + Upgrades.majorPerSecUpgrades + ")");

                    Bank.majorIncreasePS();
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }
    }
}
