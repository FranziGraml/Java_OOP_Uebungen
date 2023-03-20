package Uebung2;

public class Kleidung extends Artikel{

    String farbe;
    int groesse;

    public Kleidung(String name, double preis, int lagerbestand, String farbe, int groesse) {
        super(name, preis, lagerbestand);
        this.farbe = farbe;
        this.groesse = groesse;
    }

    public Kleidung(String name, double preis, String farbe, int groesse) {
        super(name, preis, 0);
        this.farbe = farbe;
        this.groesse = groesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }


}
