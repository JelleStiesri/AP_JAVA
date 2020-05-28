public class Steen {
    private String name;
    private int afstand;

    public Steen(String name) {
        this.name = name;

    }

    public void setAfstand(int af) {
        this.afstand = af;
    }

    public int getAfstand() {
        return afstand;
    }

    public String toString() {
        return name;
    }


}
