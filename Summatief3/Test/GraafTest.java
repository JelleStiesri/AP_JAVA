import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GraafTest {
    Node nodeA;
    Node nodeB;
    Node nodeC;
    Node nodeD;
    Graaf graaf;
    Set<Node> ansList;

    @BeforeClass
    public void setup() {
        nodeA = new Node("Node-A");
        nodeB = new Node("Node-B");
        nodeC = new Node("Node-C");
        nodeD = new Node("Node-D");
        graaf = new Graaf();
    }

    @Test
    void addNode() {
        setup();
        assertNull(graaf.getNodes());

        graaf.addNode(nodeA);
        graaf.addNode(nodeB);
        ansList = new HashSet<>();
        ansList.add(nodeA);
        ansList.add(nodeB);

        assertNotNull(graaf.getNodes());
        assertEquals(ansList,graaf.getNodes());
    }
}