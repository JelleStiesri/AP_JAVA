package Summatief2;
import java.util.*;

public class FSM {
    private ArrayList<Node> nodes; // array van nodes
    private char[] woord; // Voor Tekstgebaseerd

    public FSM(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void setWoord(String  woord) {
        this.woord = woord.toCharArray();
    }

    public ArrayList<Node> ChanceMachine() {
        int index = 0;
        Node nodeNow = nodes.get(0);
        ArrayList<Node> NodeAnsList = new ArrayList<Node>(); // Antwoord array
        NodeAnsList.add(0, nodeNow); // Zet stap 0 in array

        while (true) { // Loop blijft gaan tot een eindnode is bereikt.
            index += 1;
            Node nodeNew = nodeNow.ReturnChanceNode();
            NodeAnsList.add(index, nodeNew);
            if (nodeNew.isFinalNode()) { // Wanneer node = eindnode
                System.out.println("Eindigt na "+ (index+1)+" node(s)");
                return NodeAnsList;
            }else {
                nodeNow = nodeNew;
            }
        }
    }

    public ArrayList<Node> TextMachine() {
        System.out.println("Woord: "+String.copyValueOf(woord));
        int len = woord.length;
        int index;
        Node nodeNow = nodes.get(0); // Huidige Node
        ArrayList<Node> NodeAnsList = new ArrayList<Node>(); // Maakt lijst voor antwoorden
        NodeAnsList.add(0,nodeNow);

        for (index = 0; index < len; index++){
                Node nodeNew = nodeNow.ReturnStringNode(woord[index]);
                if (nodeNew != null) {
                    NodeAnsList.add(index + 1, nodeNew);
                    nodeNow = nodeNew;
                } else { // Node heeft geen keys die overeen komen met de letter
                    System.out.println(String.format("Error op plek %d \nHet volgende teken is geen key in machine",index+1 ));
                    return NodeAnsList;
                }
            }
        System.out.println("Succesvol afgerond");
        return NodeAnsList;
        }
}