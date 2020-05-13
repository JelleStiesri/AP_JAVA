package Summatief2;
import java.util.*;

public class FSM {
    private ArrayList<Node> nodes; // array van nodes
    private char[] woord; // Voor Tekstgebaseerd
    private String Swoord; // Puur om te printen, geen functionele toevoeging

    public FSM(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void setWoord(String  woord) {
        this.woord = woord.toCharArray();
        this.Swoord = woord;
    }

    public ArrayList<Node> ChanceMachine() {
        int index = 0;
        Node nodeNow = nodes.get(0);
        ArrayList<Node> NodeAnsList = new ArrayList<Node>(); // Antwoord array
        NodeAnsList.add(0, nodeNow); // Zet stap 0 in array

        while (true) {
            try {
                index += 1;
                Node nodeNew = nodeNow.ReturnChanceNode();
                NodeAnsList.add(index, nodeNew);
                nodeNow = nodeNew;
            } catch(NullPointerException e) {
                System.out.println("Eindigt na "+ (index-1)+" nodes");
                NodeAnsList.remove(index-1); // Haalt 'null' weg uit array
                return NodeAnsList;
            }
        }
    }

    public ArrayList<Node> TextMachine() {
        System.out.println("Woord: "+Swoord);
        int len = woord.length;
        int index;
        Node nodeNow = nodes.get(0); // Huidige Node
        ArrayList<Node> NodeAnsList = new ArrayList<Node>(); // Maakt lijst voor antwoorden
        NodeAnsList.add(0,nodeNow);

        for (index = 0; index < len; index++){
            try {
                Node nodeNew = nodeNow.ReturnStringNode(woord[index]);
                NodeAnsList.add(index+1, nodeNew);
                nodeNow = nodeNew;
            }catch(NullPointerException e) { // Wanneer null gereturnt word
                System.out.println(toString(index));
                NodeAnsList.remove(index);
                return NodeAnsList;
            }
        }
        return NodeAnsList;
    }

    public String toString(int index) {  // Error bericht
        return String.format("Error op plek %d \nHet volgende teken is geen key in machine",index+1 );
    }
}
