package com.KarlexYan.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    // 创建注册界面
    public RegisterJFrame() {
        // 设置界面宽高
        this.setSize(488, 500);
        // 设置界面标题
        this.setTitle("Puzzle Offline Register");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置是否显示
        this.setVisible(true);
    }
}
