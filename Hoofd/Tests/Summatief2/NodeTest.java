package Summatief2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node node0 = new Node("node-0", false);
    Node endnode1 = new Node("1-oog", true);
    Node endnode2 = new Node("2-ogen", true);

    @Test
    void testToString() {
        assertEquals("node-0", node0.toString());
        assertEquals("2-ogen", endnode2.toString());
    }

    @Test
    void testIsFinalNode() {
        assertTrue(endnode1.isFinalNode());
        assertFalse(node0.isFinalNode());
    }

    @Test
    void testReturnStringNode() {
        ArrayList<Character> keys = new ArrayList<>(Arrays.asList('C','E'));
        ArrayList<Node> options = new ArrayList<>(Arrays.asList(endnode1,endnode2));
        node0.setKeys(keys);
        node0.setOptions(options);
        assertEquals(endnode1,node0.ReturnStringNode('C'));
    }

    @Test
    void testReturnChanceNode() {
        ArrayList<Double> chance = new ArrayList<>(Arrays.asList(0.0,1.0)); // 100% kans op endnode2
        ArrayList<Node> options = new ArrayList<>(Arrays.asList(endnode1,endnode2));
        node0.setChance(chance);
        node0.setOptions(options);
        assertEquals(endnode2,node0.ReturnChanceNode());
    }
}