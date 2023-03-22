package Uebung2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Artikelnummer eingeben");
        String zahl = sc.nextLine();
        int length = zahl.length();
        if (length == 5){
            System.out.println("Artikelnummer ist gültig!");
        }else if( length <= 5){
            System.out.println("Artikelnummer muss fünfstellig sein!");
        }


        Kleidung kleidung = new Kleidung("T-Shirt", 15, 3, "red", 5);
        System.out.println("Lagerbestand: " + kleidung.getLagerbestand());
        kleidung.lagerbestandVeraendern(2);
        System.out.println("Lagerbestand plus 2: " + kleidung.getLagerbestand());
        kleidung.lagerbestandVeraendern(-2);
        System.out.println("Lagerbestand minus 2: " + kleidung.getLagerbestand());
        kleidung.lagerbestandVeraendern(-4);
        System.out.println("Lagerbestand minus 4: " + kleidung.getLagerbestand());







    }
}