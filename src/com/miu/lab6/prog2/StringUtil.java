package com.miu.lab6.prog2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtil extends JFrame {

    JLabel lblInput, lblOutput;
    JTextField txtInput, txtOutput;
    JButton btnCount, btnReverse, btnRemove;
    JPanel lefPanel, rightPanel;

    public StringUtil() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineLeftPanel();
        defineRightPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(lefPanel);
        mainPanel.add(rightPanel);
        getContentPane().add(mainPanel);
        //pack();
    }

    private void defineLeftPanel() {
        lefPanel = new JPanel();
        lefPanel.setLayout(new BorderLayout(5,5));

        btnCount = new JButton("Count Letters");
        btnCount.setFont(new Font(btnCount.getFont().getName(), Font.BOLD, btnCount.getFont().getSize()));
        btnCount.addActionListener(new MyButtonListener());

        btnReverse = new JButton("Reverse Letters");
        btnReverse.setFont(new Font(btnReverse.getFont().getName(), Font.BOLD, btnCount.getFont().getSize()));
        btnReverse.addActionListener(new MyButtonListener());

        btnRemove = new JButton("Remove Duplicates");
        btnRemove.setFont(new Font(btnRemove.getFont().getName(), Font.BOLD, btnCount.getFont().getSize()));
        btnRemove.addActionListener(new MyButtonListener());
        //lefPanel.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
        lefPanel.add(btnCount, BorderLayout.NORTH);
        lefPanel.add(btnReverse, BorderLayout.CENTER);
        lefPanel.add(btnRemove, BorderLayout.SOUTH);

    }

    private void defineRightPanel() {
        rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        lblInput = new JLabel("Input");
        lblInput.setFont(makeSmallFont(lblInput.getFont()));
        txtInput = new JTextField(15);
        inputPanel.add(lblInput, BorderLayout.NORTH);
        inputPanel.add(txtInput, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        lblOutput = new JLabel("Output");
        lblOutput.setFont(makeSmallFont(lblOutput.getFont()));
        txtOutput = new JTextField(15);
        outputPanel.add(lblOutput, BorderLayout.NORTH);
        outputPanel.add(txtOutput, BorderLayout.CENTER);

        rightPanel.add(inputPanel, BorderLayout.CENTER);
        rightPanel.add(outputPanel, BorderLayout.SOUTH);

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("String Utility");
        setSize(450, 200);
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
    }

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StringUtil stringUtil = new StringUtil();
                stringUtil.setVisible(true);
            }
        });

    }

    class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringBuilder input = new StringBuilder(txtInput.getText());
            //System.out.println(e.getActionCommand());

            if (e.getSource() == btnCount) {
                txtOutput.setText("" + input.length());
            }
            if (e.getSource() == btnReverse) {
                txtOutput.setText(input.reverse().toString());
            }
            if (e.getSource() == btnRemove) {
                String unique = "";
                unique += input.charAt(0);
                for (int i = 1; i < input.length(); i++) {
                    boolean exist = false;
                    for (int j = 0; j < unique.length(); j++) {
                        if (input.charAt(i) == unique.charAt(j)) {
                            exist = true;
                        }
                    }
                    if (!exist)
                        unique += input.charAt(i);
                }
                txtOutput.setText(unique);
            }
        }
    }

}
