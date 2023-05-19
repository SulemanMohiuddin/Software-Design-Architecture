package com.company;

import model.Datasource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;



public class SeatingButtonsFrame extends JFrame implements ActionListener {

    public String buttonClicked;
    JLabel business;
    JLabel economy;

    JButton availableSeatsButton;
    JButton unavailableSeatsButton;
    JLabel availableSeatsLabel;
    JLabel unavailableSeatsLabel;
    JButton confirm;

    JButton seat1A;
    JButton seat1B;
    JButton seat1C;
    JButton seat1D;
    JButton seat1E;
    JButton seat1F;
    JButton seat2A;
    JButton seat2B;
    JButton seat2C;
    JButton seat2D;
    JButton seat2E;
    JButton seat2F;
    JButton seat3A;
    JButton seat3B;
    JButton seat3C;
    JButton seat3D;
    JButton seat3E;
    JButton seat3F;
    JButton seat4A;
    JButton seat4B;
    JButton seat4C;
    JButton seat4D;
    JButton seat4E;
    JButton seat4F;
    JButton seat5A;
    JButton seat5B;
    JButton seat5C;
    JButton seat5D;
    JButton seat5E;
    JButton seat5F;
    JButton seat6A;
    JButton seat6B;
    JButton seat6C;
    JButton seat6D;
    JButton seat6E;
    JButton seat6F;
    JButton seat7A;
    JButton seat7B;
    JButton seat7C;
    JButton seat7D;
    JButton seat7E;
    JButton seat7F;
    JButton seat8A;
    JButton seat8B;
    JButton seat8C;
    JButton seat8D;
    JButton seat8E;
    JButton seat8F;
    JButton seat9A;
    JButton seat9B;
    JButton seat9C;
    JButton seat9D;
    JButton seat9E;
    JButton seat9F;
    JButton seat10A;
    JButton seat10B;
    JButton seat10C;
    JButton seat10D;
    JButton seat10E;
    JButton seat10F;
    JButton seat11A;
    JButton seat11B;
    JButton seat11C;
    JButton seat11D;
    JButton seat11E;
    JButton seat11F;
    JButton seat12A;
    JButton seat12B;
    JButton seat12C;
    JButton seat12D;
    JButton seat12E;
    JButton seat12F;
    JButton seat13A;
    JButton seat13B;
    JButton seat13C;
    JButton seat13D;
    JButton seat13E;
    JButton seat13F;
    JButton seat14A;
    JButton seat14B;
    JButton seat14C;
    JButton seat14D;
    JButton seat14E;
    JButton seat14F;
    JButton seat15A;
    JButton seat15B;
    JButton seat15C;
    JButton seat15D;
    JButton seat15E;
    JButton seat15F;
    JButton seat16A;
    JButton seat16B;
    JButton seat16C;
    JButton seat16D;
    JButton seat16E;
    JButton seat16F;
    JButton seat17A;
    JButton seat17B;
    JButton seat17C;
    JButton seat17D;
    JButton seat17E;
    JButton seat17F;
    JButton seat18A;
    JButton seat18B;
    JButton seat18C;
    JButton seat18D;
    JButton seat18E;
    JButton seat18F;
    JButton seat19A;
    JButton seat19B;
    JButton seat19C;
    JButton seat19D;
    JButton seat19E;
    JButton seat19F;
    JButton seat20A;
    JButton seat20B;
    JButton seat20C;
    JButton seat20D;
    JButton seat20E;
    JButton seat20F;
    JButton seat21A;
    JButton seat21B;
    JButton seat21C;
    JButton seat21D;
    JButton seat21E;
    JButton seat21F;
    JButton seat22A;
    JButton seat22B;
    JButton seat22C;
    JButton seat22D;
    JButton seat22E;
    JButton seat22F;
    JButton seat23A;
    JButton seat23B;
    JButton seat23C;
    JButton seat23D;
    JButton seat23E;
    JButton seat23F;
    JButton seat24A;
    JButton seat24B;
    JButton seat24C;
    JButton seat24D;
    JButton seat24E;
    JButton seat24F;
    JButton seat25A;
    JButton seat25B;
    JButton seat25C;
    JButton seat25D;
    JButton seat25E;
    JButton seat25F;
    JButton seat26A;
    JButton seat26B;
    JButton seat26C;
    JButton seat26D;
    JButton seat26E;
    JButton seat26F;
    JButton seat27A;
    JButton seat27B;
    JButton seat27C;
    JButton seat27D;
    JButton seat27E;
    JButton seat27F;
    JButton seat28A;
    JButton seat28B;
    JButton seat28C;
    JButton seat28D;
    JButton seat28E;
    JButton seat28F;
    JButton seat29A;
    JButton seat29B;
    JButton seat29C;
    JButton seat29D;
    JButton seat29E;
    JButton seat29F;
    JButton seat30A;
    JButton seat30B;
    JButton seat30C;
    JButton seat30D;
    JButton seat30E;
    JButton seat30F;
    boolean seat1AClicked = false;
    boolean seat1BClicked = false;
    boolean seat1CClicked = false;
    boolean seat1DClicked = false;
    boolean seat1EClicked = false;
    boolean seat1FClicked = false;
    boolean seat2AClicked = false;
    boolean seat2BClicked = false;
    boolean seat2CClicked = false;
    boolean seat2DClicked = false;
    boolean seat2EClicked = false;
    boolean seat2FClicked = false;
    boolean seat3AClicked = false;
    boolean seat3BClicked = false;
    boolean seat3CClicked = false;
    boolean seat3DClicked = false;
    boolean seat3EClicked = false;
    boolean seat3FClicked = false;
    boolean seat4AClicked = false;
    boolean seat4BClicked = false;
    boolean seat4CClicked = false;
    boolean seat4DClicked = false;
    boolean seat4EClicked = false;
    boolean seat4FClicked = false;
    boolean seat5AClicked = false;
    boolean seat5BClicked = false;
    boolean seat5CClicked = false;
    boolean seat5DClicked = false;
    boolean seat5EClicked = false;
    boolean seat5FClicked = false;
    boolean seat6AClicked = false;
    boolean seat6BClicked = false;
    boolean seat6CClicked = false;
    boolean seat6DClicked = false;
    boolean seat6EClicked = false;
    boolean seat6FClicked = false;
    boolean seat7AClicked = false;
    boolean seat7BClicked = false;
    boolean seat7CClicked = false;
    boolean seat7DClicked = false;
    boolean seat7EClicked = false;
    boolean seat7FClicked = false;
    boolean seat8AClicked = false;
    boolean seat8BClicked = false;
    boolean seat8CClicked = false;
    boolean seat8DClicked = false;
    boolean seat8EClicked = false;
    boolean seat8FClicked = false;
    boolean seat9AClicked = false;
    boolean seat9BClicked = false;
    boolean seat9CClicked = false;
    boolean seat9DClicked = false;
    boolean seat9EClicked = false;
    boolean seat9FClicked = false;
    boolean seat10AClicked = false;
    boolean seat10BClicked = false;
    boolean seat10CClicked = false;
    boolean seat10DClicked = false;
    boolean seat10EClicked = false;
    boolean seat10FClicked = false;
    boolean seat11AClicked = false;
    boolean seat11BClicked = false;
    boolean seat11CClicked = false;
    boolean seat11DClicked = false;
    boolean seat11EClicked = false;
    boolean seat11FClicked = false;
    boolean seat12AClicked = false;
    boolean seat12BClicked = false;
    boolean seat12CClicked = false;
    boolean seat12DClicked = false;
    boolean seat12EClicked = false;
    boolean seat12FClicked = false;
    boolean seat13AClicked = false;
    boolean seat13BClicked = false;
    boolean seat13CClicked = false;
    boolean seat13DClicked = false;
    boolean seat13EClicked = false;
    boolean seat13FClicked = false;
    boolean seat14AClicked = false;
    boolean seat14BClicked = false;
    boolean seat14CClicked = false;
    boolean seat14DClicked = false;
    boolean seat14EClicked = false;
    boolean seat14FClicked = false;
    boolean seat15AClicked = false;
    boolean seat15BClicked = false;
    boolean seat15CClicked = false;
    boolean seat15DClicked = false;
    boolean seat15EClicked = false;
    boolean seat15FClicked = false;
    boolean seat16AClicked = false;
    boolean seat16BClicked = false;
    boolean seat16CClicked = false;
    boolean seat16DClicked = false;
    boolean seat16EClicked = false;
    boolean seat16FClicked = false;
    boolean seat17AClicked = false;
    boolean seat17BClicked = false;
    boolean seat17CClicked = false;
    boolean seat17DClicked = false;
    boolean seat17EClicked = false;
    boolean seat17FClicked = false;
    boolean seat18AClicked = false;
    boolean seat18BClicked = false;
    boolean seat18CClicked = false;
    boolean seat18DClicked = false;
    boolean seat18EClicked = false;
    boolean seat18FClicked = false;
    boolean seat19AClicked = false;
    boolean seat19BClicked = false;
    boolean seat19CClicked = false;
    boolean seat19DClicked = false;
    boolean seat19EClicked = false;
    boolean seat19FClicked = false;
    boolean seat20AClicked = false;
    boolean seat20BClicked = false;
    boolean seat20CClicked = false;
    boolean seat20DClicked = false;
    boolean seat20EClicked = false;
    boolean seat20FClicked = false;
    boolean seat21AClicked = false;
    boolean seat21BClicked = false;
    boolean seat21CClicked = false;
    boolean seat21DClicked = false;
    boolean seat21EClicked = false;
    boolean seat21FClicked = false;
    boolean seat22AClicked = false;
    boolean seat22BClicked = false;
    boolean seat22CClicked = false;
    boolean seat22DClicked = false;
    boolean seat22EClicked = false;
    boolean seat22FClicked = false;
    boolean seat23AClicked = false;
    boolean seat23BClicked = false;
    boolean seat23CClicked = false;
    boolean seat23DClicked = false;
    boolean seat23EClicked = false;
    boolean seat23FClicked = false;
    boolean seat24AClicked = false;
    boolean seat24BClicked = false;
    boolean seat24CClicked = false;
    boolean seat24DClicked = false;
    boolean seat24EClicked = false;
    boolean seat24FClicked = false;
    boolean seat25AClicked = false;
    boolean seat25BClicked = false;
    boolean seat25CClicked = false;
    boolean seat25DClicked = false;
    boolean seat25EClicked = false;
    boolean seat25FClicked = false;
    boolean seat26AClicked = false;
    boolean seat26BClicked = false;
    boolean seat26CClicked = false;
    boolean seat26DClicked = false;
    boolean seat26EClicked = false;
    boolean seat26FClicked = false;
    boolean seat27AClicked = false;
    boolean seat27BClicked = false;
    boolean seat27CClicked = false;
    boolean seat27DClicked = false;
    boolean seat27EClicked = false;
    boolean seat27FClicked = false;
    boolean seat28AClicked = false;
    boolean seat28BClicked = false;
    boolean seat28CClicked = false;
    boolean seat28DClicked = false;
    boolean seat28EClicked = false;
    boolean seat28FClicked = false;
    boolean seat29AClicked = false;
    boolean seat29BClicked = false;
    boolean seat29CClicked = false;
    boolean seat29DClicked = false;
    boolean seat29EClicked = false;
    boolean seat29FClicked = false;
    boolean seat30AClicked = false;
    boolean seat30BClicked = false;
    boolean seat30CClicked = false;
    boolean seat30DClicked = false;
    boolean seat30EClicked = false;
    boolean seat30FClicked = false;
    int flightID;
    int userID;
    int seatClass;
    int seatCount;
    Datasource ds = new Datasource();
    public ArrayList<String> bookedSeats;
    public ArrayList<String> seatsOfOppClass;
    public static ArrayList<String> seatsSelected = new ArrayList<>();


    public SeatingButtonsFrame(int userID, int flightID, int seatClass, int seatCount){
        this.flightID = flightID;
        this.userID = userID;
        this.seatClass = seatClass;
        this.seatCount = seatCount;
        this.setUndecorated(true);
        boolean open = ds.openDB();
        bookedSeats = ds.getBookedSeatsInFlight(flightID);
        SeatingClasses sc = new SeatingClasses();
        if (seatClass == Datasource.ECONOMY_CLASS){
            seatsOfOppClass = sc.businessClassSeats;
        } else if (seatClass == Datasource.BUSINESS_CLASS) {
            seatsOfOppClass = sc.economyClassSeats;
        }


        business = new JLabel("Business Class");
        business.setBounds(70, 10, 200, 60);
        business.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        economy = new JLabel("Economy Class");
        economy.setBounds(750, 10, 200, 60);
        economy.setFont(new Font("Times New Roman", Font.PLAIN, 20));

       
        availableSeatsButton = new JButton();
        availableSeatsButton.setBackground(new Color(0x5584AC));
        availableSeatsButton.setBounds(1120, 437, 35, 35);
        availableSeatsButton.setEnabled(false);
        availableSeatsLabel = new JLabel("Available seats =");
        availableSeatsLabel.setBounds(1000, 430, 100, 40);
        
        unavailableSeatsButton = new JButton();
        unavailableSeatsButton.setBackground(new Color(0xFF0000));
        unavailableSeatsButton.setBounds(1120, 397, 35, 35);
        unavailableSeatsButton.setEnabled(false);
        unavailableSeatsLabel = new JLabel("Unavailable seats =");
        unavailableSeatsLabel.setBounds(1000, 390, 150, 50);

       

        confirm = new JButton("CONFIRM");
        confirm.setBounds(550, 435, 100, 35);

        confirm.setOpaque(false);
        confirm.setContentAreaFilled(false);
        confirm.setBorder(new RoundedBorder(20));
        confirm.addActionListener(this);


        seat1A = new JButton("1A");
        seat1B = new JButton("1B");
        seat1C = new JButton("1C");
        seat1D = new JButton("1D");
        seat1E = new JButton("1E");
        seat1F = new JButton("1F");
        seat2A = new JButton("2A");
        seat2B = new JButton("2B");
        seat2C = new JButton("2C");
        seat2D = new JButton("2D");
        seat2E = new JButton("2E");
        seat2F = new JButton("2F");
        seat3A = new JButton("3A");
        seat3B = new JButton("3B");
        seat3C = new JButton("3C");
        seat3D = new JButton("3D");
        seat3E = new JButton("3E");
        seat3F = new JButton("3F");
        seat4A = new JButton("4A");
        seat4B = new JButton("4B");
        seat4C = new JButton("4C");
        seat4D = new JButton("4D");
        seat4E = new JButton("4E");
        seat4F = new JButton("4F");
        seat5A = new JButton("5A");
        seat5B = new JButton("5B");
        seat5C = new JButton("5C");
        seat5D = new JButton("5D");
        seat5E = new JButton("5E");
        seat5F = new JButton("5F");
        seat6A = new JButton("6A");
        seat6B = new JButton("6B");
        seat6C = new JButton("6C");
        seat6D = new JButton("6D");
        seat6E = new JButton("6E");
        seat6F = new JButton("6F");
        seat7A = new JButton("7A");
        seat7B = new JButton("7B");
        seat7C = new JButton("7C");
        seat7D = new JButton("7D");
        seat7E = new JButton("7E");
        seat7F = new JButton("7F");
        seat8A = new JButton("8A");
        seat8B = new JButton("8B");
        seat8C = new JButton("8C");
        seat8D = new JButton("8D");
        seat8E = new JButton("8E");
        seat8F = new JButton("8F");
        seat9A = new JButton("9A");
        seat9B = new JButton("9B");
        seat9C = new JButton("9C");
        seat9D = new JButton("9D");
        seat9E = new JButton("9E");
        seat9F = new JButton("9F");
        seat10A = new JButton("10A");
        seat10B = new JButton("10B");
        seat10C = new JButton("10C");
        seat10D = new JButton("10D");
        seat10E = new JButton("10E");
        seat10F = new JButton("10F");
        seat11A = new JButton("11A");
        seat11B = new JButton("11B");
        seat11C = new JButton("11C");
        seat11D = new JButton("11D");
        seat11E = new JButton("11E");
        seat11F = new JButton("11F");
        seat12A = new JButton("12A");
        seat12B = new JButton("12B");
        seat12C = new JButton("12C");
        seat12D = new JButton("12D");
        seat12E = new JButton("12E");
        seat12F = new JButton("12F");
        seat13A = new JButton("13A");
        seat13B = new JButton("13B");
        seat13C = new JButton("13C");
        seat13D = new JButton("13D");
        seat13E = new JButton("13E");
        seat13F = new JButton("13F");
        seat14A = new JButton("14A");
        seat14B = new JButton("14B");
        seat14C = new JButton("14C");
        seat14D = new JButton("14D");
        seat14E = new JButton("14E");
        seat14F = new JButton("14F");
        seat15A = new JButton("15A");
        seat15B = new JButton("15B");
        seat15C = new JButton("15C");
        seat15D = new JButton("15D");
        seat15E = new JButton("15E");
        seat15F = new JButton("15F");
        seat16A = new JButton("16A");
        seat16B = new JButton("16B");
        seat16C = new JButton("16C");
        seat16D = new JButton("16D");
        seat16E = new JButton("16E");
        seat16F = new JButton("16F");
        seat17A = new JButton("17A");
        seat17B = new JButton("17B");
        seat17C = new JButton("17C");
        seat17D = new JButton("17D");
        seat17E = new JButton("17E");
        seat17F = new JButton("17F");
        seat18A = new JButton("18A");
        seat18B = new JButton("18B");
        seat18C = new JButton("18C");
        seat18D = new JButton("18D");
        seat18E = new JButton("18E");
        seat18F = new JButton("18F");
        seat19A = new JButton("19A");
        seat19B = new JButton("19B");
        seat19C = new JButton("19C");
        seat19D = new JButton("19D");
        seat19E = new JButton("19E");
        seat19F = new JButton("19F");
        seat20A = new JButton("20A");
        seat20B = new JButton("20B");
        seat20C = new JButton("20C");
        seat20D = new JButton("20D");
        seat20E = new JButton("20E");
        seat20F = new JButton("20F");
        seat21A = new JButton("21A");
        seat21B = new JButton("21B");
        seat21C = new JButton("21C");
        seat21D = new JButton("21D");
        seat21E = new JButton("21E");
        seat21F = new JButton("21F");
        seat22A = new JButton("22A");
        seat22B = new JButton("22B");
        seat22C = new JButton("22C");
        seat22D = new JButton("22D");
        seat22E = new JButton("22E");
        seat22F = new JButton("22F");
        seat23A = new JButton("23A");
        seat23B = new JButton("23B");
        seat23C = new JButton("23C");
        seat23D = new JButton("23D");
        seat23E = new JButton("23E");
        seat23F = new JButton("23F");
        seat24A = new JButton("24A");
        seat24B = new JButton("24B");
        seat24C = new JButton("24C");
        seat24D = new JButton("24D");
        seat24E = new JButton("24E");
        seat24F = new JButton("24F");
        seat25A = new JButton("25A");
        seat25B = new JButton("25B");
        seat25C = new JButton("25C");
        seat25D = new JButton("25D");
        seat25E = new JButton("25E");
        seat25F = new JButton("25F");
        seat26A = new JButton("26A");
        seat26B = new JButton("26B");
        seat26C = new JButton("26C");
        seat26D = new JButton("26D");
        seat26E = new JButton("26E");
        seat26F = new JButton("26F");
        seat27A = new JButton("27A");
        seat27B = new JButton("27B");
        seat27C = new JButton("27C");
        seat27D = new JButton("27D");
        seat27E = new JButton("27E");
        seat27F = new JButton("27F");
        seat28A = new JButton("28A");
        seat28B = new JButton("28B");
        seat28C = new JButton("28C");
        seat28D = new JButton("28D");
        seat28E = new JButton("28E");
        seat28F = new JButton("28F");
        seat29A = new JButton("29A");
        seat29B = new JButton("29B");
        seat29C = new JButton("29C");
        seat29D = new JButton("29D");
        seat29E = new JButton("29E");
        seat29F = new JButton("29F");
        seat30A = new JButton("30A");
        seat30B = new JButton("30B");
        seat30C = new JButton("30C");
        seat30D = new JButton("30D");
        seat30E = new JButton("30E");
        seat30F = new JButton("30F");
        

        seat1A.setBounds(10, 70, 35, 35);
        seat1B.setBounds(10, 115, 35, 35);
        seat1C.setBounds(10, 160, 35, 35);
        seat1D.setBounds(10, 235, 35, 35);
        seat1E.setBounds(10, 280, 35, 35);
        seat1F.setBounds(10, 325, 35, 35);
        seat2A.setBounds(50, 70, 35, 35);
        seat2B.setBounds(50, 115, 35, 35);
        seat2C.setBounds(50, 160, 35, 35);
        seat2D.setBounds(50, 235, 35, 35);
        seat2E.setBounds(50, 280, 35, 35);
        seat2F.setBounds(50, 325, 35, 35);
        seat3A.setBounds(90, 70, 35, 35);
        seat3B.setBounds(90, 115, 35, 35);
        seat3C.setBounds(90, 160, 35, 35);
        seat3D.setBounds(90, 235, 35, 35);
        seat3E.setBounds(90, 280, 35, 35);
        seat3F.setBounds(90, 325, 35, 35);
        seat4A.setBounds(130, 70, 35, 35);
        seat4B.setBounds(130, 115, 35, 35);
        seat4C.setBounds(130, 160, 35, 35);
        seat4D.setBounds(130, 235, 35, 35);
        seat4E.setBounds(130, 280, 35, 35);
        seat4F.setBounds(130, 325, 35, 35);
        seat5A.setBounds(170, 70, 35, 35);
        seat5B.setBounds(170, 115, 35, 35);
        seat5C.setBounds(170, 160, 35, 35);
        seat5D.setBounds(170, 235, 35, 35);
        seat5E.setBounds(170, 280, 35, 35);
        seat5F.setBounds(170, 325, 35, 35);
        seat6A.setBounds(210, 70, 35, 35);
        seat6B.setBounds(210, 115, 35, 35);
        seat6C.setBounds(210, 160, 35, 35);
        seat6D.setBounds(210, 235, 35, 35);
        seat6E.setBounds(210, 280, 35, 35);
        seat6F.setBounds(210, 325, 35, 35);
        seat7A.setBounds(250, 70, 35, 35);
        seat7B.setBounds(250, 115, 35, 35);
        seat7C.setBounds(250, 160, 35, 35);
        seat7D.setBounds(250, 235, 35, 35);
        seat7E.setBounds(250, 280, 35, 35);
        seat7F.setBounds(250, 325, 35, 35);
        seat8A.setBounds(290, 70, 35, 35);
        seat8B.setBounds(290, 115, 35, 35);
        seat8C.setBounds(290, 160, 35, 35);
        seat8D.setBounds(290, 235, 35, 35);
        seat8E.setBounds(290, 280, 35, 35);
        seat8F.setBounds(290, 325, 35, 35);
        seat9A.setBounds(360, 70, 35, 35);
        seat9B.setBounds(360, 115, 35, 35);
        seat9C.setBounds(360, 160, 35, 35);
        seat9D.setBounds(360, 235, 35, 35);
        seat9E.setBounds(360, 280, 35, 35);
        seat9F.setBounds(360, 325, 35, 35);
        seat10A.setBounds(400, 70, 35, 35);
        seat10B.setBounds(400, 115, 35, 35);
        seat10C.setBounds(400, 160, 35, 35);
        seat10D.setBounds(400, 235, 35, 35);
        seat10E.setBounds(400, 280, 35, 35);
        seat10F.setBounds(400, 325, 35, 35);
        seat11A.setBounds(440, 70, 35, 35);
        seat11B.setBounds(440, 115, 35, 35);
        seat11C.setBounds(440, 160, 35, 35);
        seat11D.setBounds(440, 235, 35, 35);
        seat11E.setBounds(440, 280, 35, 35);
        seat11F.setBounds(440, 325, 35, 35);
        seat12A.setBounds(480, 70, 35, 35);
        seat12B.setBounds(480, 115, 35, 35);
        seat12C.setBounds(480, 160, 35, 35);
        seat12D.setBounds(480, 235, 35, 35);
        seat12E.setBounds(480, 280, 35, 35);
        seat12F.setBounds(480, 325, 35, 35);
        seat13A.setBounds(520, 70, 35, 35);
        seat13B.setBounds(520, 115, 35, 35);
        seat13C.setBounds(520, 160, 35, 35);
        seat13D.setBounds(520, 235, 35, 35);
        seat13E.setBounds(520, 280, 35, 35);
        seat13F.setBounds(520, 325, 35, 35);
        seat14A.setBounds(560, 70, 35, 35);
        seat14B.setBounds(560, 115, 35, 35);
        seat14C.setBounds(560, 160, 35, 35);
        seat14D.setBounds(560, 235, 35, 35);
        seat14E.setBounds(560, 280, 35, 35);
        seat14F.setBounds(560, 325, 35, 35);
        seat15A.setBounds(600, 70, 35, 35);
        seat15B.setBounds(600, 115, 35, 35);
        seat15C.setBounds(600, 160, 35, 35);
        seat15D.setBounds(600, 235, 35, 35);
        seat15E.setBounds(600, 280, 35, 35);
        seat15F.setBounds(600, 325, 35, 35);
        seat16A.setBounds(640, 70, 35, 35);
        seat16B.setBounds(640, 115, 35, 35);
        seat16C.setBounds(640, 160, 35, 35);
        seat16D.setBounds(640, 235, 35, 35);
        seat16E.setBounds(640, 280, 35, 35);
        seat16F.setBounds(640, 325, 35, 35);
        seat17A.setBounds(680, 70, 35, 35);
        seat17B.setBounds(680, 115, 35, 35);
        seat17C.setBounds(680, 160, 35, 35);
        seat17D.setBounds(680, 235, 35, 35);
        seat17E.setBounds(680, 280, 35, 35);
        seat17F.setBounds(680, 325, 35, 35);
        seat18A.setBounds(720, 70, 35, 35);
        seat18B.setBounds(720, 115, 35, 35);
        seat18C.setBounds(720, 160, 35, 35);
        seat18D.setBounds(720, 235, 35, 35);
        seat18E.setBounds(720, 280, 35, 35);
        seat18F.setBounds(720, 325, 35, 35);
        seat19A.setBounds(760, 70, 35, 35);
        seat19B.setBounds(760, 115, 35, 35);
        seat19C.setBounds(760, 160, 35, 35);
        seat19D.setBounds(760, 235, 35, 35);
        seat19E.setBounds(760, 280, 35, 35);
        seat19F.setBounds(760, 325, 35, 35);
        seat20A.setBounds(800, 70, 35, 35);
        seat20B.setBounds(800, 115, 35, 35);
        seat20C.setBounds(800, 160, 35, 35);
        seat20D.setBounds(800, 235, 35, 35);
        seat20E.setBounds(800, 280, 35, 35);
        seat20F.setBounds(800, 325, 35, 35);
        seat21A.setBounds(840, 70, 35, 35);
        seat21B.setBounds(840, 115, 35, 35);
        seat21C.setBounds(840, 160, 35, 35);
        seat21D.setBounds(840, 235, 35, 35);
        seat21E.setBounds(840, 280, 35, 35);
        seat21F.setBounds(840, 325, 35, 35);
        seat22A.setBounds(880, 70, 35, 35);
        seat22B.setBounds(880, 115, 35, 35);
        seat22C.setBounds(880, 160, 35, 35);
        seat22D.setBounds(880, 235, 35, 35);
        seat22E.setBounds(880, 280, 35, 35);
        seat22F.setBounds(880, 325, 35, 35);
        seat23A.setBounds(920, 70, 35, 35);
        seat23B.setBounds(920, 115, 35, 35);
        seat23C.setBounds(920, 160, 35, 35);
        seat23D.setBounds(920, 235, 35, 35);
        seat23E.setBounds(920, 280, 35, 35);
        seat23F.setBounds(920, 325, 35, 35);
        seat24A.setBounds(960, 70, 35, 35);
        seat24B.setBounds(960, 115, 35, 35);
        seat24C.setBounds(960, 160, 35, 35);
        seat24D.setBounds(960, 235, 35, 35);
        seat24E.setBounds(960, 280, 35, 35);
        seat24F.setBounds(960, 325, 35, 35);
        seat25A.setBounds(1000, 70, 35, 35);
        seat25B.setBounds(1000, 115, 35, 35);
        seat25C.setBounds(1000, 160, 35, 35);
        seat25D.setBounds(1000, 235, 35, 35);
        seat25E.setBounds(1000, 280, 35, 35);
        seat25F.setBounds(1000, 325, 35, 35);
        seat26A.setBounds(1040, 70, 35, 35);
        seat26B.setBounds(1040, 115, 35, 35);
        seat26C.setBounds(1040, 160, 35, 35);
        seat26D.setBounds(1040, 235, 35, 35);
        seat26E.setBounds(1040, 280, 35, 35);
        seat26F.setBounds(1040, 325, 35, 35);
        seat27A.setBounds(1080, 70, 35, 35);
        seat27B.setBounds(1080, 115, 35, 35);
        seat27C.setBounds(1080, 160, 35, 35);
        seat27D.setBounds(1080, 235, 35, 35);
        seat27E.setBounds(1080, 280, 35, 35);
        seat27F.setBounds(1080, 325, 35, 35);
        seat28A.setBounds(1120, 70, 35, 35);
        seat28B.setBounds(1120, 115, 35, 35);
        seat28C.setBounds(1120, 160, 35, 35);
        seat28D.setBounds(1120, 235, 35, 35);
        seat28E.setBounds(1120, 280, 35, 35);
        seat28F.setBounds(1120, 325, 35, 35);
        seat29A.setBounds(1160, 70, 35, 35);
        seat29B.setBounds(1160, 115, 35, 35);
        seat29C.setBounds(1160, 160, 35, 35);
        seat29D.setBounds(1160, 235, 35, 35);
        seat29E.setBounds(1160, 280, 35, 35);
        seat29F.setBounds(1160, 325, 35, 35);
        seat30A.setBounds(1200, 70, 35, 35);
        seat30B.setBounds(1200, 115, 35, 35);
        seat30C.setBounds(1200, 160, 35, 35);
        seat30D.setBounds(1200, 235, 35, 35);
        seat30E.setBounds(1200, 280, 35, 35);
        seat30F.setBounds(1200, 325, 35, 35);

        seat1A.setMargin(new Insets(0, 0, 0, 0));
        seat1B.setMargin(new Insets(0, 0, 0, 0));
        seat1C.setMargin(new Insets(0, 0, 0, 0));
        seat1D.setMargin(new Insets(0, 0, 0, 0));
        seat1E.setMargin(new Insets(0, 0, 0, 0));
        seat1F.setMargin(new Insets(0, 0, 0, 0));
        seat2A.setMargin(new Insets(0, 0, 0, 0));
        seat2B.setMargin(new Insets(0, 0, 0, 0));
        seat2C.setMargin(new Insets(0, 0, 0, 0));
        seat2D.setMargin(new Insets(0, 0, 0, 0));
        seat2E.setMargin(new Insets(0, 0, 0, 0));
        seat2F.setMargin(new Insets(0, 0, 0, 0));
        seat3A.setMargin(new Insets(0, 0, 0, 0));
        seat3B.setMargin(new Insets(0, 0, 0, 0));
        seat3C.setMargin(new Insets(0, 0, 0, 0));
        seat3D.setMargin(new Insets(0, 0, 0, 0));
        seat3E.setMargin(new Insets(0, 0, 0, 0));
        seat3F.setMargin(new Insets(0, 0, 0, 0));
        seat4A.setMargin(new Insets(0, 0, 0, 0));
        seat4B.setMargin(new Insets(0, 0, 0, 0));
        seat4C.setMargin(new Insets(0, 0, 0, 0));
        seat4D.setMargin(new Insets(0, 0, 0, 0));
        seat4E.setMargin(new Insets(0, 0, 0, 0));
        seat4F.setMargin(new Insets(0, 0, 0, 0));
        seat5A.setMargin(new Insets(0, 0, 0, 0));
        seat5B.setMargin(new Insets(0, 0, 0, 0));
        seat5C.setMargin(new Insets(0, 0, 0, 0));
        seat5D.setMargin(new Insets(0, 0, 0, 0));
        seat5E.setMargin(new Insets(0, 0, 0, 0));
        seat5F.setMargin(new Insets(0, 0, 0, 0));
        seat6A.setMargin(new Insets(0, 0, 0, 0));
        seat6B.setMargin(new Insets(0, 0, 0, 0));
        seat6C.setMargin(new Insets(0, 0, 0, 0));
        seat6D.setMargin(new Insets(0, 0, 0, 0));
        seat6E.setMargin(new Insets(0, 0, 0, 0));
        seat6F.setMargin(new Insets(0, 0, 0, 0));
        seat7A.setMargin(new Insets(0, 0, 0, 0));
        seat7B.setMargin(new Insets(0, 0, 0, 0));
        seat7C.setMargin(new Insets(0, 0, 0, 0));
        seat7D.setMargin(new Insets(0, 0, 0, 0));
        seat7E.setMargin(new Insets(0, 0, 0, 0));
        seat7F.setMargin(new Insets(0, 0, 0, 0));
        seat8A.setMargin(new Insets(0, 0, 0, 0));
        seat8B.setMargin(new Insets(0, 0, 0, 0));
        seat8C.setMargin(new Insets(0, 0, 0, 0));
        seat8D.setMargin(new Insets(0, 0, 0, 0));
        seat8E.setMargin(new Insets(0, 0, 0, 0));
        seat8F.setMargin(new Insets(0, 0, 0, 0));
        seat9A.setMargin(new Insets(0, 0, 0, 0));
        seat9B.setMargin(new Insets(0, 0, 0, 0));
        seat9C.setMargin(new Insets(0, 0, 0, 0));
        seat9D.setMargin(new Insets(0, 0, 0, 0));
        seat9E.setMargin(new Insets(0, 0, 0, 0));
        seat9F.setMargin(new Insets(0, 0, 0, 0));
        seat10A.setMargin(new Insets(0, 0, 0, 0));
        seat10B.setMargin(new Insets(0, 0, 0, 0));
        seat10C.setMargin(new Insets(0, 0, 0, 0));
        seat10D.setMargin(new Insets(0, 0, 0, 0));
        seat10E.setMargin(new Insets(0, 0, 0, 0));
        seat10F.setMargin(new Insets(0, 0, 0, 0));
        seat11A.setMargin(new Insets(0, 0, 0, 0));
        seat11B.setMargin(new Insets(0, 0, 0, 0));
        seat11C.setMargin(new Insets(0, 0, 0, 0));
        seat11D.setMargin(new Insets(0, 0, 0, 0));
        seat11E.setMargin(new Insets(0, 0, 0, 0));
        seat11F.setMargin(new Insets(0, 0, 0, 0));
        seat12A.setMargin(new Insets(0, 0, 0, 0));
        seat12B.setMargin(new Insets(0, 0, 0, 0));
        seat12C.setMargin(new Insets(0, 0, 0, 0));
        seat12D.setMargin(new Insets(0, 0, 0, 0));
        seat12E.setMargin(new Insets(0, 0, 0, 0));
        seat12F.setMargin(new Insets(0, 0, 0, 0));
        seat13A.setMargin(new Insets(0, 0, 0, 0));
        seat13B.setMargin(new Insets(0, 0, 0, 0));
        seat13C.setMargin(new Insets(0, 0, 0, 0));
        seat13D.setMargin(new Insets(0, 0, 0, 0));
        seat13E.setMargin(new Insets(0, 0, 0, 0));
        seat13F.setMargin(new Insets(0, 0, 0, 0));
        seat14A.setMargin(new Insets(0, 0, 0, 0));
        seat14B.setMargin(new Insets(0, 0, 0, 0));
        seat14C.setMargin(new Insets(0, 0, 0, 0));
        seat14D.setMargin(new Insets(0, 0, 0, 0));
        seat14E.setMargin(new Insets(0, 0, 0, 0));
        seat14F.setMargin(new Insets(0, 0, 0, 0));
        seat15A.setMargin(new Insets(0, 0, 0, 0));
        seat15B.setMargin(new Insets(0, 0, 0, 0));
        seat15C.setMargin(new Insets(0, 0, 0, 0));
        seat15D.setMargin(new Insets(0, 0, 0, 0));
        seat15E.setMargin(new Insets(0, 0, 0, 0));
        seat15F.setMargin(new Insets(0, 0, 0, 0));
        seat16A.setMargin(new Insets(0, 0, 0, 0));
        seat16B.setMargin(new Insets(0, 0, 0, 0));
        seat16C.setMargin(new Insets(0, 0, 0, 0));
        seat16D.setMargin(new Insets(0, 0, 0, 0));
        seat16E.setMargin(new Insets(0, 0, 0, 0));
        seat16F.setMargin(new Insets(0, 0, 0, 0));
        seat17A.setMargin(new Insets(0, 0, 0, 0));
        seat17B.setMargin(new Insets(0, 0, 0, 0));
        seat17C.setMargin(new Insets(0, 0, 0, 0));
        seat17D.setMargin(new Insets(0, 0, 0, 0));
        seat17E.setMargin(new Insets(0, 0, 0, 0));
        seat17F.setMargin(new Insets(0, 0, 0, 0));
        seat18A.setMargin(new Insets(0, 0, 0, 0));
        seat18B.setMargin(new Insets(0, 0, 0, 0));
        seat18C.setMargin(new Insets(0, 0, 0, 0));
        seat18D.setMargin(new Insets(0, 0, 0, 0));
        seat18E.setMargin(new Insets(0, 0, 0, 0));
        seat18F.setMargin(new Insets(0, 0, 0, 0));
        seat19A.setMargin(new Insets(0, 0, 0, 0));
        seat19B.setMargin(new Insets(0, 0, 0, 0));
        seat19C.setMargin(new Insets(0, 0, 0, 0));
        seat19D.setMargin(new Insets(0, 0, 0, 0));
        seat19E.setMargin(new Insets(0, 0, 0, 0));
        seat19F.setMargin(new Insets(0, 0, 0, 0));
        seat20A.setMargin(new Insets(0, 0, 0, 0));
        seat20B.setMargin(new Insets(0, 0, 0, 0));
        seat20C.setMargin(new Insets(0, 0, 0, 0));
        seat20D.setMargin(new Insets(0, 0, 0, 0));
        seat20E.setMargin(new Insets(0, 0, 0, 0));
        seat20F.setMargin(new Insets(0, 0, 0, 0));
        seat21A.setMargin(new Insets(0, 0, 0, 0));
        seat21B.setMargin(new Insets(0, 0, 0, 0));
        seat21C.setMargin(new Insets(0, 0, 0, 0));
        seat21D.setMargin(new Insets(0, 0, 0, 0));
        seat21E.setMargin(new Insets(0, 0, 0, 0));
        seat21F.setMargin(new Insets(0, 0, 0, 0));
        seat22A.setMargin(new Insets(0, 0, 0, 0));
        seat22B.setMargin(new Insets(0, 0, 0, 0));
        seat22C.setMargin(new Insets(0, 0, 0, 0));
        seat22D.setMargin(new Insets(0, 0, 0, 0));
        seat22E.setMargin(new Insets(0, 0, 0, 0));
        seat22F.setMargin(new Insets(0, 0, 0, 0));
        seat23A.setMargin(new Insets(0, 0, 0, 0));
        seat23B.setMargin(new Insets(0, 0, 0, 0));
        seat23C.setMargin(new Insets(0, 0, 0, 0));
        seat23D.setMargin(new Insets(0, 0, 0, 0));
        seat23E.setMargin(new Insets(0, 0, 0, 0));
        seat23F.setMargin(new Insets(0, 0, 0, 0));
        seat24A.setMargin(new Insets(0, 0, 0, 0));
        seat24B.setMargin(new Insets(0, 0, 0, 0));
        seat24C.setMargin(new Insets(0, 0, 0, 0));
        seat24D.setMargin(new Insets(0, 0, 0, 0));
        seat24E.setMargin(new Insets(0, 0, 0, 0));
        seat24F.setMargin(new Insets(0, 0, 0, 0));
        seat25A.setMargin(new Insets(0, 0, 0, 0));
        seat25B.setMargin(new Insets(0, 0, 0, 0));
        seat25C.setMargin(new Insets(0, 0, 0, 0));
        seat25D.setMargin(new Insets(0, 0, 0, 0));
        seat25E.setMargin(new Insets(0, 0, 0, 0));
        seat25F.setMargin(new Insets(0, 0, 0, 0));
        seat26A.setMargin(new Insets(0, 0, 0, 0));
        seat26B.setMargin(new Insets(0, 0, 0, 0));
        seat26C.setMargin(new Insets(0, 0, 0, 0));
        seat26D.setMargin(new Insets(0, 0, 0, 0));
        seat26E.setMargin(new Insets(0, 0, 0, 0));
        seat26F.setMargin(new Insets(0, 0, 0, 0));
        seat27A.setMargin(new Insets(0, 0, 0, 0));
        seat27B.setMargin(new Insets(0, 0, 0, 0));
        seat27C.setMargin(new Insets(0, 0, 0, 0));
        seat27D.setMargin(new Insets(0, 0, 0, 0));
        seat27E.setMargin(new Insets(0, 0, 0, 0));
        seat27F.setMargin(new Insets(0, 0, 0, 0));
        seat28A.setMargin(new Insets(0, 0, 0, 0));
        seat28B.setMargin(new Insets(0, 0, 0, 0));
        seat28C.setMargin(new Insets(0, 0, 0, 0));
        seat28D.setMargin(new Insets(0, 0, 0, 0));
        seat28E.setMargin(new Insets(0, 0, 0, 0));
        seat28F.setMargin(new Insets(0, 0, 0, 0));
        seat29A.setMargin(new Insets(0, 0, 0, 0));
        seat29B.setMargin(new Insets(0, 0, 0, 0));
        seat29C.setMargin(new Insets(0, 0, 0, 0));
        seat29D.setMargin(new Insets(0, 0, 0, 0));
        seat29E.setMargin(new Insets(0, 0, 0, 0));
        seat29F.setMargin(new Insets(0, 0, 0, 0));
        seat30A.setMargin(new Insets(0, 0, 0, 0));
        seat30B.setMargin(new Insets(0, 0, 0, 0));
        seat30C.setMargin(new Insets(0, 0, 0, 0));
        seat30D.setMargin(new Insets(0, 0, 0, 0));
        seat30E.setMargin(new Insets(0, 0, 0, 0));
        seat30F.setMargin(new Insets(0, 0, 0, 0));

        seat1A.setBackground(new Color(0x5584AC));
        seat1B.setBackground(new Color(0x5584AC));
        seat1C.setBackground(new Color(0x5584AC));
        seat1D.setBackground(new Color(0x5584AC));
        seat1E.setBackground(new Color(0x5584AC));
        seat1F.setBackground(new Color(0x5584AC));
        seat2A.setBackground(new Color(0x5584AC));
        seat2B.setBackground(new Color(0x5584AC));
        seat2C.setBackground(new Color(0x5584AC));
        seat2D.setBackground(new Color(0x5584AC));
        seat2E.setBackground(new Color(0x5584AC));
        seat2F.setBackground(new Color(0x5584AC));
        seat3A.setBackground(new Color(0x5584AC));
        seat3B.setBackground(new Color(0x5584AC));
        seat3C.setBackground(new Color(0x5584AC));
        seat3D.setBackground(new Color(0x5584AC));
        seat3E.setBackground(new Color(0x5584AC));
        seat3F.setBackground(new Color(0x5584AC));
        seat4A.setBackground(new Color(0x5584AC));
        seat4B.setBackground(new Color(0x5584AC));
        seat4C.setBackground(new Color(0x5584AC));
        seat4D.setBackground(new Color(0x5584AC));
        seat4E.setBackground(new Color(0x5584AC));
        seat4F.setBackground(new Color(0x5584AC));
        seat5A.setBackground(new Color(0x5584AC));
        seat5B.setBackground(new Color(0x5584AC));
        seat5C.setBackground(new Color(0x5584AC));
        seat5D.setBackground(new Color(0x5584AC));
        seat5E.setBackground(new Color(0x5584AC));
        seat5F.setBackground(new Color(0x5584AC));
        seat6A.setBackground(new Color(0x5584AC));
        seat6B.setBackground(new Color(0x5584AC));
        seat6C.setBackground(new Color(0x5584AC));
        seat6D.setBackground(new Color(0x5584AC));
        seat6E.setBackground(new Color(0x5584AC));
        seat6F.setBackground(new Color(0x5584AC));
        seat7A.setBackground(new Color(0x5584AC));
        seat7B.setBackground(new Color(0x5584AC));
        seat7C.setBackground(new Color(0x5584AC));
        seat7D.setBackground(new Color(0x5584AC));
        seat7E.setBackground(new Color(0x5584AC));
        seat7F.setBackground(new Color(0x5584AC));
        seat8A.setBackground(new Color(0x5584AC));
        seat8B.setBackground(new Color(0x5584AC));
        seat8C.setBackground(new Color(0x5584AC));
        seat8D.setBackground(new Color(0x5584AC));
        seat8E.setBackground(new Color(0x5584AC));
        seat8F.setBackground(new Color(0x5584AC));
        seat9A.setBackground(new Color(0x5584AC));
        seat9B.setBackground(new Color(0x5584AC));
        seat9C.setBackground(new Color(0x5584AC));
        seat9D.setBackground(new Color(0x5584AC));
        seat9E.setBackground(new Color(0x5584AC));
        seat9F.setBackground(new Color(0x5584AC));
        seat10A.setBackground(new Color(0x5584AC));
        seat10B.setBackground(new Color(0x5584AC));
        seat10C.setBackground(new Color(0x5584AC));
        seat10D.setBackground(new Color(0x5584AC));
        seat10E.setBackground(new Color(0x5584AC));
        seat10F.setBackground(new Color(0x5584AC));
        seat11A.setBackground(new Color(0x5584AC));
        seat11B.setBackground(new Color(0x5584AC));
        seat11C.setBackground(new Color(0x5584AC));
        seat11D.setBackground(new Color(0x5584AC));
        seat11E.setBackground(new Color(0x5584AC));
        seat11F.setBackground(new Color(0x5584AC));
        seat12A.setBackground(new Color(0x5584AC));
        seat12B.setBackground(new Color(0x5584AC));
        seat12C.setBackground(new Color(0x5584AC));
        seat12D.setBackground(new Color(0x5584AC));
        seat12E.setBackground(new Color(0x5584AC));
        seat12F.setBackground(new Color(0x5584AC));
        seat13A.setBackground(new Color(0x5584AC));
        seat13B.setBackground(new Color(0x5584AC));
        seat13C.setBackground(new Color(0x5584AC));
        seat13D.setBackground(new Color(0x5584AC));
        seat13E.setBackground(new Color(0x5584AC));
        seat13F.setBackground(new Color(0x5584AC));
        seat14A.setBackground(new Color(0x5584AC));
        seat14B.setBackground(new Color(0x5584AC));
        seat14C.setBackground(new Color(0x5584AC));
        seat14D.setBackground(new Color(0x5584AC));
        seat14E.setBackground(new Color(0x5584AC));
        seat14F.setBackground(new Color(0x5584AC));
        seat15A.setBackground(new Color(0x5584AC));
        seat15B.setBackground(new Color(0x5584AC));
        seat15C.setBackground(new Color(0x5584AC));
        seat15D.setBackground(new Color(0x5584AC));
        seat15E.setBackground(new Color(0x5584AC));
        seat15F.setBackground(new Color(0x5584AC));
        seat16A.setBackground(new Color(0x5584AC));
        seat16B.setBackground(new Color(0x5584AC));
        seat16C.setBackground(new Color(0x5584AC));
        seat16D.setBackground(new Color(0x5584AC));
        seat16E.setBackground(new Color(0x5584AC));
        seat16F.setBackground(new Color(0x5584AC));
        seat17A.setBackground(new Color(0x5584AC));
        seat17B.setBackground(new Color(0x5584AC));
        seat17C.setBackground(new Color(0x5584AC));
        seat17D.setBackground(new Color(0x5584AC));
        seat17E.setBackground(new Color(0x5584AC));
        seat17F.setBackground(new Color(0x5584AC));
        seat18A.setBackground(new Color(0x5584AC));
        seat18B.setBackground(new Color(0x5584AC));
        seat18C.setBackground(new Color(0x5584AC));
        seat18D.setBackground(new Color(0x5584AC));
        seat18E.setBackground(new Color(0x5584AC));
        seat18F.setBackground(new Color(0x5584AC));
        seat19A.setBackground(new Color(0x5584AC));
        seat19B.setBackground(new Color(0x5584AC));
        seat19C.setBackground(new Color(0x5584AC));
        seat19D.setBackground(new Color(0x5584AC));
        seat19E.setBackground(new Color(0x5584AC));
        seat19F.setBackground(new Color(0x5584AC));
        seat20A.setBackground(new Color(0x5584AC));
        seat20B.setBackground(new Color(0x5584AC));
        seat20C.setBackground(new Color(0x5584AC));
        seat20D.setBackground(new Color(0x5584AC));
        seat20E.setBackground(new Color(0x5584AC));
        seat20F.setBackground(new Color(0x5584AC));
        seat21A.setBackground(new Color(0x5584AC));
        seat21B.setBackground(new Color(0x5584AC));
        seat21C.setBackground(new Color(0x5584AC));
        seat21D.setBackground(new Color(0x5584AC));
        seat21E.setBackground(new Color(0x5584AC));
        seat21F.setBackground(new Color(0x5584AC));
        seat22A.setBackground(new Color(0x5584AC));
        seat22B.setBackground(new Color(0x5584AC));
        seat22C.setBackground(new Color(0x5584AC));
        seat22D.setBackground(new Color(0x5584AC));
        seat22E.setBackground(new Color(0x5584AC));
        seat22F.setBackground(new Color(0x5584AC));
        seat23A.setBackground(new Color(0x5584AC));
        seat23B.setBackground(new Color(0x5584AC));
        seat23C.setBackground(new Color(0x5584AC));
        seat23D.setBackground(new Color(0x5584AC));
        seat23E.setBackground(new Color(0x5584AC));
        seat23F.setBackground(new Color(0x5584AC));
        seat24A.setBackground(new Color(0x5584AC));
        seat24B.setBackground(new Color(0x5584AC));
        seat24C.setBackground(new Color(0x5584AC));
        seat24D.setBackground(new Color(0x5584AC));
        seat24E.setBackground(new Color(0x5584AC));
        seat24F.setBackground(new Color(0x5584AC));
        seat25A.setBackground(new Color(0x5584AC));
        seat25B.setBackground(new Color(0x5584AC));
        seat25C.setBackground(new Color(0x5584AC));
        seat25D.setBackground(new Color(0x5584AC));
        seat25E.setBackground(new Color(0x5584AC));
        seat25F.setBackground(new Color(0x5584AC));
        seat26A.setBackground(new Color(0x5584AC));
        seat26B.setBackground(new Color(0x5584AC));
        seat26C.setBackground(new Color(0x5584AC));
        seat26D.setBackground(new Color(0x5584AC));
        seat26E.setBackground(new Color(0x5584AC));
        seat26F.setBackground(new Color(0x5584AC));
        seat27A.setBackground(new Color(0x5584AC));
        seat27B.setBackground(new Color(0x5584AC));
        seat27C.setBackground(new Color(0x5584AC));
        seat27D.setBackground(new Color(0x5584AC));
        seat27E.setBackground(new Color(0x5584AC));
        seat27F.setBackground(new Color(0x5584AC));
        seat28A.setBackground(new Color(0x5584AC));
        seat28B.setBackground(new Color(0x5584AC));
        seat28C.setBackground(new Color(0x5584AC));
        seat28D.setBackground(new Color(0x5584AC));
        seat28E.setBackground(new Color(0x5584AC));
        seat28F.setBackground(new Color(0x5584AC));
        seat29A.setBackground(new Color(0x5584AC));
        seat29B.setBackground(new Color(0x5584AC));
        seat29C.setBackground(new Color(0x5584AC));
        seat29D.setBackground(new Color(0x5584AC));
        seat29E.setBackground(new Color(0x5584AC));
        seat29F.setBackground(new Color(0x5584AC));
        seat30A.setBackground(new Color(0x5584AC));
        seat30B.setBackground(new Color(0x5584AC));
        seat30C.setBackground(new Color(0x5584AC));
        seat30D.setBackground(new Color(0x5584AC));
        seat30E.setBackground(new Color(0x5584AC));
        seat30F.setBackground(new Color(0x5584AC));
        

        seat1A.setFocusable(false);
        seat1B.setFocusable(false);
        seat1C.setFocusable(false);
        seat1D.setFocusable(false);
        seat1E.setFocusable(false);
        seat1F.setFocusable(false);
        seat2A.setFocusable(false);
        seat2B.setFocusable(false);
        seat2C.setFocusable(false);
        seat2D.setFocusable(false);


        if (bookedSeats != null){
            if (bookedSeats.contains(seat1A.getText()) || seatsOfOppClass.contains(seat1A.getText())){
                seat1A.setBackground(new Color(0xF55353));
                seat1A.setEnabled(false);
            }
            if (bookedSeats.contains(seat1B.getText()) || seatsOfOppClass.contains(seat1B.getText())){
                seat1B.setBackground(new Color(0xF55353));
                seat1B.setEnabled(false);
            }
            if (bookedSeats.contains(seat1C.getText()) || seatsOfOppClass.contains(seat1C.getText())){
                seat1C.setBackground(new Color(0xF55353));
                seat1C.setEnabled(false);
            }
            if (bookedSeats.contains(seat1D.getText()) || seatsOfOppClass.contains(seat1D.getText())){
                seat1D.setBackground(new Color(0xF55353));
                seat1D.setEnabled(false);
            }
            if (bookedSeats.contains(seat1E.getText()) || seatsOfOppClass.contains(seat1E.getText())){
                seat1E.setBackground(new Color(0xF55353));
                seat1E.setEnabled(false);
            }
            if (bookedSeats.contains(seat1F.getText()) || seatsOfOppClass.contains(seat1F.getText())){
                seat1F.setBackground(new Color(0xF55353));
                seat1F.setEnabled(false);
            }
            if (bookedSeats.contains(seat2A.getText()) || seatsOfOppClass.contains(seat2A.getText())){
                seat2A.setBackground(new Color(0xF55353));
                seat2A.setEnabled(false);
            }
            if (bookedSeats.contains(seat2B.getText()) || seatsOfOppClass.contains(seat2B.getText())){
                seat2B.setBackground(new Color(0xF55353));
                seat2B.setEnabled(false);
            }
            if (bookedSeats.contains(seat2C.getText()) || seatsOfOppClass.contains(seat2C.getText())){
                seat2C.setBackground(new Color(0xF55353));
                seat2C.setEnabled(false);
            }
            if (bookedSeats.contains(seat2D.getText()) || seatsOfOppClass.contains(seat2D.getText())){
                seat2D.setBackground(new Color(0xF55353));
                seat2D.setEnabled(false);
            }
            if(bookedSeats.contains(seat2E.getText()) || seatsOfOppClass.contains(seat2E.getText())){
                seat2E.setBackground(new Color(0xF55353));
                seat2E.setEnabled(false);
            }
            if (bookedSeats.contains(seat2F.getText()) || seatsOfOppClass.contains(seat2F.getText())){
                seat2F.setBackground(new Color(0xF55353));
                seat2F.setEnabled(false);
            }

            if (bookedSeats.contains(seat3A.getText()) || seatsOfOppClass.contains(seat3A.getText())){
                seat3A.setBackground(new Color(0xF55353));
                seat3A.setEnabled(false);
            }
            if (bookedSeats.contains(seat3B.getText()) || seatsOfOppClass.contains(seat3B.getText())){
                seat3B.setBackground(new Color(0xF55353));
                seat3B.setEnabled(false);
            }
            if (bookedSeats.contains(seat3C.getText()) || seatsOfOppClass.contains(seat3C.getText())){
                seat3C.setBackground(new Color(0xF55353));
                seat3C.setEnabled(false);
            }
            if (bookedSeats.contains(seat3D.getText()) || seatsOfOppClass.contains(seat3D.getText())){
                seat3D.setBackground(new Color(0xF55353));
                seat3D.setEnabled(false);
            }
            if(bookedSeats.contains(seat3E.getText()) || seatsOfOppClass.contains(seat3E.getText())){
                seat3E.setBackground(new Color(0xF55353));
                seat3E.setEnabled(false);
            }
            if (bookedSeats.contains(seat3F.getText()) || seatsOfOppClass.contains(seat3F.getText())){
                seat3F.setBackground(new Color(0xF55353));
                seat3F.setEnabled(false);
            }

            if (bookedSeats.contains(seat4A.getText()) || seatsOfOppClass.contains(seat4A.getText())){
                seat4A.setBackground(new Color(0xF55353));
                seat4A.setEnabled(false);
            }
            if (bookedSeats.contains(seat4B.getText()) || seatsOfOppClass.contains(seat4B.getText())){
                seat4B.setBackground(new Color(0xF55353));
                seat4B.setEnabled(false);
            }
            if (bookedSeats.contains(seat4C.getText()) || seatsOfOppClass.contains(seat4C.getText())){
                seat4C.setBackground(new Color(0xF55353));
                seat4C.setEnabled(false);
            }
            if (bookedSeats.contains(seat4D.getText()) || seatsOfOppClass.contains(seat4D.getText())){
                seat4D.setBackground(new Color(0xF55353));
                seat4D.setEnabled(false);
            }
            if(bookedSeats.contains(seat4E.getText()) || seatsOfOppClass.contains(seat4E.getText())){
                seat4E.setBackground(new Color(0xF55353));
                seat4E.setEnabled(false);
            }
            if (bookedSeats.contains(seat4F.getText()) || seatsOfOppClass.contains(seat4F.getText())){
                seat4F.setBackground(new Color(0xF55353));
                seat4F.setEnabled(false);
            }

            if (bookedSeats.contains(seat5A.getText()) || seatsOfOppClass.contains(seat5A.getText())){
                seat5A.setBackground(new Color(0xF55353));
                seat5A.setEnabled(false);
            }
            if (bookedSeats.contains(seat5B.getText()) || seatsOfOppClass.contains(seat5B.getText())){
                seat5B.setBackground(new Color(0xF55353));
                seat5B.setEnabled(false);
            }
            if (bookedSeats.contains(seat5C.getText()) || seatsOfOppClass.contains(seat5C.getText())){
                seat5C.setBackground(new Color(0xF55353));
                seat5C.setEnabled(false);
            }
            if (bookedSeats.contains(seat5D.getText()) || seatsOfOppClass.contains(seat5D.getText())){
                seat5D.setBackground(new Color(0xF55353));
                seat5D.setEnabled(false);
            }
            if(bookedSeats.contains(seat5E.getText()) || seatsOfOppClass.contains(seat5E.getText())){
                seat5E.setBackground(new Color(0xF55353));
                seat5E.setEnabled(false);
            }
            if (bookedSeats.contains(seat5F.getText()) || seatsOfOppClass.contains(seat5F.getText())){
                seat5F.setBackground(new Color(0xF55353));
                seat5F.setEnabled(false);
            }

            if (bookedSeats.contains(seat6A.getText()) || seatsOfOppClass.contains(seat6A.getText())){
                seat6A.setBackground(new Color(0xF55353));
                seat6A.setEnabled(false);
            }
            if (bookedSeats.contains(seat6B.getText()) || seatsOfOppClass.contains(seat6B.getText())){
                seat6B.setBackground(new Color(0xF55353));
                seat6B.setEnabled(false);
            }
            if (bookedSeats.contains(seat6C.getText()) || seatsOfOppClass.contains(seat6C.getText())){
                seat6C.setBackground(new Color(0xF55353));
                seat6C.setEnabled(false);
            }
            if (bookedSeats.contains(seat6D.getText()) || seatsOfOppClass.contains(seat6D.getText())){
                seat6D.setBackground(new Color(0xF55353));
                seat6D.setEnabled(false);
            }
            if(bookedSeats.contains(seat6E.getText()) || seatsOfOppClass.contains(seat6E.getText())){
                seat6E.setBackground(new Color(0xF55353));
                seat6E.setEnabled(false);
            }
            if (bookedSeats.contains(seat6F.getText()) || seatsOfOppClass.contains(seat6F.getText())){
                seat6F.setBackground(new Color(0xF55353));
                seat6F.setEnabled(false);
            }

            if (bookedSeats.contains(seat7A.getText()) || seatsOfOppClass.contains(seat7A.getText())){
                seat7A.setBackground(new Color(0xF55353));
                seat7A.setEnabled(false);
            }
            if (bookedSeats.contains(seat7B.getText()) || seatsOfOppClass.contains(seat7B.getText())){
                seat7B.setBackground(new Color(0xF55353));
                seat7B.setEnabled(false);
            }
            if (bookedSeats.contains(seat7C.getText()) || seatsOfOppClass.contains(seat7C.getText())){
                seat7C.setBackground(new Color(0xF55353));
                seat7C.setEnabled(false);
            }
            if (bookedSeats.contains(seat7D.getText()) || seatsOfOppClass.contains(seat7D.getText())){
                seat7D.setBackground(new Color(0xF55353));
                seat7D.setEnabled(false);
            }
            if(bookedSeats.contains(seat7E.getText()) || seatsOfOppClass.contains(seat7E.getText())){
                seat7E.setBackground(new Color(0xF55353));
                seat7E.setEnabled(false);
            }
            if (bookedSeats.contains(seat7F.getText()) || seatsOfOppClass.contains(seat7F.getText())){
                seat7F.setBackground(new Color(0xF55353));
                seat7F.setEnabled(false);
            }

            if (bookedSeats.contains(seat8A.getText()) || seatsOfOppClass.contains(seat8A.getText())){
                seat8A.setBackground(new Color(0xF55353));
                seat8A.setEnabled(false);
            }
            if (bookedSeats.contains(seat8B.getText()) || seatsOfOppClass.contains(seat8B.getText())){
                seat8B.setBackground(new Color(0xF55353));
                seat8B.setEnabled(false);
            }
            if (bookedSeats.contains(seat8C.getText()) || seatsOfOppClass.contains(seat8C.getText())){
                seat8C.setBackground(new Color(0xF55353));
                seat8C.setEnabled(false);
            }
            if (bookedSeats.contains(seat8D.getText()) || seatsOfOppClass.contains(seat8D.getText())){
                seat8D.setBackground(new Color(0xF55353));
                seat8D.setEnabled(false);
            }
            if(bookedSeats.contains(seat8E.getText()) || seatsOfOppClass.contains(seat8E.getText())){
                seat8E.setBackground(new Color(0xF55353));
                seat8E.setEnabled(false);
            }
            if (bookedSeats.contains(seat8F.getText()) || seatsOfOppClass.contains(seat8F.getText())){
                seat8F.setBackground(new Color(0xF55353));
                seat8F.setEnabled(false);
            }

            if (bookedSeats.contains(seat9A.getText()) || seatsOfOppClass.contains(seat9A.getText())){
                seat9A.setBackground(new Color(0xF55353));
                seat9A.setEnabled(false);
            }
            if (bookedSeats.contains(seat9B.getText()) || seatsOfOppClass.contains(seat9B.getText())){
                seat9B.setBackground(new Color(0xF55353));
                seat9B.setEnabled(false);
            }
            if (bookedSeats.contains(seat9C.getText()) || seatsOfOppClass.contains(seat9C.getText())){
                seat9C.setBackground(new Color(0xF55353));
                seat9C.setEnabled(false);
            }
            if (bookedSeats.contains(seat9D.getText()) || seatsOfOppClass.contains(seat9D.getText())){
                seat9D.setBackground(new Color(0xF55353));
                seat9D.setEnabled(false);
            }
            if(bookedSeats.contains(seat9E.getText()) || seatsOfOppClass.contains(seat9E.getText())){
                seat9E.setBackground(new Color(0xF55353));
                seat9E.setEnabled(false);
            }
            if (bookedSeats.contains(seat9F.getText()) || seatsOfOppClass.contains(seat9F.getText())){
                seat9F.setBackground(new Color(0xF55353));
                seat9F.setEnabled(false);
            }

            if (bookedSeats.contains(seat10A.getText()) || seatsOfOppClass.contains(seat10A.getText())){
                seat10A.setBackground(new Color(0xF55353));
                seat10A.setEnabled(false);
            }
            if (bookedSeats.contains(seat10B.getText()) || seatsOfOppClass.contains(seat10B.getText())){
                seat10B.setBackground(new Color(0xF55353));
                seat10B.setEnabled(false);
            }
            if (bookedSeats.contains(seat10C.getText()) || seatsOfOppClass.contains(seat10C.getText())){
                seat10C.setBackground(new Color(0xF55353));
                seat10C.setEnabled(false);
            }
            if (bookedSeats.contains(seat10D.getText()) || seatsOfOppClass.contains(seat10D.getText())){
                seat10D.setBackground(new Color(0xF55353));
                seat10D.setEnabled(false);
            }
            if(bookedSeats.contains(seat10E.getText()) || seatsOfOppClass.contains(seat10E.getText())){
                seat10E.setBackground(new Color(0xF55353));
                seat10E.setEnabled(false);
            }
            if (bookedSeats.contains(seat10F.getText()) || seatsOfOppClass.contains(seat10F.getText())){
                seat10F.setBackground(new Color(0xF55353));
                seat10F.setEnabled(false);
            }

            if (bookedSeats.contains(seat11A.getText()) || seatsOfOppClass.contains(seat11A.getText())){
                seat11A.setBackground(new Color(0xF55353));
                seat11A.setEnabled(false);
            }
            if (bookedSeats.contains(seat11B.getText()) || seatsOfOppClass.contains(seat11B.getText())){
                seat11B.setBackground(new Color(0xF55353));
                seat11B.setEnabled(false);
            }
            if (bookedSeats.contains(seat11C.getText()) || seatsOfOppClass.contains(seat11C.getText())){
                seat11C.setBackground(new Color(0xF55353));
                seat11C.setEnabled(false);
            }
            if (bookedSeats.contains(seat11D.getText()) || seatsOfOppClass.contains(seat11D.getText())){
                seat11D.setBackground(new Color(0xF55353));
                seat11D.setEnabled(false);
            }
            if(bookedSeats.contains(seat11E.getText()) || seatsOfOppClass.contains(seat11E.getText())){
                seat11E.setBackground(new Color(0xF55353));
                seat11E.setEnabled(false);
            }
            if (bookedSeats.contains(seat11F.getText()) || seatsOfOppClass.contains(seat11F.getText())){
                seat11F.setBackground(new Color(0xF55353));
                seat11F.setEnabled(false);
            }
            if (bookedSeats.contains(seat12A.getText()) || seatsOfOppClass.contains(seat12A.getText())){
                seat12A.setBackground(new Color(0xF55353));
                seat12A.setEnabled(false);
            }
            if (bookedSeats.contains(seat12B.getText()) || seatsOfOppClass.contains(seat12B.getText())){
                seat12B.setBackground(new Color(0xF55353));
                seat12B.setEnabled(false);
            }
            if (bookedSeats.contains(seat12C.getText()) || seatsOfOppClass.contains(seat12C.getText())){
                seat12C.setBackground(new Color(0xF55353));
                seat12C.setEnabled(false);
            }
            if (bookedSeats.contains(seat12D.getText()) || seatsOfOppClass.contains(seat12D.getText())){
                seat12D.setBackground(new Color(0xF55353));
                seat12D.setEnabled(false);
            }
            if(bookedSeats.contains(seat12E.getText()) || seatsOfOppClass.contains(seat12E.getText())){
                seat12E.setBackground(new Color(0xF55353));
                seat12E.setEnabled(false);
            }
            if (bookedSeats.contains(seat12F.getText()) || seatsOfOppClass.contains(seat12F.getText())){
                seat12F.setBackground(new Color(0xF55353));
                seat12F.setEnabled(false);
            }
            if (bookedSeats.contains(seat13A.getText()) || seatsOfOppClass.contains(seat13A.getText())){
                seat13A.setBackground(new Color(0xF55353));
                seat13A.setEnabled(false);
            }
            if (bookedSeats.contains(seat13B.getText()) || seatsOfOppClass.contains(seat13B.getText())){
                seat13B.setBackground(new Color(0xF55353));
                seat13B.setEnabled(false);
            }
            if (bookedSeats.contains(seat13C.getText()) || seatsOfOppClass.contains(seat13C.getText())){
                seat13C.setBackground(new Color(0xF55353));
                seat13C.setEnabled(false);
            }
            if (bookedSeats.contains(seat13D.getText()) || seatsOfOppClass.contains(seat13D.getText())){
                seat13D.setBackground(new Color(0xF55353));
                seat13D.setEnabled(false);
            }
            if(bookedSeats.contains(seat13E.getText()) || seatsOfOppClass.contains(seat13E.getText())){
                seat13E.setBackground(new Color(0xF55353));
                seat13E.setEnabled(false);
            }
            if (bookedSeats.contains(seat13F.getText()) || seatsOfOppClass.contains(seat13F.getText())){
                seat13F.setBackground(new Color(0xF55353));
                seat13F.setEnabled(false);
            }

            if (bookedSeats.contains(seat14A.getText()) || seatsOfOppClass.contains(seat14A.getText())){
                seat14A.setBackground(new Color(0xF55353));
                seat14A.setEnabled(false);
            }
            if (bookedSeats.contains(seat14B.getText()) || seatsOfOppClass.contains(seat14B.getText())){
                seat14B.setBackground(new Color(0xF55353));
                seat14B.setEnabled(false);
            }
            if (bookedSeats.contains(seat14C.getText()) || seatsOfOppClass.contains(seat14C.getText())){
                seat14C.setBackground(new Color(0xF55353));
                seat14C.setEnabled(false);
            }
            if (bookedSeats.contains(seat14D.getText()) || seatsOfOppClass.contains(seat14D.getText())){
                seat14D.setBackground(new Color(0xF55353));
                seat14D.setEnabled(false);
            }
            if(bookedSeats.contains(seat14E.getText()) || seatsOfOppClass.contains(seat14E.getText())){
                seat14E.setBackground(new Color(0xF55353));
                seat14E.setEnabled(false);
            }
            if (bookedSeats.contains(seat14F.getText()) || seatsOfOppClass.contains(seat14F.getText())){
                seat14F.setBackground(new Color(0xF55353));
                seat14F.setEnabled(false);
            }

            if (bookedSeats.contains(seat15A.getText()) || seatsOfOppClass.contains(seat15A.getText())){
                seat15A.setBackground(new Color(0xF55353));
                seat15A.setEnabled(false);
            }
            if (bookedSeats.contains(seat15B.getText()) || seatsOfOppClass.contains(seat15B.getText())){
                seat15B.setBackground(new Color(0xF55353));
                seat15B.setEnabled(false);
            }
            if (bookedSeats.contains(seat15C.getText()) || seatsOfOppClass.contains(seat15C.getText())){
                seat15C.setBackground(new Color(0xF55353));
                seat15C.setEnabled(false);
            }
            if (bookedSeats.contains(seat15D.getText()) || seatsOfOppClass.contains(seat15D.getText())){
                seat15D.setBackground(new Color(0xF55353));
                seat15D.setEnabled(false);
            }
            if(bookedSeats.contains(seat15E.getText()) || seatsOfOppClass.contains(seat15E.getText())){
                seat15E.setBackground(new Color(0xF55353));
                seat15E.setEnabled(false);
            }
            if (bookedSeats.contains(seat15F.getText()) || seatsOfOppClass.contains(seat15F.getText())){
                seat15F.setBackground(new Color(0xF55353));
                seat15F.setEnabled(false);
            }
            if (bookedSeats.contains(seat16A.getText()) || seatsOfOppClass.contains(seat16A.getText())){
                seat16A.setBackground(new Color(0xF55353));
                seat16A.setEnabled(false);
            }
            if (bookedSeats.contains(seat16B.getText()) || seatsOfOppClass.contains(seat16B.getText())){
                seat16B.setBackground(new Color(0xF55353));
                seat16B.setEnabled(false);
            }
            if (bookedSeats.contains(seat16C.getText()) || seatsOfOppClass.contains(seat16C.getText())){
                seat16C.setBackground(new Color(0xF55353));
                seat16C.setEnabled(false);
            }
            if (bookedSeats.contains(seat16D.getText()) || seatsOfOppClass.contains(seat16D.getText())){
                seat16D.setBackground(new Color(0xF55353));
                seat16D.setEnabled(false);
            }
            if(bookedSeats.contains(seat16E.getText()) || seatsOfOppClass.contains(seat16E.getText())){
                seat16E.setBackground(new Color(0xF55353));
                seat16E.setEnabled(false);
            }
            if (bookedSeats.contains(seat16F.getText()) || seatsOfOppClass.contains(seat16F.getText())){
                seat16F.setBackground(new Color(0xF55353));
                seat16F.setEnabled(false);
            }

            if (bookedSeats.contains(seat17A.getText()) || seatsOfOppClass.contains(seat17A.getText())){
                seat17A.setBackground(new Color(0xF55353));
                seat17A.setEnabled(false);
            }
            if (bookedSeats.contains(seat17B.getText()) || seatsOfOppClass.contains(seat17B.getText())){
                seat17B.setBackground(new Color(0xF55353));
                seat17B.setEnabled(false);
            }
            if (bookedSeats.contains(seat17C.getText()) || seatsOfOppClass.contains(seat17C.getText())){
                seat17C.setBackground(new Color(0xF55353));
                seat17C.setEnabled(false);
            }
            if (bookedSeats.contains(seat17D.getText()) || seatsOfOppClass.contains(seat17D.getText())){
                seat17D.setBackground(new Color(0xF55353));
                seat17D.setEnabled(false);
            }
            if(bookedSeats.contains(seat17E.getText()) || seatsOfOppClass.contains(seat17E.getText())){
                seat17E.setBackground(new Color(0xF55353));
                seat17E.setEnabled(false);
            }
            if (bookedSeats.contains(seat17F.getText()) || seatsOfOppClass.contains(seat17F.getText())){
                seat17F.setBackground(new Color(0xF55353));
                seat17F.setEnabled(false);
            }

            if (bookedSeats.contains(seat18A.getText()) || seatsOfOppClass.contains(seat18A.getText())){
                seat18A.setBackground(new Color(0xF55353));
                seat18A.setEnabled(false);
            }
            if (bookedSeats.contains(seat18B.getText()) || seatsOfOppClass.contains(seat18B.getText())){
                seat18B.setBackground(new Color(0xF55353));
                seat18B.setEnabled(false);
            }
            if (bookedSeats.contains(seat18C.getText()) || seatsOfOppClass.contains(seat18C.getText())){
                seat18C.setBackground(new Color(0xF55353));
                seat18C.setEnabled(false);
            }
            if (bookedSeats.contains(seat18D.getText()) || seatsOfOppClass.contains(seat18D.getText())){
                seat18D.setBackground(new Color(0xF55353));
                seat18D.setEnabled(false);
                seat18D.setVisible(true);
            }
            if(bookedSeats.contains(seat18E.getText()) || seatsOfOppClass.contains(seat18E.getText())){
                seat18E.setBackground(new Color(0xF55353));
                seat18E.setEnabled(false);
            }
            if (bookedSeats.contains(seat18F.getText()) || seatsOfOppClass.contains(seat18F.getText())){
                seat18F.setBackground(new Color(0xF55353));
                seat18F.setEnabled(false);
            }

            if (bookedSeats.contains(seat19A.getText()) || seatsOfOppClass.contains(seat19A.getText())){
                seat19A.setBackground(new Color(0xF55353));
                seat19A.setEnabled(false);
            }
            if (bookedSeats.contains(seat19B.getText()) || seatsOfOppClass.contains(seat19B.getText())){
                seat19B.setBackground(new Color(0xF55353));
                seat19B.setEnabled(false);
            }
            if (bookedSeats.contains(seat19C.getText()) || seatsOfOppClass.contains(seat19C.getText())){
                seat19C.setBackground(new Color(0xF55353));
                seat19C.setEnabled(false);
            }
            if (bookedSeats.contains(seat19D.getText()) || seatsOfOppClass.contains(seat19D.getText())){
                seat19D.setBackground(new Color(0xF55353));
                seat19D.setEnabled(false);
            }
            if(bookedSeats.contains(seat19E.getText()) || seatsOfOppClass.contains(seat19E.getText())){
                seat19E.setBackground(new Color(0xF55353));
                seat19E.setEnabled(false);
            }
            if (bookedSeats.contains(seat19F.getText()) || seatsOfOppClass.contains(seat19F.getText())){
                seat19F.setBackground(new Color(0xF55353));
                seat19F.setEnabled(false);
            }

            if (bookedSeats.contains(seat20A.getText()) || seatsOfOppClass.contains(seat20A.getText())){
                seat20A.setBackground(new Color(0xF55353));
                seat20A.setEnabled(false);
            }
            if (bookedSeats.contains(seat20B.getText()) || seatsOfOppClass.contains(seat20B.getText())){
                seat20B.setBackground(new Color(0xF55353));
                seat20B.setEnabled(false);
            }
            if (bookedSeats.contains(seat20C.getText()) || seatsOfOppClass.contains(seat20C.getText())){
                seat20C.setBackground(new Color(0xF55353));
                seat20C.setEnabled(false);
            }
            if (bookedSeats.contains(seat20D.getText()) || seatsOfOppClass.contains(seat20D.getText())){
                seat20D.setBackground(new Color(0xF55353));
                seat20D.setEnabled(false);
            }
            if(bookedSeats.contains(seat20E.getText()) || seatsOfOppClass.contains(seat20E.getText())){
                seat20E.setBackground(new Color(0xF55353));
                seat20E.setEnabled(false);
            }
            if (bookedSeats.contains(seat20F.getText()) || seatsOfOppClass.contains(seat20F.getText())){
                seat20F.setBackground(new Color(0xF55353));
                seat20F.setEnabled(false);
            }

            if (bookedSeats.contains(seat21A.getText()) || seatsOfOppClass.contains(seat21A.getText())){
                seat21A.setBackground(new Color(0xF55353));
                seat21A.setEnabled(false);
            }
            if (bookedSeats.contains(seat21B.getText()) || seatsOfOppClass.contains(seat21B.getText())){
                seat21B.setBackground(new Color(0xF55353));
                seat21B.setEnabled(false);
            }
            if (bookedSeats.contains(seat21C.getText()) || seatsOfOppClass.contains(seat21C.getText())){
                seat21C.setBackground(new Color(0xF55353));
                seat21C.setEnabled(false);
            }
            if (bookedSeats.contains(seat21D.getText()) || seatsOfOppClass.contains(seat21D.getText())){
                seat21D.setBackground(new Color(0xF55353));
                seat21D.setEnabled(false);
            }
            if(bookedSeats.contains(seat21E.getText()) || seatsOfOppClass.contains(seat21E.getText())){
                seat21E.setBackground(new Color(0xF55353));
                seat21E.setEnabled(false);
            }
            if (bookedSeats.contains(seat21F.getText()) || seatsOfOppClass.contains(seat21F.getText())){
                seat21F.setBackground(new Color(0xF55353));
                seat21F.setEnabled(false);
            }

            if (bookedSeats.contains(seat22A.getText()) || seatsOfOppClass.contains(seat22A.getText())){
                seat22A.setBackground(new Color(0xF55353));
                seat22A.setEnabled(false);
            }
            if (bookedSeats.contains(seat22B.getText()) || seatsOfOppClass.contains(seat22B.getText())){
                seat22B.setBackground(new Color(0xF55353));
                seat22B.setEnabled(false);
            }
            if (bookedSeats.contains(seat22C.getText()) || seatsOfOppClass.contains(seat22C.getText())){
                seat22C.setBackground(new Color(0xF55353));
                seat22C.setEnabled(false);
            }
            if (bookedSeats.contains(seat22D.getText()) || seatsOfOppClass.contains(seat22D.getText())){
                seat22D.setBackground(new Color(0xF55353));
                seat22D.setEnabled(false);
            }
            if(bookedSeats.contains(seat22E.getText()) || seatsOfOppClass.contains(seat22E.getText())){
                seat22E.setBackground(new Color(0xF55353));
                seat22E.setEnabled(false);
            }
            if (bookedSeats.contains(seat22F.getText()) || seatsOfOppClass.contains(seat22F.getText())){
                seat22F.setBackground(new Color(0xF55353));
                seat22F.setEnabled(false);
            }

            if (bookedSeats.contains(seat23A.getText()) || seatsOfOppClass.contains(seat23A.getText())){
                seat23A.setBackground(new Color(0xF55353));
                seat23A.setEnabled(false);
            }
            if (bookedSeats.contains(seat23B.getText()) || seatsOfOppClass.contains(seat23B.getText())){
                seat23B.setBackground(new Color(0xF55353));
                seat23B.setEnabled(false);
            }
            if (bookedSeats.contains(seat23C.getText()) || seatsOfOppClass.contains(seat23C.getText())){
                seat23C.setBackground(new Color(0xF55353));
                seat23C.setEnabled(false);
            }
            if (bookedSeats.contains(seat23D.getText()) || seatsOfOppClass.contains(seat23D.getText())){
                seat23D.setBackground(new Color(0xF55353));
                seat23D.setEnabled(false);
            }
            if(bookedSeats.contains(seat23E.getText()) || seatsOfOppClass.contains(seat23E.getText())){
                seat23E.setBackground(new Color(0xF55353));
                seat23E.setEnabled(false);
            }
            if (bookedSeats.contains(seat23F.getText()) || seatsOfOppClass.contains(seat23F.getText())){
                seat23F.setBackground(new Color(0xF55353));
                seat23F.setEnabled(false);
            }

            if (bookedSeats.contains(seat24A.getText()) || seatsOfOppClass.contains(seat24A.getText())){
                seat24A.setBackground(new Color(0xF55353));
                seat24A.setEnabled(false);
            }
            if (bookedSeats.contains(seat24B.getText()) || seatsOfOppClass.contains(seat24B.getText())){
                seat24B.setBackground(new Color(0xF55353));
                seat24B.setEnabled(false);
            }
            if (bookedSeats.contains(seat24C.getText()) || seatsOfOppClass.contains(seat24C.getText())){
                seat24C.setBackground(new Color(0xF55353));
                seat24C.setEnabled(false);
            }
            if (bookedSeats.contains(seat24D.getText()) || seatsOfOppClass.contains(seat24D.getText())){
                seat24D.setBackground(new Color(0xF55353));
                seat24D.setEnabled(false);
            }
            if(bookedSeats.contains(seat24E.getText()) || seatsOfOppClass.contains(seat24E.getText())){
                seat24E.setBackground(new Color(0xF55353));
                seat24E.setEnabled(false);
            }
            if (bookedSeats.contains(seat24F.getText()) || seatsOfOppClass.contains(seat24F.getText())){
                seat24F.setBackground(new Color(0xF55353));
                seat24F.setEnabled(false);
            }
            if (bookedSeats.contains(seat25A.getText()) || seatsOfOppClass.contains(seat25A.getText())){
                seat25A.setBackground(new Color(0xF55353));
                seat25A.setEnabled(false);
            }
            if (bookedSeats.contains(seat25B.getText()) || seatsOfOppClass.contains(seat25B.getText())){
                seat25B.setBackground(new Color(0xF55353));
                seat25B.setEnabled(false);
            }
            if (bookedSeats.contains(seat25C.getText()) || seatsOfOppClass.contains(seat25C.getText())){
                seat25C.setBackground(new Color(0xF55353));
                seat25C.setEnabled(false);
            }
            if (bookedSeats.contains(seat25D.getText()) || seatsOfOppClass.contains(seat25D.getText())){
                seat25D.setBackground(new Color(0xF55353));
                seat25D.setEnabled(false);
            }
            if(bookedSeats.contains(seat25E.getText()) || seatsOfOppClass.contains(seat25E.getText())){
                seat25E.setBackground(new Color(0xF55353));
                seat25E.setEnabled(false);
            }
            if (bookedSeats.contains(seat25F.getText()) || seatsOfOppClass.contains(seat25F.getText())){
                seat25F.setBackground(new Color(0xF55353));
                seat25F.setEnabled(false);
            }
            if (bookedSeats.contains(seat26A.getText()) || seatsOfOppClass.contains(seat26A.getText())){
                seat26A.setBackground(new Color(0xF55353));
                seat26A.setEnabled(false);
            }
            if (bookedSeats.contains(seat26B.getText()) || seatsOfOppClass.contains(seat26B.getText())){
                seat26B.setBackground(new Color(0xF55353));
                seat26B.setEnabled(false);
            }
            if (bookedSeats.contains(seat26C.getText()) || seatsOfOppClass.contains(seat26C.getText())){
                seat26C.setBackground(new Color(0xF55353));
                seat26C.setEnabled(false);
            }
            if (bookedSeats.contains(seat26D.getText()) || seatsOfOppClass.contains(seat26D.getText())){
                seat26D.setBackground(new Color(0xF55353));
                seat26D.setEnabled(false);
            }
            if(bookedSeats.contains(seat26E.getText()) || seatsOfOppClass.contains(seat26E.getText())){
                seat26E.setBackground(new Color(0xF55353));
                seat26E.setEnabled(false);
            }
            if (bookedSeats.contains(seat26F.getText()) || seatsOfOppClass.contains(seat26F.getText())){
                seat26F.setBackground(new Color(0xF55353));
                seat26F.setEnabled(false);
            }
            if (bookedSeats.contains(seat27A.getText()) || seatsOfOppClass.contains(seat27A.getText())){
                seat27A.setBackground(new Color(0xF55353));
                seat27A.setEnabled(false);
            }
            if (bookedSeats.contains(seat27B.getText()) || seatsOfOppClass.contains(seat27B.getText())){
                seat27B.setBackground(new Color(0xF55353));
                seat27B.setEnabled(false);
            }
            if (bookedSeats.contains(seat27C.getText()) || seatsOfOppClass.contains(seat27C.getText())){
                seat27C.setBackground(new Color(0xF55353));
                seat27C.setEnabled(false);
            }
            if (bookedSeats.contains(seat27D.getText()) || seatsOfOppClass.contains(seat27D.getText())){
                seat27D.setBackground(new Color(0xF55353));
                seat27D.setEnabled(false);
            }
            if(bookedSeats.contains(seat27E.getText()) || seatsOfOppClass.contains(seat27E.getText())){
                seat27E.setBackground(new Color(0xF55353));
                seat27E.setEnabled(false);
            }
            if (bookedSeats.contains(seat27F.getText()) || seatsOfOppClass.contains(seat27F.getText())){
                seat27F.setBackground(new Color(0xF55353));
                seat27F.setEnabled(false);
            }
            if (bookedSeats.contains(seat28A.getText()) || seatsOfOppClass.contains(seat28A.getText())){
                seat28A.setBackground(new Color(0xF55353));
                seat28A.setEnabled(false);
            }
            if (bookedSeats.contains(seat28B.getText()) || seatsOfOppClass.contains(seat28B.getText())){
                seat28B.setBackground(new Color(0xF55353));
                seat28B.setEnabled(false);
            }
            if (bookedSeats.contains(seat28C.getText()) || seatsOfOppClass.contains(seat28C.getText())){
                seat28C.setBackground(new Color(0xF55353));
                seat28C.setEnabled(false);
            }
            if (bookedSeats.contains(seat28D.getText()) || seatsOfOppClass.contains(seat28D.getText())){
                seat28D.setBackground(new Color(0xF55353));
                seat28D.setEnabled(false);
            }
            if(bookedSeats.contains(seat28E.getText()) || seatsOfOppClass.contains(seat28E.getText())){
                seat28E.setBackground(new Color(0xF55353));
                seat28E.setEnabled(false);
            }
            if (bookedSeats.contains(seat28F.getText()) || seatsOfOppClass.contains(seat28F.getText())){
                seat28F.setBackground(new Color(0xF55353));
                seat28F.setEnabled(false);
            }
            if (bookedSeats.contains(seat29A.getText()) || seatsOfOppClass.contains(seat29A.getText())){
                seat29A.setBackground(new Color(0xF55353));
                seat29A.setEnabled(false);
            }
            if (bookedSeats.contains(seat29B.getText()) || seatsOfOppClass.contains(seat29B.getText())){
                seat29B.setBackground(new Color(0xF55353));
                seat29B.setEnabled(false);
            }
            if (bookedSeats.contains(seat29C.getText()) || seatsOfOppClass.contains(seat29C.getText())){
                seat29C.setBackground(new Color(0xF55353));
                seat29C.setEnabled(false);
            }
            if (bookedSeats.contains(seat29D.getText()) || seatsOfOppClass.contains(seat29D.getText())){
                seat29D.setBackground(new Color(0xF55353));
                seat29D.setEnabled(false);
            }
            if(bookedSeats.contains(seat29E.getText()) || seatsOfOppClass.contains(seat29E.getText())){
                seat29E.setBackground(new Color(0xF55353));
                seat29E.setEnabled(false);
            }
            if (bookedSeats.contains(seat29F.getText()) || seatsOfOppClass.contains(seat29F.getText())){
                seat29F.setBackground(new Color(0xF55353));
                seat29F.setEnabled(false);
            }
            if (bookedSeats.contains(seat30A.getText()) || seatsOfOppClass.contains(seat30A.getText())){
                seat30A.setBackground(new Color(0xF55353));
                seat30A.setEnabled(false);
            }
            if (bookedSeats.contains(seat30B.getText()) || seatsOfOppClass.contains(seat30B.getText())){
                seat30B.setBackground(new Color(0xF55353));
                seat30B.setEnabled(false);
            }
            if (bookedSeats.contains(seat30C.getText()) || seatsOfOppClass.contains(seat30C.getText())){
                seat30C.setBackground(new Color(0xF55353));
                seat30C.setEnabled(false);
            }
            if (bookedSeats.contains(seat30D.getText()) || seatsOfOppClass.contains(seat30D.getText())){
                seat30D.setBackground(new Color(0xF55353));
                seat30D.setEnabled(false);
            }
            if(bookedSeats.contains(seat30E.getText()) || seatsOfOppClass.contains(seat30E.getText())){
                seat30E.setBackground(new Color(0xF55353));
                seat30E.setEnabled(false);
            }
            if (bookedSeats.contains(seat30F.getText()) || seatsOfOppClass.contains(seat30F.getText())){
                seat30F.setBackground(new Color(0xF55353));
                seat30F.setEnabled(false);
            }
        }


        seat1A.addActionListener(this);
        seat1B.addActionListener(this);
        seat1C.addActionListener(this);
        seat1D.addActionListener(this);
        seat1E.addActionListener(this);
        seat1F.addActionListener(this);
        seat2A.addActionListener(this);
        seat2B.addActionListener(this);
        seat2C.addActionListener(this);
        seat2D.addActionListener(this);
        seat2E.addActionListener(this);
        seat2F.addActionListener(this);
        seat3A.addActionListener(this);
        seat3B.addActionListener(this);
        seat3C.addActionListener(this);
        seat3D.addActionListener(this);
        seat3E.addActionListener(this);
        seat3F.addActionListener(this);
        seat4A.addActionListener(this);
        seat4B.addActionListener(this);
        seat4C.addActionListener(this);
        seat4D.addActionListener(this);
        seat4E.addActionListener(this);
        seat4F.addActionListener(this);
        seat5A.addActionListener(this);
        seat5B.addActionListener(this);
        seat5C.addActionListener(this);
        seat5D.addActionListener(this);
        seat5E.addActionListener(this);
        seat5F.addActionListener(this);
        seat6A.addActionListener(this);
        seat6B.addActionListener(this);
        seat6C.addActionListener(this);
        seat6D.addActionListener(this);
        seat6E.addActionListener(this);
        seat6F.addActionListener(this);
        seat7A.addActionListener(this);
        seat7B.addActionListener(this);
        seat7C.addActionListener(this);
        seat7D.addActionListener(this);
        seat7E.addActionListener(this);
        seat7F.addActionListener(this);
        seat8A.addActionListener(this);
        seat8B.addActionListener(this);
        seat8C.addActionListener(this);
        seat8D.addActionListener(this);
        seat8E.addActionListener(this);
        seat8F.addActionListener(this);
        seat9A.addActionListener(this);
        seat9B.addActionListener(this);
        seat9C.addActionListener(this);
        seat9D.addActionListener(this);
        seat9E.addActionListener(this);
        seat9F.addActionListener(this);
        seat10A.addActionListener(this);
        seat10B.addActionListener(this);
        seat10C.addActionListener(this);
        seat10D.addActionListener(this);
        seat10E.addActionListener(this);
        seat10F.addActionListener(this);
        seat11A.addActionListener(this);
        seat11B.addActionListener(this);
        seat11C.addActionListener(this);
        seat11D.addActionListener(this);
        seat11E.addActionListener(this);
        seat11F.addActionListener(this);
        seat12A.addActionListener(this);
        seat12B.addActionListener(this);
        seat12C.addActionListener(this);
        seat12D.addActionListener(this);
        seat12E.addActionListener(this);
        seat12F.addActionListener(this);
        seat13A.addActionListener(this);
        seat13B.addActionListener(this);
        seat13C.addActionListener(this);
        seat13D.addActionListener(this);
        seat13E.addActionListener(this);
        seat13F.addActionListener(this);
        seat14A.addActionListener(this);
        seat14B.addActionListener(this);
        seat14C.addActionListener(this);
        seat14D.addActionListener(this);
        seat14E.addActionListener(this);
        seat14F.addActionListener(this);
        seat15A.addActionListener(this);
        seat15B.addActionListener(this);
        seat15C.addActionListener(this);
        seat15D.addActionListener(this);
        seat15E.addActionListener(this);
        seat15F.addActionListener(this);
        seat16A.addActionListener(this);
        seat16B.addActionListener(this);
        seat16C.addActionListener(this);
        seat16D.addActionListener(this);
        seat16E.addActionListener(this);
        seat16F.addActionListener(this);
        seat17A.addActionListener(this);
        seat17B.addActionListener(this);
        seat17C.addActionListener(this);
        seat17D.addActionListener(this);
        seat17E.addActionListener(this);
        seat17F.addActionListener(this);
        seat18A.addActionListener(this);
        seat18B.addActionListener(this);
        seat18C.addActionListener(this);
        seat18D.addActionListener(this);
        seat18E.addActionListener(this);
        seat18F.addActionListener(this);
        seat19A.addActionListener(this);
        seat19B.addActionListener(this);
        seat19C.addActionListener(this);
        seat19D.addActionListener(this);
        seat19E.addActionListener(this);
        seat19F.addActionListener(this);
        seat20A.addActionListener(this);
        seat20B.addActionListener(this);
        seat20C.addActionListener(this);
        seat20D.addActionListener(this);
        seat20E.addActionListener(this);
        seat20F.addActionListener(this);
        seat21A.addActionListener(this);
        seat21B.addActionListener(this);
        seat21C.addActionListener(this);
        seat21D.addActionListener(this);
        seat21E.addActionListener(this);
        seat21F.addActionListener(this);
        seat22A.addActionListener(this);
        seat22B.addActionListener(this);
        seat22C.addActionListener(this);
        seat22D.addActionListener(this);
        seat22E.addActionListener(this);
        seat22F.addActionListener(this);
        seat23A.addActionListener(this);
        seat23B.addActionListener(this);
        seat23C.addActionListener(this);
        seat23D.addActionListener(this);
        seat23E.addActionListener(this);
        seat23F.addActionListener(this);
        seat24A.addActionListener(this);
        seat24B.addActionListener(this);
        seat24C.addActionListener(this);
        seat24D.addActionListener(this);
        seat24E.addActionListener(this);
        seat24F.addActionListener(this);
        seat25A.addActionListener(this);
        seat25B.addActionListener(this);
        seat25C.addActionListener(this);
        seat25D.addActionListener(this);
        seat25E.addActionListener(this);
        seat25F.addActionListener(this);
        seat26A.addActionListener(this);
        seat26B.addActionListener(this);
        seat26C.addActionListener(this);
        seat26D.addActionListener(this);
        seat26E.addActionListener(this);
        seat26F.addActionListener(this);
        seat27A.addActionListener(this);
        seat27B.addActionListener(this);
        seat27C.addActionListener(this);
        seat27D.addActionListener(this);
        seat27E.addActionListener(this);
        seat27F.addActionListener(this);
        seat28A.addActionListener(this);
        seat28B.addActionListener(this);
        seat28C.addActionListener(this);
        seat28D.addActionListener(this);
        seat28E.addActionListener(this);
        seat28F.addActionListener(this);
        seat29A.addActionListener(this);
        seat29B.addActionListener(this);
        seat29C.addActionListener(this);
        seat29D.addActionListener(this);
        seat29E.addActionListener(this);
        seat29F.addActionListener(this);
        seat30A.addActionListener(this);
        seat30B.addActionListener(this);
        seat30C.addActionListener(this);
        seat30D.addActionListener(this);
        seat30E.addActionListener(this);
        seat30F.addActionListener(this);

        //this.addWindowListener(new WindowEventHandler(userID, flightID, seatClass));
        this.setSize(1250, 520);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground( new Color(127, 208, 234) );
        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(business);
        this.add(economy);


        this.add(availableSeatsButton);
        this.add(availableSeatsLabel);
        this.add(unavailableSeatsButton);
        this.add(unavailableSeatsLabel);


        this.add(confirm);

        this.add(seat1A);
        this.add(seat1B);
        this.add(seat1C);
        this.add(seat1D);
        this.add(seat1E);
        this.add(seat1F);
        this.add(seat2A);
        this.add(seat2B);
        this.add(seat2C);
        this.add(seat2D);
        this.add(seat2E);
        this.add(seat2F);
        this.add(seat3A);
        this.add(seat3B);
        this.add(seat3C);
        this.add(seat3D);
        this.add(seat3E);
        this.add(seat3F);
        this.add(seat4A);
        this.add(seat4B);
        this.add(seat4C);
        this.add(seat4D);
        this.add(seat4E);
        this.add(seat4F);
        this.add(seat5A);
        this.add(seat5B);
        this.add(seat5C);
        this.add(seat5D);
        this.add(seat5E);
        this.add(seat5F);
        this.add(seat6A);
        this.add(seat6B);
        this.add(seat6C);
        this.add(seat6D);
        this.add(seat6E);
        this.add(seat6F);
        this.add(seat7A);
        this.add(seat7B);
        this.add(seat7C);
        this.add(seat7D);
        this.add(seat7E);
        this.add(seat7F);
        this.add(seat8A);
        this.add(seat8B);
        this.add(seat8C);
        this.add(seat8D);
        this.add(seat8E);
        this.add(seat8F);
        this.add(seat9A);
        this.add(seat9B);
        this.add(seat9C);
        this.add(seat9D);
        this.add(seat9E);
        this.add(seat9F);
        this.add(seat10A);
        this.add(seat10B);
        this.add(seat10C);
        this.add(seat10D);
        this.add(seat10E);
        this.add(seat10F);
        this.add(seat11A);
        this.add(seat11B);
        this.add(seat11C);
        this.add(seat11D);
        this.add(seat11E);
        this.add(seat11F);
        this.add(seat12A);
        this.add(seat12B);
        this.add(seat12C);
        this.add(seat12D);
        this.add(seat12E);
        this.add(seat12F);
        this.add(seat13A);
        this.add(seat13B);
        this.add(seat13C);
        this.add(seat13D);
        this.add(seat13E);
        this.add(seat13F);
        this.add(seat14A);
        this.add(seat14B);
        this.add(seat14C);
        this.add(seat14D);
        this.add(seat14E);
        this.add(seat14F);
        this.add(seat15A);
        this.add(seat15B);
        this.add(seat15C);
        this.add(seat15D);
        this.add(seat15E);
        this.add(seat15F);
        this.add(seat16A);
        this.add(seat16B);
        this.add(seat16C);
        this.add(seat16D);
        this.add(seat16E);
        this.add(seat16F);
        this.add(seat17A);
        this.add(seat17B);
        this.add(seat17C);
        this.add(seat17D);
        this.add(seat17E);
        this.add(seat17F);
        this.add(seat18A);
        this.add(seat18B);
        this.add(seat18C);
        this.add(seat18D);
        this.add(seat18E);
        this.add(seat18F);
        this.add(seat19A);
        this.add(seat19B);
        this.add(seat19C);
        this.add(seat19D);
        this.add(seat19E);
        this.add(seat19F);
        this.add(seat20A);
        this.add(seat20B);
        this.add(seat20C);
        this.add(seat20D);
        this.add(seat20E);
        this.add(seat20F);
        this.add(seat21A);
        this.add(seat21B);
        this.add(seat21C);
        this.add(seat21D);
        this.add(seat21E);
        this.add(seat21F);
        this.add(seat22A);
        this.add(seat22B);
        this.add(seat22C);
        this.add(seat22D);
        this.add(seat22E);
        this.add(seat22F);
        this.add(seat23A);
        this.add(seat23B);
        this.add(seat23C);
        this.add(seat23D);
        this.add(seat23E);
        this.add(seat23F);
        this.add(seat24A);
        this.add(seat24B);
        this.add(seat24C);
        this.add(seat24D);
        this.add(seat24E);
        this.add(seat24F);
        this.add(seat25A);
        this.add(seat25B);
        this.add(seat25C);
        this.add(seat25D);
        this.add(seat25E);
        this.add(seat25F);
        this.add(seat26A);
        this.add(seat26B);
        this.add(seat26C);
        this.add(seat26D);
        this.add(seat26E);
        this.add(seat26F);
        this.add(seat27A);
        this.add(seat27B);
        this.add(seat27C);
        this.add(seat27D);
        this.add(seat27E);
        this.add(seat27F);
        this.add(seat28A);
        this.add(seat28B);
        this.add(seat28C);
        this.add(seat28D);
        this.add(seat28E);
        this.add(seat28F);
        this.add(seat29A);
        this.add(seat29B);
        this.add(seat29C);
        this.add(seat29D);
        this.add(seat29E);
        this.add(seat29F);
        this.add(seat30A);
        this.add(seat30B);
        this.add(seat30C);
        this.add(seat30D);
        this.add(seat30E);
        this.add(seat30F);
        
        

    }

    public static void main(String[] args) {
        new SeatingButtonsFrame(1, 3, Datasource.ECONOMY_CLASS, 3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==seat1A){
            if (seat1AClicked == false){
                seat1A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1A.getText());
                seat1AClicked = true;
            } else{
                seat1A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1A.getText());
                seat1AClicked = false;
            }
            buttonClicked = seat1A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat1B){
            if (seat1BClicked == false){
                seat1B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1B.getText());
                seat1BClicked = true;
            } else{
                seat1B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1B.getText());
                seat1BClicked = false;
            }
            buttonClicked = seat1B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat1C){
            if (seat1CClicked == false){
                seat1C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1C.getText());
                seat1CClicked = true;
            } else{
                seat1C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1C.getText());
                seat1CClicked = false;
            }
            buttonClicked = seat1C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat1D){
            if (seat1DClicked == false){
                seat1D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1D.getText());
                seat1DClicked = true;
            } else{
                seat1D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1D.getText());
                seat1DClicked = false;
            }
            buttonClicked = seat1D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat1E){
            if (seat1EClicked == false){
                seat1E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1E.getText());
                seat1EClicked = true;
            } else{
                seat1E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1E.getText());
                seat1EClicked = false;
            }
            buttonClicked = seat1E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat1F){
            if (seat1FClicked == false){
                seat1F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat1F.getText());
                seat1FClicked = true;
            } else{
                seat1F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat1F.getText());
                seat1FClicked = false;
            }
            buttonClicked = seat1F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2A){
            if (seat2AClicked == false){
                seat2A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2A.getText());
                seat2AClicked = true;
            } else{
                seat2A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2A.getText());
                seat2AClicked = false;
            }
            buttonClicked = seat2A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2B){
            if (seat2BClicked == false){
                seat2B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2B.getText());
                seat2BClicked = true;
            } else{
                seat2B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2B.getText());
                seat2BClicked = false;
            }
            buttonClicked = seat2B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2C){
            if (seat2CClicked == false){
                seat2C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2C.getText());
                seat2CClicked = true;
            } else{
                seat2C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2C.getText());
                seat2CClicked = false;
            }
            buttonClicked = seat2C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2D){
            if (seat2DClicked == false){
                seat2D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2D.getText());
                seat2DClicked = true;
            } else{
                seat2D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2D.getText());
                seat2DClicked = false;
            }
            buttonClicked = seat2D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2E){
            if (seat2EClicked == false){
                seat2E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2E.getText());
                seat2EClicked = true;
            } else{
                seat2E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2E.getText());
                seat2EClicked = false;
            }
            buttonClicked = seat2E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat2F){
            if (seat2FClicked == false){
                seat2F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat2F.getText());
                seat2FClicked = true;
            } else{
                seat2F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat2F.getText());
                seat2FClicked = false;
            }
            buttonClicked = seat2F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat3A){
            if (seat3AClicked == false){
                seat3A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3A.getText());
                seat3AClicked = true;
            } else{
                seat3A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3A.getText());
                seat3AClicked = false;
            }
            buttonClicked = seat3A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat3B){
            if (seat3BClicked == false){
                seat3B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3B.getText());
                seat3BClicked = true;
            } else{
                seat3B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3B.getText());
                seat3BClicked = false;
            }
            buttonClicked = seat3B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat3C){
            if (seat3CClicked == false){
                seat3C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3C.getText());
                seat3CClicked = true;
            } else{
                seat3C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3C.getText());
                seat3CClicked = false;
            }
            buttonClicked = seat3C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat3D){
            if (seat3DClicked == false){
                seat3D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3D.getText());
                seat3DClicked = true;
            } else{
                seat3D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3D.getText());
                seat3DClicked = false;
            }
            buttonClicked = seat3D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat3E){
            if (seat3EClicked == false){
                seat3E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3E.getText());
                seat3EClicked = true;
            } else{
                seat3E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3E.getText());
                seat3EClicked = false;
            }
            buttonClicked = seat3E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat3F){
            if (seat3FClicked == false){
                seat3F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat3F.getText());
                seat3FClicked = true;
            } else{
                seat3F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat3F.getText());
                seat3FClicked = false;
            }
            buttonClicked = seat3F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat4A){
            if (seat4AClicked == false){
                seat4A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4A.getText());
                seat4AClicked = true;
            } else{
                seat4A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4A.getText());
                seat4AClicked = false;
            }
            buttonClicked = seat4A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat4B){
            if (seat4BClicked == false){
                seat4B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4B.getText());
                seat4BClicked = true;
            } else{
                seat4B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4B.getText());
                seat4BClicked = false;
            }
            buttonClicked = seat4B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat4C){
            if (seat4CClicked == false){
                seat4C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4C.getText());
                seat4CClicked = true;
            } else{
                seat4C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4C.getText());
                seat4CClicked = false;
            }
            buttonClicked = seat4C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat4D){
            if (seat4DClicked == false){
                seat4D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4D.getText());
                seat4DClicked = true;
            } else{
                seat4D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4D.getText());
                seat4DClicked = false;
            }
            buttonClicked = seat4D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat4E){
            if (seat4EClicked == false){
                seat4E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4E.getText());
                seat4EClicked = true;
            } else{
                seat4E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4E.getText());
                seat4EClicked = false;
            }
            buttonClicked = seat4E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat4F){
            if (seat4FClicked == false){
                seat4F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat4F.getText());
                seat4FClicked = true;
            } else{
                seat4F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat4F.getText());
                seat4FClicked = false;
            }
            buttonClicked = seat4F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat5A){
            if (seat5AClicked == false){
                seat5A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5A.getText());
                seat5AClicked = true;
            } else{
                seat5A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5A.getText());
                seat5AClicked = false;
            }
            buttonClicked = seat5A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat5B){
            if (seat5BClicked == false){
                seat5B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5B.getText());
                seat5BClicked = true;
            } else{
                seat5B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5B.getText());
                seat5BClicked = false;
            }
            buttonClicked = seat5B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat5C){
            if (seat5CClicked == false){
                seat5C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5C.getText());
                seat5CClicked = true;
            } else{
                seat5C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5C.getText());
                seat5CClicked = false;
            }
            buttonClicked = seat5C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat5D){
            if (seat5DClicked == false){
                seat5D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5D.getText());
                seat5DClicked = true;
            } else{
                seat5D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5D.getText());
                seat5DClicked = false;
            }
            buttonClicked = seat5D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat5E){
            if (seat5EClicked == false){
                seat5E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5E.getText());
                seat5EClicked = true;
            } else{
                seat5E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5E.getText());
                seat5EClicked = false;
            }
            buttonClicked = seat5E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat5F){
            if (seat5FClicked == false){
                seat5F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat5F.getText());
                seat5FClicked = true;
            } else{
                seat5F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat5F.getText());
                seat5FClicked = false;
            }
            buttonClicked = seat5F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat6A){
            if (seat6AClicked == false){
                seat6A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6A.getText());
                seat6AClicked = true;
            } else{
                seat6A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6A.getText());
                seat6AClicked = false;
            }
            buttonClicked = seat6A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat6B){
            if (seat6BClicked == false){
                seat6B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6B.getText());
                seat6BClicked = true;
            } else{
                seat6B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6B.getText());
                seat6BClicked = false;
            }
            buttonClicked = seat6B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat6C){
            if (seat6CClicked == false){
                seat6C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6C.getText());
                seat6CClicked = true;
            } else{
                seat6C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6C.getText());
                seat6CClicked = false;
            }
            buttonClicked = seat6C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat6D){
            if (seat6DClicked == false){
                seat6D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6D.getText());
                seat6DClicked = true;
            } else{
                seat6D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6D.getText());
                seat6DClicked = false;
            }
            buttonClicked = seat6D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat6E){
            if (seat6EClicked == false){
                seat6E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6E.getText());
                seat6EClicked = true;
            } else{
                seat6E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6E.getText());
                seat6EClicked = false;
            }
            buttonClicked = seat6E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat6F){
            if (seat6FClicked == false){
                seat6F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat6F.getText());
                seat6FClicked = true;
            } else{
                seat6F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat6F.getText());
                seat6FClicked = false;
            }
            buttonClicked = seat6F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat7A){
            if (seat7AClicked == false){
                seat7A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7A.getText());
                seat7AClicked = true;
            } else{
                seat7A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7A.getText());
                seat7AClicked = false;
            }
            buttonClicked = seat7A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat7B){
            if (seat7BClicked == false){
                seat7B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7B.getText());
                seat7BClicked = true;
            } else{
                seat7B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7B.getText());
                seat7BClicked = false;
            }
            buttonClicked = seat7B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat7C){
            if (seat7CClicked == false){
                seat7C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7C.getText());
                seat7CClicked = true;
            } else{
                seat7C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7C.getText());
                seat7CClicked = false;
            }
            buttonClicked = seat7C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat7D){
            if (seat7DClicked == false){
                seat7D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7D.getText());
                seat7DClicked = true;
            } else{
                seat7D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7D.getText());
                seat7DClicked = false;
            }
            buttonClicked = seat7D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat7E){
            if (seat7EClicked == false){
                seat7E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7E.getText());
                seat7EClicked = true;
            } else{
                seat7E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7E.getText());
                seat7EClicked = false;
            }
            buttonClicked = seat7E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat7F){
            if (seat7FClicked == false){
                seat7F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat7F.getText());
                seat7FClicked = true;
            } else{
                seat7F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat7F.getText());
                seat7FClicked = false;
            }
            buttonClicked = seat7F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat8A){
            if (seat8AClicked == false){
                seat8A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8A.getText());
                seat8AClicked = true;
            } else{
                seat8A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8A.getText());
                seat8AClicked = false;
            }
            buttonClicked = seat8A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat8B){
            if (seat8BClicked == false){
                seat8B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8B.getText());
                seat8BClicked = true;
            } else{
                seat8B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8B.getText());
                seat8BClicked = false;
            }
            buttonClicked = seat8B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat8C){
            if (seat8CClicked == false){
                seat8C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8C.getText());
                seat8CClicked = true;
            } else{
                seat8C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8C.getText());
                seat8CClicked = false;
            }
            buttonClicked = seat8C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat8D){
            if (seat8DClicked == false){
                seat8D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8D.getText());
                seat8DClicked = true;
            } else{
                seat8D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8D.getText());
                seat8DClicked = false;
            }
            buttonClicked = seat8D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat8E){
            if (seat8EClicked == false){
                seat8E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8E.getText());
                seat8EClicked = true;
            } else{
                seat8E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8E.getText());
                seat8EClicked = false;
            }
            buttonClicked = seat8E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat8F){
            if (seat8FClicked == false){
                seat8F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat8F.getText());
                seat8FClicked = true;
            } else{
                seat8F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat8F.getText());
                seat8FClicked = false;
            }
            buttonClicked = seat8F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat9A){
            if (seat9AClicked == false){
                seat9A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9A.getText());
                seat9AClicked = true;
            } else{
                seat9A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9A.getText());
                seat9AClicked = false;
            }
            buttonClicked = seat9A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat9B){
            if (seat9BClicked == false){
                seat9B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9B.getText());
                seat9BClicked = true;
            } else{
                seat9B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9B.getText());
                seat9BClicked = false;
            }
            buttonClicked = seat9B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat9C){
            if (seat9CClicked == false){
                seat9C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9C.getText());
                seat9CClicked = true;
            } else{
                seat9C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9C.getText());
                seat9CClicked = false;
            }
            buttonClicked = seat9C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat9D){
            if (seat9DClicked == false){
                seat9D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9D.getText());
                seat9DClicked = true;
            } else{
                seat9D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9D.getText());
                seat9DClicked = false;
            }
            buttonClicked = seat9D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat9E){
            if (seat9EClicked == false){
                seat9E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9E.getText());
                seat9EClicked = true;
            } else{
                seat9E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9E.getText());
                seat9EClicked = false;
            }
            buttonClicked = seat9E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat9F){
            if (seat9FClicked == false){
                seat9F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat9F.getText());
                seat9FClicked = true;
            } else{
                seat9F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat9F.getText());
                seat9FClicked = false;
            }
            buttonClicked = seat9F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat10A){
            if (seat10AClicked == false){
                seat10A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10A.getText());
                seat10AClicked = true;
            } else{
                seat10A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10A.getText());
                seat10AClicked = false;
            }
            buttonClicked = seat10A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat10B){
            if (seat10BClicked == false){
                seat10B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10B.getText());
                seat10BClicked = true;
            } else{
                seat10B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10B.getText());
                seat10BClicked = false;
            }
            buttonClicked = seat10B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat10C){
            if (seat10CClicked == false){
                seat10C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10C.getText());
                seat10CClicked = true;
            } else{
                seat10C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10C.getText());
                seat10CClicked = false;
            }
            buttonClicked = seat10C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat10D){
            if (seat10DClicked == false){
                seat10D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10D.getText());
                seat10DClicked = true;
            } else{
                seat10D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10D.getText());
                seat10DClicked = false;
            }
            buttonClicked = seat10D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat10E){
            if (seat10EClicked == false){
                seat10E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10E.getText());
                seat10EClicked = true;
            } else{
                seat10E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10E.getText());
                seat10EClicked = false;
            }
            buttonClicked = seat10E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat10F){
            if (seat10FClicked == false){
                seat10F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat10F.getText());
                seat10FClicked = true;
            } else{
                seat10F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat10F.getText());
                seat10FClicked = false;
            }
            buttonClicked = seat10F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat11A){
            if (seat11AClicked == false){
                seat11A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11A.getText());
                seat11AClicked = true;
            } else{
                seat11A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11A.getText());
                seat11AClicked = false;
            }
            buttonClicked = seat11A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat11B){
            if (seat11BClicked == false){
                seat11B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11B.getText());
                seat11BClicked = true;
            } else{
                seat11B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11B.getText());
                seat11BClicked = false;
            }
            buttonClicked = seat11B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat11C){
            if (seat11CClicked == false){
                seat11C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11C.getText());
                seat11CClicked = true;
            } else{
                seat11C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11C.getText());
                seat11CClicked = false;
            }
            buttonClicked = seat11C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat11D){
            if (seat11DClicked == false){
                seat11D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11D.getText());
                seat11DClicked = true;
            } else{
                seat11D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11D.getText());
                seat11DClicked = false;
            }
            buttonClicked = seat11D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat11E){
            if (seat11EClicked == false){
                seat11E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11E.getText());
                seat11EClicked = true;
            } else{
                seat11E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11E.getText());
                seat11EClicked = false;
            }
            buttonClicked = seat11E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat11F){
            if (seat11FClicked == false){
                seat11F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat11F.getText());
                seat11FClicked = true;
            } else{
                seat11F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat11F.getText());
                seat11FClicked = false;
            }
            buttonClicked = seat11F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat12A){
            if (seat12AClicked == false){
                seat12A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12A.getText());
                seat12AClicked = true;
            } else{
                seat12A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12A.getText());
                seat12AClicked = false;
            }
            buttonClicked = seat12A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat12B){
            if (seat12BClicked == false){
                seat12B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12B.getText());
                seat12BClicked = true;
            } else{
                seat12B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12B.getText());
                seat12BClicked = false;
            }
            buttonClicked = seat12B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat12C){
            if (seat12CClicked == false){
                seat12C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12C.getText());
                seat12CClicked = true;
            } else{
                seat12C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12C.getText());
                seat12CClicked = false;
            }
            buttonClicked = seat12C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat12D){
            if (seat12DClicked == false){
                seat12D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12D.getText());
                seat12DClicked = true;
            } else{
                seat12D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12D.getText());
                seat12DClicked = false;
            }
            buttonClicked = seat12D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat12E){
            if (seat12EClicked == false){
                seat12E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12E.getText());
                seat12EClicked = true;
            } else{
                seat12E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12E.getText());
                seat12EClicked = false;
            }
            buttonClicked = seat12E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat12F){
            if (seat12FClicked == false){
                seat12F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat12F.getText());
                seat12FClicked = true;
            } else{
                seat12F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat12F.getText());
                seat12FClicked = false;
            }
            buttonClicked = seat12F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat13A){
            if (seat13AClicked == false){
                seat13A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13A.getText());
                seat13AClicked = true;
            } else{
                seat13A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13A.getText());
                seat13AClicked = false;
            }
            buttonClicked = seat13A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat13B){
            if (seat13BClicked == false){
                seat13B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13B.getText());
                seat13BClicked = true;
            } else{
                seat13B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13B.getText());
                seat13BClicked = false;
            }
            buttonClicked = seat13B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat13C){
            if (seat13CClicked == false){
                seat13C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13C.getText());
                seat13CClicked = true;
            } else{
                seat13C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13C.getText());
                seat13CClicked = false;
            }
            buttonClicked = seat13C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat13D){
            if (seat13DClicked == false){
                seat13D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13D.getText());
                seat13DClicked = true;
            } else{
                seat13D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13D.getText());
                seat13DClicked = false;
            }
            buttonClicked = seat13D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat13E){
            if (seat13EClicked == false){
                seat13E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13E.getText());
                seat13EClicked = true;
            } else{
                seat13E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13E.getText());
                seat13EClicked = false;
            }
            buttonClicked = seat13E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat13F){
            if (seat13FClicked == false){
                seat13F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat13F.getText());
                seat13FClicked = true;
            } else{
                seat13F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat13F.getText());
                seat13FClicked = false;
            }
            buttonClicked = seat13F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat14A){
            if (seat14AClicked == false){
                seat14A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14A.getText());
                seat14AClicked = true;
            } else{
                seat14A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14A.getText());
                seat14AClicked = false;
            }
            buttonClicked = seat14A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat14B){
            if (seat14BClicked == false){
                seat14B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14B.getText());
                seat14BClicked = true;
            } else{
                seat14B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14B.getText());
                seat14BClicked = false;
            }
            buttonClicked = seat14B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat14C){
            if (seat14CClicked == false){
                seat14C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14C.getText());
                seat14CClicked = true;
            } else{
                seat14C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14C.getText());
                seat14CClicked = false;
            }
            buttonClicked = seat14C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat14D){
            if (seat14DClicked == false){
                seat14D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14D.getText());
                seat14DClicked = true;
            } else{
                seat14D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14D.getText());
                seat14DClicked = false;
            }
            buttonClicked = seat14D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat14E){
            if (seat14EClicked == false){
                seat14E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14E.getText());
                seat14EClicked = true;
            } else{
                seat14E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14E.getText());
                seat14EClicked = false;
            }
            buttonClicked = seat14E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat14F){
            if (seat14FClicked == false){
                seat14F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat14F.getText());
                seat14FClicked = true;
            } else{
                seat14F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat14F.getText());
                seat14FClicked = false;
            }
            buttonClicked = seat14F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat15A){
            if (seat15AClicked == false){
                seat15A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15A.getText());
                seat15AClicked = true;
            } else{
                seat15A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15A.getText());
                seat15AClicked = false;
            }
            buttonClicked = seat15A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat15B){
            if (seat15BClicked == false){
                seat15B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15B.getText());
                seat15BClicked = true;
            } else{
                seat15B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15B.getText());
                seat15BClicked = false;
            }
            buttonClicked = seat15B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat15C){
            if (seat15CClicked == false){
                seat15C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15C.getText());
                seat15CClicked = true;
            } else{
                seat15C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15C.getText());
                seat15CClicked = false;
            }
            buttonClicked = seat15C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat15D){
            if (seat15DClicked == false){
                seat15D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15D.getText());
                seat15DClicked = true;
            } else{
                seat15D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15D.getText());
                seat15DClicked = false;
            }
            buttonClicked = seat15D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat15E){
            if (seat15EClicked == false){
                seat15E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15E.getText());
                seat15EClicked = true;
            } else{
                seat15E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15E.getText());
                seat15EClicked = false;
            }
            buttonClicked = seat15E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat15F){
            if (seat15FClicked == false){
                seat15F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat15F.getText());
                seat15FClicked = true;
            } else{
                seat15F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat15F.getText());
                seat15FClicked = false;
            }
            buttonClicked = seat15F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat16A){
            if (seat16AClicked == false){
                seat16A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16A.getText());
                seat16AClicked = true;
            } else{
                seat16A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16A.getText());
                seat16AClicked = false;
            }
            buttonClicked = seat16A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat16B){
            if (seat16BClicked == false){
                seat16B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16B.getText());
                seat16BClicked = true;
            } else{
                seat16B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16B.getText());
                seat16BClicked = false;
            }
            buttonClicked = seat16B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat16C){
            if (seat16CClicked == false){
                seat16C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16C.getText());
                seat16CClicked = true;
            } else{
                seat16C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16C.getText());
                seat16CClicked = false;
            }
            buttonClicked = seat16C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat16D){
            if (seat16DClicked == false){
                seat16D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16D.getText());
                seat16DClicked = true;
            } else{
                seat16D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16D.getText());
                seat16DClicked = false;
            }
            buttonClicked = seat16D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat16E){
            if (seat16EClicked == false){
                seat16E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16E.getText());
                seat16EClicked = true;
            } else{
                seat16E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16E.getText());
                seat16EClicked = false;
            }
            buttonClicked = seat16E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat16F){
            if (seat16FClicked == false){
                seat16F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat16F.getText());
                seat16FClicked = true;
            } else{
                seat16F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat16F.getText());
                seat16FClicked = false;
            }
            buttonClicked = seat16F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat17A){
            if (seat17AClicked == false){
                seat17A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17A.getText());
                seat17AClicked = true;
            } else{
                seat17A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17A.getText());
                seat17AClicked = false;
            }
            buttonClicked = seat17A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat17B){
            if (seat17BClicked == false){
                seat17B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17B.getText());
                seat17BClicked = true;
            } else{
                seat17B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17B.getText());
                seat17BClicked = false;
            }
            buttonClicked = seat17B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat17C){
            if (seat17CClicked == false){
                seat17C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17C.getText());
                seat17CClicked = true;
            } else{
                seat17C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17C.getText());
                seat17CClicked = false;
            }
            buttonClicked = seat17C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat17D){
            if (seat17DClicked == false){
                seat17D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17D.getText());
                seat17DClicked = true;
            } else{
                seat17D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17D.getText());
                seat17DClicked = false;
            }
            buttonClicked = seat17D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat17E){
            if (seat17EClicked == false){
                seat17E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17E.getText());
                seat17EClicked = true;
            } else{
                seat17E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17E.getText());
                seat17EClicked = false;
            }
            buttonClicked = seat17E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat17F){
            if (seat17FClicked == false){
                seat17F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat17F.getText());
                seat17FClicked = true;
            } else{
                seat17F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat17F.getText());
                seat17FClicked = false;
            }
            buttonClicked = seat17F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat18A){
            if (seat18AClicked == false){
                seat18A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18A.getText());
                seat18AClicked = true;
            } else{
                seat18A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18A.getText());
                seat18AClicked = false;
            }
            buttonClicked = seat18A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat18B){
            if (seat18BClicked == false){
                seat18B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18B.getText());
                seat18BClicked = true;
            } else{
                seat18B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18B.getText());
                seat18BClicked = false;
            }
            buttonClicked = seat18B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat18C){
            if (seat18CClicked == false){
                seat18C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18C.getText());
                seat18CClicked = true;
            } else{
                seat18C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18C.getText());
                seat18CClicked = false;
            }
            buttonClicked = seat18C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat18D){
            if (seat18DClicked == false){
                seat18D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18D.getText());
                seat18DClicked = true;
            } else{
                seat18D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18D.getText());
                seat18DClicked = false;
            }
            buttonClicked = seat18D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat18E){
            if (seat18EClicked == false){
                seat18E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18E.getText());
                seat18EClicked = true;
            } else{
                seat18E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18E.getText());
                seat18EClicked = false;
            }
            buttonClicked = seat18E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat18F){
            if (seat18FClicked == false){
                seat18F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat18F.getText());
                seat18FClicked = true;
            } else{
                seat18F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat18F.getText());
                seat18FClicked = false;
            }
            buttonClicked = seat18F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat19A){
            if (seat19AClicked == false){
                seat19A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19A.getText());
                seat19AClicked = true;
            } else{
                seat19A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19A.getText());
                seat19AClicked = false;
            }
            buttonClicked = seat19A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat19B){
            if (seat19BClicked == false){
                seat19B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19B.getText());
                seat19BClicked = true;
            } else{
                seat19B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19B.getText());
                seat19BClicked = false;
            }
            buttonClicked = seat19B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat19C){
            if (seat19CClicked == false){
                seat19C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19C.getText());
                seat19CClicked = true;
            } else{
                seat19C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19C.getText());
                seat19CClicked = false;
            }
            buttonClicked = seat19C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat19D){
            if (seat19DClicked == false){
                seat19D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19D.getText());
                seat19DClicked = true;
            } else{
                seat19D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19D.getText());
                seat19DClicked = false;
            }
            buttonClicked = seat19D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat19E){
            if (seat19EClicked == false){
                seat19E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19E.getText());
                seat19EClicked = true;
            } else{
                seat19E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19E.getText());
                seat19EClicked = false;
            }
            buttonClicked = seat19E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat19F){
            if (seat19FClicked == false){
                seat19F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat19F.getText());
                seat19FClicked = true;
            } else{
                seat19F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat19F.getText());
                seat19FClicked = false;
            }
            buttonClicked = seat19F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat20A){
            if (seat20AClicked == false){
                seat20A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20A.getText());
                seat20AClicked = true;
            } else{
                seat20A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20A.getText());
                seat20AClicked = false;
            }
            buttonClicked = seat20A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat20B){
            if (seat20BClicked == false){
                seat20B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20B.getText());
                seat20BClicked = true;
            } else{
                seat20B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20B.getText());
                seat20BClicked = false;
            }
            buttonClicked = seat20B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat20C){
            if (seat20CClicked == false){
                seat20C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20C.getText());
                seat20CClicked = true;
            } else{
                seat20C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20C.getText());
                seat20CClicked = false;
            }
            buttonClicked = seat20C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat20D){
            if (seat20DClicked == false){
                seat20D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20D.getText());
                seat20DClicked = true;
            } else{
                seat20D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20D.getText());
                seat20DClicked = false;
            }
            buttonClicked = seat20D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat20E){
            if (seat20EClicked == false){
                seat20E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20E.getText());
                seat20EClicked = true;
            } else{
                seat20E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20E.getText());
                seat20EClicked = false;
            }
            buttonClicked = seat20E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat20F){
            if (seat20FClicked == false){
                seat20F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat20F.getText());
                seat20FClicked = true;
            } else{
                seat20F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat20F.getText());
                seat20FClicked = false;
            }
            buttonClicked = seat20F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat21A){
            if (seat21AClicked == false){
                seat21A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21A.getText());
                seat21AClicked = true;
            } else{
                seat21A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21A.getText());
                seat21AClicked = false;
            }
            buttonClicked = seat21A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat21B){
            if (seat21BClicked == false){
                seat21B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21B.getText());
                seat21BClicked = true;
            } else{
                seat21B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21B.getText());
                seat21BClicked = false;
            }
            buttonClicked = seat21B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat21C){
            if (seat21CClicked == false){
                seat21C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21C.getText());
                seat21CClicked = true;
            } else{
                seat21C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21C.getText());
                seat21CClicked = false;
            }
            buttonClicked = seat21C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat21D){
            if (seat21DClicked == false){
                seat21D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21D.getText());
                seat21DClicked = true;
            } else{
                seat21D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21D.getText());
                seat21DClicked = false;
            }
            buttonClicked = seat21D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat21E){
            if (seat21EClicked == false){
                seat21E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21E.getText());
                seat21EClicked = true;
            } else{
                seat21E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21E.getText());
                seat21EClicked = false;
            }
            buttonClicked = seat21E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat21F){
            if (seat21FClicked == false){
                seat21F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat21F.getText());
                seat21FClicked = true;
            } else{
                seat21F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat21F.getText());
                seat21FClicked = false;
            }
            buttonClicked = seat21F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat22A){
            if (seat22AClicked == false){
                seat22A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22A.getText());
                seat22AClicked = true;
            } else{
                seat22A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22A.getText());
                seat22AClicked = false;
            }
            buttonClicked = seat22A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat22B){
            if (seat22BClicked == false){
                seat22B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22B.getText());
                seat22BClicked = true;
            } else{
                seat22B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22B.getText());
                seat22BClicked = false;
            }
            buttonClicked = seat22B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat22C){
            if (seat22CClicked == false){
                seat22C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22C.getText());
                seat22CClicked = true;
            } else{
                seat22C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22C.getText());
                seat22CClicked = false;
            }
            buttonClicked = seat22C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat22D){
            if (seat22DClicked == false){
                seat22D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22D.getText());
                seat22DClicked = true;
            } else{
                seat22D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22D.getText());
                seat22DClicked = false;
            }
            buttonClicked = seat22D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat22E){
            if (seat22EClicked == false){
                seat22E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22E.getText());
                seat22EClicked = true;
            } else{
                seat22E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22E.getText());
                seat22EClicked = false;
            }
            buttonClicked = seat22E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat22F){
            if (seat22FClicked == false){
                seat22F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat22F.getText());
                seat22FClicked = true;
            } else{
                seat22F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat22F.getText());
                seat22FClicked = false;
            }
            buttonClicked = seat22F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat23A){
            if (seat23AClicked == false){
                seat23A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23A.getText());
                seat23AClicked = true;
            } else{
                seat23A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23A.getText());
                seat23AClicked = false;
            }
            buttonClicked = seat23A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat23B){
            if (seat23BClicked == false){
                seat23B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23B.getText());
                seat23BClicked = true;
            } else{
                seat23B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23B.getText());
                seat23BClicked = false;
            }
            buttonClicked = seat23B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat23C){
            if (seat23CClicked == false){
                seat23C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23C.getText());
                seat23CClicked = true;
            } else{
                seat23C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23C.getText());
                seat23CClicked = false;
            }
            buttonClicked = seat23C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat23D){
            if (seat23DClicked == false){
                seat23D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23D.getText());
                seat23DClicked = true;
            } else{
                seat23D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23D.getText());
                seat23DClicked = false;
            }
            buttonClicked = seat23D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat23E){
            if (seat23EClicked == false){
                seat23E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23E.getText());
                seat23EClicked = true;
            } else{
                seat23E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23E.getText());
                seat23EClicked = false;
            }
            buttonClicked = seat23E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat23F){
            if (seat23FClicked == false){
                seat23F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat23F.getText());
                seat23FClicked = true;
            } else{
                seat23F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat23F.getText());
                seat23FClicked = false;
            }
            buttonClicked = seat23F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat24A){
            if (seat24AClicked == false){
                seat24A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24A.getText());
                seat24AClicked = true;
            } else{
                seat24A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24A.getText());
                seat24AClicked = false;
            }
            buttonClicked = seat24A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat24B){
            if (seat24BClicked == false){
                seat24B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24B.getText());
                seat24BClicked = true;
            } else{
                seat24B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24B.getText());
                seat24BClicked = false;
            }
            buttonClicked = seat24B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat24C){
            if (seat24CClicked == false){
                seat24C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24C.getText());
                seat24CClicked = true;
            } else{
                seat24C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24C.getText());
                seat24CClicked = false;
            }
            buttonClicked = seat24C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat24D){
            if (seat24DClicked == false){
                seat24D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24D.getText());
                seat24DClicked = true;
            } else{
                seat24D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24D.getText());
                seat24DClicked = false;
            }
            buttonClicked = seat24D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat24E){
            if (seat24EClicked == false){
                seat24E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24E.getText());
                seat24EClicked = true;
            } else{
                seat24E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24E.getText());
                seat24EClicked = false;
            }
            buttonClicked = seat24E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat24F){
            if (seat24FClicked == false){
                seat24F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat24F.getText());
                seat24FClicked = true;
            } else{
                seat24F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat24F.getText());
                seat24FClicked = false;
            }
            buttonClicked = seat24F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat25A){
            if (seat25AClicked == false){
                seat25A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25A.getText());
                seat25AClicked = true;
            } else{
                seat25A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25A.getText());
                seat25AClicked = false;
            }
            buttonClicked = seat25A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat25B){
            if (seat25BClicked == false){
                seat25B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25B.getText());
                seat25BClicked = true;
            } else{
                seat25B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25B.getText());
                seat25BClicked = false;
            }
            buttonClicked = seat25B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat25C){
            if (seat25CClicked == false){
                seat25C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25C.getText());
                seat25CClicked = true;
            } else{
                seat25C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25C.getText());
                seat25CClicked = false;
            }
            buttonClicked = seat25C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat25D){
            if (seat25DClicked == false){
                seat25D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25D.getText());
                seat25DClicked = true;
            } else{
                seat25D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25D.getText());
                seat25DClicked = false;
            }
            buttonClicked = seat25D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat25E){
            if (seat25EClicked == false){
                seat25E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25E.getText());
                seat25EClicked = true;
            } else{
                seat25E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25E.getText());
                seat25EClicked = false;
            }
            buttonClicked = seat25E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat25F){
            if (seat25FClicked == false){
                seat25F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat25F.getText());
                seat25FClicked = true;
            } else{
                seat25F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat25F.getText());
                seat25FClicked = false;
            }
            buttonClicked = seat25F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat26A){
            if (seat26AClicked == false){
                seat26A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26A.getText());
                seat26AClicked = true;
            } else{
                seat26A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26A.getText());
                seat26AClicked = false;
            }
            buttonClicked = seat26A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat26B){
            if (seat26BClicked == false){
                seat26B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26B.getText());
                seat26BClicked = true;
            } else{
                seat26B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26B.getText());
                seat26BClicked = false;
            }
            buttonClicked = seat26B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat26C){
            if (seat26CClicked == false){
                seat26C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26C.getText());
                seat26CClicked = true;
            } else{
                seat26C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26C.getText());
                seat26CClicked = false;
            }
            buttonClicked = seat26C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat26D){
            if (seat26DClicked == false){
                seat26D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26D.getText());
                seat26DClicked = true;
            } else{
                seat26D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26D.getText());
                seat26DClicked = false;
            }
            buttonClicked = seat26D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat26E){
            if (seat26EClicked == false){
                seat26E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26E.getText());
                seat26EClicked = true;
            } else{
                seat26E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26E.getText());
                seat26EClicked = false;
            }
            buttonClicked = seat26E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat26F){
            if (seat26FClicked == false){
                seat26F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat26F.getText());
                seat26FClicked = true;
            } else{
                seat26F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat26F.getText());
                seat26FClicked = false;
            }
            buttonClicked = seat26F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat27A){
            if (seat27AClicked == false){
                seat27A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27A.getText());
                seat27AClicked = true;
            } else{
                seat27A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27A.getText());
                seat27AClicked = false;
            }
            buttonClicked = seat27A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat27B){
            if (seat27BClicked == false){
                seat27B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27B.getText());
                seat27BClicked = true;
            } else{
                seat27B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27B.getText());
                seat27BClicked = false;
            }
            buttonClicked = seat27B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat27C){
            if (seat27CClicked == false){
                seat27C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27C.getText());
                seat27CClicked = true;
            } else{
                seat27C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27C.getText());
                seat27CClicked = false;
            }
            buttonClicked = seat27C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat27D){
            if (seat27DClicked == false){
                seat27D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27D.getText());
                seat27DClicked = true;
            } else{
                seat27D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27D.getText());
                seat27DClicked = false;
            }
            buttonClicked = seat27D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat27E){
            if (seat27EClicked == false){
                seat27E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27E.getText());
                seat27EClicked = true;
            } else{
                seat27E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27E.getText());
                seat27EClicked = false;
            }
            buttonClicked = seat27E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat27F){
            if (seat27FClicked == false){
                seat27F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat27F.getText());
                seat27FClicked = true;
            } else{
                seat27F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat27F.getText());
                seat27FClicked = false;
            }
            buttonClicked = seat27F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat28A){
            if (seat28AClicked == false){
                seat28A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28A.getText());
                seat28AClicked = true;
            } else{
                seat28A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28A.getText());
                seat28AClicked = false;
            }
            buttonClicked = seat28A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat28B){
            if (seat28BClicked == false){
                seat28B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28B.getText());
                seat28BClicked = true;
            } else{
                seat28B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28B.getText());
                seat28BClicked = false;
            }
            buttonClicked = seat28B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat28C){
            if (seat28CClicked == false){
                seat28C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28C.getText());
                seat28CClicked = true;
            } else{
                seat28C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28C.getText());
                seat28CClicked = false;
            }
            buttonClicked = seat28C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat28D){
            if (seat28DClicked == false){
                seat28D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28D.getText());
                seat28DClicked = true;
            } else{
                seat28D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28D.getText());
                seat28DClicked = false;
            }
            buttonClicked = seat28D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat28E){
            if (seat28EClicked == false){
                seat28E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28E.getText());
                seat28EClicked = true;
            } else{
                seat28E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28E.getText());
                seat28EClicked = false;
            }
            buttonClicked = seat28E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat28F){
            if (seat28FClicked == false){
                seat28F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat28F.getText());
                seat28FClicked = true;
            } else{
                seat28F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat28F.getText());
                seat28FClicked = false;
            }
            buttonClicked = seat28F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat29A){
            if (seat29AClicked == false){
                seat29A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29A.getText());
                seat29AClicked = true;
            } else{
                seat29A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29A.getText());
                seat29AClicked = false;
            }
            buttonClicked = seat29A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat29B){
            if (seat29BClicked == false){
                seat29B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29B.getText());
                seat29BClicked = true;
            } else{
                seat29B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29B.getText());
                seat29BClicked = false;
            }
            buttonClicked = seat29B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat29C){
            if (seat29CClicked == false){
                seat29C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29C.getText());
                seat29CClicked = true;
            } else{
                seat29C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29C.getText());
                seat29CClicked = false;
            }
            buttonClicked = seat29C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat29D){
            if (seat29DClicked == false){
                seat29D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29D.getText());
                seat29DClicked = true;
            } else{
                seat29D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29D.getText());
                seat29DClicked = false;
            }
            buttonClicked = seat29D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat29E){
            if (seat29EClicked == false){
                seat29E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29E.getText());
                seat29EClicked = true;
            } else{
                seat29E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29E.getText());
                seat29EClicked = false;
            }
            buttonClicked = seat29E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat29F){
            if (seat29FClicked == false){
                seat29F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat29F.getText());
                seat29FClicked = true;
            } else{
                seat29F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat29F.getText());
                seat29FClicked = false;
            }
            buttonClicked = seat29F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }

        if (e.getSource()==seat30A){
            if (seat30AClicked == false){
                seat30A.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30A.getText());
                seat30AClicked = true;
            } else{
                seat30A.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30A.getText());
                seat30AClicked = false;
            }
            buttonClicked = seat30A.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat30B){
            if (seat30BClicked == false){
                seat30B.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30B.getText());
                seat30BClicked = true;
            } else{
                seat30B.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30B.getText());
                seat30BClicked = false;
            }
            buttonClicked = seat30B.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat30C){
            if (seat30CClicked == false){
                seat30C.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30C.getText());
                seat30CClicked = true;
            } else{
                seat30C.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30C.getText());
                seat30CClicked = false;
            }
            buttonClicked = seat30C.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat30D){
            if (seat30DClicked == false){
                seat30D.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30D.getText());
                seat30DClicked = true;
            } else{
                seat30D.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30D.getText());
                seat30DClicked = false;
            }
            buttonClicked = seat30D.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat30E){
            if (seat30EClicked == false){
                seat30E.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30E.getText());
                seat30EClicked = true;
            } else{
                seat30E.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30E.getText());
                seat30EClicked = false;
            }
            buttonClicked = seat30E.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        if (e.getSource()==seat30F){
            if (seat30FClicked == false){
                seat30F.setBackground(new Color(0x6BCB77));
                seatsSelected.add(seat30F.getText());
                seat30FClicked = true;
            } else{
                seat30F.setBackground(new Color(0x5584AC));
                seatsSelected.remove(seat30F.getText());
                seat30FClicked = false;
            }
            buttonClicked = seat30F.getText();
            System.out.println("The selected seat is: " + buttonClicked);
        }
        
        if (e.getSource()==confirm){
            if (SeatingButtonsFrame.seatsSelected.size() == seatCount){
            	dispose();
                Datasource ds = new Datasource();
                ds.openDB();
                ds.addBookedSeats(flightID, SeatingButtonsFrame.seatsSelected, userID);
                
                boolean a = ds.updateSeatingInfo(flightID, SeatingButtonsFrame.seatsSelected.size(), seatClass);
                
                
                ds.closeDB();
                System.out.println(SeatingButtonsFrame.seatsSelected.toString());
                SeatingButtonsFrame.seatsSelected.clear();
              
            } else{
                JOptionPane.showMessageDialog(null,
                        "Please select exactly " + seatCount + " seats.");
            }
            

        }
        
    }
  
    boolean close = ds.closeDB();
}
