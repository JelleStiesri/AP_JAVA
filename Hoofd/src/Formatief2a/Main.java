package Formatief2a;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node("node0",'A', 'B');
        Node node1 = new Node("node1",'A', 'B');
        Node node2 = new Node("node2",'A', 'B');
        Node node3 = new Node("node3",'A', 'B');
        node0.setOption1(node2);
        node0.setOption2(node1);
        node1.setOption1(node1);
        node1.setOption2(node2);
        node2.setOption2(node3);
        node3.setOption1(node3);
        node3.setOption2(node0);

        FSM fsm1 = new FSM("BAABAB", node0,node1,node2,node3);
        System.out.println(fsm1.machine());



    }
}
