package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpgradeListener implements ActionListener {
    MainWindow mainWindow;

    public UpgradeListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+1$ per click. Price - 100$")) {
            if (Bank.state >= 100) {
                Bank.upgrade(1);
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was upgraded by +1$. Bank plus now: " + Bank.plus);
            }
        }
        else if(e.getActionCommand().equals("+10$ per click. Price - 1000$")){
            if (Bank.state >= 1000){
                Bank.upgrade(10);
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
                System.out.println("Bank plus was MAJOR upgraded by +10$. Bank plus now: " + Bank.plus);
            }
        }
    }
}
