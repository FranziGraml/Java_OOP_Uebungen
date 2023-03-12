import uebung1.Person;



public class Main {
    public static void main(String[] args) {
        Person person = new Person("Franzi", "Graml");
        int alter = person.berechneAlter(1, 03, 1987);
        System.out.println( person.getVorname() + person.getNachname() + " ist " + alter + " Jahre alt ");


    }

}