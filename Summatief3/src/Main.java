import java.util.*;
public class Main {

        public static void main(String[] args)
        {
            Test();

//            Stap stap1 = new Stap("test");
//            stap1.addDestination();
//            System.out.println(stap1.toString());
        }

        private static void Test()
        {
            Stap stap1 = new Stap("test");

            Node nodeA = new Node("Node-A");
            Node nodeB = new Node("Node-B");
            Node nodeC = new Node("Node-C");
            Node nodeD = new Node("Node-D");
            Node nodeE = new Node("Node-E");
            Node nodeF = new Node("Node-F");

            nodeA.addDestination(nodeB, 10);
            nodeA.addDestination(nodeC, 15);

            nodeB.addDestination(nodeD, 12);
            nodeB.addDestination(nodeF, 15);

            nodeC.addDestination(nodeE, 10);

            nodeD.addDestination(nodeF,1);
            nodeD.addDestination(nodeE,2);

            nodeF.addDestination(nodeE,5);

            Graaf graaf = new Graaf();

            graaf.addNode(nodeA);
            graaf.addNode(nodeB);
            graaf.addNode(nodeC);
            graaf.addNode(nodeD);
            graaf.addNode(nodeF);
            graaf.addNode(nodeE);

            graaf = Dijkstra.ShortestPath(graaf, nodeA);

            Node eindbestemming = nodeE;
            for (Node ns : eindbestemming.getPath())
            {
                System.out.println(ns.toString());
            }
            System.out.println(eindbestemming.toString());
            System.out.println(eindbestemming.getDistance());
        }
    }




