package PT6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Translation extends JFrame implements ActionListener {
    JLabel tipsText = new JLabel("输入要查询的单词：");
    JTextField wordText = new JTextField(15);
    JButton searchButton = new JButton("查询");
    JTextArea resultText = new JTextArea(14, 35);

    JPanel menuPanel = new JPanel();
    JPanel contentPanel = new JPanel();

    public Translation() {
        initJFrame();
        initView();

        this.setVisible(true);
    }

    private void initView() {

        searchButton.setContentAreaFilled(false);
        searchButton.addActionListener(this);
        menuPanel.add(tipsText);
        menuPanel.add(wordText);
        menuPanel.add(searchButton);
        this.getContentPane().add(menuPanel, BorderLayout.NORTH);

        contentPanel.add(resultText);
        this.getContentPane().add(contentPanel, BorderLayout.CENTER);

    }

    private void initJFrame() {
        this.setSize(488, 330);
        this.setTitle("英语释义查询");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == searchButton) {
            String result = new DBConnection().search(wordText.getText());
            if (result != null) {
                resultText.setText(result);
            } else {
                JOptionPane.showMessageDialog(this, "数据库里没有找到该单词的翻译");
                wordText.setText("");
                resultText.setText("");
            }
        }
    }
}
