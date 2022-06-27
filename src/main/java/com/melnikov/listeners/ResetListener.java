package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;
import com.melnikov.logic.Upgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {
    MainWindow mainWindow;

    public ResetListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Upgrades.setToDefault();
        mainWindow.getUpgradeClickButton().setText("+1$ per click. Price - 100$. (" + Upgrades.clickUpgrades + ")");
        mainWindow.getMajorUpgradeClickButton().setText("+10$ per click. Price - 1000$. (" + Upgrades.majorClickUpgrades + ")");
        mainWindow.getPerSecUpgradeButton().setText("+1$ per second. Price - 1000$. (" + Upgrades.perSecUpgrades + ")");
        mainWindow.getMajorPerSecUpgradeButton().setText("+10$ per second. Price - 10000$. (" + Upgrades.majorPerSecUpgrades + ")");

        Bank.setToDefault();
        if (!(mainWindow.getTimer() == null) && mainWindow.getTimer().isRunning()){
            mainWindow.getTimer().stop();
        }
        mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
        mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
        mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");

        System.out.println("Game was reset. All timers was stopped if any was running. Bank state now: " + Bank.state + "$. Bank plus now: " + Bank.plus + "$. Bank perSec now: " + Bank.perSec + "$.");
    }
}
