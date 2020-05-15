package Summatief2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {

    @Test
    void chanceMachine() {
        Node node0 = new Node("node-0", false);
        Node node1 = new Node("node-1", false);
        Node endnode1 = new Node("1-oog", true);
        Node endnode2 = new Node("2-ogen", true);
        Node endnode3 = new Node("3-ogen", true);
        ArrayList<Double> chance0 = new ArrayList<>(Arrays.asList(1.0,0.0)); // Percentages(x100)
        ArrayList<Node> options0 = new ArrayList<>(Arrays.asList(node1,endnode3));
        ArrayList<Double> chance1 = new ArrayList<>(Arrays.asList(0.0,1.0)); // Percentages(x100)
        ArrayList<Node> options1 = new ArrayList<>(Arrays.asList(endnode1,endnode2));
        ArrayList<Node> nodeList = new ArrayList<>(Arrays.asList(node0,node1,endnode1,endnode2,endnode3));
        node0.setChance(chance0);
        node0.setOptions(options0);
        node1.setChance(chance1);
        node1.setOptions(options1);
        FSM fsm1 = new FSM(nodeList);
        ArrayList<Node> verwachting = new ArrayList<>(Arrays.asList(node0,node1,endnode2));
        assertEquals(verwachting,fsm1.ChanceMachine());

    }

    @Test
    void textMachine() {
    }
}