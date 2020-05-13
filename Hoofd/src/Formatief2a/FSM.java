package Formatief2a;
import java.util.*;

public class FSM {
    private char[] woord;
    private String Swoord; // Puur om te printen, geen functionele toevoeging
    private ArrayList<Node> nodes; // array van nodes


    public FSM(String wR, ArrayList<Node> nodes) { // Node n0, Node n1, Node n2, Node n3
        this.woord = wR.toCharArray();
        this.Swoord = wR;
        this.nodes = nodes;
    }


    public ArrayList<Node> Machine() {
        System.out.println("Woord: "+Swoord);
        int len = woord.length;
        int index;
        Node nodeNow = nodes.get(0);
        ArrayList<Node> NodeAnsList = new ArrayList<Node>();
        NodeAnsList.add(0,nodeNow);

        for (index = 0; index < len; index++){
            try {
                Node nodeNew = nodeNow.giveNode(woord[index]);
                NodeAnsList.add(index+1, nodeNew);
                nodeNow = nodeNew;
            }catch(NullPointerException e) {
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