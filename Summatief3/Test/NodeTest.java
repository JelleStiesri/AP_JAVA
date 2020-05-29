import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

class NodeTest {
    Node nodeA;
    Node nodeB;
    Node nodeC;
    Node nodeD;
    LinkedList<Node> nodeList;
    Type type1;
    Type type2;

    @BeforeClass
    public void setup() {
        nodeA = new Node("Node-A");
        nodeB = new Node("Node-B");
        nodeC = new Node("Node-C");
        nodeD = new Node("Node-D");

        nodeList = new LinkedList<>();
        nodeList.add(nodeA);
        nodeList.add(nodeB);
        nodeList.add(nodeC);

        type1 = new Type("Vliegen",2.00);
        type2 = new Type("Rijden",1.00);

        nodeA.addDestination(nodeB, 15.00);
        nodeA.addType(nodeB,type2);
        nodeA.addDestination(nodeC, 10.00);
        nodeA.addType(nodeC,type1);
    }

    @Test
    void getDistanceTest() {
        setup();
        assertEquals(nodeA.getDistance(), 1.7976931348623157E308); // grote getal is MAX_VALUE
        nodeA.setDistance(10.00);
        assertEquals(10.00, nodeA.getDistance());
    }

    @Test
    void getPathTest() {
        setup();
        nodeD.setPath(nodeList);
        assertThat(nodeD.getPath(),is(nodeList)); // Test het in zelfde vorm blijft
        // Ik kreeg errors wanneer ik Equals gebruik, That is hetzelfde
    }

    @Test
    void toStringTest() {
        setup();
        assertThat("Node-A",is(nodeA.toString()));
        nodeA.setName("Yahoo");
        assertThat("Yahoo", is(nodeA.toString()));
            }

    @Test
    void getAdjacentNodesTest(){
        setup();
        Map<Node, Double> destinationMap = nodeA.getAdjacentNodes();
        assertEquals(10,destinationMap.get(nodeC)); //Checkt of de distance correct is van nodeC
        assertEquals(15,destinationMap.get(nodeB));
    }

    @Test
    void getFactor() {
        setup();
        assertEquals(1.00,nodeA.getFactor(nodeB));
        assertEquals(2.00,nodeA.getFactor(nodeC));
    }
}