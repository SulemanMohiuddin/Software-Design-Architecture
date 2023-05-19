package com.company;

import model.Datasource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passwordFieldText extends JFrame implements ActionListener {
    JLabel label;
    JPasswordField pf;
    JButton btn;
    passwordFieldText(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

        label = new JLabel("Password");
        label.setBounds(100, 100, 120, 30);
        this.add(label);

        pf = new JPasswordField();
        pf.setBounds(220, 100, 120, 30);
        this.add(pf);
        
        btn = new JButton("sumbit");
        btn.setBounds(160, 150, 80, 30);
        btn.addActionListener(this);
        this.add(btn);
    }
    
    public static void main(String[] args) {
         new passwordFieldText();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new String(pf.getPassword()));
    }
}


//
