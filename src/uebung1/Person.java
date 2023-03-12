package uebung1;

public class Person {

    //Eigenschaften |Attribute

    private String vorname;
    private String nachname;
    private int geburtstag;
    private int geburtsmonat;
    private int geburtsjahr;


    //Konstruktor
    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }


    public Person(String vorname, String nachname, int geburtstag, int geburtsmonat, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
        this.geburtsmonat = geburtsmonat;
        this.geburtsjahr = geburtsjahr;


    }


    public void setGeburtsdatum(int tag, int monat, int jahr) {
        this.geburtstag = tag;
        this.geburtsmonat = monat;
        this.geburtsjahr = jahr;
    }


    //Methoden | Getter und Setter
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGeburtstag() {
        return geburtstag;
    }

    public int getGeburtsmonat() {
        return geburtsmonat;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public static int berechneAlter(int tag, int monat, int jahr) {
        int alter = 0;
        int aktuellerTag = 13;
        int aktuellerMonat = 3;
        int aktuellesJahr = 2023;
        alter = aktuellesJahr - jahr;
        if (aktuellerMonat < monat) {
            alter -= 1;
        } else if (aktuellerMonat == monat && aktuellerTag < tag) {
            alter -= 1;
        }
        return alter;

        public void gueltigesDatum() {

        [0]  = 28;
        int[1]  = 30;
        int[2]  = 31;

        if()


        }

    }
}

