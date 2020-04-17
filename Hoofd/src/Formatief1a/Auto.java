package Formatief1a;

public class Auto {
    private static String type;
    public static double prijsPerDag;

    public Auto(String tp, double prPd){
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd){
        this.prijsPerDag = prPd;
    }

    public static double getPrijsPerDag() {
        return prijsPerDag;
    }

    public static String toString1() {
        String line = "autotype: "+ type + " met prijs per dag: " +prijsPerDag;
        return line;
    }
}