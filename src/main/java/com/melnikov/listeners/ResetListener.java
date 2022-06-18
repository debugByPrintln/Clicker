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
        mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
        mainWindow.getPerClick().setText("|PerClick - " + Bank.plus + "$|");
    }
}
