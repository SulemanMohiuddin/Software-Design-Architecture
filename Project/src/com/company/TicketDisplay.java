package com.company;

import model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

class TicketDisplay extends JFrame implements ActionListener {

    
    JLabel ReservationDetails,id,user,date,departurePlace,arrivalPlace,seatClass,baggage,wheelChair,price,flightno,arrivaldate,plane;
    JTextField idText, userText, planeText, flightNoText, DepartureDateText, departurePlaceText, arrivalPlaceText,
            arrivalDateText, seatClassText, baggageText, wheelchairText, priceText;
    JButton Show, delete,ex;
    int userID;
    JPanel p1;
    JComboBox comboBox, comboBox_1;

    public static void main(String[] args){
        new TicketDisplay(1);
    }

    public TicketDisplay(int userID){
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

        seatClass = new JLabel("Departure");
        seatClass.setForeground(Color.white);
        seatClass.setFont(new Font("Tahoma", Font.PLAIN, 19));
        seatClass.setBounds(25, 170, 150, 27);
        p1.add(seatClass);

        baggage = new JLabel("Arrival");
        baggage.setFont(new Font("Tahoma", Font.PLAIN, 19));
        baggage.setForeground(Color.white);
        baggage.setBounds(30, 70, 150, 27);
        p1.add(baggage);



        Show = new JButton("SHOW");
        Show.setBounds(50, 400, 100, 30);
        Show.setForeground(Color.white);
        Show.setOpaque(false);
        Show.setContentAreaFilled(false);
        Show.setBorder(new RoundedBorder(20));
        Show.addActionListener(this);
        p1.add(Show);

        delete = new JButton("DELETE");
        delete.setBounds(50, 450, 100, 30);
        delete.setForeground(Color.white);
        delete.setOpaque(false);
        delete.setContentAreaFilled(false);
        delete.setBorder(new RoundedBorder(20));
        delete.addActionListener(this);
        p1.add(delete);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        ReservationDetails = new JLabel("Tickets");
        ReservationDetails.setForeground(Color.BLACK);
        ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
        ReservationDetails.setBounds(250, 27, 359, 31);
        add(ReservationDetails);
        
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


        id = new JLabel("ID");
        id.setFont(new Font("Tahoma", Font.PLAIN, 13));
        id.setBounds(150, 160, 80, 25);
        add(id);

        idText = new JTextField(20);
        idText.setBounds(240,160,170,25);
        idText.setEditable(false);
        add(idText);

        user = new JLabel("User");
        user.setFont(new Font("Tahoma", Font.PLAIN, 13));
        user.setBounds(150, 190, 80, 25);
        add(user);

        userText = new JTextField(20);
        userText.setBounds(240,190,170,25);
        
        userText.setEditable(false);
        add(userText);

        plane = new JLabel("Plane");
        plane.setFont(new Font("Tahoma", Font.PLAIN, 13));
        plane.setBounds(150, 220, 80, 25);
        add(plane);

        planeText = new JTextField(20);
        planeText.setBounds(240,220,170,25);
        planeText.setEditable(false);
        add(planeText);

        flightno = new JLabel("Flight No.");
        flightno.setFont(new Font("Tahoma", Font.PLAIN, 13));
        flightno.setBounds(150, 250, 80, 25);
        add(flightno);

        flightNoText = new JTextField(20);
        flightNoText.setBounds(240,250,170,25);
        flightNoText.setEditable(false);
        add(flightNoText);

        departurePlace = new JLabel("Departure");
        departurePlace.setFont(new Font("Tahoma", Font.PLAIN, 13));
        departurePlace.setBounds(150, 280, 80, 25);
        add(departurePlace);

        departurePlaceText = new JTextField(20);
        departurePlaceText.setBounds(240,280,170,25);
        departurePlaceText.setEditable(false);
        add(departurePlaceText);




        arrivalPlace = new JLabel("Arrival");
        arrivalPlace.setFont(new Font("Tahoma", Font.PLAIN, 13));
        arrivalPlace.setBounds(150, 310, 80, 25);
        
        add(arrivalPlace);

        arrivalPlaceText = new JTextField(20);
        arrivalPlaceText.setBounds(240,310,170,25);
        arrivalPlaceText.setEditable(false);
  
        add(arrivalPlaceText);



        seatClass = new JLabel("Seats");
        seatClass.setFont(new Font("Tahoma", Font.PLAIN, 13));
        seatClass.setBounds(150, 340, 80, 25);
        add(seatClass);

        seatClassText = new JTextField(20);
        seatClassText.setBounds(240,340,170,25);
        seatClassText.setEditable(false);
        add(seatClassText);

 

        price = new JLabel("Price");
        price.setFont(new Font("Tahoma", Font.PLAIN, 13));
        price.setBounds(150, 370, 80, 25);
        add(price);

        priceText = new JTextField(20);
        priceText.setBounds(240,370,170,25);
        priceText.setEditable(false);
        add(priceText);

        DepartureDateText= new JTextField(20);
        arrivalDateText= new JTextField(20);
        baggageText=new JTextField();
        wheelchairText= new JTextField(20);
       
        priceText.setBounds(240,370,170,25);
        priceText.setEditable(false);
        

        String[] items1 =  {
                "Karachi", "Lahore", "Islamabad",
                "Quetta", "Dubai", "New York City", "Kuala Lumpur",
                "Swat", "London", "Istanbul", "Moscow"
        };
        comboBox = new JComboBox(items1);
        comboBox.setBounds(25, 100, 150, 27);
        p1.add(comboBox);


        String[] items2 =  {
                "Karachi", "Lahore", "Islamabad",
                "Quetta", "Dubai", "New York City", "Kuala Lumpur",
                "Swat", "London", "Istanbul", "Moscow"
        };
        comboBox_1 = new JComboBox(items2);
        comboBox_1.setBounds(25, 200, 150, 27);
        p1.add(comboBox_1);



        setSize(700,600);
        setLocation(400,200);
        this.setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == ex){
        	dispose();
        }
    	
        Datasource ds = new Datasource();
        ds.openDB();
        Ticket t = ds.getAllTicketsOfUser(userID, comboBox.getSelectedItem().toString(),
                comboBox_1.getSelectedItem().toString());
        Flight f = ds.getFlight(t.getFlight());
        User u = ds.findUser(userID);
        ArrayList<String> seats = ds.getSeatsOfUserInFlight(t.getFlight(), userID);
        StringBuilder sb = new StringBuilder();
        for (String seat: seats) {
            sb.append(seat + ",");
        }

   
        
        if (e.getSource() == Show){

            idText.setText(String.valueOf(t.getId()));
            userText.setText(u.getFirstName() + " " + u.getLastName());
            planeText.setText(f.getPlaneModel());
            flightNoText.setText(f.getFlightNum());
            DepartureDateText.setText(f.getDepartureDay() + "/" + f.getMonth() + "/2022" + "  " +
                    f.getDepartureHour() + ":" + f.getDepartureMin());
            departurePlaceText.setText(t.getDeparturePlace());
            arrivalDateText.setText(f.getArrivalDay() + "/" + f.getMonth() + "/2022" + "  " +
                    f.getArrivalHour() + ":" + f.getArrivalMin());
            arrivalPlaceText.setText(t.getArrivalPlace());
            seatClassText.setText(sb.toString());
            baggageText.setText(String.valueOf(t.getBaggage()));
            if (t.getWheelChair() == 0) wheelchairText.setText("No");
            else wheelchairText.setText("Yes");
            priceText.setText(String.valueOf(t.getPrice()));

        }

        if (e.getSource() == delete){
            ds.deleteTicket(t.getId());
            JOptionPane.showMessageDialog(null, "Ticket from " + t.getDeparturePlace() +
                    " to " + t.getArrivalPlace() + " has been canceled.");
            idText.setText("");
            userText.setText("");
            planeText.setText("");
            flightNoText.setText("");
            DepartureDateText.setText("");
            departurePlaceText.setText("");
            arrivalDateText.setText("");
            arrivalPlaceText.setText("");
            seatClassText.setText("");
            baggageText.setText("");
            wheelchairText.setText("");
            priceText.setText("");
        }
        ds.closeDB();

    }
}
