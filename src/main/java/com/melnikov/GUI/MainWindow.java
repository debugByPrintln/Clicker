package com.melnikov.GUI;

import com.melnikov.listeners.*;
import com.melnikov.logic.Bank;
import com.melnikov.logic.Upgrades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private final JLabel score;
    private final JLabel perClick;
    private final JLabel perSecond;

    private final JButton clickButton;
    private final JButton upgradeClickButton;
    private final JButton majorUpgradeClickButton;
    private final JButton perSecUpgradeButton;
    private final JButton majorPerSecUpgradeButton;
    private final JButton resetButton;

    private Timer timer;

    public MainWindow() {
        JFrame frame = new JFrame("Clicker");

        frame.setLayout(new FlowLayout());
        frame.setSize(500, 200);
        frame.setLocation(800, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickButton = new JButton("CLICK!");
        upgradeClickButton = new JButton("+1$ per click. Price - 100$. (" + Upgrades.clickUpgrades + ")");
        majorUpgradeClickButton = new JButton("+10$ per click. Price - 1000$. (" + Upgrades.majorClickUpgrades + ")");
        perSecUpgradeButton = new JButton("+1$ per second. Price - 1000$. (" + Upgrades.perSecUpgrades + ")");
        majorPerSecUpgradeButton = new JButton("+10$ per second. Price - 10000$. (" + Upgrades.majorPerSecUpgrades + ")");
        resetButton = new JButton("Reset Game");

        clickButton.addActionListener(new ClickListener(this));
        upgradeClickButton.addActionListener(new UpgradeListener(this));
        majorUpgradeClickButton.addActionListener(new UpgradeListener(this));
        perSecUpgradeButton.addActionListener(new PerSecListener(this));
        majorPerSecUpgradeButton.addActionListener(new PerSecListener(this));
        resetButton.addActionListener(new ResetListener(this));

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

    public JButton getUpgradeClickButton() {
        return upgradeClickButton;
    }

    public JButton getMajorUpgradeClickButton() {
        return majorUpgradeClickButton;
    }

    public JButton getPerSecUpgradeButton() {
        return perSecUpgradeButton;
    }

    public JButton getMajorPerSecUpgradeButton() {
        return majorPerSecUpgradeButton;
    }
}
