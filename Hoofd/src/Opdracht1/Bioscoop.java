package Opdracht1;

public class Bioscoop implements Ruimte {
    private String naam;
    private String adres;

    public Bioscoop(String nM, String aD) {
        this.naam = nM;
        this.adres = aD;
    }

    @Override
    public boolean lichtAan(){
        return true;
    }

    @Override
    public boolean opSlot(){
        return false;
    }

    @Override
    public String toString() {
        return "'"+naam+"'" + " - Adres: " + adres + "\n";
    }
}