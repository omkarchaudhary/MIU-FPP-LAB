package com.miu.lab6.prog1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressForm extends JFrame {
    JLabel lblName, lblStreet, lblCity, lblState, lblZip;
    JTextField txtName, txtStreet, txtCity, txtState, txtZip;
    JButton btnSubmit;
    JPanel topPanel, middlePanel, bottomPanel;
    public AddressForm() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineTopPanel();
        defineMiddlePanel();
        defineBottomPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
    }
    private void defineTopPanel() {
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        lblName = new JLabel("Name");
        txtName = new JTextField(15);
        namePanel.add(lblName, BorderLayout.NORTH);
        namePanel.add(txtName, BorderLayout.CENTER);

        JPanel streetPanel = new JPanel();
        streetPanel.setLayout(new BorderLayout());
        lblStreet = new JLabel("Street");
        txtStreet = new JTextField(15);
        streetPanel.add(lblStreet, BorderLayout.NORTH);
        streetPanel.add(txtStreet, BorderLayout.CENTER);

        JPanel cityPanel = new JPanel();
        cityPanel.setLayout(new BorderLayout());
        lblCity = new JLabel("City");
        txtCity = new JTextField(15);
        cityPanel.add(lblCity, BorderLayout.NORTH);
        cityPanel.add(txtCity, BorderLayout.CENTER);

        topPanel.add(namePanel);
        topPanel.add(streetPanel);
        topPanel.add(cityPanel);

    }
    private void defineMiddlePanel(){
        middlePanel=new JPanel();
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));

        JPanel statePanel = new JPanel();
        statePanel.setLayout(new BorderLayout());
        lblState = new JLabel("State");
        txtState = new JTextField(15);
        statePanel.add(lblState, BorderLayout.NORTH);
        statePanel.add(txtState, BorderLayout.CENTER);

        JPanel zipPanel = new JPanel();
        zipPanel.setLayout(new BorderLayout());
        lblZip = new JLabel("Zip");
        txtZip = new JTextField(15);
        zipPanel.add(lblZip, BorderLayout.NORTH);
        zipPanel.add(txtZip, BorderLayout.CENTER);

        middlePanel.add(statePanel);
        middlePanel.add(zipPanel);

    }
    private void defineBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0 , 15));
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new MyButtonListener());
        bottomPanel.add(btnSubmit);

    }

    private void initializeWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(500,200);
        centerFrameOnDesktop(this);
        setResizable(false);
    }
    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width  = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth  = f.getSize().width;
        f.setLocation(((width-frameWidth)/2), (height-frameHeight)/3);
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                AddressForm addForm = new AddressForm();
                addForm.setVisible(true);
            }
        });

    }

    class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                System.out.println(txtName.getText());
                System.out.println(txtStreet.getText());
                System.out.println(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
            //JOptionPane.showMessageDialog(null, "Please provide complete info", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
