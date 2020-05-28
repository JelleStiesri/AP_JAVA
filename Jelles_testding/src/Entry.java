public class Entry implements Comparable<Entry> {
    private String key;
    private int value;

    public Entry(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return key;
    }

    @Override
    public int compareTo(Entry employee) {
        if (this.getValue() > employee.getValue()) {
            return 1;
        } else if (this.getValue() < employee.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}