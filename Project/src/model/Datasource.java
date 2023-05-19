package model;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Datasource {

    public static final String TEST_DB = "ProjectTest.db";
    public static final String CONNECTION_STRING ="jdbc:sqlite:C:\\Users\\SMP2K2\\eclipse-workspace\\Project\\" +
            TEST_DB;

    public static final String INSERT_USER = "INSERT INTO Users (FirstName, LastName, Email, Password, CardInfo," +
            " CNIC, PhoneNum, State, City) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String QUERY_USERS = "SELECT * FROM Users WHERE Email=? AND Password=?";
    public static final String QUERY_USERS_BY_EMAIL = "SELECT * FROM Users WHERE Email=?";
    public static final String QUERY_FLIGHT_BY_FROM_AND_TO = "SELECT * FROM Flights WHERE Departure=? AND Arrival=?";
    public static final String QUERY_FLIGHT_BY_ID = "SELECT * FROM Flights WHERE ID=?";
    public static final String INSERT_TICKET = "INSERT INTO Tickets (User, Flight, Departure, Arrival, Class, Adult, " +
            "Child, Infant, Baggage, Wheelchair, Price) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String DELETE_TICKET = "DELETE FROM Tickets WHERE ID=?";
    public static final String INSERT_WAITING = "INSERT INTO Waiting (User, Flight, Class, SeatCount, " +
            "Baggage, Wheelchair, Day, Month, Hour, Minute) " +
            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String DELETE_FROM_WAITING = "DELETE FROM Waiting WHERE User=? AND Flight=?";
    public static final String QUERY_WAITING = "SELECT * FROM Waiting WHERE User=? AND Flight=?";
    public static int currentUser = 0;

    public static final int ECONOMY_CLASS = 0;
    public static final int BUSINESS_CLASS = 1;

    private Connection conn = null;
    private PreparedStatement insertIntoUsers;
    private PreparedStatement queryUser;
    private PreparedStatement queryUserByEmail;
    private PreparedStatement queryFlightsByFromAndTo;
    private PreparedStatement queryFlightsById;
    private PreparedStatement insertIntoTickets;
    private PreparedStatement deleteFromTickets;
    private PreparedStatement insertIntoWaiting;
    private PreparedStatement deleteWaitingList;
    private PreparedStatement queryWaitingList;
    private PreparedStatement insertSeats;

    public boolean openDB(){
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            insertIntoUsers = conn.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            queryUser = conn.prepareStatement(QUERY_USERS);
            queryUserByEmail = conn.prepareStatement(QUERY_USERS_BY_EMAIL);
            queryFlightsByFromAndTo = conn.prepareStatement(QUERY_FLIGHT_BY_FROM_AND_TO,
                    Statement.RETURN_GENERATED_KEYS);
            queryFlightsById = conn.prepareStatement(QUERY_FLIGHT_BY_ID);
            insertIntoTickets = conn.prepareStatement(INSERT_TICKET, Statement.RETURN_GENERATED_KEYS);
            deleteFromTickets = conn.prepareStatement(DELETE_TICKET);
            insertIntoWaiting = conn.prepareStatement(INSERT_WAITING, Statement.RETURN_GENERATED_KEYS);
            deleteWaitingList = conn.prepareStatement(DELETE_FROM_WAITING);
            queryWaitingList = conn.prepareStatement(QUERY_WAITING);

            return true;
        } catch (SQLException e){
            System.out.println("Could not open database: " + e.getMessage());
            return false;
        }
    }

    public boolean closeDB(){
        try {
            if (conn != null){
                conn.close();
            }
            if (insertIntoUsers != null){
                insertIntoUsers.close();
            }
            if (queryUser != null){
                queryUser.close();
            }
            if (queryFlightsByFromAndTo != null){
                queryFlightsByFromAndTo.close();
            }
            if (queryFlightsById != null){
                queryFlightsById.close();
            }
            if (insertIntoTickets != null){
                insertIntoTickets.close();
            }
            return true;
        } catch (SQLException e){
            System.out.println("Could not close database: " + e.getMessage());
            return false;
        }
    }

    //********************** Flights related queries ************************

    public ArrayList<Flight> getFlightsData(){

        String query = "SELECT * FROM Flights";
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {

            ArrayList<Flight> flights = new ArrayList<>();
            while (resultSet.next()){
                Flight flight = new Flight();
                flight.setId(resultSet.getInt(1));
                flight.setFrom(resultSet.getString(2));
                flight.setTo(resultSet.getString(3));
                flight.setFlightNum(resultSet.getString(4));
                flight.setPlaneModel(resultSet.getString(5));
                flight.setSeatsInEconomy(resultSet.getInt(6));
                flight.setSeatsBookedInEconomy(resultSet.getInt(7));
                flight.setSeatsInBusiness(resultSet.getInt(8));
                flight.setSeatsBookedInBusiness(resultSet.getInt(9));
                flight.setSeatsEmpty(resultSet.getInt(10));
                flight.setDepartureDay(resultSet.getInt(11));
                flight.setMonth(resultSet.getInt(12));
                flight.setDepartureHour(resultSet.getInt(13));
                flight.setDepartureMin(resultSet.getInt(14));
                flight.setArrivalDay(resultSet.getInt(15));
                flight.setArrivalHour(resultSet.getInt(16));
                flight.setArrivalMin(resultSet.getInt(17));
                flight.setTicketPrice(resultSet.getInt(18));

                flights.add(flight);
            }

            return flights;
        } catch (SQLException e){
            System.out.println("Could not get flights: " + e.getMessage());
            return null;
        }
    }

    public Flight getFlight(String from, String to){
        try {
            queryFlightsByFromAndTo.setString(1, from);
            queryFlightsByFromAndTo.setString(2, to);

            ResultSet resultSet = queryFlightsByFromAndTo.executeQuery();
            Flight flight = new Flight();
            while(resultSet.next()){
                flight.setId(resultSet.getInt(1));
                flight.setFrom(resultSet.getString(2));
                flight.setTo(resultSet.getString(3));
                flight.setFlightNum(resultSet.getString(4));
                flight.setPlaneModel(resultSet.getString(5));
                flight.setSeatsInEconomy(resultSet.getInt(6));
                flight.setSeatsBookedInEconomy(resultSet.getInt(7));
                flight.setSeatsInBusiness(resultSet.getInt(8));
                flight.setSeatsBookedInBusiness(resultSet.getInt(9));
                flight.setSeatsEmpty(resultSet.getInt(10));
                flight.setDepartureDay(resultSet.getInt(11));
                flight.setMonth(resultSet.getInt(12));
                flight.setDepartureHour(resultSet.getInt(13));
                flight.setDepartureMin(resultSet.getInt(14));
                flight.setArrivalDay(resultSet.getInt(15));
                flight.setArrivalHour(resultSet.getInt(16));
                flight.setArrivalMin(resultSet.getInt(17));
                flight.setTicketPrice(resultSet.getInt(18));
            }
                return flight;
        } catch (SQLException e){
            System.out.println("Could not find flights: " + e.getMessage());
            return null;
        }
    }

    public Flight getFlight(int id){
        try {
            queryFlightsById.setInt(1, id);

            ResultSet resultSet = queryFlightsById.executeQuery();
            Flight flight;
            if (resultSet.next()){
                flight = new Flight();
                flight.setId(resultSet.getInt(1));
                flight.setFrom(resultSet.getString(2));
                flight.setTo(resultSet.getString(3));
                flight.setFlightNum(resultSet.getString(4));
                flight.setPlaneModel(resultSet.getString(5));
                flight.setSeatsInEconomy(resultSet.getInt(6));
                flight.setSeatsBookedInEconomy(resultSet.getInt(7));
                flight.setSeatsInBusiness(resultSet.getInt(8));
                flight.setSeatsBookedInBusiness(resultSet.getInt(9));
                flight.setSeatsEmpty(resultSet.getInt(10));
                flight.setDepartureDay(resultSet.getInt(11));
                flight.setMonth(resultSet.getInt(12));
                flight.setDepartureHour(resultSet.getInt(13));
                flight.setDepartureMin(resultSet.getInt(14));
                flight.setArrivalDay(resultSet.getInt(15));
                flight.setArrivalHour(resultSet.getInt(16));
                flight.setArrivalMin(resultSet.getInt(17));
                flight.setTicketPrice(resultSet.getInt(18));
            } else return null;
            return flight;
        } catch (SQLException e){
            System.out.println("Could not find flights: " + e.getMessage());
            return null;
        }
    }

    public boolean updateSeatingInfo(int flightID, int seatCount, int seatClass){
        int seatBookedUpdated = 0;
        int seatsEmptyUpdated = 0;
        String findPrevSeatCount = "";
        if (seatClass == ECONOMY_CLASS){
            findPrevSeatCount = "SELECT SeatsBookedInEconomy, SeatsEmpty FROM Flights WHERE ID=" + flightID;
        }
        if (seatClass == BUSINESS_CLASS){
            findPrevSeatCount = "SELECT SeatsBookedInBusiness, SeatsEmpty FROM Flights WHERE ID=" + flightID;
        }

        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(findPrevSeatCount)){
            seatBookedUpdated = resultSet.getInt(1);
            seatBookedUpdated += seatCount;
            seatsEmptyUpdated = resultSet.getInt(2);
            if (seatsEmptyUpdated == 0) {
                return false;
            }
            seatsEmptyUpdated -= seatCount;

        } catch (SQLException e){
            System.out.println("Failed to get seat count: " + e.getMessage());
            return false;
        }

        String update = "";
        if (seatClass == ECONOMY_CLASS){
            update = "UPDATE Flights SET SeatsBookedInEconomy=" + seatBookedUpdated +
                    ", SeatsEmpty=" + seatsEmptyUpdated + " WHERE ID=" + flightID;
        } else if (seatClass == BUSINESS_CLASS){
            update = "UPDATE Flights SET SeatsBookedInBusiness=" + seatBookedUpdated +
                    ", SeatsEmpty=" + seatsEmptyUpdated + " WHERE ID=" + flightID;
        }

        try(Statement statement = conn.createStatement()) {
            statement.executeUpdate(update);
        } catch (SQLException e){
            System.out.println("failed to update table: " + e.getMessage());
            return false;
        }
        return true;
    }

    public int getEmptySeatsOfFlight(int flightID){
        String sql = "SELECT SeatsEmpty FROM Flights WHERE ID=" + flightID;
        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
            return resultSet.getInt(1);
        } catch (SQLException e){
            System.out.println("Could not get info about empty seats: " + e.getMessage());
            return -1;
        }
    }

    public int getSeatsEmptyInClass(int flightID, int seatClass){
        int totalSeatsInClass = 0;
        String sql = "";
        if (seatClass == ECONOMY_CLASS){
            sql = "SELECT SeatsBookedInEconomy FROM Flights WHERE ID=" + flightID;
            totalSeatsInClass = 132;
        } else if (seatClass == BUSINESS_CLASS){
            sql = "SELECT SeatsBookedInBusiness FROM Flights WHERE ID=" + flightID;
            totalSeatsInClass = 48;
        }
        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){
            int s = totalSeatsInClass - resultSet.getInt(1);
            return s;
        } catch (SQLException e){
            System.out.println("Could not get info about booked seats in a class: " + e.getMessage());
            return -1;
        }
    }

    //********************** User related queries ************************

    public int insertUser (String fName, String lName, String email, String password, String cardInfo, String CNIC,
                          String phnNum, String state, String city) {
        boolean found = findUser(email);
        if (!found){
            try {
                insertIntoUsers.setString(1, fName);
                insertIntoUsers.setString(2, lName);
                insertIntoUsers.setString(3, email);
                insertIntoUsers.setString(4, password);
                insertIntoUsers.setString(5, cardInfo);
                insertIntoUsers.setString(6, CNIC);
                insertIntoUsers.setString(7, phnNum);
                insertIntoUsers.setString(8, state);
                insertIntoUsers.setString(9, city);

                int affectedRows = insertIntoUsers.executeUpdate();
                if (affectedRows != 1){
                    System.out.println("could not insert user");
                }

                ResultSet generatedKey =insertIntoUsers.getGeneratedKeys();
                currentUser = generatedKey.getInt(1);
                return generatedKey.getInt(1);

            } catch (SQLException e){
                System.out.println("could not insert user: " + e.getMessage());
                return -1;
            }
        } else {
            return -1;
        }


    }

    public User findUser(String email, String password){
        String sql = "SELECT * FROM Users WHERE Email='" + email + "' AND Password='" + password + "'";
        try (Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){

            User user = new User();
            if (resultSet.next()){
                currentUser = resultSet.getInt(1);
                user.setId(resultSet.getInt(1));
                user.setFirstName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setPassword(resultSet.getString(5));
                user.setCardInfo(resultSet.getString(6));
                user.setCNIC(resultSet.getString(7));
                user.setPhoneNum(resultSet.getString(8));
                user.setState(resultSet.getString(9));
                user.setCity(resultSet.getString(10));
            } else {
                user = null;
            }
            return user;
        } catch (SQLException e){
            System.out.println("Could not find user: " + e.getMessage());
            return null;
        }
    }

    public boolean findUser(String email){
        try{
            queryUserByEmail.setString(1, email);
            ResultSet resultSet = queryUserByEmail.executeQuery();

            User user = new User();
            if (resultSet.next()){
                user.setId(resultSet.getInt(1));
                user.setFirstName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setPassword(resultSet.getString(5));
                user.setCardInfo(resultSet.getString(6));
                user.setCNIC(resultSet.getString(7));
                user.setPhoneNum(resultSet.getString(8));
                user.setState(resultSet.getString(9));
                user.setCity(resultSet.getString(10));
            } else {
                user = null;
            }
            if (user != null) return true;
            else return false;
        } catch (SQLException e){
            System.out.println("Cannot find user by email: " + e.getMessage());
            return false;
        }
    }

    public User findUser(int id){
        String sql = "SELECT * FROM Users WHERE ID=" + id;
        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)){

            User user = new User();
            if (resultSet.next()){
                currentUser = resultSet.getInt(1);
                user.setId(resultSet.getInt(1));
                user.setFirstName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setPassword(resultSet.getString(5));
                user.setCardInfo(resultSet.getString(6));
                user.setCNIC(resultSet.getString(7));
                user.setPhoneNum(resultSet.getString(8));
                user.setState(resultSet.getString(9));
                user.setCity(resultSet.getString(10));
            } else {
                user = null;
            }
            return user;
        } catch (SQLException e){
            System.out.println("Could not find user by ID: " + e.getMessage());
            return null;
        }
    }



    //********************** Tickets related queries ************************

    public int insertTicket(int user, int flight, int seatClass, int adult, int child, int infant,
                                int baggage, int wheelChair){
        String departure = "";
        String arrival = "";
        int initialPrice = 0;
        int price = 0;
        String sql = "SELECT Departure, Arrival, ticketPrice FROM Flights WHERE ID=" + flight;
        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){
            departure = resultSet.getString(1);
            arrival = resultSet.getString(2);
            initialPrice = resultSet.getInt(3);
        } catch (SQLException e){
            System.out.println("Cannot get departure, arrival and price details: " + e.getMessage());
        }

        price = (int) ((initialPrice * adult) + (initialPrice * 0.9 * child) + (initialPrice * 0.85 * infant));

        try {
            insertIntoTickets.setInt(1, user);
            insertIntoTickets.setInt(2, flight);
            insertIntoTickets.setString(3, departure);
            insertIntoTickets.setString(4, arrival);
            insertIntoTickets.setInt(5, seatClass);
            insertIntoTickets.setInt(6, adult);
            insertIntoTickets.setInt(7, child);
            insertIntoTickets.setInt(8, infant);
            insertIntoTickets.setInt(9, baggage);
            insertIntoTickets.setInt(10, wheelChair);
            insertIntoTickets.setInt(11, price);

            int affectedRows = insertIntoTickets.executeUpdate();
            if (affectedRows != 1){
                System.out.println("failed to insert ticket");
                return -1;
            }
            ResultSet resultSet = insertIntoTickets.getGeneratedKeys();
            int id = resultSet.getInt(1);

            return id;
        } catch (SQLException e){
            System.out.println("Could not insert ticket: " + e.getMessage());
            return -1;
        }

    }

    public Ticket getAllTicketsOfUser(int user, String departure, String arrival){
        String sql = "SELECT * FROM Tickets WHERE User=" + user + " AND Departure='" + departure +
                "' AND Arrival='" + arrival + "'";
        try(Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)){
            Flight f;
            Date date;
            Ticket t = new Ticket();

            if (resultSet.next()){
                f = getFlight(resultSet.getInt(3));
                t.setId(resultSet.getInt(1));
                t.setUser(resultSet.getInt(2));
                t.setFlight(resultSet.getInt(3));
                t.setDeparturePlace(resultSet.getString(4));
                t.setArrivalPlace(resultSet.getString(5));
                t.setSeatClass(resultSet.getInt(6));
                t.setAdults(resultSet.getInt(7));
                t.setChild(resultSet.getInt(8));
                t.setInfant(resultSet.getInt(9));
                t.setSeats(getSeatsOfUserInFlight(f.getId(), user));
                t.setBaggage(resultSet.getInt(10));
                t.setWheelChair(resultSet.getInt(11));
                t.setPrice(resultSet.getInt(12));

                return t;
            } else return null;
        } catch (SQLException e){
            System.out.println("cannot get ticket of the user: " + e.getMessage());
            return null;
        }
    }

    public boolean deleteTicket(int ticketID){
        try {
            deleteFromTickets.setInt(1, ticketID);
            deleteFromTickets.executeUpdate();
            return true;
        } catch (SQLException e){
            System.out.println("could not delete ticket: " + e.getMessage());
            return false;
        }
    }


    //********************** Waiting related queries ************************

    public boolean insertWaiting(int user, int flight, int seatClass, int seatCount, int baggage, int wheelchair){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int hour = now.getHour();
        int min = now.getMinute();

        try {
            insertIntoWaiting.setInt(1, user);
            insertIntoWaiting.setInt(2, flight);
            insertIntoWaiting.setInt(3, seatClass);
            insertIntoWaiting.setInt(4, seatCount);
            insertIntoWaiting.setInt(5, baggage);
            insertIntoWaiting.setInt(6, wheelchair);
            insertIntoWaiting.setInt(7, day);
            insertIntoWaiting.setInt(8, month);
            insertIntoWaiting.setInt(9, hour);
            insertIntoWaiting.setInt(10, min);

            int affectedRows = insertIntoWaiting.executeUpdate();
            if (affectedRows != 1){
                System.out.println("failed to insert user in waiting list.");
                return false;
            }
            return true;
        } catch (SQLException e){
            System.out.println("Could not insert user in waiting list: " + e.getMessage());
            return false;
        }
    }

    public void deleteUserFromWaiting(int user, int flight){
        String sql = "DELETE FROM Waiting WHERE User=" + user + " AND Flight=" + flight;
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (SQLException e){
            System.out.println("Could not delete from waiting: " + e.getMessage());
        }
    }

    public boolean checkUserForWaitingList(int user){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Date d2 = new Date(now.getMonthValue(), now.getDayOfMonth(), now.getHour(), now.getMinute());

        int flight = 0;
        int seatClass = 0;
        int seatCount = 0;
        int baggage = 0;
        int wheelchair = 0;
        Flight f;
        Date d1 = new Date();
        String getUserInWaiting = "SELECT * FROM Waiting WHERE User=" + user;
        try (Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(getUserInWaiting)){
            if (resultSet.next()){
                flight = resultSet.getInt(3);
                f = getFlight(flight);
                seatClass = resultSet.getInt(4);
                seatCount = resultSet.getInt(5);
                baggage = resultSet.getInt(6);
                wheelchair = resultSet.getInt(7);
                d1.setDay(f.getDepartureDay());
                d1.setMonth(f.getMonth());
                d1.setHour(f.getDepartureHour());
                d1.setMin(f.getDepartureMin());
            } else System.out.println("User does not have any waiting.");

        } catch (SQLException e){
            System.out.println("Could not find user in waiting list: " + e.getMessage());
        }
        if (d1.checkD1IsAfterD2(d1, d2)){
            if (getEmptySeatsOfFlight(flight) >= seatCount){
                if (getSeatsEmptyInClass(flight, seatClass) >= seatCount){
                    deleteUserFromWaiting(user, flight);
                    insertTicket(user, flight, seatClass, seatCount, 0, 0, baggage, wheelchair);
                    return true;
                }
            }
        } else {
            deleteUserFromWaiting(user, flight);
        }
        return false;
        //send a optionPane to user that they have a seat
    }

    //********************** seating table ************************

    public void addBookedSeats(int flightID, ArrayList<String> selectedSeats, int userID){
        String create = "CREATE TABLE IF NOT EXISTS Flight" + flightID + " (Seat varchar(10), User INT)";

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(create);
            statement.close();

            for (String seat: selectedSeats) {
                String sql = "INSERT INTO Flight" + flightID + " VALUES('" + seat + "', " + userID + ")";
                try {
                    Statement statement1 = conn.createStatement();
                    statement1.executeUpdate(sql);
                } catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }

        } catch (SQLException e){
            System.out.println("Failed as outer catch is running: " + e.getMessage());
        }

    }

    public ArrayList<String> getBookedSeatsInFlight(int flightID){
        String sql = "SELECT Seat FROM Flight" + flightID;
        ArrayList<String> bookedSeats = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                bookedSeats.add(resultSet.getString(1));
            }

            return bookedSeats;
        } catch (SQLException e){
            System.out.println("Could not find booked seats in flight" + flightID + ": " + e.getMessage());
            return null;
        }
    }

    public ArrayList<String> getSeatsOfUserInFlight(int flightID, int userID){
        String sql = "SELECT Seat FROM Flight" + flightID + " WHERE User=" + userID;
        ArrayList<String> seatsOfUser = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                seatsOfUser.add(resultSet.getString(1));
            }

            return seatsOfUser;
        } catch (SQLException e){
            System.out.println("Could not find booked seats in flight" + flightID + ": " + e.getMessage());
            return null;
        }
    }

}
