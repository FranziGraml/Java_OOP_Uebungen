package Uebung2;

public class Artikel {
    private String name;
    private double preis;
    private int lagerbestand;
    private int nummer;

    public Artikel(String name, double preis, int lagerbestand) {
        this.name = name;
        this.preis = preis;
        this.lagerbestand = lagerbestand;
        this.nummer = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getLagerbestand() {
        return lagerbestand;
    }

    public int getNummer() {
        return nummer;
    }

    public void lagerbestandVeraendern(int newLagerbestand) {
        if(newLagerbestand >= 0) {
            lagerbestand += newLagerbestand;
            System.out.println("Der Lagerbestand wurde erfolgreich geändert");
        } else {
            int result = lagerbestand + newLagerbestand;
            if(result >= 0) {
                lagerbestand = result;
                System.out.println("Der Lagerbestand wurde erfolgreich geändert");
            } else {
                System.out.println("Diese Änderung im Lagerbestand ist nicht möglich");
            }
        }
    }



}

