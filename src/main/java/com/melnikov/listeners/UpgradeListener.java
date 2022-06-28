package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;
import com.melnikov.logic.Prices;
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
        if (e.getActionCommand().equals("+1$ per click. Price - " + Prices.clickUpgrade + "$. " +
                "(" + Upgrades.clickUpgrades + ")")) {

            if (Bank.state >= Prices.clickUpgrade) {
                Bank.upgrade();
                Upgrades.clickUpgrade();
                Prices.increaseClickUpgrade();
                mainWindow.getUpgradeClickButton().setText("+1$ per click. Price - " + Prices.clickUpgrade + "$. " +
                        "(" + Upgrades.clickUpgrades + ")");


                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was upgraded by +1$. Bank plus now: " + Bank.plus);
            }
        }



        else if(e.getActionCommand().equals("+10$ per click. Price - " + Prices.majorClickUpgrade + "$. " +
                "(" + Upgrades.majorClickUpgrades + ")")){

            if (Bank.state >= Prices.majorClickUpgrade){
                Bank.majorUpgrade();
                Upgrades.majorClickUpgrade();
                Prices.increaseMajorClickUpgrade();
                mainWindow.getMajorUpgradeClickButton().setText("+10$ per click. Price - " + Prices.majorClickUpgrade + "$. " +
                        "(" + Upgrades.majorClickUpgrades + ")");


                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was MAJOR upgraded by +10$. Bank plus now: " + Bank.plus);
            }
        }
    }
}
