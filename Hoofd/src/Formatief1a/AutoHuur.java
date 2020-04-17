package Formatief1a;
import Formatief1a.*;

public class AutoHuur {
    private int aantalDagen;
    private Auto gA;
    private Klant k;

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant k) {
        this.k = k;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gA = gA;
    }

    public Klant getHuurder() {
        return k; // Werkt nog niet. krijg datawaarde terug
    }

    public Auto getGehuurdeAuto() {
        return gA; // Werkt nog niet. krijg datawaarde terug
    }

    public double totaalPrijs() {
        return ((Auto.getPrijsPerDag()/100*(100-Klant.getKorting()))*aantalDagen);
    }

    public String toString() {
        String gehu;
        if (gA == null) {
            gehu = "Er is geen auto bekend";
        }
        else {
            gehu=Auto.toString1();
        }
        String kla;
        if (k == null) {
            kla ="Er is geen huurder bekend";
        }
        else {
            kla =Klant.toString2();
        }
        String lines = gehu+"\n"+kla+"\n"+"aantal dagen: "+aantalDagen+" en dat kost: "+totaalPrijs()+" euro\n";
        return lines;}
}

