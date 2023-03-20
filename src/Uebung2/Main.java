package Uebung2;

public class Main {

    public static void main(String[] args) {

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
