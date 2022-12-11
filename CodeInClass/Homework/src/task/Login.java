package task;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;

public class Login extends JFrame implements MouseListener {
    JButton login = new JButton("登录");
    JButton register = new JButton("注册");
    JTextField username = new JTextField();
    JTextField password = new JPasswordField();

    public Login() {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        // 登录文字
        JLabel titleText = new JLabel("登录");
        titleText.setBounds(120, 20, 47, 17);
        this.getContentPane().add(titleText);

        // 用户名
        JLabel usernameText = new JLabel("用户名");
        usernameText.setBounds(45, 50, 57, 17);
        this.getContentPane().add(usernameText);

        // 用户名输入框
        username.setBounds(100, 50, 110, 20);
        this.getContentPane().add(username);

        // 密码
        JLabel passwordText = new JLabel("密 码");
        passwordText.setBounds(53, 90, 57, 17);
        this.getContentPane().add(passwordText);

        // 密码输入框
        password.setBounds(100, 90, 110, 20);
        this.getContentPane().add(password);

        // 登录按钮
        login.setBounds(65, 130, 60, 25);
//        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.getContentPane().add(login);

        // 注册按钮
        register.setBounds(150, 130, 60, 25);
//        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

    }

    private void initJFrame() {
        this.setSize(288, 230);
        this.setTitle("登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == login) {
            String usernameInput = username.getText();
            String passwordInput = password.getText();

            if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                JOptionPane.showMessageDialog(this, "用户名或密码为空");
            } else if (new DBConnection().contains(usernameInput, passwordInput)) {
                JOptionPane.showMessageDialog(this, "登录成功");
            } else {
                JOptionPane.showMessageDialog(this, "用户名或密码有误");
            }
        } else if (obj == register) {
            this.setVisible(false);
            new Register();
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
