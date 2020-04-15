package main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String name = "Henk"; // Maakt name "Henk"

        Pension pension = new Pension("Pension_het_Hondje");
        pension.addDog(name);
        pension.addDog("Klaas");
        pension.addDog("Pietje");

        System.out.println(pension); // Print het overzicht van een pension
//        System.out.println(hdog); // Print naam van hond
    }}