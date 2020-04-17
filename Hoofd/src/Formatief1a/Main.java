package Formatief1a;
// Ik heb samengewerkt met mijn leergroepje
// Wel heeft iedereen alles voor zichzelf geschreven

public class Main {
    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur: " + ah1.toString());

        Klant kla = new Klant("Mijnheer de Vries");
        kla.setKorting(10.0);
        ah1.setHuurder(kla);
        System.out.println("Eerste autohuur: " + ah1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: \n" + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(kla);
        ah1.setAantalDagen(1);
        System.out.println("Tweede autohuur: \n" + ah1.toString());

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}