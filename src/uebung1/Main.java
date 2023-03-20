package uebung1;

import uebung1.Person;



public class Main {
    public static void main(String[] args) {
        Person franzi = new Person("Franzi", "Müller",1,8,1997);
        Person oliver = new Person("Oli","Müller");
        oliver.setGeburtsdatum(29,2,2021);
        int alter;
        alter = franzi.berechneAlter(15, 3, 2023);
        System.out.println( franzi.getVorname() + franzi.getNachname() + " ist " + alter + " Jahre alt ");
        alter = oliver.berechneAlter(15,3,2023);
        System.out.println( oliver.getVorname() + oliver.getNachname() + " ist " + alter + " Jahre alt ");



    }

}

























