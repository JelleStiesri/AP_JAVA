import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class StapTest {
    Node nodeA = new Node("Node-A");
    Node nodeB = new Node("Node-B");
    Node nodeC = new Node("Node-C");
    PriorityQueue<Stap> PrioQueue = new PriorityQueue<>();



//    @Test
//    void TestPrioQueue() {
//        nodeA.setDistance(10.00);
//        nodeB.setDistance(25.00);
//        nodeC.setDistance(5.00);
//        //Volgorde is dus 5-10-25 ofwel  C-A-B
//        PrioQueue.add(new Stap(nodeA, nodeA.getDistance()));
//        PrioQueue.add(new Stap(nodeB, nodeB.getDistance()));
//        PrioQueue.add(new Stap(nodeC, nodeC.getDistance()));
//
//        ArrayList<Node> anslist = new ArrayList<>();
//        while (!PrioQueue.isEmpty()) {
//            anslist.add(PrioQueue.remove().getKey());
//        }
//        ArrayList<Node> Juist = new ArrayList<>(Arrays.asList(nodeC,nodeA,nodeB));
//        assertEquals(Juist, anslist);
//
//    }


}