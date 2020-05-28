public class Stap extends Node {
    private Reis reis;

    public Stap(String name) {
        super(name);
    }

    public void setReis(Reis rs) {
        this.reis = rs;
    }

    public Reis getReis() {
        return reis;
    }
}
