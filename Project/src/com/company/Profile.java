package com.company;

import model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

class Profile extends JFrame implements ActionListener {

    JLabel user,date,departurePlace,flightno,plane,h;
    JTextField  userText, planeText, flightNoText, DepartureDateText, departurePlaceText;
    JButton Show,ex;
    int userID;
    JPanel p1;
    JLabel Heading,pic;


    public static void main(String[] args){
        new Profile(1);
    }

    public Profile(int userID){
        this.userID = userID;

        setTitle("Ticket Information");
        getContentPane().setBackground( new Color(127, 208, 234) );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);
        
        p1 =new JPanel();
        p1.setLayout(null);
        p1.setBounds(500, 0, 300, 600);
        p1.setBackground(new Color(1, 45, 78));
        this.add(p1);
        
    	ImageIcon logo = new ImageIcon("logo2.png");
        Heading=new JLabel();
        Heading.setIcon(logo);
        Heading.setLocation(20, 50);
        Heading.setSize(150,150);
        p1.add(Heading);
        
        h=new JLabel("Personal info");
        h.setSize(250,150);
        h.setLocation(200, 320);
        h.setFont(new Font("Algerian", Font.ITALIC,35));
        this.add(h);
        
    	ImageIcon pic1 = new ImageIcon("pic1.png");
        pic=new JLabel();
        pic.setIcon(pic1);
        pic.setLocation(250, 20);
        pic.setSize(150,150);
        this.add(pic);




        Show = new JButton("SHOW");
        Show.setBounds(50, 200, 100, 30);
        Show.setForeground(Color.white);
        Show.setOpaque(false);
        Show.setContentAreaFilled(false);
        Show.setBorder(new RoundedBorder(20));
        Show.addActionListener(this);
        p1.add(Show);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        
        ImageIcon re = new ImageIcon("remove.png");
        ex=new JButton();
        ex.setIcon(re);
        ex.setSize(28,28);
        ex.setLocation(160,0);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        ex.setOpaque(false);
        p1.add(ex);

        ex.addActionListener(this);


       

        user = new JLabel("Name");
        user.setFont(new Font("Tahoma", Font.PLAIN, 13));
        user.setBounds(150, 190, 80, 25);
        add(user);

        userText = new JTextField(20);
        userText.setBounds(240,190,170,25);
        
        userText.setEditable(false);
        add(userText);

        plane = new JLabel("CNIC");
        plane.setFont(new Font("Tahoma", Font.PLAIN, 13));
        plane.setBounds(150, 220, 80, 25);
        add(plane);

        planeText = new JTextField(20);
        planeText.setBounds(240,220,170,25);
        planeText.setEditable(false);
        add(planeText);

        flightno = new JLabel("Card");
        flightno.setFont(new Font("Tahoma", Font.PLAIN, 13));
        flightno.setBounds(150, 250, 80, 25);
        add(flightno);

        flightNoText = new JTextField(20);
        flightNoText.setBounds(240,250,170,25);
        flightNoText.setEditable(false);
        add(flightNoText);

        departurePlace = new JLabel("Email");
        departurePlace.setFont(new Font("Tahoma", Font.PLAIN, 13));
        departurePlace.setBounds(150, 280, 80, 25);
        add(departurePlace);

        departurePlaceText = new JTextField(20);
        departurePlaceText.setBounds(240,280,170,25);
        departurePlaceText.setEditable(false);
        add(departurePlaceText);

        date = new JLabel("Phone");
        date.setFont(new Font("Tahoma", Font.PLAIN, 13));
        date.setBounds(150, 310, 80, 25);
        add(date);

        DepartureDateText = new JTextField(20);
        DepartureDateText.setBounds(240,310,170,25);
        DepartureDateText.setEditable(false);
        add(DepartureDateText);




        

        String[] items1 =  {
                "Karachi", "Lahore", "Islamabad",
                "Quetta", "Dubai", "New York City", "Kuala Lumpur",
                "Swat", "London", "Istanbul", "Moscow"
        };



        String[] items2 =  {
                "Karachi", "Lahore", "Islamabad",
                "Quetta", "Dubai", "New York City", "Kuala Lumpur",
                "Swat", "London", "Istanbul", "Moscow"
        };




        setSize(700,500);
        setLocation(400,200);
        this.setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Datasource ds = new Datasource();
        ds.openDB();


        User u = ds.findUser(userID);

       

        if (e.getSource() == ex){
        	dispose();
        }
        
        if (e.getSource() == Show){


            userText.setText(u.getFirstName() + " " + u.getLastName());
            planeText.setText(u.getCNIC());
            flightNoText.setText(u.getCardInfo());
            DepartureDateText.setText(u.getPhoneNum());
            departurePlaceText.setText(u.getEmail());
         


        }


        ds.closeDB();

    }
}
