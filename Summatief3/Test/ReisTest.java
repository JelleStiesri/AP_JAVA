import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {
    Node nodeA;
    Node nodeB;
    Node nodeC;
    Node nodeD; // Eind node
    Reis reis;
    Reis reis2;
    Type type;
    Type type2;

    LinkedList<Node> path;

    @BeforeClass
    public void reisSetup(){
        nodeA = new Node("Node-A");
        nodeB = new Node("Node-B");
        nodeC = new Node("Node-C");
        nodeD = new Node("Node-D");

        type = new Type("Rijden",1.00);
        type2 = new Type("Vliegen",2.00);

        nodeA.addDestination(nodeB, 15.00);
        nodeA.addType(nodeB,type);
        nodeB.addDestination(nodeC, 10.00);
        nodeB.addType(nodeC,type);
        nodeC.addDestination(nodeD, 5.00);
        nodeC.addType(nodeD,type2);

        path = new LinkedList<>(); // Path naar Node-D
        path.add(nodeA);
        path.add(nodeB);
        path.add(nodeC);

        nodeD.setPath(path);
        reis = new Reis(nodeD);
        reis2 = new Reis(nodeA);
    }

    @Test
    void getAfstand() {
        reisSetup();
        assertEquals(35.0,reis.getAfstand());
        assertNull(reis2.getAfstand()); // reis 2 bevat geen stappen
    }
}