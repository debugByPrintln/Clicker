package com.melnikov.listeners;

import com.melnikov.GUI.MainWindow;
import com.melnikov.logic.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    MainWindow mainWindow;

    public ClickListener(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Bank.increment();
        mainWindow.getScore().setText("|Bank - " + Bank.state + "$|");
        System.out.println("Click was registered. Bank was incremented by: " + Bank.plus + "$. Bank state now is: " + Bank.state + "$.");
    }
}
