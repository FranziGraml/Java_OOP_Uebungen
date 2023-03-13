package uebung1;

import java.util.Arrays;

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
        gueltigesDatum(tag, monat);
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
    }

    public static void gueltigesDatum(int tag, int monat) {
        int[] thirtyDays = {4, 6, 9, 11};
        Integer[] thirtyOneDays = {1, 3, 5, 7, 8, 10, 12};
        boolean thirtyDaysContainsMonth = isInArray(thirtyDays, monat);
        boolean thirtyOneDaysContainsMonth = Arrays.asList(thirtyOneDays).contains(monat);
        boolean isFebruary = (monat == 2);
        System.out.println(thirtyOneDaysContainsMonth);
        if (monat < 1 || monat > 12) {   // Monate sollen zwischen 1 && 12 liegen
            throw new IllegalArgumentException("Monatsangabe ungültig");
        }
        if (thirtyDaysContainsMonth && (tag < 1 || tag > 30)) {
            throw new IllegalArgumentException("Datumseingabe ungültig");
        }
        if (thirtyOneDaysContainsMonth && (tag < 1 || tag > 31)) {
            throw new IllegalArgumentException("Datumseingabe ungültig");
        }
        if (isFebruary && (tag < 1 || tag > 28)) {
            throw new IllegalArgumentException("Datumseingabe ungültig");
        }
    }

    public static boolean isInArray(int[] arr, int zahl) {
        for(int element : arr) {
            if(element == zahl) {
                return true;
            }
        }
        return false;
    }

}







