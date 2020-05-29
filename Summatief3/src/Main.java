import java.util.*;
public class Main {

        public static void main(String[] args)
        {
            Test();

        }

        private static void Test()
        {
            Type Rit = new Type("Rit",1.00);
            Type Vliegen = new Type("Vliegen", 2.00); // 100 km staat gelijk aan 50$
            Type Treinrit = new Type("Treinrit",1.66); // 100 km staat gelijk aan 60 minuten

            Node nodeA = new Node("Node-A");
            Node nodeB = new Node("Node-B");
            Node nodeC = new Node("Node-C");
            Node nodeD = new Node("Node-D");
            Node nodeE = new Node("Node-E");
            Node nodeF = new Node("Node-F");

            nodeA.addDestination(nodeB, 10.00); //Dist = Kilometers
            nodeA.addType(nodeB,Rit);
            nodeA.addDestination(nodeC, 30.00); //Dist = Euro's
            nodeA.addType(nodeC,Vliegen);

            nodeB.addDestination(nodeD, 30.00); //Dist = Minuten
            nodeB.addType(nodeD,Treinrit);
            nodeB.addDestination(nodeF, 20.00);
            nodeB.addType(nodeF,Rit);

            nodeC.addDestination(nodeE, 15.00);
            nodeC.addType(nodeE,Treinrit);

            nodeD.addDestination(nodeF,2.00);
            nodeD.addType(nodeF,Rit);
            nodeD.addDestination(nodeE,5.00);
            nodeD.addType(nodeE,Rit);

            nodeF.addDestination(nodeE,15.00);
            nodeF.addType(nodeE,Treinrit);

            Graaf graaf = new Graaf();

            graaf.addNode(nodeA);
            graaf.addNode(nodeB);
            graaf.addNode(nodeC);
            graaf.addNode(nodeD);
            graaf.addNode(nodeF);
            graaf.addNode(nodeE);

            Node begin = nodeA;

            Node einde = nodeE;

            graaf =  Dijkstra.calculateShortestPathFromSource(graaf, begin, einde); // Voert Dijkstra functie uit
            Reis reis1 = new Reis(nodeE); // Nieuwe reis aanmaken
            reis1.setStapReis(reis1); // Set de reis van de stappen in reis1 naar reis1

            System.out.println("Totale afstand (reis):"+reis1.getAfstand()+"\n"); // Print totale afstand

            for (Node nd : einde.getPath()) { // Print per Node
                System.out.println(nd.toString());
            }System.out.println(einde.toString());
        }
    }