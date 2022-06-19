package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {
    MainWindow mainWindow;

    public ResetListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Bank.setToDefault();
        if (mainWindow.getTimer1().isRunning()){
            mainWindow.getTimer1().stop();
        }
        if (mainWindow.getTimer2().isRunning()){
            mainWindow.getTimer2().stop();
        }
        mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
        mainWindow.getPerSecond().setText("|PerSec - " + (Bank.perSec1 + Bank.perSec2) + "$|");
        mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
    }
}
