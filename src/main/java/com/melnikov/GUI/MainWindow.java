package com.melnikov.GUI;

import com.melnikov.listeners.*;
import com.melnikov.logic.Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    JLabel score;
    JLabel perClick;
    JLabel perSecond;


    ClickListener clickListener = new ClickListener(this);
    UpgradeListener upgradeListener = new UpgradeListener(this);
    ResetListener resetListener = new ResetListener(this);
    PerSecListener perSecListener = new PerSecListener(this);

    Timer timer;

    public MainWindow() {
        JFrame frame = new JFrame("Clicker");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 200);
        frame.setLocation(800, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton clickButton = new JButton("CLICK!");
        JButton upgradeClickButton = new JButton("+1$ per click. Price - 100$");
        JButton majorUpgradeClickButton = new JButton("+10$ per click. Price - 1000$");
        JButton perSecUpgradeButton = new JButton("+1$ per second. Price - 1000$");
        JButton majorPerSecUpgradeButton = new JButton("+10$ per second. Price - 10000$");
        JButton resetButton = new JButton("Reset Game");

        clickButton.addActionListener(clickListener);
        upgradeClickButton.addActionListener(upgradeListener);
        majorUpgradeClickButton.addActionListener(upgradeListener);
        perSecUpgradeButton.addActionListener(perSecListener);
        majorPerSecUpgradeButton.addActionListener(perSecListener);
        resetButton.addActionListener(resetListener);

        score = new JLabel("|Bank - " + Bank.state + "$|");
        perClick = new JLabel("|PerClick - " + Bank.plus + "$|");
        perSecond = new JLabel("|PerSec - " + Bank.perSec + "$|");

        frame.add(score);
        frame.add(perClick);
        frame.add(perSecond);

        frame.add(clickButton);
        frame.add(upgradeClickButton);
        frame.add(majorUpgradeClickButton);
        frame.add(perSecUpgradeButton);
        frame.add(majorPerSecUpgradeButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    public void setTimer(){
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bank.timeIncrement();
                score.setText("|Bank - " + Bank.state + "$|");
                System.out.println("Bank has been incremented by TIMER. Bank state now: " + Bank.state + "$. PerSec: " + Bank.perSec + "$.");
            }
        });
    }


    public JLabel getScore() {
        return score;
    }


    public JLabel getPerClick() {
        return perClick;
    }

    public Timer getTimer() {
        return timer;
    }

    public JLabel getPerSecond() {
        return perSecond;
    }

}
