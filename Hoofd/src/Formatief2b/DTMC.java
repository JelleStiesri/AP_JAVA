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
        ArrayList<Node> NodeAnsList = new ArrayList<Node>();
        NodeAnsList.add(0, nodeNow);

        while (true) {
            try {
                index += 1;
                Node nodeNew = nodeNow.giveNode();
                NodeAnsList.add(index + 1, nodeNew);
                nodeNow = nodeNew;
            } catch (NullPointerException e) {
                System.out.println("STOP");
                NodeAnsList.remove(index);
                return NodeAnsList;

            }

        }
    }

}


