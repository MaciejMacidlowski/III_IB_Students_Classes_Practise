package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>=1 && day<=31){

            this.day = day;
        }
        else {
            this.day=1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1 && month<=12){

            this.month = month;

        }
        else {
            this.month=1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>=1900 && year<=2099){

            this.year = year;

        }
        else {
            this.year=2000;
    }}

    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);

    }

}
