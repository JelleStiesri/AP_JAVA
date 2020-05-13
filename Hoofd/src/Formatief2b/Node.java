package Formatief2b;
import java.util.*;

public class Node {
    private String name;
    private double chance1;
    private double chance2;
    private Node option1;
    private Node option2;

    public Node(String name) {
        this.name = name;
    }

    public void setOption1(Node op1) {
        this.option1 = op1;
    }

    public void setOption2(Node op2) {
        this.option2 = op2;
    }

    public void setChance(double ch1, double ch2){
        this.chance1 = ch1;
        this.chance2 = ch2;
    }

    public Node giveNode() {
        if (chance1 == 0.0) { // = gelijk aan EndNode
            return null; // Eindigt loop
        }else {
           int numb = giveRandom();
            if (numb == 0) {
                return option1;
            }else{
                return option2;
                }
        }
    }

    public int giveRandom() { // DIT MOET NOG GEFIXT WORDEN MET DE KANS
        Random r = new Random();
        int ans = r.nextInt(2); // random tussen 1 en 0
        return ans;
    }

    public String toString() {
        return name;
    }
}
