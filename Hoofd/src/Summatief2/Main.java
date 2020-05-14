package Summatief2;

import Opstartopdrachten.Testfile.Steen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====Chance=====");

        Node cnode0 = new Node("Node-0",false); // Maakt de nodes aan
        Node cnode1 = new Node("Node-1",false);
        Node cnode2 = new Node("Node-2",false);
        Node cnode3 = new Node("Node-3",false);
        Node cnode4 = new Node("Node-4",false);
        Node cnode5 = new Node("Node-5",false);
        Node cnode6 = new Node("Node-6",false);
        Node cnode7 = new Node("Node-7",false);
        Node endnode1 = new Node("1-oog",true);
        Node endnode2 = new Node("2-ogen",true);
        Node endnode3 = new Node("3-ogen",true);
        Node endnode4 = new Node("4-ogen",true);
        Node endnode5 = new Node("5-ogen",true);
        Node endnode6 = new Node("6-ogen",true);
        Node endnode7 = new Node("7-ogen",true);
        Node endnode8 = new Node("8-ogen",true);


        /*Maakt alle arrays voor set functies
        * Dit doe ik zodat het programma flexibel is en ik dus verschillende hoeveelheden
        * aan opties kan gebruiken, de ene node heeft er 2 en de andere 3. Dit kan je
        * uitbereiden naar zoveel je wilt. Dit doe ik later ook voor de Text versie
        */
        ArrayList<Double> chance0 = new ArrayList<>(Arrays.asList(0.5,0.5)); // Percentages(x100)
        ArrayList<Node> coptions0 = new ArrayList<>(Arrays.asList(cnode1,cnode2));
        ArrayList<Double> chance1 = new ArrayList<>(Arrays.asList(0.5,0.5));
        ArrayList<Node> coptions1 = new ArrayList<>(Arrays.asList(cnode3,cnode4));
        ArrayList<Double> chance2 = new ArrayList<>(Arrays.asList(0.3,0.7));
        ArrayList<Node> coptions2 = new ArrayList<>(Arrays.asList(cnode5,cnode6));
        ArrayList<Double> chance3 = new ArrayList<>(Arrays.asList(0.65,0.30,0.05));
        ArrayList<Node> coptions3 = new ArrayList<>(Arrays.asList(cnode1,endnode1,endnode2)); // 5% kans op endnode 2
        ArrayList<Double> chance4 = new ArrayList<>(Arrays.asList(0.45,0.65));
        ArrayList<Node> coptions4 = new ArrayList<>(Arrays.asList(endnode2,endnode3));
        ArrayList<Double> chance5 = new ArrayList<>(Arrays.asList(0.5,0.5));
        ArrayList<Node> coptions5 = new ArrayList<>(Arrays.asList(endnode4,endnode5));
        ArrayList<Double> chance6 = new ArrayList<>(Arrays.asList(0.15,0.4,0.45)); // Kan dus meer dan 2 overgangen hebben
        ArrayList<Node> coptions6 = new ArrayList<>(Arrays.asList(cnode2,endnode6,cnode7));
        ArrayList<Double> chance7 = new ArrayList<>(Arrays.asList(0.4,0.6));
        ArrayList<Node> coptions7 = new ArrayList<>(Arrays.asList(endnode7,endnode8));

        cnode0.setChance(chance0); // Voert alle set functies uit
        cnode0.setOptions(coptions0);
        cnode1.setChance(chance1);
        cnode1.setOptions(coptions1);
        cnode2.setChance(chance2);
        cnode2.setOptions(coptions2);
        cnode3.setChance(chance3);
        cnode3.setOptions(coptions3);
        cnode4.setChance(chance4);
        cnode4.setOptions(coptions4);
        cnode5.setChance(chance5);
        cnode5.setOptions(coptions5);
        cnode6.setChance(chance6);
        cnode6.setOptions(coptions6);
        cnode7.setChance(chance7);
        cnode7.setOptions(coptions7);

        ArrayList<Node> nodeList = new ArrayList<>(Arrays.asList(cnode0,cnode1,cnode2,cnode3,cnode4,cnode5,cnode6,cnode7,endnode1,endnode2,endnode3,endnode4,endnode5,endnode6,endnode7,endnode8));
        FSM Cfsm1 = new FSM(nodeList); // Maakt machine aan

        System.out.println(Cfsm1.ChanceMachine()+"\n");
        System.out.println(Cfsm1.ChanceMachine()+"\n");
        System.out.println(Cfsm1.ChanceMachine()+"\n");

        // Textgebaseerd
        System.out.println("=====Text=====");

        Node tnode0 = new Node("Node-0",false); // Maakt de nodes aan
        Node tnode1 = new Node("Node-1",false);
        Node tnode2 = new Node("Node-2",false);
        Node tnode3 = new Node("Node-3",false);
        Node tnode4 = new Node("Node-4",false);

        // Key = vereiste karakter voor overgang naar volgende node
        ArrayList<Character> keys0 = new ArrayList<>(Arrays.asList('A','B','Z'));
        ArrayList<Character> keys13 = new ArrayList<>(Arrays.asList('A','B'));
        ArrayList<Character> keys2 = new ArrayList<>(Arrays.asList('B'));
        ArrayList<Character> keys4 = new ArrayList<>(Arrays.asList('B','C'));

        tnode0.setKeys(keys0); // Set de keys voor elke node
        tnode1.setKeys(keys13);
        tnode2.setKeys(keys2);
        tnode3.setKeys(keys13);
        tnode4.setKeys(keys4);

        ArrayList<Node> toptions0 = new ArrayList<>(Arrays.asList(tnode1,tnode4,tnode2));
        ArrayList<Node> toptions1 = new ArrayList<>(Arrays.asList(tnode1,tnode2));
        ArrayList<Node> toptions2 = new ArrayList<>(Arrays.asList(tnode3));
        ArrayList<Node> toptions3 = new ArrayList<>(Arrays.asList(tnode4,tnode0));
        ArrayList<Node> toptions4 = new ArrayList<>(Arrays.asList(tnode0,tnode1));

        tnode0.setOptions(toptions0);
        tnode1.setOptions(toptions1);
        tnode2.setOptions(toptions2);
        tnode3.setOptions(toptions3);
        tnode4.setOptions(toptions4);

        ArrayList<Node> tnodeList = new ArrayList<Node>();
        tnodeList.add(tnode0);
        tnodeList.add(tnode1);
        tnodeList.add(tnode2);
        tnodeList.add(tnode3);
        tnodeList.add(tnode4);

        FSM Tfsm1 = new FSM(tnodeList); // test 1
        FSM Tfsm2 = new FSM(tnodeList); // test 2
        FSM Tfsm3 = new FSM(tnodeList); // test 3

        Tfsm1.setWoord("ZBACA");
        Tfsm2.setWoord("AABAB");
        Tfsm3.setWoord("BBABBBZ");

        System.out.println(Tfsm1.TextMachine()+"\n"); // Succesvolle afronding
        System.out.println(Tfsm2.TextMachine()+"\n"); // Error
        System.out.println(Tfsm3.TextMachine()+"\n"); // Succesvolle afronding
    }
}
