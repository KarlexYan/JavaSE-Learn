package PT4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NoteBook extends JFrame implements ActionListener {

    // 文件菜单的子选项
    JMenuItem newMenu = new JMenuItem("新建");
    JMenuItem openMenu = new JMenuItem("打开");
    JMenuItem saveMenu = new JMenuItem("保存");
    JMenuItem saveAsMenu = new JMenuItem("另存为");
    JMenuItem exitMenu = new JMenuItem("退出");
    // 编辑菜单的子选项
    JMenuItem revokeMenu = new JMenuItem("撤销");
    JMenuItem shearMenu = new JMenuItem("剪切");
    JMenuItem copyMenu = new JMenuItem("复制");
    JMenuItem pasteMenu = new JMenuItem("粘贴");
    JMenuItem deleteMenu = new JMenuItem("删除");
    JMenuItem selectAllMenu = new JMenuItem("全选");
    // 帮助菜单的子选项
    JMenuItem aboutMenu = new JMenuItem("关于我");

    // 写东西的地方
    JTextArea jTextArea = new JTextArea();


    // 用户选择框
    JFileChooser jFileChooser = new JFileChooser();
    // 用户所打开的文件
    File openFiles;

    public NoteBook() {
        // 初始化界面
        initJFrame();
        // 加载菜单栏
        initJMenuBar();
        // 加载文本框
    }

    private void initJFrame() {
        this.setSize(550, 400);
        this.setTitle("NoteBook by KarlexYan");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 文件 编辑 帮助三个菜单
        JMenu fileJMenu = new JMenu("文件(F)");
        JMenu editJMenu = new JMenu("编辑(E)");
        JMenu helpJMenu = new JMenu("帮助(H)");

        // 增加监听
        newMenu.addActionListener(this);
        openMenu.addActionListener(this);
        saveMenu.addActionListener(this);
        saveAsMenu.addActionListener(this);
        exitMenu.addActionListener(this);
        revokeMenu.addActionListener(this);
        shearMenu.addActionListener(this);
        copyMenu.addActionListener(this);
        pasteMenu.addActionListener(this);
        deleteMenu.addActionListener(this);
        selectAllMenu.addActionListener(this);
        aboutMenu.addActionListener(this);

        // 将选项添加到文件菜单
        fileJMenu.add(newMenu);
        fileJMenu.add(openMenu);
        fileJMenu.add(saveMenu);
        fileJMenu.add(saveAsMenu);
        fileJMenu.add(exitMenu);
        // 将选项添加到编辑菜单
        editJMenu.add(revokeMenu);
        editJMenu.add(shearMenu);
        editJMenu.add(copyMenu);
        editJMenu.add(pasteMenu);
        editJMenu.add(deleteMenu);
        editJMenu.add(selectAllMenu);
        // 将选项添加到帮助菜单
        helpJMenu.add(aboutMenu);
        // 将三个菜单添加到对象中
        jMenuBar.add(fileJMenu);
        jMenuBar.add(editJMenu);
        jMenuBar.add(helpJMenu);
        // 显示界面
        this.setJMenuBar(jMenuBar);
        this.add(new JScrollPane(jTextArea));
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == newMenu) {
            newFile();
        } else if (obj == openMenu) {
            openFile();
        } else if (obj == saveMenu) {
            save();
        } else if (obj == saveAsMenu) {
            saveAs();
        } else if (obj == exitMenu) {
            System.exit(0);
        } else if (obj == revokeMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == shearMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == copyMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == pasteMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == deleteMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == selectAllMenu) {
            JOptionPane.showMessageDialog(this, "太懒了还没做，敬请期待！");
        } else if (obj == aboutMenu) {
            JOptionPane.showMessageDialog(this, "这里是严炜轩写的记事本");
            JDialog jDialog = new JDialog();
            jDialog.setTitle("V我50恰个肯德基");
            JLabel jLabel = new JLabel(new ImageIcon("CodeInClass/PracticalTraining/src/PT4/v50.png"));
            jLabel.setBounds(0, 0, 315, 417);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(350, 480);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }

    private void saveAs() {
        openFiles = null;
        save();
    }

    private void openFile() {
        int state = jFileChooser.showOpenDialog(this);
        if (state == JFileChooser.APPROVE_OPTION) {
            jTextArea.setText("");
            openFiles = jFileChooser.getSelectedFile();
            try {
                FileReader fileReader = new FileReader(openFiles);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    jTextArea.append(str + "\n");
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void newFile() {
        if (jTextArea.getText() != null && !jTextArea.getText().equals("")) {
            int i = JOptionPane.showConfirmDialog(this, "该文本未保存，是否保存后新建？");
            if (i == JOptionPane.YES_OPTION) {
                save();
                jTextArea.setText("");
            } else if (i == JOptionPane.NO_OPTION) {
                jTextArea.setText("");
            }
        }
    }

    private void save() {
        if (openFiles == null) {
            int state = jFileChooser.showOpenDialog(this);
            if (state == JFileChooser.APPROVE_OPTION) {
                File saveFile = jFileChooser.getSelectedFile();
                try {
                    FileWriter fileWriter = new FileWriter(saveFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(jTextArea.getText());
                    bufferedWriter.close();
                    JOptionPane.showMessageDialog(this, "保存成功");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
