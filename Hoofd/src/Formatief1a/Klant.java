package Formatief1a;

public class Klant {
    private static String naam;
    private static double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public void setKorting(double kP){
        this.kortingsPercentage = kP;
    }

    public static double getKorting() {
        return kortingsPercentage;
    }

    public static String toString2() {
        String line = "Op naam van: '" + naam + "' (korting: "+ kortingsPercentage+")";
        return line;
    }
}
