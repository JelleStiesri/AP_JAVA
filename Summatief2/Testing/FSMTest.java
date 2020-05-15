import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {

    /**Deze testen zijn niet echt voor de opdracht, maar gewoon om ermee te oefenen*/

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
        FSM fsm = new FSM(nodeList);
        ArrayList<Node> verwachting = new ArrayList<>(Arrays.asList(node0,node1,endnode2));
        assertEquals(verwachting,fsm.ChanceMachine());
    }

    @Test
    void textMachine() {
        Node node0 = new Node("node-0", false);
        Node node1 = new Node("node-1", false);
        Node node2 = new Node("node-1", false);
        ArrayList<Character> keys01 = new ArrayList<>(Arrays.asList('A','B'));
        ArrayList<Character> keys2 = new ArrayList<>(Arrays.asList('B'));
        node0.setKeys(keys01);
        node1.setKeys(keys01);
        node2.setKeys(keys2);
        ArrayList<Node> options0 = new ArrayList<>(Arrays.asList(node1,node0));
        ArrayList<Node> options1 = new ArrayList<>(Arrays.asList(node1,node2));
        ArrayList<Node> options2 = new ArrayList<>(Arrays.asList(node0));
        node0.setOptions(options0);
        node1.setOptions(options1);
        node2.setOptions(options2);
        ArrayList<Node> nodeList = new ArrayList<>(Arrays.asList(node0,node1,node2));

        FSM fsm = new FSM(nodeList);
        fsm.setWoord("AABBB");
        ArrayList<Node> verwachting = new ArrayList<>(Arrays.asList(node0,node1,node1,node2,node0,node0));
        assertEquals(verwachting,fsm.TextMachine()); // Test1
        fsm.setWoord("BABAB");
        ArrayList<Node> verwachting2 = new ArrayList<>(Arrays.asList(node0,node0,node1,node2));
        assertEquals(verwachting2,fsm.TextMachine()); // Test2
    }
}