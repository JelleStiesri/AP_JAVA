package Formatief2b;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node("Node-0"); // Maakt de nodes aan
        Node node1 = new Node("Node-1");
        Node node2 = new Node("Node-2");
        Node node3 = new Node("Node-3");
        Node node4 = new Node("Node-4");
        Node node5 = new Node("Node-5");
        Node node6 = new Node("Node-6");
        node0.setChance(0.5,0.5);
        node1.setChance(0.5,0.5);
        node2.setChance(0.5,0.5);
        node3.setChance(0.5,0.5);
        node4.setChance(0.5,0.5);
        node5.setChance(0.5,0.5);
        node6.setChance(0.5,0.5);

        Node end1 = new Node("1 Oog"); // Maakt de eindnodes aan
        Node end2 = new Node("2 Ogen");
        Node end3 = new Node("3 Ogen");
        Node end4 = new Node("4 Ogen");
        Node end5 = new Node("5 Ogen");
        Node end6 = new Node("6 Ogen");

        node0.setOption1(node1); // Set alle opties
        node0.setOption2(node2);
        node1.setOption1(node3);
        node1.setOption2(node4);
        node3.setOption1(node1);
        node3.setOption2(end1);
        node4.setOption1(end2);
        node4.setOption2(end3);
        node2.setOption1(node5);
        node2.setOption2(node6);
        node5.setOption1(end4);
        node5.setOption2(end5);
        node6.setOption1(node2);
        node6.setOption2(end6);

        ArrayList<Node> nodeList = new ArrayList<Node>(); // Maakt array met alle nodes voor machine
        nodeList.add(node0);
        nodeList.add(node1);
        nodeList.add(node2);
        nodeList.add(node3);
        nodeList.add(node4);
        nodeList.add(node5);
        nodeList.add(node6);
        nodeList.add(end1);
        nodeList.add(end2);
        nodeList.add(end3);
        nodeList.add(end4);
        nodeList.add(end5);
        nodeList.add(end6);

        DTMC dtmc1 = new DTMC(nodeList); // Maakt machine aan

        System.out.println(dtmc1.Machine()+"\n"); // Test 5 keer
        System.out.println(dtmc1.Machine()+"\n");
        System.out.println(dtmc1.Machine()+"\n");
        System.out.println(dtmc1.Machine()+"\n");
        System.out.println(dtmc1.Machine()+"\n");
    }
}
