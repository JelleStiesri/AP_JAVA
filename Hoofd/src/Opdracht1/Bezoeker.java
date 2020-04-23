package Opdracht1;

public class Bezoeker {
    private String naam;
    private boolean ticket;
    private Stoel stoel;

    public Bezoeker(String nM) {
        this.naam = nM;
    }

    public boolean getTicket() {
        return ticket;
    }

    public void setTicket(boolean tK) {
        this.ticket = tK;
    }

    public void setStoel(Stoel sL) {
        this.stoel = sL;
    }

    @Override
    public String toString(){
        return naam;
    }
}