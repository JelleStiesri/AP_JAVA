class PrioNode implements Comparable<PrioNode> {
    /* PrioNode is er om te zorgen dat ik makkelijk een Priority queue kan maken
    Ik maak in de Dijkstra class een neiuwe prionode aan voor elke keer dat er gekeken word
    welk item de laagste value heeft (maar dan blijven de nodes in de prioqueu staan ipv de value)
     */
    private Node key;
    private Double value;

    public PrioNode(Node key, Double value) {
        this.key = key;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public Node getKey() {
        return key;
    }

    @Override // Ingebouwd in java
    public int compareTo(PrioNode entry) {
        if (this.getValue() > entry.getValue()) {
            return 1;
        } else if (this.getValue() < entry.getValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}