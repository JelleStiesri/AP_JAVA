package Formatief2a;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node("node0",'A', 'B'); // Maakt de nodes aan
        Node node1 = new Node("node1",'A', 'B');
        Node node2 = new Node("node2",'A', 'B');
        Node node3 = new Node("node3",'A', 'B');
        node0.setOption1(node2); // Set de opties voor de nodes
        node0.setOption2(node1);
        node1.setOption1(node1);
        node1.setOption2(node2);
        node2.setOption2(node3);
        node3.setOption1(node3);
        node3.setOption2(node0);

        FSM fsm1 = new FSM("BAAB", node0,node1,node2,node3); // test 1
        FSM fsm2 = new FSM("BAABAB", node0,node1,node2,node3); // test 2
        FSM fsm3 = new FSM("BABBAABABA", node0,node1,node2,node3); // test 3
        FSM fsm4 = new FSM("BABBAABAABA", node0,node1,node2,node3); // test 4
        FSM fsm5 = new FSM("BABBAABCBA", node0,node1,node2,node3); // test 5
        System.out.println(fsm1.machine()); // Succesvolle afronding
        System.out.println(fsm2.machine()); // Error
        System.out.println(fsm3.machine()); // Succesvolle afronding
        System.out.println(fsm4.machine()); // Error
        System.out.println(fsm5.machine()); // Error
    }
}