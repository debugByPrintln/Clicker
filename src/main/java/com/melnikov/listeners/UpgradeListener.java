package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;
import com.melnikov.logic.Upgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpgradeListener implements ActionListener {
    MainWindow mainWindow;

    public UpgradeListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+1$ per click. Price - 100$. (" + Upgrades.clickUpgrades + ")")) {

            if (Bank.state >= 100) {

                Upgrades.clickUpgrade();
                mainWindow.getUpgradeClickButton().setText("+1$ per click. Price - 100$. (" + Upgrades.clickUpgrades + ")");

                Bank.upgrade();
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was upgraded by +1$. Bank plus now: " + Bank.plus);
            }
        }



        else if(e.getActionCommand().equals("+10$ per click. Price - 1000$. (" + Upgrades.majorClickUpgrades + ")")){

            if (Bank.state >= 1000){

                Upgrades.majorClickUpgrade();
                mainWindow.getMajorUpgradeClickButton().setText("+10$ per click. Price - 1000$. (" + Upgrades.majorClickUpgrades + ")");

                Bank.majorUpgrade();
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was MAJOR upgraded by +10$. Bank plus now: " + Bank.plus);
            }
        }
    }
}
