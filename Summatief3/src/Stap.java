public class Stap implements Comparable<Stap> {
    private Reis reis;
    private Node key;
    private int value;

    public Stap(Node key, int value) {
        this.key = key;
        this.value = value;
    }

    public void setReis(Reis rs) {
        this.reis = rs;
    }

    public Reis getReis() {
        return reis;
    }

    public int getValue() {
        return value;
    }

    public Node getKey() {
        return key;
    }

    @Override
    public int compareTo(Stap stap) { // Vergelijkt alle nodes in de prioQueue
        if (this.getValue() > stap.getValue()) {
            return 1;
        } else if (this.getValue() < stap.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }

}
