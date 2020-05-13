package Summatief2;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====Chance=====");
        Node cnode0 = new Node("Node-0"); // Maakt de nodes aan
        Node cnode1 = new Node("Node-1");
        Node cnode2 = new Node("Node-2");
        Node cnode3 = new Node("Node-3");
        Node cnode4 = new Node("Node-4");
        Node cnode5 = new Node("Node-5");
        Node cnode6 = new Node("Node-6");
        cnode0.setChance(0.5,0.5);
        cnode1.setChance(0.5,0.5);
        cnode2.setChance(0.5,0.5);
        cnode3.setChance(0.5,0.5);
        cnode4.setChance(0.5,0.5);
        cnode5.setChance(0.5,0.5);
        cnode6.setChance(0.5,0.5);

        Node end1 = new Node("1 Oog"); // Maakt de eindnodes aan
        Node end2 = new Node("2 Ogen");
        Node end3 = new Node("3 Ogen");
        Node end4 = new Node("4 Ogen");
        Node end5 = new Node("5 Ogen");
        Node end6 = new Node("6 Ogen");

        cnode0.setOption1(cnode1); // Set alle opties
        cnode0.setOption2(cnode2);
        cnode1.setOption1(cnode3);
        cnode1.setOption2(cnode4);
        cnode3.setOption1(cnode1);
        cnode3.setOption2(end1);
        cnode4.setOption1(end2);
        cnode4.setOption2(end3);
        cnode2.setOption1(cnode5);
        cnode2.setOption2(cnode6);
        cnode5.setOption1(end4);
        cnode5.setOption2(end5);
        cnode6.setOption1(cnode2);
        cnode6.setOption2(end6);

        ArrayList<Node> nodeList = new ArrayList<Node>(); // Maakt array met alle nodes voor machine
        nodeList.add(cnode0);
        nodeList.add(cnode1);
        nodeList.add(cnode2);
        nodeList.add(cnode3);
        nodeList.add(cnode4);
        nodeList.add(cnode5);
        nodeList.add(cnode6);
        nodeList.add(end1);
        nodeList.add(end2);
        nodeList.add(end3);
        nodeList.add(end4);
        nodeList.add(end5);
        nodeList.add(end6);

        FSM Cfsm1 = new FSM(nodeList); // Maakt machine aan

        System.out.println(Cfsm1.ChanceMachine()+"\n"); // Test 5 keer
        System.out.println(Cfsm1.ChanceMachine()+"\n");
        System.out.println(Cfsm1.ChanceMachine()+"\n");
        System.out.println(Cfsm1.ChanceMachine()+"\n");
        System.out.println(Cfsm1.ChanceMachine()+"\n");

        // Textgebaseerd
        System.out.println("=====Text=====");

        Node tnode0 = new Node("Node-0"); // Maakt de nodes aan
        Node tnode1 = new Node("Node-1");
        Node tnode2 = new Node("Node-2");
        Node tnode3 = new Node("Node-3");
        Node tnode4 = new Node("Node-4"); // Deze word niet gebuikt!!

        tnode0.setOption1(tnode2); // Set de opties voor de nodes
        tnode0.setOption2(tnode1);
        tnode1.setOption1(tnode1);
        tnode1.setOption2(tnode2);
        tnode2.setOption2(tnode3);
        tnode3.setOption1(tnode3);
        tnode3.setOption2(tnode0);

        tnode0.setKeys('A', 'B');
        tnode1.setKeys('A', 'B');
        tnode2.setKeys('A', 'B');
        tnode3.setKeys('A', 'B');
        tnode4.setKeys('A', 'B');

        ArrayList<Node> tnodeList = new ArrayList<Node>();
        tnodeList.add(tnode0);
        tnodeList.add(tnode1);
        tnodeList.add(tnode2);
        tnodeList.add(tnode3);

        FSM Tfsm1 = new FSM(tnodeList); // test 1
        FSM Tfsm2 = new FSM(tnodeList); // test 2
        FSM Tfsm3 = new FSM(tnodeList); // test 3
        FSM Tfsm4 = new FSM(tnodeList); // test 4
        FSM Tfsm5 = new FSM(tnodeList); // test 5

        Tfsm1.setWoord("BAAB");
        Tfsm2.setWoord("BAABAB");
        Tfsm3.setWoord("BABBAABABA");
        Tfsm4.setWoord("BABBAABAABA");
        Tfsm5.setWoord("BABBAABCBA");

        System.out.println(Tfsm1.TextMachine()+"\n"); // Succesvolle afronding
        System.out.println(Tfsm2.TextMachine()+"\n"); // Error
        System.out.println(Tfsm3.TextMachine()+"\n"); // Succesvolle afronding
        System.out.println(Tfsm4.TextMachine()+"\n"); // Error
        System.out.println(Tfsm5.TextMachine()+"\n"); // Error
    }
}
