package com.engeto.examples.graduationresults;

import java.time.LocalDate;

//méno, příjmení, datum narození, patří do nějaké třídy
public class Student {
    String name;
    String surname;
    LocalDate dateBirth;
    String classID;
    Objects object1;
    Objects object2;
    Objects object3;
    Objects object4;
    double result;
    LocalDate dateExam;

    public Student(String name, String surname, LocalDate dateBirth, String classID,
                   LocalDate dateExam) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.classID = classID;
        object1 = new Objects("Angličtina");
        object2 = new Objects("Čeština");
        object3 = new Objects("Matematika");
        object4 = new Objects("Dějepis");

        this.dateExam = dateExam;

    }

    public String getName() {
        return name;
    }

     public String getSurname() {
        return surname;
    }


    public LocalDate getDateBirth() {
        return dateBirth;
    }


    public Objects getObject1() {
        return  object1;
    }


    public Objects getObject2() {
        return object2;
    }

     public Objects getObject3() {
        return object3;
    }

     public Objects getObject4() {
        return object4;
    }


    public double count(int o1,int o2,int o3,int o4){
        return (object1.getScore() + object2.getScore() +object3.getScore() +object1.getScore())/4;
    }

    public double getResult() {
        return result;
    }

    public LocalDate getDateExam() {
        return dateExam;
    }

    public boolean passedWihtHonor(double result){
        return result ==1;
    }

    public boolean passed(double result){
        return result >=2 && result <=4;
    }

    public boolean notPassed(double result){
        return result >4;
    }

    public  boolean isAfterExam(LocalDate dateExam){
        return dateExam.isBefore(LocalDate.now());
    }

}
