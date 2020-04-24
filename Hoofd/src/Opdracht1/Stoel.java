package Opdracht1;

public class Stoel {
    private int nummer;
    private int rij;
    private boolean luxe;
    private Zaal zaal;

    public Stoel(int Nr, int Rj, boolean Lux, Zaal zL) {
        this.nummer = Nr;
        this.rij = Rj;
        this.luxe = Lux;
        this.zaal = zL;
    }

    @Override
    public String toString() {
        String antwoord = "\n";
        antwoord +=  String.format("Zitplek: %s - Rij: %s - Stoel: %s", zaal.getZaalnaam(), rij, nummer);
        if (luxe)
            antwoord += String.format("\n   Kosten ticket: %s € (Luxe stoelen)",zaal.getFilmprijs() * 1.5); // Luxe stoelen kosten 50% meer
        else
            antwoord += String.format("\n   Kosten ticket: %s € (Normale stoelen)",zaal.getFilmprijs());;
        antwoord += "\n" + zaal.toString();
        return antwoord;
    }
}