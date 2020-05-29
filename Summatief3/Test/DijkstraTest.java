import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {
    Node nodeA;
    Node nodeB;
    Node nodeC;
    Node nodeD;
    Type Rit;
    Type Treinrit;
    Type Vliegen;
    Graaf graaf;
    Node begin;
    Node einde;
    List<Node> pathList;

    @BeforeClass
    public void setup() {
        Rit = new Type("Rijden",1.00);
        Treinrit = new Type("Treinen",1.66);
        Vliegen = new Type("Vliegen",2.00);

        nodeA = new Node("Node-A");
        nodeB = new Node("Node-B");
        nodeC = new Node("Node-C");
        nodeD = new Node("Node-D");

        nodeA.addDestination(nodeB, 15.00); //Dist = Kilometers
        nodeA.addType(nodeB,Treinrit);
        nodeA.addDestination(nodeC, 5.00); //Dist = Euro's
        nodeA.addType(nodeC,Rit);
        nodeB.addDestination(nodeD, 10.00); //Dist = Minuten
        nodeB.addType(nodeD,Treinrit);
        nodeC.addDestination(nodeB, 2.00);
        nodeC.addType(nodeB,Rit);
        nodeC.addDestination(nodeD, 30.00);
        nodeC.addType(nodeD,Vliegen);

        graaf = new Graaf();
        graaf.addNode(nodeA);
        graaf.addNode(nodeB);
        graaf.addNode(nodeC);
        graaf.addNode(nodeD);

        pathList = new LinkedList<>();
        pathList.add(nodeA);
        pathList.add(nodeC);
        pathList.add(nodeB);

        begin = nodeA;
        einde = nodeD;
        graaf =  Dijkstra.calculateShortestPathFromSource(graaf, begin, einde);
    }

    @Test
    void calculateShortestPathFromSourceTest() {
        setup();
        assertEquals(5.00,nodeC.getDistance());
        assertEquals(7.00,nodeB.getDistance());
        assertEquals(7+(10*1.66),nodeD.getDistance());
        assertEquals(pathList,nodeD.getPath()); // Checkt of volgorde antwoord klopt
    }
}