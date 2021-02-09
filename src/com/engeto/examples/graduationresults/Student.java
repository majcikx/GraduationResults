package com.engeto.examples.graduationresults;

import java.time.LocalDate;

//méno, příjmení, datum narození, patří do nějaké třídy
public class Student {
   private String name;
    private String surname;
    private LocalDate dateBirth;
    private String classID;
    private Objects object1;
    private Objects object2;
    private Objects object3;
    private Objects object4;
    private double averageResult;
    private LocalDate dateExam;

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
    public void setName(String name) {
        this.name = name;
    }

     public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Objects getObject1() {
        return  object1;
    }

   public void setClassID(String classID) {
        this.classID = classID;
    }

    public void setObject1(Objects object1) {
        this.object1 = object1;
    }

    public void setObject2(Objects object2) {
        this.object2 = object2;
    }

    public void setObject3(Objects object3) {
        this.object3 = object3;
    }

    public void setObject4(Objects object4) {
        this.object4 = object4;
    }

    public void setResult(double result) {
        this.averageResult = result;
    }

    public void setDateExam(LocalDate dateExam) {
        this.dateExam = dateExam;
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


    public double countAverage(){
        return (object1.getScore() + object2.getScore() +object3.getScore() +object4.getScore())/4;
    }


    public double getResult() {
        return averageResult;
    }

    public LocalDate getDateExam() {
        return dateExam;
    }

    public boolean passedWihtHonor(double averageResult){
        return (averageResult >0) && (averageResult <=1.5);
    }


    public boolean passed(){
        return ((object1.getScore() < 5 && object1.getScore() > 0) &&
                (object2.getScore() < 5 && object1.getScore() > 0) &&
                (object3.getScore() < 5 && object1.getScore() > 0) &&
                (object4.getScore() < 5 && object1.getScore() > 0));
    }

    public boolean notPassed(){

        return object1.getScore() == 5 || object2.getScore() ==5 || object3.getScore()== 5 || object4.getScore()== 5;
    }

    public  boolean isAfterExam(LocalDate dateExam){
        return dateExam.isBefore(LocalDate.now());
    }



}
