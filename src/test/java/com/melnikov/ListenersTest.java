package com.melnikov;

import com.melnikov.GUI.MainWindow;
import com.melnikov.listeners.ClickListener;
import com.melnikov.listeners.PerSecListener;
import com.melnikov.listeners.ResetListener;
import com.melnikov.listeners.UpgradeListener;
import com.melnikov.logic.Bank;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListenersTest {
    MainWindow mainWindow = new MainWindow();

    @AfterEach
    public void setToDefault(){
        Bank.state = 0;
        Bank.perSec = 0;
        Bank.plus = 1;
        System.out.println("\n ---Scores were dropped---\n");
    }

    @Test
    public void testClickListener(){
        ClickListener clickListener = new ClickListener(mainWindow);

        assertEquals(0, Bank.state);

        clickListener.actionPerformed(new ActionEvent(new JButton(), 1, null));

        assertEquals(1, Bank.state);
    }

    @Test
    public void testPerSecListener(){
        PerSecListener perSecListener = new PerSecListener(mainWindow);
        assertEquals(0, Bank.perSec);
        Bank.state = 11000;

        perSecListener.actionPerformed(new ActionEvent(new JButton(), 1, "+1$ per second. Price - 1000$"));
        assertEquals(1, Bank.perSec);

        perSecListener.actionPerformed(new ActionEvent(new JButton(), 1, "+10$ per second. Price - 10000$"));
        assertEquals(11, Bank.perSec);
    }

    @Test
    public void testResetListener(){
        Bank.state = 1000;
        Bank.perSec = 10000;
        Bank.plus = 3434;

        ResetListener resetListener = new ResetListener(mainWindow);

        resetListener.actionPerformed(new ActionEvent(new JButton(), 1, null));

        assertEquals(0 , Bank.state);
        assertEquals(0 , Bank.perSec);
        assertEquals(1 , Bank.plus);
    }

    @Test
    public void testUpgradeListener(){
        UpgradeListener upgradeListener = new UpgradeListener(mainWindow);
        assertEquals(1, Bank.plus);
        Bank.state = 1100;

        upgradeListener.actionPerformed(new ActionEvent(new JButton(), 1, "+1$ per click. Price - 100$"));
        assertEquals(2, Bank.plus);

        upgradeListener.actionPerformed(new ActionEvent(new JButton(), 1, "+10$ per click. Price - 1000$"));
        assertEquals(12, Bank.plus);
    }
}
