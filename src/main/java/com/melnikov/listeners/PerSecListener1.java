package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerSecListener1 implements ActionListener {
    MainWindow mainWindow;

    public PerSecListener1(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Bank.state >= 1000){
            if (mainWindow.getTimer1() == null || !mainWindow.getTimer1().isRunning()){
                Bank.increasePS1();
                mainWindow.getPerSecond().setText("|PerSec - " + (Bank.perSec1 + Bank.perSec2) + "$|");
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                mainWindow.setTimer1();
                mainWindow.getTimer1().start();
            }

            else{
                Bank.increasePS1();
                mainWindow.getPerSecond().setText("|PerSec - " + (Bank.perSec1 + Bank.perSec2) + "$|");
                mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
            }
        }

    }
}
