package task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Register extends JFrame implements MouseListener {
    JButton register = new JButton("注册");
    JButton cancel = new JButton("返回");
    JTextField username = new JTextField();
    JTextField password = new JPasswordField();
    JTextField comfirmPassword = new JPasswordField();

    public Register() {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        Container container = this.getContentPane();
        JLabel titleText = new JLabel("注册");
        titleText.setBounds(120, 20, 47, 17);
        container.add(titleText);

        JLabel usernameText = new JLabel("用户名");
        usernameText.setBounds(45, 50, 57, 17);
        container.add(usernameText);

        username.setBounds(100, 50, 110, 20);
        container.add(username);

        JLabel passwordText = new JLabel("密 码");
        passwordText.setBounds(53, 90, 57, 17);
        container.add(passwordText);

        password.setBounds(100, 90, 110, 20);
        container.add(password);

        JLabel comfirmPasswordText = new JLabel("确认密码");
        comfirmPasswordText.setBounds(38, 130, 65, 17);
        container.add(comfirmPasswordText);

        comfirmPassword.setBounds(100, 130, 110, 20);
        container.add(comfirmPassword);

        register.setBounds(65, 160, 60, 25);
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        container.add(register);

        cancel.setBounds(150, 160, 60, 25);
        cancel.setContentAreaFilled(false);
        cancel.addMouseListener(this);
        container.add(cancel);

    }

    private void initJFrame() {
        this.setSize(288, 230);
        this.setTitle("注册");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == register) {
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String comfirmInput = comfirmPassword.getText();
            if (usernameInput.length() == 0 || passwordInput.length() == 0 || comfirmInput.length() == 0) {
                JOptionPane.showMessageDialog(this, "必须全部填完");
            } else if (!comfirmInput.equals(passwordInput)) {
                JOptionPane.showMessageDialog(this, "两次密码不一致");
            } else if (new DBConnection().contains(usernameInput)) {
                JOptionPane.showMessageDialog(this, "用户已存在，请重新输入");
                this.dispose();
                new Register();
            } else {
                int result = new DBConnection().register(usernameInput, passwordInput);
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "注册成功");
                    this.dispose();
                    new Login();
                }
            }
        } else if (obj == cancel) {
            this.setVisible(false);
            new Login();
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
