package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //current max student subjects: 4.
       Subject maths = new Subject("Maths",5,4);
       Subject cs = new Subject("CS",4,2);
       Subject polish = new Subject("Polish",2,2);
       Subject subject = new Subject("Subject",4,3);

       Date date1 = new Date(20,10,2004);

       Student student = new Student("andrzej",date1);
       student.addSubject(subject);
       Student student1 = new Student("Janusz",date1);



        student1.addSubject(subject);
        student1.addSubject(maths);
        System.out.println(student1.isStudentAdult(date1));
        System.out.println(student1.getTotalECTS());
        System.out.println(student1.getAllStudentSubjects());
        System.out.println(student1.getAverageMark());



        System.out.println("");
        System.out.println(student1);
        System.out.println(student1.removeSubject());
        System.out.println(student1);





//        System.out.println(student.addSubject(maths));
//        System.out.println(student.addSubject(cs));
//
//        System.out.println(student);
//        System.out.println("[Subject{id=1, name='Maths, pointECTS=5, mark=4.0}, Subject{id=1, name='Cs, pointECTS=4, mark=1.0}, null, null]");
//        System.out.println(student.getAllStudentSubjects());
//        System.out.println(student.getTotalECTS());
//        System.out.println(student.getAverageMark());





    }
}
