package Opstartopdrachten.main;

public class Main {
    public static void main(String[] args) {
        String name = "Henk"; // Maakt name "Henk"

        Pension pension = new Pension("Pension_het_Hondje");
        pension.addAnimal(name);
        pension.addAnimal("Klaas");
        pension.addAnimal("Pietje");

        System.out.println(pension); // Print het overzicht van een pension
//        System.out.println(hdog); // Print naam van hond
    }}