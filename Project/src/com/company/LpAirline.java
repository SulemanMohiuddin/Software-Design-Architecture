package com.company;

import model.Datasource;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LpAirline extends JFrame implements ActionListener {
    private Container b;
    private JPanel p1;
    private JPanel p2;
    private JLabel Logo;
    private JLabel IC1;
    private JLabel IC2;
    private JLabel Heading;
    private JPasswordField pass;
    private JTextField namef;
    private JButton can;
    private JButton ex;
    private JButton signup;
    private JButton login;



    public LpAirline(){
    	ImageIcon logo = new ImageIcon("logo.png");
    	ImageIcon ic1 = new ImageIcon("user.png");
    	ImageIcon ic2 = new ImageIcon("padlock.png");
    	ImageIcon re = new ImageIcon("remove.png");
        setTitle("Login");
        setUndecorated(true);
        setBounds(300,90,1000,500);
        setLocationRelativeTo(null);
        setResizable(true);
        setBounds(getBounds());

        
        
        
        b=getContentPane();
        b.setLayout(null);


        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 500, 500);
        p1.setBackground(new Color(1, 45, 78));
        
        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(500, 0, 500, 500);
        p2.setBackground(new Color(127, 208, 234));
   
        b.add(p1);
        b.add(p2);
        
        


        pass=new JPasswordField("Password");
        pass.setFont(new Font("Arial",Font.PLAIN,20));
        pass.setSize(300,40);
        pass.setLocation(600,220);
        pass.setBackground(new Color(127, 208, 234));
        pass.setBorder(null);
        b.add(pass);



        namef=new JTextField("Email");
        namef.setFont(new Font("Garamond",Font.PLAIN,20));
        namef.setCaretColor(Color.gray);
 
        namef.setSize(300,40);
        namef.setLocation(600,150);
       namef.setBorder(null);
       namef.setBackground(new Color(127, 208, 234));
        
        b.add(namef);



        Logo=new JLabel( );
        Logo.setLocation(40, 70);
        Logo.setBounds(45, 70, 500, 400);
        Logo.setIcon(logo);
        p1.add(Logo);
        
        IC1=new JLabel( );
       
        IC1.setBounds(50, 157, 25, 25);
        IC1.setIcon(ic1);
        p2.add(IC1);
        
        Heading=new JLabel("Welcome Back" );
        Heading.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        Heading.setBounds(150, 10 , 250, 50);
        Heading.setFont(new Font("Algerian",Font.CENTER_BASELINE,34));
        p2.add(Heading);
        
        IC2=new JLabel( );
        
        IC2.setBounds(50, 227, 25, 25);
        IC2.setIcon(ic2);
        p2.add(IC2);
        

        ex=new JButton();
        ex.setIcon(re);
        ex.setSize(28,28);
        ex.setLocation(472,0);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        ex.setOpaque(false);
        p2.add(ex);

        login=new JButton("Login");
        login.setSize(100,40);
        login.setOpaque(false);
        login.setContentAreaFilled(false);
        login.setBorder(new RoundedBorder(20));
        login.setLocation(100,300);
        p2.add(login);


        
        signup=new JButton("Sign Up");
        signup.setFont(new Font("Algerian",Font.PLAIN,15));
        signup.setSize(100,40);
        signup.setOpaque(false);
        signup.setContentAreaFilled(false);
        signup.setBorder(new RoundedBorder(20));
        signup.setLocation(250,300);

        p2.add(signup);
        

        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SignUpPage();
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userData();
            }
        });

        setVisible(true);


    }
    public void userData(){
        User user;
        String Password= new String(pass.getPassword());
        String Email=namef.getText();
        if(Password.isEmpty()||Email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter all Fields","Try Again",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Datasource ds = new Datasource();
        boolean open = ds.openDB();
        user = ds.findUser(Email, Password);
        if (user != null){
            dispose();
            new Main_page(user.getId());
            ds.closeDB();

        }else {
            JOptionPane.showMessageDialog(this,"Failed to login. Enter correct email and password",
                    "Try Again",JOptionPane.ERROR_MESSAGE);
            }
        boolean close = ds.closeDB();

    }

    public static void main(String[] args) {
        new LpAirline();

    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
