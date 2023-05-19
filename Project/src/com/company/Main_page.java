package com.company;
import model.Datasource;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main_page extends JFrame implements ActionListener {
    public int user;

	

    JPanel p1;
    JButton ex;
    JButton BT;
    JButton pfp;
    JButton IT;
    JButton help;
    JLabel Heading;
    JLabel bg;

    Main_page(int user) {

        super("System");

    	
    	System.out.println(user);
    	ImageIcon re = new ImageIcon("remove.png");
        this.setUndecorated(true);
        this.setSize(1000,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground( new Color(127, 208, 234) );
   

        this.user = user;
        
    	ImageIcon BG = new ImageIcon("BG.jpg");
        bg = new JLabel();
        bg.setBounds(200, 0, 1000, 700);
        bg.setIcon(BG);
        
      
        
        
        p1 =new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 200, 700);
        p1.setBackground(new Color(1, 45, 78));
        this.add(p1);
        
    	ImageIcon logo = new ImageIcon("logo2.png");
        Heading=new JLabel();
        Heading.setIcon(logo);
        Heading.setLocation(20, 0);
        Heading.setSize(150,150);
        p1.add(Heading);
        
        ex=new JButton();
        ex.setIcon(re);
        ex.setSize(28,28);
        ex.setLocation(972,0);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        ex.setOpaque(false);
        this.add(ex);

        ex.addActionListener(this);




        
        BT=new JButton("Book Ticket");
        BT.setSize(200,100);
        BT.setFont(new Font("Algerian",Font.PLAIN,20));
        BT.setLocation(0, 200);
        BT.setForeground(Color.white);
        BT.setOpaque(false);
        BT.setContentAreaFilled(false);
        BT.setBorder(null);
        p1.add(BT);
        
        pfp=new JButton("Profile");
        pfp.setSize(200,100);
        pfp.setFont(new Font("Algerian",Font.PLAIN,20));
        pfp.setLocation(0, 500);
        pfp.setForeground(Color.white);
        pfp.setOpaque(false);
        pfp.setContentAreaFilled(false);
        pfp.setBorder(null);
        p1.add(pfp);
        
        IT=new JButton("Ticket Info");
        IT.setSize(200,95);
        IT.setFont(new Font("Algerian",Font.PLAIN,20));
        IT.setLocation(0, 300);
        IT.setForeground(Color.white);
        IT.setOpaque(false);
        IT.setContentAreaFilled(false);
        IT.setBorder(null);
        p1.add(IT);
        
        help=new JButton("Help");
        help.setSize(200,95);
        help.setFont(new Font("Algerian",Font.PLAIN,20));
        help.setLocation(0, 400);
        help.setForeground(Color.white);
        help.setOpaque(false);
        help.setContentAreaFilled(false);
        help.setBorder(null);
        p1.add(help);
        
       BT.addActionListener(this);
       IT.addActionListener(this);
       help.addActionListener(this);
       pfp.addActionListener(this);
        
       this.add(bg);

        this.setVisible(true);

        Datasource ds = new Datasource();
        boolean open = ds.openDB();
        boolean waitingList = ds.checkUserForWaitingList(user);
        if (waitingList){
            JOptionPane.showMessageDialog(null, "You have been assigned a ticket from the " +
                    "waiting list. Please check the ticket info section.");
        }

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == help) {
            JOptionPane.showMessageDialog(null, "Contact : Suleman \nEmail : K213887@nu.edu.pk\nWebsite : Github.com/SulemanMohiuddin \nGrp members = Arqam : Talha : Suleman","About us", JOptionPane.INFORMATION_MESSAGE);

        }
        
        if(e.getSource()== BT){
            //JOptionPane.showMessageDialog(null, "This is Ticket Booking","About us", JOptionPane.INFORMATION_MESSAGE);
            new TicketSystem(user);
        }
        if (e.getSource() == IT){
            new TicketDisplay(user);
        }
        if (e.getSource() == pfp){
            new Profile(user);
        }
        if (e.getSource() == ex){
        	int response = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

       
        
    }
    
    

    }

//    FlightInfo.addActionListener(new ActionListener(){
//        public void actionPerformed(ActionEvent ae){
//            new Flight_Info();
//        }
//    });
//
//
//
//        CustomeDetails.addActionListener(new ActionListener(){
//        public void actionPerformed(ActionEvent ae){
//            new Customer_Details();
//        }
//    });
//
//        TicketInfo.addActionListener(new ActionListener(){
//        public void actionPerformed(ActionEvent ae){
//            new Ticket_Info():
//        }
//    });
//
//
//

