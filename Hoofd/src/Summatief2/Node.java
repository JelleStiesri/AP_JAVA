package Summatief2;
import java.util.*;

public class Node {
    private String name;
    private ArrayList<Node> options; //In array voor flexibelheid
    private boolean finalNode;
    //Voor Tekst
    private ArrayList<Character> keys; //In array voor flexibelheid
    // Voor Kans
    private ArrayList<Double> chances; // Voor monte Carlo


    public Node(String name, boolean finalNode) {
        this.name = name;
        this.finalNode = finalNode;
    }

    public void setOptions(ArrayList<Node> options) {
        this.options = options;
    }

    public void setKeys(ArrayList<Character> keys) {
        this.keys = keys;
    }

    public void setChance(ArrayList<Double> chances){
        this.chances = chances;
    }

    public boolean isFinalNode() {
        return finalNode;
    }

    public Node ReturnStringNode(char let) { // Tekstgebaseerd
        if (keys.contains(let)) {
            int index = keys.indexOf(let);
            return options.get(index);
        } else {
            return null;
        }
    }

    public Node ReturnChanceNode() {
        double p = Math.random();
        double totalChance = 0.0;
        for (Node node : options) {
            int index = options.indexOf(node);
            totalChance += chances.get(index);
            if (p <= totalChance) {
                double kans = chances.get(index) * 100;
                System.out.println(String.format("%s - Kans op deze node was: %d Procent ",node,(int)kans));
                return node;
            }
        }
        return null; // Nooit gebruikt
    }

    public String toString() {
        return name;
    }
}


