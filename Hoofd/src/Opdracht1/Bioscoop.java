package Opdracht1;

public class Bioscoop {
    private String naam;
    private String adres;
    private Zaal zaal;


    public Bioscoop(String nM, String aD) {
        this.naam = nM;
        this.adres = aD;
    }

    public void setZaal(Zaal zL) {
        this.zaal = zL;
    }


    @Override
    public String toString() {
        String antwoord = "'"+naam+"'" + " - Adres: " + adres + "\n";
//        antwoord += "Prijs stoel 10: " +

        return antwoord;

    }
}
