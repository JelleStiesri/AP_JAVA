package Opdracht1;

public class Film {
    private String name;
    private int length;
    private double price;

    public Film(String nM, int len){
        this.name = nM;
        this.length = len;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        this.price = pr;
    }
}

