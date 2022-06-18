package com.melnikov.GUI;

import com.melnikov.listeners.ClickListener;
import com.melnikov.listeners.MajorUpgradeListener;
import com.melnikov.listeners.ResetListener;
import com.melnikov.listeners.UpgradeListener;
import com.melnikov.logic.Bank;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    JLabel score;
    JLabel perClick;

    ClickListener clickListener = new ClickListener(this);
    UpgradeListener upgradeListener = new UpgradeListener(this);
    MajorUpgradeListener majorUpgradeListener = new MajorUpgradeListener(this);
    ResetListener resetListener = new ResetListener(this);

    public MainWindow() {
        JFrame frame = new JFrame("Clicker");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 200);
        frame.setLocation(800, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton clickButton = new JButton("CLICK!");
        JButton upgradeClickButton = new JButton("+1$ per click. Price - 100");
        JButton majorUpgradeClickButton = new JButton("+10$ per click. Price - 1000");
        JButton resetButton = new JButton("Reset Game");

        clickButton.addActionListener(clickListener);
        upgradeClickButton.addActionListener(upgradeListener);
        majorUpgradeClickButton.addActionListener(majorUpgradeListener);
        resetButton.addActionListener(resetListener);


        frame.add(clickButton);
        frame.add(upgradeClickButton);
        frame.add(majorUpgradeClickButton);

        score = new JLabel("|Bank - " + Bank.state + "$|");
        perClick = new JLabel("|PerClick - " + Bank.plus + "$|");

        frame.add(score);
        frame.add(perClick);


        frame.add(resetButton);

        frame.setVisible(true);
    }

    public JLabel getScore() {
        return score;
    }

    public void setScore(JLabel score) {
        this.score = score;
    }

    public JLabel getPerClick() {
        return perClick;
    }

    public void setPerClick(JLabel perClick) {
        this.perClick = perClick;
    }
}
