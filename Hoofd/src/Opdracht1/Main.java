package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Bioscoop bios1 = new Bioscoop("Biosopo", "Cavialaan 10");

        Zaal zaal1 = new Zaal("Zaal 1", 200);
        bios1.setZaal(zaal1);
        System.out.println("Eerste bioscoopbezoek: " + bios1.toString());

        Film film1 = new Film("Jelle's gekke avonturen",125);
        film1.setPrice(10);
        zaal1.setFilm(film1);

        Stoel stoel1 = new Stoel(10,3,true, zaal1);
        System.out.println("Prijs stoel 10: " + stoel1.prijs());



    }
}
