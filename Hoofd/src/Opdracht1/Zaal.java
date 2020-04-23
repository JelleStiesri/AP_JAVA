package Opdracht1;

public class Zaal {
    private String zaalnaam;
    private int stoelen;
    private Film film;
    private double filmprijs;


    public Zaal(String nM, int St) {
        this.zaalnaam = nM;
        this.stoelen = St;
    }

    public void setFilm(Film fm) {
        this.film = fm;
        this.filmprijs = fm.getPrice();
    }

    public double getFilmprijs() {
        return filmprijs;
    }



}
