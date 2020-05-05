package Formatief2a;

public class Node {
    private String name;
    private char key1;  // key = vereiste letter om naar volgende stap te gaan
    private char key2;
    private Node option1;  // wanneer input = key1
    private Node option2;  // wanneer input = key2

    public Node(String nM,char k1, char k2) {
        this.name = nM;
        this.key1 = k1;
        this.key2 = k2;
    }

    public void setOption1(Node op1) {
        this.option1 = op1;
    }

    public void setOption2(Node op2) {
        this.option2 = op2;
    }

    public String getName() {
        return name;
    }

    public String toString(char let) {
        String result = "";
        try {
            if (let == key1) { // Optie 1
                result = option1.getName();
            } else if (let == key2) { // Optie 2
                result = option2.getName();
            }
        }catch (NullPointerException e) { // Wanneer een optie leeg is (en dus geen volgende stap heeft)
            result = "Error";
        }
        return result;
    }
}