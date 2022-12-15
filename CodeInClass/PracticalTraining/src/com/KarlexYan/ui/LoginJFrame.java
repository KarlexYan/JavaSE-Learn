package com.KarlexYan.ui;

import com.KarlexYan.domain.User;
import com.KarlexYan.util.CodeUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("zhangsan", "123"));
        list.add(new User("lisi", "123"));
    }

    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();
    JLabel rightCode = new JLabel();

    // 创建登录界面
    public LoginJFrame() {
        //初始化界面
        initJFrame();
        //添加内容
        initView();
        // 设置是否显示
        this.setVisible(true);

    }

    private void initView() {
        // 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/login/用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);
        // 添加输入框

        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);
        // 添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/login/密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);
        // 添加输入框

        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);
        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/login/验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);
        // 添加输入框

        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);


        String codeStr = CodeUtil.getCode();
        rightCode.setText(codeStr);
        rightCode.addMouseListener(this);
        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);

        // 登录按钮

        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/登录按钮.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.getContentPane().add(login);

        // 注册按钮

        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/注册按钮.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        // 背景图片
        JLabel background = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/login/background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    private void initJFrame() {
        // 设置界面宽高
        this.setSize(488, 430);
        // 设置界面标题
        this.setTitle("Puzzle Offline Login");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认布局
        this.setLayout(null);
    }

    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("点击了登录按钮");
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String codeInput = code.getText();

            User userInfo = new User(usernameInput, passwordInput);

            if (codeInput.length() == 0) {
                showJDialog("验证码不能为空");
            } else if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                System.out.println("用户名或者密码为空");
                showJDialog("用户名或者密码为空");
            } else if (!codeInput.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码输入错误");
            } else if (contains(userInfo)) {
                this.setVisible(false);
                new GameJFrame();
            } else {
                showJDialog("用户名或密码错误");
            }

        } else if (e.getSource() == register) {
            JOptionPane.showMessageDialog(this, "开发中，敬请期待！");
        } else if (e.getSource() == rightCode) {
            System.out.println("更换验证码");
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
    }

    private boolean contains(User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (userInfo.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("登录按下");
            login.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/登录按下.png"));
        } else if (e.getSource() == register) {
            System.out.println("注册按下");
            register.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/登录按钮.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("CodeInClass/PracticalTraining/image/login/注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
