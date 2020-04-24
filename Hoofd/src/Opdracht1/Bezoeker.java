package Opdracht1;

public class Bezoeker {
    private String naam;
    private boolean ticket;
    private Stoel stoel;

    public Bezoeker(String nM, boolean tt) {
        this.naam = nM;
        this.ticket = tt;
    }

    public void setTicket(boolean tK) {
        this.ticket = tK;
    }

    public void setStoel(Stoel sL) {
        if (ticket) // Bezoeker kan geen stoel reserveren als deze nog geen ticket heeft
            this.stoel = sL;
    }

    @Override
    public String toString(){
        String antwoord = "";
        if (ticket)
            try {
                antwoord +=  stoel.toString() + "\n";
            }catch(NullPointerException e) {
                antwoord += naam + " heeft nog geen stoel gereserveerd. \n";
            }
        else
            antwoord += naam + " heeft nog geen ticket gekocht\n";
        return antwoord;
    }
}