package Formatief2b;
import java.util.*;

public class DTMC {
    private ArrayList<Node> nodes; // array van nodes

    public DTMC(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Node> Machine() {
        int index = 0;
        Node nodeNow = nodes.get(0);
        ArrayList<Node> NodeAnsList = new ArrayList<Node>(); // Antwoord array
        NodeAnsList.add(0, nodeNow); // Zet stap 0 in array

        while (true) {
            try {
                index += 1;
                Node nodeNew = nodeNow.giveNode();
                NodeAnsList.add(index, nodeNew);
                nodeNow = nodeNew;
            } catch(NullPointerException e) {
                System.out.println("Eindigt na "+ (index-1)+" nodes");
                NodeAnsList.remove(index-1); // Haalt 'null' weg uit array
                return NodeAnsList;
            }
        }
    }

}