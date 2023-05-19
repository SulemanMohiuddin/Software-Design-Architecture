package com.company;

import model.Datasource;
import model.Flight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketSystem extends JFrame implements ActionListener {
    public int user;
    public int flag =1;
    private JLabel title;
    private Container c;
    private JLabel departure;
    private JLabel name;
    private JTextField tname;
    private JComboBox tdeparture;
    private JLabel arrival;
    private JComboBox tarrival;
    private JLabel passenger;
    private JRadioButton adults;
    private JRadioButton childs;
    private JRadioButton infants;
    private JTextField adultText;
    private JTextField childsText;
    private JTextField infantsText;
    private JLabel wheel;
    private JButton ex;
    private JRadioButton yes;
    private JRadioButton no;
    private ButtonGroup wcgp;
    private JLabel aclass;
    private JRadioButton economy;
    private JRadioButton business;
    private ButtonGroup cgp;
    private JLabel payment;
    private JLabel Heading;
    private JComboBox getPayment;
    private JButton sub;
    private JLabel bag;
    private JComboBox weight;
    private JLabel res;
    private JTextArea tout;
    private JTextArea resadd;
    private JButton seating;
    private JButton date;
    private JButton date2;
    private JPanel p1;
    private String cities[] = {
            "Karachi", "Lahore", "Islamabad",
            "Quetta", "Dubai", "New York City", "Kuala Lumpur",
            "Swat", "London", "Istanbul", "Moscow"
    };
    private String arrivals[] = {
            "Karachi", "Lahore", "Islamabad",
            "Quetta", "Dubai", "New York City", "Kuala Lumpur",
            "Swat", "London", "Istanbul", "Moscow"
    };
    private String pay[] = {
            "Your Card",
    };
    private String baggage[]={
            "10","20","30","40","50"
    };


    public TicketSystem(int user) {
        this.user = user;

        setTitle("Ticket System");
        setBounds(300, 90, 900, 700);
        getContentPane().setBackground( new Color(127, 208, 234) );
        setResizable(false);
        setUndecorated(true);
        this.setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Book Your Ticket");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(400, 30);
        c.add(title);

        p1 =new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 200, 700);
        p1.setBackground(new Color(1, 45, 78));
        this.add(p1);
        
        ImageIcon logo = new ImageIcon("logo2.png");
        Heading=new JLabel();
        Heading.setIcon(logo);
        Heading.setLocation(20, 50);
        Heading.setSize(150,150);
        p1.add(Heading);

        departure = new JLabel("Departure");
        departure.setFont(new Font("Arial", Font.PLAIN, 20));
        departure.setSize(100, 20);
        departure.setLocation(200, 150);
        c.add(departure);

        tdeparture = new JComboBox(cities);
        tdeparture.setFont(new Font("Arial", Font.PLAIN, 18));
        tdeparture.setSize(200, 20);
        tdeparture.setLocation(300, 150);
        c.add(tdeparture);
        
        

        arrival = new JLabel("Arrival");
        arrival.setFont(new Font("Arial", Font.PLAIN, 20));
        arrival.setSize(100, 20);
        arrival.setLocation(200, 200);
        c.add(arrival);

        tarrival = new JComboBox(arrivals);
        tarrival.setFont(new Font("Arial", Font.PLAIN, 18));
        tarrival.setSize(200, 20);
        tarrival.setLocation(300, 200);
        c.add(tarrival);

        passenger = new JLabel("Passenger");
        passenger.setFont(new Font("Arial", Font.PLAIN, 20));
        passenger.setSize(100, 20);
        passenger.setLocation(200, 250);
        c.add(passenger);

        adults = new JRadioButton("Adult");
        adults.setFont(new Font("Arial", Font.PLAIN, 15));
        adults.setSelected(false);
        adults.setSize(75, 20);
        adults.setLocation(300, 250);
        adults.setBackground( new Color(127, 208, 234) );
        adults.setVisible(false);
        c.add(adults);

        adultText=new JTextField();
        adultText.setFont(new Font("Arial",Font.PLAIN,15));
        adultText.setSize(50,20);
        adultText.setLocation(300,250);
        adultText.setText("0");
        c.add(adultText);

        childs = new JRadioButton();
        childs.setFont(new Font("Arial", Font.PLAIN, 15));
        childs.setSelected(false);
        childs.setSize(75, 20);
        childs.setLocation(375, 250);
        childs.setVisible(false);
        childs.setBackground( new Color(127, 208, 234) );
        c.add(childs);

        childsText=new JTextField("Childern");
        childsText.setFont(new Font("Arial",Font.PLAIN,15));
        childsText.setSize(50,20);
        childsText.setLocation(375,250);
        childsText.setText("0");
        c.add(childsText);

        infants = new JRadioButton("Infant");
        infants.setFont(new Font("Arial", Font.PLAIN, 15));
        infants.setSelected(false);
        infants.setSize(75, 20);
        infants.setBackground( new Color(127, 208, 234) );
        infants.setLocation(450, 250);
        infants.setVisible(false);
        c.add(infants);

        infantsText=new JTextField();
        infantsText.setFont(new Font("Arial",Font.PLAIN,15));
        infantsText.setSize(50,20);
        infantsText.setLocation(450,300);
        infantsText.setText("0");
        infantsText.setVisible(false);
        c.add(infantsText);

        wheel = new JLabel("Wheelchair");
        wheel.setFont(new Font("Arial", Font.PLAIN, 20));
        wheel.setSize(100, 20);
        wheel.setLocation(200, 350);
        wheel.setVisible(false);
        c.add(wheel);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Arial", Font.PLAIN, 15));
        yes.setSelected(false);
        yes.setSize(75, 20);
        yes.setLocation(300, 350);
        yes.setVisible(false);
        yes.setBackground( new Color(127, 208, 234) );
        c.add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("Arial", Font.PLAIN, 15));
        no.setSelected(true);
        no.setSize(75, 20);
        no.setLocation(400, 350);
        no.setBackground( new Color(127, 208, 234) );
        no.setVisible(false);
        c.add(no);

        wcgp = new ButtonGroup();
        wcgp.add(yes);
        wcgp.add(no);
       
        
        aclass = new JLabel("Class");
        aclass.setFont(new Font("Arial", Font.PLAIN, 20));
        aclass.setSize(100, 20);
        aclass.setLocation(200, 400);
        c.add(aclass);

        economy = new JRadioButton("Economy");
        economy.setFont(new Font("Arial", Font.PLAIN, 15));
        economy.setSelected(false);
        economy.setSize(100, 20);
        economy.setBackground( new Color(127, 208, 234) );
        economy.setLocation(300, 400);
        c.add(economy);

        business = new JRadioButton("Business");
        business.setFont(new Font("Arial", Font.PLAIN, 15));
        business.setSelected(false);
        business.setSize(100, 20);
        business.setBackground( new Color(127, 208, 234) );
        business.setLocation(400, 400);
        c.add(business);

        date = new JButton("Date");
        date.setLocation(300, 300);
        date.setSize(150, 50);
        c.add(date);
        date.setOpaque(false);
        date.setContentAreaFilled(false);
        date.setBorder(new RoundedBorder(20));
        date.addActionListener(this);
        
        date2 = new JButton("Pay n Confirm");
        date2.setLocation(30, 450);
        date2.setSize(150, 50);
        p1.add(date2);
        date2.setOpaque(false);
        date2.setForeground(Color.white);
        date2.setContentAreaFilled(false);
        date2.setBorder(new RoundedBorder(20));
        date2.addActionListener(this);
        
        
        cgp = new ButtonGroup();
        cgp.add(economy);
        cgp.add(business);



        getPayment = new JComboBox(pay);
        getPayment.setFont(new Font("Arial", Font.PLAIN, 18));
        getPayment.setSize(250, 20);
        getPayment.setLocation(300, 450);
        getPayment.setVisible(false);
        c.add(getPayment);

        bag=new JLabel("Baggage in KGs");
        bag.setFont(new Font("Arial",Font.PLAIN,20));
        bag.setSize(150,20);
        bag.setLocation(200,450);
        c.add(bag);

        weight=new JComboBox(baggage);
        weight.setFont(new Font("Arial",Font.PLAIN,15));
        weight.setSize(100,20);
        weight.setLocation(350,450);
        c.add(weight);

        sub = new JButton("Summary");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(150, 50);
        sub.setLocation(30, 250);
        sub.setOpaque(false);
        sub.setContentAreaFilled(false);
        sub.setBorder(new RoundedBorder(20));
        sub.addActionListener(this);
        sub.addActionListener(this);
        sub.setForeground(Color.white);
        p1.add(sub);

        seating=new JButton("Seating ");
        seating.setFont(new Font("Arial",Font.PLAIN,15));
        seating.setSize(150, 50);
        seating.setLocation(30,350);
        seating.setOpaque(false);
        seating.setContentAreaFilled(false);
        seating.setBorder(new RoundedBorder(20));
        seating.addActionListener(this);

        seating.setForeground(Color.white); 
        p1.add(seating);
        
        ImageIcon re = new ImageIcon("remove.png");
        ex=new JButton();
        ex.setIcon(re);
        ex.setSize(28,28);
        ex.setLocation(872,0);
        ex.setContentAreaFilled(false);
        ex.setBorderPainted(false);
        ex.setOpaque(false);
        ex.addActionListener(this);
        this.add(ex);

        res=new JLabel("");
        res.setFont(new Font("Arial",Font.PLAIN,20));
        res.setSize(500,25);
        res.setLocation(220,600);
        c.add(res);

        resadd=new JTextArea();
        resadd.setFont(new Font("Arial",Font.PLAIN,15));
    
        resadd.setLocation(580,175);
        resadd.setLineWrap(true);
        c.add(resadd);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(570, 150);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);



        setVisible(true);


    }

    public static void main(String[] args) {
        new TicketSystem(1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == ex){
        	dispose();
        }
    	
        boolean buttonClicked = false;
        Datasource ds = new Datasource();
        boolean open = ds.openDB();
        Flight flight = ds.getFlight(tdeparture.getSelectedItem().toString()
                , tarrival.getSelectedItem().toString());
        int seatClass;
        if(economy.isSelected()) seatClass = Datasource.ECONOMY_CLASS;
        else seatClass = Datasource.BUSINESS_CLASS;
        int adult = Integer.parseInt(adultText.getText());
        int child = Integer.parseInt(childsText.getText());
        int infant = Integer.parseInt(infantsText.getText());
        int seatCount = adult + child + infant;
        int wheelchair = 0;
        if(yes.isSelected()) wheelchair = 1;
        else wheelchair = 0;
        


        if(e.getSource()==sub){
            if (!buttonClicked){
                buttonClicked = true;

                String data1;
//            String data="Name: "+tname.getText()+"\n";
                int i;
                String data3;

                String data2="Departure From: "+tdeparture.getSelectedItem()+"\n"+
                        "Arrival To: "+tarrival.getSelectedItem()+"\n";
                if(economy.isSelected()) {
                    data3 = "Class: Economy" + "\n";
                }
                else {
                    data3 = "Class: Business" + "\n";
                }
                String data4="Payment By: "+getPayment.getSelectedItem()+"\n";

                int initialPrice = flight.getTicketPrice();
                String data5="Baggage: "+weight.getSelectedItem()+"/Kg"+"\n";
                String data6="Adults: "+adultText.getText()+"\n";
                String data7="Children: "+childsText.getText()+"\n";
                String data8="Infants: "+infantsText.getText()+"\n";
                String data9="Charges per person: "+"\n"+"Adult=" + (initialPrice * adult) +"\n"+
                        
                        "\n"+"***Passenger***"+"\n";
                int TotalBill= (int) ((initialPrice * adult) + (initialPrice * 0.9 * child) + (initialPrice * 0.85 * infant));
                String data10="Total Price Of Tickets: "+TotalBill;

                int emptySeats = ds.getSeatsEmptyInClass(flight.getId(), seatClass);
                int totalSeats = (adult + child + infant);
                int ans = -1;
                if (emptySeats < totalSeats){
                    ans  = JOptionPane.showConfirmDialog(null, "The flight you have selected does " +
                                    "not have the requested number of seats. Do you want to add your name to the waiting list",
                            "Flight full", JOptionPane.YES_NO_CANCEL_OPTION);
                } else {
                    tout.setText(data2+data4+data5+data9+data6+data10);
                    tout.setEditable(false);
                    res.setText("Information saved Successfully.....");

                    ds.insertTicket(user, flight.getId(), seatClass, adult, child, infant,
                            Integer.parseInt(weight.getSelectedItem().toString()), wheelchair);
                }
                if (ans == 0){
                    ds.insertWaiting(user, flight.getId(), seatClass, totalSeats,
                            Integer.parseInt(weight.getSelectedItem().toString()), wheelchair);
                }
            }


        }

        //*********************** seating button functionality ****************
        if(e.getSource()==seating){

            if (!buttonClicked){
                buttonClicked = true;
                int emptySeats = ds.getSeatsEmptyInClass(flight.getId(), seatClass);
                int totalSeats = (adult + child + infant);
                int ans = -1;
                if (emptySeats < totalSeats){
                    ans  = JOptionPane.showConfirmDialog(null, "The flight you have selected does " +
                                    "not have the requested number of seats. Do you want to add your name to the waiting list",
                            "Flight full", JOptionPane.YES_NO_CANCEL_OPTION);
                } 
                
            
                else {
  
                    System.out.println("Seating Chart");
                    new SeatingButtonsFrame(user, flight.getId(), seatClass, seatCount);
                	
                }
                
                if (ans == 0){
                    ds.insertWaiting(user, flight.getId(), seatClass, totalSeats,
                            Integer.parseInt(weight.getSelectedItem().toString()), wheelchair);
                }
            } else new SeatingButtonsFrame(user, flight.getId(), seatClass, seatCount);
      

        }
        if(e.getSource()==date){
        	calender o1=new calender();
        	o1.setVisible(true);
        	
        }
        
        if (e.getSource() == date2){
            if (!buttonClicked){
                buttonClicked = true;



                int initialPrice = flight.getTicketPrice();

                        
                     
                int TotalBill= (int) ((initialPrice * adult) + (initialPrice * 0.9 * child) + (initialPrice * 0.85 * infant));


                JOptionPane.showMessageDialog(null, "Payment of =="+ TotalBill +" Has been deducted from you account");

                dispose();

        }
        
        boolean close = ds.closeDB();
    }
}
}