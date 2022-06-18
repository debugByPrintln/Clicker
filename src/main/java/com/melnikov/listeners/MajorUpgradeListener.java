package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MajorUpgradeListener implements ActionListener {
    MainWindow mainWindow;

    public MajorUpgradeListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Bank.state >= 1000){
            Bank.majorUpgrade();
            mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
            mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
        }
    }
}
