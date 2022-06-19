package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerSecListener2 implements ActionListener {
    MainWindow mainWindow;

    public PerSecListener2(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Bank.state >= 10000){
            if (mainWindow.getTimer2() == null || !mainWindow.getTimer2().isRunning()){
                Bank.increasePS2();
                mainWindow.getPerSecond().setText("|PerSec - " + (Bank.perSec1 + Bank.perSec2) + "$|");
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.setTimer2();
                mainWindow.getTimer2().start();
            }

            else{
                Bank.increasePS2();
                mainWindow.getPerSecond().setText("|PerSec - " + (Bank.perSec1 + Bank.perSec2) + "$|");
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
            }
        }
    }
}
