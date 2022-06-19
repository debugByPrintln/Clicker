package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerSecListener implements ActionListener {
    MainWindow mainWindow;

    public PerSecListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+1$ per second. Price - 1000$")) {
            if (Bank.state >= 1000) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {
                    Bank.increasePS(1);
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                } else {
                    Bank.increasePS(1);
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was incremented by 1$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }
        else if(e.getActionCommand().equals("+10$ per second. Price - 10000$")) {
            if (Bank.state >= 10000) {
                if (mainWindow.getTimer() == null || !mainWindow.getTimer().isRunning()) {
                    Bank.increasePS(10);
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    mainWindow.setTimer();
                    mainWindow.getTimer().start();
                    System.out.println("Timer has started and perSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                } else {
                    Bank.increasePS(10);
                    mainWindow.getPerSecond().setText("|PerSec - " + Bank.perSec + "$|");
                    mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
                    System.out.println("PerSec was MAJOR incremented by 10$. PerSec now: " + Bank.perSec + "$.");
                }
            }
        }
    }
}
