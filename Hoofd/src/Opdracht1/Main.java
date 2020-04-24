package Opdracht1;

public class Main {
    public static void main(String[] args) {
        Bioscoop bios1 = new Bioscoop("Biosopo", "Cavialaan 10");

        Zaal zaal1 = new Zaal("Blauwe zaal", 200, bios1);
        System.out.println("Bioscoop: " + bios1.toString());

        Film film1 = new Film("Peters gekke avonturen",125); // Maakt film 1
        film1.setPrice(10);
        zaal1.setFilm(film1);
        Stoel stoel1 = new Stoel(10,3,false, zaal1); // Maakt stoel 1

        // Test bezoeker zonder stoel
        Bezoeker bezoeker1 = new Bezoeker("Jelle", false);
        System.out.println("Bezoeker 1: " + bezoeker1.toString()); // Zonder ticket
        bezoeker1.setTicket(true);
        System.out.println("Bezoeker 1: " + bezoeker1.toString()); // Met ticket

        // Test bezoeker met stoel
        bezoeker1.setStoel(stoel1);
        System.out.println("Bezoeker 1: " + bezoeker1.toString());

        // Test nieuwe bezoeker, Zaal & Film
        Zaal zaal2 = new Zaal("Rode zaal", 340,bios1);
        Film film2 = new Film("De 4 geitjes", 165);
        film2.setPrice(13);
        zaal2.setFilm(film2);
        Bezoeker bezoeker2 = new Bezoeker("Henk", true);
        Stoel stoel2 = new Stoel(15,6,true, zaal2);
        bezoeker2.setStoel(stoel2);
        System.out.println("Bezoeker 2: " + bezoeker2.toString()); // Print nieuwe bezoeker

        // Test nieuwe bioscoop, zelfde film, zelfde bezoeker
        Bioscoop bios2 = new Bioscoop("Pothe", "Hogestraat 32");
        Zaal zaal3 = new Zaal("Parel zaal", 120, bios2);
        System.out.println("========================================\n"+"Bioscoop: " + bios2.toString()); // == afscheiding

        zaal3.setFilm(film1);
        Stoel stoel3 = new Stoel(5,2,true, zaal3);
        bezoeker1.setStoel(stoel3);
        System.out.println("Bezoeker 1: " + bezoeker1.toString());
    }
}
