package com.company;

import model.Datasource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage extends JFrame implements ActionListener {
    private Container c;
    private Container b;
    private JLabel Logo;
    private JLabel title;
    private JLabel fname;
    private JTextField ftext;
    private JLabel sname;
    private JTextField stext;
    private JLabel email;
    private JTextField temail;
    private JLabel password;
    private JPasswordField tPassword;
    private JLabel cardInfo;
    private JTextField tcardInfo;
    private JLabel cnic;
    private JTextField tcnic;
    private JLabel phone;
    private JTextField tphone;
    private JLabel state;
    private JTextField tstate;
    private JLabel City;
    private JComboBox tCity;
    private JButton Sub;
    private JButton log;
    private String city[] = {
            "Karachi", "Lahore", "Islamabad",
            "Quetta","Peshawar","Faislabaad","Hydrabad","Multan"
    };

    private JButton ex;
    private JLabel res;
    private JLabel LFullName;
    private JTextField tLFullName;
    private JLabel LEmail;
    private JTextField tLEmail;
    private JPanel p1;
    private JPanel p2;


    public SignUpPage(){
    	ImageIcon logo = new ImageIcon("logo.png");
    	ImageIcon re = new ImageIcon("remove.png");
        setTitle("Sign Up");
        setBounds(300,90,1000,500);
        setUndecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(127, 208, 234));
        c=getContentPane();
        c.setLayout(null);
        
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(500, 0, 500, 500);
        p1.setBackground(new Color(1, 45, 78));
        
        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 0, 500, 500);
        p2.setBackground(new Color(127, 208, 234));
   
        c.add(p1);
        c.add(p2);
        
        tCity= new JComboBox(city);
        tCity.setFont(new Font("Arial", Font.PLAIN, 18));
        tCity.setSize(200,28);
        tCity.setLocation(140,380);
        p2.add(tCity);
        
        Logo=new JLabel( );
        Logo.setLocation(40, 70);
        Logo.setBounds(45, 70, 500, 400);
        Logo.setIcon(logo);
        p1.add(Logo);
        
        ex=new JButton();
        ex.setIcon(re);
        ex.setSize(28,28);
        ex.setLocation(471,0);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        ex.setOpaque(false);
        p1.add(ex);

        title=new JLabel("Sign Up");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,40);
        title.setLocation(200,10);
        p2.add(title);

        fname=new JLabel("First Name");
        fname.setFont(new Font("Arial",Font.PLAIN,20));
        fname.setSize(150,28);
        fname.setLocation(10,100);
        p2.add(fname);

        ftext=new JTextField();
        ftext.setFont(new Font("Arial",Font.PLAIN,20));
        ftext.setSize(200,28);
        ftext.setLocation(140,100);
        c.add(ftext);

        sname=new JLabel("Second Name");
        sname.setFont(new Font("Arial",Font.PLAIN,20));
        sname.setSize(150,28);
        sname.setLocation(10,140);
        p2.add(sname);

        stext=new JTextField();
        stext.setFont(new Font("Arial",Font.PLAIN,20));
        stext.setSize(200,28);
        stext.setLocation(140,140);
        c.add(stext);

        email=new JLabel("Email");
        email.setFont(new Font("Arial",Font.PLAIN,20));
        email.setSize(200,28);
        email.setLocation(10,180);
        p2.add(email);

        temail=new JTextField();
        temail.setFont(new Font("Arial",Font.PLAIN,20));
        temail.setSize(200,28);
        temail.setLocation(140,180);
        c.add(temail);

        password=new JLabel("Password");
        password.setFont(new Font("Arial",Font.PLAIN,20));
        password.setSize(200,28);
        password.setLocation(10,220);
        p2.add(password);

        tPassword=new JPasswordField();
        tPassword.setFont(new Font("Arial",Font.PLAIN,20));
        tPassword.setSize(200,28);
        tPassword.setLocation(140,220);
        c.add(tPassword);

        cardInfo=new JLabel("Card NO#");
        cardInfo.setFont(new Font("Arial",Font.PLAIN,20));
        cardInfo.setSize(200,28);
        cardInfo.setLocation(10,260);
      
        p2.add(cardInfo);

        tcardInfo=new JTextField();
        tcardInfo.setFont(new Font("Arial",Font.PLAIN,20));
        tcardInfo.setSize(200,28);
        tcardInfo.setLocation(140,260);
       
        c.add(tcardInfo);

        cnic=new JLabel("Passport NO#");
        cnic.setFont(new Font("Arial",Font.PLAIN,20));
        cnic.setSize(200,28);
        cnic.setLocation(10,300);
        p2.add(cnic);

        tcnic=new JTextField();
        tcnic.setFont(new Font("Arial",Font.PLAIN,20));
        tcnic.setSize(200,28);
        tcnic.setLocation(140,300);
        c.add(tcnic);

        phone=new JLabel("Phone N0#");
        phone.setFont(new Font("Arial",Font.PLAIN,20));
        phone.setSize(200,28);
        phone.setLocation(10,340);
        p2.add(phone);

        tphone=new JTextField();
        tphone.setFont(new Font("Arial",Font.PLAIN,20));
        tphone.setSize(200,28);
        tphone.setLocation(140,340);
        c.add(tphone);

        state=new JLabel("State Name");
        state.setFont(new Font("Arial",Font.PLAIN,20));
        state.setSize(200,28);
        state.setVisible(false);
        state.setLocation(10,380);
        p2.add(state);

        tstate=new JTextField();
        tstate.setFont(new Font("Arial",Font.PLAIN,20));
        tstate.setSize(200,28);
        tstate.setLocation(140,380);
        tstate.setVisible(false);
        c.add(tstate);

        City=new JLabel("City");
        City.setFont(new Font("Arial",Font.PLAIN,20));
        City.setSize(200,28);
        City.setLocation(10,380);
        p2.add(City);


        res=new JLabel("");
        res.setFont(new Font("Arial",Font.PLAIN,20));
        res.setSize(400,28);
        res.setLocation(400,550);
        c.add(res);

        Sub=new JButton("Sign Up");
        Sub.setFont(new Font("Algerian",Font.PLAIN,15));
        Sub.setSize(100,40);
        Sub.setOpaque(false);
        Sub.setContentAreaFilled(false);
        Sub.setBorder(new RoundedBorder(20));
        Sub.setLocation(370,200);

        p2.add(Sub);

        log=new JButton("Login");
        log.setSize(100,40);
        log.setOpaque(false);
        log.setContentAreaFilled(false);
        log.setBorder(new RoundedBorder(20));
        log.setLocation(370,300);
        p2.add(log);


        Sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        ex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LpAirline();

            }
        });

        setVisible(true);
        c.revalidate();



    }
    private void registerUser(){
        int user;
        String FirstName= ftext.getText();
            String SecondName= stext.getText();
            String Email=temail.getText();
            String CardInfo=tcardInfo.getText();
            String State=tstate.getText();
            String City=(String) tCity.getSelectedItem();
            String PhoneNumber=tphone.getText();
            String Password= new String(tPassword.getPassword());
            String CNICNumber=tcnic.getText();
            if(FirstName.isEmpty()||SecondName.isEmpty()||Email.isEmpty()
                    ||City.isEmpty()||PhoneNumber.isEmpty()||Password.isEmpty()||CNICNumber.isEmpty()){
                JOptionPane.showMessageDialog(this,"Please Enter all Fields","Try Again",JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                int number = Integer.parseInt(tphone.getText());
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter only numbers in Phone field.");
                return;
            }
            try {
                int number2 = Integer.parseInt(tcnic.getText());
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter only numbers in Passport field");
                return;
            }
            try {
                int number3 = Integer.parseInt(tcardInfo.getText());
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter only numbers in Card information field");
                return;
            }
            
        Datasource ds = new Datasource();
        boolean open = ds.openDB();
        if (ds.findUser(Email)){
            JOptionPane.showMessageDialog(this,"Failed to register new User, enter a" +
                            " different email or use LOGIN button to go to login page",
                    "Try Again",JOptionPane.ERROR_MESSAGE);
        } else {
            user = ds.insertUser(FirstName,SecondName,Email, Password,CardInfo,CNICNumber,PhoneNumber, State,City);
            if(user>=0){
                res.setText("Sign Up Successfully.....");
                dispose();
                new Main_page(user);
            }else {
                JOptionPane.showMessageDialog(this,"Failed to register new User",
                        "Try Again",JOptionPane.ERROR_MESSAGE);
            }
        }
        boolean close = ds.closeDB();
    }
//    public User user;
//    private User addUserToDataBase(String FirstName,String SecondName,String Email,String CardInfo,String State,String PhoneNumber,String Password,String CNICNumber,String Cities){
//        User user=null;
//
//        return user;


    public static void main(String[] args) {
            new SignUpPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
