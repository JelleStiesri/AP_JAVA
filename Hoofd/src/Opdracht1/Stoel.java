package Opdracht1;

public class Stoel {
    private int nummer;
    private int rij;
    private boolean luxe;
    private Bezoeker persoon;
    private Zaal zaal;


    public Stoel(int Nr, int Rj, boolean Lux, Zaal zL) {
        this.nummer = Nr;
        this.rij = Rj;
        this.luxe = Lux;
        this.zaal = zL;
    }

    public void setPersoon(Bezoeker bz) {
        this.persoon = bz;
    }

    public double prijs() {
        if (luxe)
            return zaal.getFilmprijs() * 1.5; // Luxe stoelen kosten 50% meer
        else
            return zaal.getFilmprijs();
    }
    
}

