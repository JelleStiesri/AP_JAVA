import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class NodeTest {
    private Node node0 = new Node("node-0", false);
    private Node endnode1 = new Node("1-oog", true);
    private Node endnode2 = new Node("2-ogen", true);
    ArrayList<Node> options = new ArrayList<>(Arrays.asList(endnode1, endnode2));

    @Test
    void testIsFinalNode() {
        assertTrue(endnode1.isFinalNode());
        assertFalse(node0.isFinalNode());
    }

    @Test
    void testReturnStringNode() {
        ArrayList<Character> keys = new ArrayList<>(Arrays.asList('C', 'E'));
        node0.setKeys(keys);
        node0.setOptions(options);
        assertEquals(endnode1, node0.ReturnStringNode('C'));
        assertEquals(null, node0.ReturnStringNode('A'));
    }

    @Test
    void testReturnChanceNode() {
        ArrayList<Double> chance = new ArrayList<>(Arrays.asList(0.0, 1.0)); // 100% kans op endnode2
        node0.setChance(chance);
        node0.setOptions(options);
        assertEquals(endnode2, node0.ReturnChanceNode());
        ArrayList<Double> chance2 = new ArrayList<>(Arrays.asList(1.0, 0.0)); // 100% kans op endnode1
        node0.setChance(chance2);
        assertEquals(endnode1, node0.ReturnChanceNode());
    }

    @Test
    void testToString() {
        assertEquals("node-0", node0.toString());
        assertEquals("2-ogen", endnode2.toString());
    }

    /** GRAAG EERST LAATSTE DEEL README LEZEN VOOR DEZE*/
    @Test
    void testRandom() {
        ArrayList<Double> chance = new ArrayList<>(Arrays.asList(0.2, 0.8)); // 100% kans op endnode2
        node0.setChance(chance);
        node0.setOptions(options);
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 10000; i++) { // Runt 10000 keer
            nodes.add(node0.ReturnChanceNode());
        }
        int voorkomen = Collections.frequency(nodes, endnode2);
        System.out.println(voorkomen);
        if (voorkomen > 7850& voorkomen <8150) { // Foutmarge 1.5% beide kanten
            boolean ans = true;
        } else {
            boolean ans = false;
            assertTrue(ans);
        }
    }
}