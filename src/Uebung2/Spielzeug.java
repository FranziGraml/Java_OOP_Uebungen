package Uebung2;

public class Spielzeug extends Artikel{

    int altersempfehlung;

    public Spielzeug(String name, double preis, int lagerbestand, int altersempfehlung) {
        super(name, preis, lagerbestand);
        this.altersempfehlung = altersempfehlung;
    }
    public Spielzeug(String name, double preis, int altersempfehlung) {
        super(name, preis, 0);
        this.altersempfehlung = altersempfehlung;
    }

    public int getAltersempfehlung() {
        return altersempfehlung;
    }

    public void setAltersempfehlung(int altersempfehlung) {
        this.altersempfehlung = altersempfehlung;
    }
}
