package Summatief2;
import Opstartopdrachten.Testfile.Steen;
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
//
//package Summatief2;
//        import java.util.*;
//
//public class Node {
//    private String name;
//    private Node option1;
//    private Node option2;
//    private boolean finalNode;
//    //Voor Tekst
//    private char key1;
//    private char key2;
//    // Voor Kans
//    private double chance1;
//    private double chance2;
//
//    public Node(String name, boolean finalNode) {
//        this.name = name;
//        this.finalNode = finalNode;
//    }
//
//    public void setOption1(Node op1) {
//        this.option1 = op1;
//    }
//
//    public void setOption2(Node op2) {
//        this.option2 = op2;
//    }
//
//    public void setChance(double ch1, double ch2){
//        this.chance1 = ch1;
//        this.chance2 = ch2;
//    }
//
//    public void setKeys(char k1, char k2) {
//        this.key1 = k1;
//        this.key2 = k2;
//    }
//
//    public Node ReturnStringNode(char let) { // Tekstgebaseerd
//        if (let == key1) { // optie 1
//            return option1;
//        } else if (let == key2) {
//            return option2;
//        } else {
//            return null;}
//    }
//
//    public int giveRandom() { // Voor Monte Carlo
//        Random r = new Random();
//        int ans = r.nextInt(100)+1; // random tussen 1 en 100
//        return ans;
//    }
//
//    public Node ReturnChanceNode() { // Voor Monte Carlo
//        if (chance1 == 0.0) { // = gelijk aan EndNode
//            return null; // Eindigt loop
//        }else {
//            double Max1 = chance1*100;
//            double numb = giveRandom();
//            if (numb <= Max1) { // Random getal onder max1
//                return option1;
//            }else{
//                return option2;
//            }
//        }
//    }
//
//    public String toString() {
//        return name;
//    }
//}

