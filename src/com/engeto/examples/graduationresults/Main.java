package com.engeto.examples.graduationresults;

/*Potřebujeme nějak evidovat maturitní výsledky studentů - každý student má
jméno, příjmení, datum narození, patří do nějaké třídy a maturuje ze čtyř předmětů
- z každého dostane jednu známku a nakonec buď prospěje z vyznamenáním, prospěje,
a nebo neprospěje - všechny tyhle údaje potřebujeme nějak evidovat
a na vás je vymyslet a naprogramovat to jak.

A protože jsou naši programátoři poněkud líní, tak je velmi potěší,
 když jestě vytvoříte i metodu, pomocí které půjde jednoduše vypsat,
 jak ten daný student dopadl a druhou metodu, která zjistí, jestli už má maturitu za sebou.*/

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Student student1 = new Student("Martin","Mrkva",
                LocalDate.of(1995,12,12),"4A",
                LocalDate.of(2020,12,12));

        Student student2 = new Student("Petr","Hruška",
                LocalDate.of(1995,12,12),"4B",
                        LocalDate.of(2021,06,12));
        Student student3 = new Student("František","Malý",
                LocalDate.of(1995,12,12),"4A",
                LocalDate.of(2020,06,12));
        Student student4 = new Student("Jana","Bílá",
                LocalDate.of(1995,12,12),"4B",
                LocalDate.of(2020,06,12));

        student1.getObject1().setScore((byte)1);
        student1.getObject2().setScore((byte) 1);
        student1.getObject3().setScore((byte) 1);
        student1.getObject4().setScore((byte) 1);

        student2.getObject1().setScore((byte) 0);
        student2.getObject2().setScore((byte) 0);
        student2.getObject3().setScore((byte) 0);
        student2.getObject4().setScore((byte) 0);

        student3.getObject1().setScore((byte) 5);
        student3.getObject2().setScore((byte) 5);
        student3.getObject3().setScore((byte) 5);
        student3.getObject4().setScore((byte) 5);

        student4.getObject1().setScore((byte) 1);
        student4.getObject2().setScore((byte) 2);
        student4.getObject3().setScore((byte) 3);
        student4.getObject4().setScore((byte) 5);



        System.out.println("********************************** Student 1 *************************************");

        System.out.println("Student: " + student1.getName()+ " " + student1.getSurname() + " Datum narození: " +
        student1.getDateBirth()+ " dosáhl následujících výsledků: ");
        System.out.println("Předmět 1: " + student1.getObject1().getObjectsName() + " Známka: " + student1.getObject1().getScore());
        System.out.println("Předmět 2: " + student1.getObject2().getObjectsName() + " Známka: " + student1.getObject2().getScore());
        System.out.println("Předmět 3: " + student1.getObject3().getObjectsName() + " Známka: " + student1.getObject3().getScore());
        System.out.println("Předmět 4: " + student1.getObject4().getObjectsName() + " Známka: " + student1.getObject4().getScore());
        System.out.println(" ");
        System.out.println("Maturitní zkoušku složil s vyznamenáním " + student1.passedWihtHonor(student1.countAverage()) + " průměr matritní zkoušky je " + student1.countAverage());
        System.out.println("Maturitní zkoušku složil " + student1.passed()) ;
        System.out.println("Maturitní zkoušku nesložil " + student1.notPassed());

        System.out.println("Maturitní zkoušku již absolvoval " + student1.isAfterExam(student1.getDateExam()));
        System.out.println(" ");

        System.out.println("********************************** Student 2 *************************************");

        System.out.println("Student: " + student2.getName()+ " " + student2.getSurname() + " Datum narození: " +
                student2.getDateBirth()+ " dosáhl následujících výsledků: ");
        System.out.println("Předmět 1: " + student2.getObject1().getObjectsName() + " Známka: " + student2.getObject1().getScore());
        System.out.println("Předmět 2: " + student2.getObject2().getObjectsName() + " Známka: " + student2.getObject2().getScore());
        System.out.println("Předmět 3: " + student2.getObject3().getObjectsName() + " Známka: " + student2.getObject3().getScore());
        System.out.println("Předmět 4: " + student2.getObject4().getObjectsName() + " Známka: " + student2.getObject4().getScore());
        System.out.println(" ");
        System.out.println("Maturitní zkoušku složil s vyznamenáním " + student2.passedWihtHonor(student2.countAverage()));
        System.out.println("Maturitní zkoušku složil " + student2.passed());
        System.out.println("Maturitní zkoušku nesložil " + student2.notPassed());

        System.out.println("Maturitní zkoušku již absolvoval " + student2.isAfterExam(student2.getDateExam()));
        System.out.println(" ");
        System.out.println("********************************** Student 3 *************************************");
        System.out.println("Student: " + student3.getName()+ " " + student3.getSurname() + " Datum narození: " +
                student3.getDateBirth()+ " dosáhl následujících výsledků: ");
        System.out.println("Předmět 1: " + student3.getObject1().getObjectsName() + " Známka: " + student3.getObject1().getScore());
        System.out.println("Předmět 2: " + student3.getObject2().getObjectsName() + " Známka: " + student3.getObject2().getScore());
        System.out.println("Předmět 3: " + student3.getObject3().getObjectsName() + " Známka: " + student3.getObject3().getScore());
        System.out.println("Předmět 4: " + student3.getObject4().getObjectsName() + " Známka: " + student3.getObject4().getScore());
        System.out.println(" ");
        System.out.println("Maturitní zkoušku složil s vyznamenáním " + student3.passedWihtHonor(student3.getResult()));
        System.out.println("Maturitní zkoušku složil " + student3.passed()) ;
        System.out.println("Maturitní zkoušku nesložil " + student3.notPassed());

        System.out.println("Maturitní zkoušku již absolvoval " + student3.isAfterExam(student3.getDateExam()));
        System.out.println(" ");
        System.out.println("********************************** Student 4 *************************************");
        System.out.println("Student: " + student4.getName()+ " " + student4.getSurname() + " Datum narození: " +
                student1.getDateBirth()+ " dosáhl následujících výsledků: ");
        System.out.println("Předmět 1: " + student4.getObject1().getObjectsName() + " Známka: " + student4.getObject1().getScore());
        System.out.println("Předmět 2: " + student4.getObject2().getObjectsName() + " Známka: " + student4.getObject2().getScore());
        System.out.println("Předmět 3: " + student4.getObject3().getObjectsName() + " Známka: " + student4.getObject3().getScore());
        System.out.println("Předmět 4: " + student4.getObject4().getObjectsName() + " Známka: " + student4.getObject4().getScore());
        System.out.println(" ");
        System.out.println("Maturitní zkoušku složil s vyznamenáním " + student4.passedWihtHonor(student4.getResult()));
        System.out.println("Maturitní zkoušku složil " + student4.passed()) ;
        System.out.println("Maturitní zkoušku nesložil " + student4.notPassed());

        System.out.println("Maturitní zkoušku již absolvoval " + student4.isAfterExam(student4.getDateExam()));




    }




}
