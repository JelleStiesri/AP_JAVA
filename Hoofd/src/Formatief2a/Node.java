package Formatief2a;

public class Node {
    private String name;
    private char key1;  // key = vereiste letter om naar volgende stap te gaan
    private char key2;
    private Node option1;  // wanneer input = key1
    private Node option2;  // wanneer input = key2

    public Node(String name,char k1, char k2) {
        this.name = name;
        this.key1 = k1;
        this.key2 = k2;
    }

    public void setOption1(Node op1) {
        this.option1 = op1;
    }

    public void setOption2(Node op2) {
        this.option2 = op2;
    }

    public Node giveNode(char let) {
        if (let == key1) { // optie 1
            return option1;
        } else if (let == key2) {
            return option2;
        } else {
            return null;}
        }

    public String toString() {
        return name;
    }
}
