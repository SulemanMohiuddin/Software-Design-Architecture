package model;

public class Date{
    int month;
    int day;
    int hour;
    int min;

    public Date(int month, int day, int hour, int min) {
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
    }

    public Date() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public boolean checkD1IsAfterD2(Date d1, Date d2){
        if (d1.month > d2.month){
            return true;
        } else if (d1.month == d2.month && d1.day > d2.day){
            return true;
        } else if (d1.month == d2.month && d1.day == d2.day && d1.hour > d2.hour){
            return true;
        } else return false;
    }
}