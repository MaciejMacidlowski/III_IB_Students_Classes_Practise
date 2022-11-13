package com.company;

import java.time.LocalDate;
import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Student {
    int idCount = 0;
    private int id;
    private String name;
    private Date yearOfBirth;
    private Subject[] subjects = new Subject[4];





    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", subjects=" + Arrays.toString(subjects) +
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

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
    public Student(String name, Date yearOfBirth){
        idCount++;
        this.id = idCount;
        setName(name);
        this.yearOfBirth = yearOfBirth;

    }

    public  boolean addSubject( Subject subject){
        int howManyNulls = 0;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null){
                howManyNulls++;
            }
        }


        int listCount = subjects.length-howManyNulls;
        subjects[listCount] = subject;
        listCount++;
        if (subjects[listCount-1] == subject) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean removeSubject(){
        int howManyNulls = 1;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null){
                howManyNulls++;
            }
        }
        subjects[subjects.length-howManyNulls] = null;
        if (subjects[subjects.length-howManyNulls] == null){
        return true;
        }
        else return false;
    }
    public  boolean isStudentAdult(Date Date){
        if (LocalDate.now().getYear() - Date.getYear()>18){
            return true;
        }
        else{
            return false;
        }

    }

    public String getAllStudentSubjects(){
        String answer = "";


        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i]!= null) {
                String firstStep = subjects[i].toString();
                String[] secondStep = firstStep.split("name='");
                String[] thirdStep = secondStep[1].split(",");
                answer = answer + " "+thirdStep[0];
            }

        }
            return answer;


}

    public double getTotalECTS(){
        double answer=0;


        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i]!= null) {
                String firstStep = subjects[i].toString();
                String[] secondStep = firstStep.split("pointECTS=");
                String[] thirdStep = secondStep[1].split(",");
                String toBeChanged =thirdStep[0];
                double changed = Double.parseDouble(toBeChanged);
                answer = answer+changed;
            }

        }
        return answer;
    }

    public double getAverageMark(){
        double answer=0;
        double mark=2.0;
        double pointsECTS = 0;
        for (int i = 0; i < subjects.length; i++) {
        // finding mark in a subject
            if (subjects[i]!= null) {
                String firstStep = subjects[i].toString();
                String[] secondStep = firstStep.split("mark=");
                String[] thirdStep = secondStep[1].split("}");
                String toBeChanged = thirdStep[0];
                mark = Double.parseDouble(toBeChanged);
        // find points in a subject
                String firstStepECTS = subjects[i].toString();
                String[] secondStepECTS = firstStepECTS.split("pointECTS=");
                String[] thirdStepECTS = secondStepECTS[1].split(",");
                String toBeChangedMark = thirdStepECTS[0];
                pointsECTS=Double.parseDouble(toBeChangedMark);

                //calculating average
                answer= answer + mark*pointsECTS;
            }
        }
        return answer;
    }


}
