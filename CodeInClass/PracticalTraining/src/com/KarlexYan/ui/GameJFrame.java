package com.KarlexYan.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // 创建一个二维数组
    int[][] data = new int[4][4];
    // 记录空白方块在数组中的位置
    int x = 0;
    int y = 0;

    // 定义一个变量，记录当前展示的图片
    String path = "CodeInClass/PracticalTraining/image/animal/animal1/";

    // 定义一个二维数组，存储正确的顺序
    int[][] win = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};

    // 统计步数
    int step = 0;

    //创建选项下面的条目对象
    JMenuItem replayMenu = new JMenuItem("重新游戏");
    JMenuItem reloginMenu = new JMenuItem("重新登录");
    JMenuItem closeMenu = new JMenuItem("关闭游戏");
    JMenuItem qrCode = new JMenuItem("二维码");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    // 设置游戏界面大小
    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 创建菜单栏
        initJMenuBar();
        // 初始化数据
        initData();
        // 初始化图片
        initImage();

        // 设置是否显示
        this.setVisible(true);
    }


    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random rd = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = rd.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];


        }
    }

    private void initImage() {
        //清空列表
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利图标
            JLabel winJLabel = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //生成图片
//        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载的图片序号
                int number = data[i][j];
                // 创建一个图片ImageIcon的对象
                // ImageIcon icon1 = new ImageIcon("D:\\Coding\\Intelij-workspace\\PuzzleGame\\image\\animal\\animal3\\"+number+".jpg")
                // 创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));
                // 指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 把管理容器添加到界面
                this.getContentPane().add(jLabel);
//                number++;
            }
        }
        //生成背景图
        JLabel background = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        // 刷新界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {

        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我");
        JMenu changeImage = new JMenu("更换图片");


        //绑定事件
        replayMenu.addActionListener(this);
        reloginMenu.addActionListener(this);
        closeMenu.addActionListener(this);
        qrCode.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        // 将每一个选项下面的条目添加到选项当中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);
        functionJMenu.add(changeImage);
        functionJMenu.add(replayMenu);
        functionJMenu.add(reloginMenu);
        functionJMenu.add(closeMenu);
        aboutJMenu.add(qrCode);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //显示菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置宽高
        this.setSize(603, 680);
        // 设置界面标题
        this.setTitle("Puzzle Offline v1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置默认的布局
        this.setLayout(null);
        // 给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //生成背景图
            JLabel background = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        // 判断游戏是否胜利
        if (victory()) {
            return;
        }


        int code = e.getKeyCode();
        if (code == 37) {
            //向左移动
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 38) {
            //向上移动
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 39) {
            //向右移动
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 40) {
            //向下移动
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 65) {
            // 显示完整图片
            {
                initImage();
            }
        } else if (code == 87) {
            // 一键通关
            data = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayMenu) {
            step = 0;
            initData();
            initImage();
        } else if (obj == reloginMenu) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeMenu) {
            System.exit(0);
        } else if (obj == qrCode) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/image/v50.png"));
            jLabel.setBounds(0, 0, 312, 418);
            jDialog.getContentPane().add(jLabel);
            jDialog.setTitle("V我50");
            jDialog.setSize(400, 490);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (obj == girl) {
            int index = new Random().nextInt(13) + 1;
            path = "CodeInClass/PracticalTraining/image/girl/girl" + index + "/";
            initData();
            initImage();
            System.out.println("美女");
        } else if (obj == animal) {
            int index = new Random().nextInt(8) + 1;
            path = "CodeInClass/PracticalTraining/image/animal/animal" + index + "/";
            initData();
            initImage();
            System.out.println("动物");
        } else if (obj == sport) {
            int index = new Random().nextInt(10) + 1;
            path = "CodeInClass/PracticalTraining/image/sport/sport" + index + "/";
            initData();
            initImage();
            System.out.println("运动");
        }
    }
}

