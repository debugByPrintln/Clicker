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
    MajorUpgradeListener majorUpgradeListener = new MajorUpgradeListener(this);
    ResetListener resetListener = new ResetListener(this);
    PerSecListener1 perSecListener1 = new PerSecListener1(this);
    PerSecListener2 perSecListener2 = new PerSecListener2(this);

    Timer timer1;
    Timer timer2;

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
        majorUpgradeClickButton.addActionListener(majorUpgradeListener);
        perSecUpgradeButton.addActionListener(perSecListener1);
        majorPerSecUpgradeButton.addActionListener(perSecListener2);
        resetButton.addActionListener(resetListener);

        score = new JLabel("|Bank - " + Bank.state + "$|");
        perClick = new JLabel("|PerClick - " + Bank.plus + "$|");
        perSecond = new JLabel("|PerSec - " + Bank.perSec1 + "$|");

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

    public void setTimer1(){
        timer1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bank.timeIncrement1();
                score.setText("|Bank - " + Bank.state + "$|");
            }
        });
    }

    public void setTimer2(){
        timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bank.timeIncrement2();
                score.setText("|Bank - " + Bank.state + "$|");
            }
        });
    }

    public JLabel getScore() {
        return score;
    }


    public JLabel getPerClick() {
        return perClick;
    }

    public Timer getTimer1() {
        return timer1;
    }

    public JLabel getPerSecond() {
        return perSecond;
    }

    public Timer getTimer2() {
        return timer2;
    }
}
