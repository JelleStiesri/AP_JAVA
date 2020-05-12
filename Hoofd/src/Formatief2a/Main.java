package Formatief2a;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node("Node-0",'A', 'B'); // Maakt de nodes aan
        Node node1 = new Node("Node-1",'A', 'B');
        Node node2 = new Node("Node-2",'A', 'B');
        Node node3 = new Node("Node-3",'A', 'B');
        Node node4 = new Node("Node-4",'A', 'B'); // Deze word niet gebuikt!!
        node0.setOption1(node2); // Set de opties voor de nodes
        node0.setOption2(node1);
        node1.setOption1(node1);
        node1.setOption2(node2);
        node2.setOption2(node3);
        node3.setOption1(node3);
        node3.setOption2(node0);

        ArrayList<Node> nodeList = new ArrayList<Node>();
        nodeList.add(node0);
        nodeList.add(node1);
        nodeList.add(node2);
        nodeList.add(node3);

        FSM fsm1 = new FSM("BAAB", nodeList); // test 1
        FSM fsm2 = new FSM("BAABAB", nodeList); // test 2
        FSM fsm3 = new FSM("BABBAABABA", nodeList); // test 3
        FSM fsm4 = new FSM("BABBAABAABA", nodeList); // test 4
        FSM fsm5 = new FSM("BABBAABCBA", nodeList); // test 5

        System.out.println(fsm1.Machine()+"\n"); // Succesvolle afronding
        System.out.println(fsm2.Machine()+"\n"); // Error
        System.out.println(fsm3.Machine()+"\n"); // Succesvolle afronding
        System.out.println(fsm4.Machine()+"\n"); // Error
        System.out.println(fsm5.Machine()+"\n"); // Error
    }
}