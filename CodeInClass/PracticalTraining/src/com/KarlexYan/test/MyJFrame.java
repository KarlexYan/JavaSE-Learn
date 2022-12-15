package com.KarlexYan.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jButton1 = new JButton("登录");
    JButton jButton2 = new JButton("注册");

    public MyJFrame() {
        this.setSize(603, 680);
        this.setTitle("Puzzle Game v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jButton1.setBounds(0, 0, 100, 50);
        jButton1.addActionListener(this);
        jButton2.setBounds(100, 0, 100, 50);
        jButton2.addActionListener(this);

        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jButton1) {
            jButton1.setSize(150, 250);
        } else if (source == jButton2) {
            Random rd = new Random();
            jButton2.setLocation(rd.nextInt(500), rd.nextInt(500));
        }
    }
}
