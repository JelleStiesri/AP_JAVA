public class Stap {
    private int number;
    private Reis reis; // 1 stap heeft 1 reis
    private Double kosten; //Kosten alsin waarde om de stap te maken


    public Stap(Double dist, Double factor) {
        this.kosten = dist * factor;
    }

    public void setReis(Reis rs) {
        this.reis = rs;
    }

    public void setNumber(int numb) {
        this.number = numb;
    }

    public Reis getReis() {
        return reis;
    }

    public Double getKosten(){
        return kosten;
    }

    public String toString() {
        return "Nummer: "+number;
    }



}
