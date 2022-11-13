package com.company;

public class Subject {
    private int idCount=0;
    private int id;
    private String name;
    private int pointECTS;
    private double mark;





    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name  +
                ", pointECTS=" + pointECTS +
                ", mark=" + mark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()){
            this.name = "brak danych";
        }
        else {

            this.name = (name.charAt(0)+"").toUpperCase() + name.substring(1).toLowerCase();
        }
    }

    public int getPointECTS() {
        return pointECTS;
    }

    public void setPointECTS(int pointECTS) {
        if (pointECTS < 1 || pointECTS >8){
        this.pointECTS = 1;
        }
        else {
            this.pointECTS = pointECTS;
        }

    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark<=5.0 && mark>=2.0){
            this.mark = mark;
        }
        else {
        this.mark = 1.0;
        }
    }

    public Subject(String name,int pointECTS,double mark){
        idCount++;
        this.id=idCount;
        setName(name);
        setPointECTS(pointECTS);
        setMark(mark);


    }
}
