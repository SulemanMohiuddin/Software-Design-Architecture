package model;

public class Flight {
    private int id;
    private String  from;
    private String  to;
    private String flightNum;
    private String planeModel;
    private int seatsInEconomy;
    private int seatsBookedInEconomy;
    private int seatsInBusiness;
    private int seatsBookedInBusiness;
    private int seatsEmpty;
    private int departureDay;
    private int month;
    private int departureHour;
    private int departureMin;
    private int arrivalDay;
    private int arrivalHour;
    private int arrivalMin;
    private int ticketPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public int getSeatsInEconomy() {
        return seatsInEconomy;
    }

    public void setSeatsInEconomy(int seatsInEconomy) {
        this.seatsInEconomy = seatsInEconomy;
    }

    public int getSeatsBookedInEconomy() {
        return seatsBookedInEconomy;
    }

    public void setSeatsBookedInEconomy(int seatsBookedInEconomy) {
        this.seatsBookedInEconomy = seatsBookedInEconomy;
    }

    public int getSeatsInBusiness() {
        return seatsInBusiness;
    }

    public void setSeatsInBusiness(int seatsInBusiness) {
        this.seatsInBusiness = seatsInBusiness;
    }

    public int getSeatsBookedInBusiness() {
        return seatsBookedInBusiness;
    }

    public void setSeatsBookedInBusiness(int seatsBookedInBusiness) {
        this.seatsBookedInBusiness = seatsBookedInBusiness;
    }

    public int getSeatsEmpty() {
        return seatsEmpty;
    }

    public void setSeatsEmpty(int seatsEmpty) {
        this.seatsEmpty = seatsEmpty;
    }

    public int getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(int departureDay) {
        this.departureDay = departureDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(int departureHour) {
        this.departureHour = departureHour;
    }

    public int getDepartureMin() {
        return departureMin;
    }

    public void setDepartureMin(int departureMin) {
        this.departureMin = departureMin;
    }

    public int getArrivalDay() {
        return arrivalDay;
    }

    public void setArrivalDay(int arrivalDay) {
        this.arrivalDay = arrivalDay;
    }

    public int getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(int arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public int getArrivalMin() {
        return arrivalMin;
    }

    public void setArrivalMin(int arrivalMin) {
        this.arrivalMin = arrivalMin;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
