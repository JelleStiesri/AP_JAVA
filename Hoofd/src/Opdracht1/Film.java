package Opdracht1;

public class Film {
    private String naam;
    private int lengte;
    private double prijs;

    public Film(String nM, int len){
        this.naam = nM;
        this.lengte = len;
    }

    public double getPrice() {
        return prijs;
    }

    public int getLengte(){
        return lengte;
    }

    public String getNaam(){
        return naam;
    }

    public void setPrice(double pr) {
        this.prijs = pr;
    }
}