//* BRON: https://www.baeldung.com/java-dijkstra *//

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class Dijkstra {
    public static Graaf calculateShortestPathFromSource(Graaf graaf, Node start, Node eind) {
        start.setDistance(0.00); // Distance NodeA = altijd 0
        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<prioNode> unsettledNodes = new PriorityQueue<>(); // De Priority Queue

        unsettledNodes.add(new prioNode(start, start.getDistance()));

        while (unsettledNodes.size() != 0)
        {
            Node currentNode = unsettledNodes.remove().getKey();
            for (Entry<Node, Double> adjacencyPair : currentNode.getAdjacentNodes().entrySet())
            // Voor elke verbinding in Currentnode
            {
                Node adjacentNode = adjacencyPair.getKey();
                Stap stap = new Stap(adjacencyPair.getValue(),currentNode.getFactor(adjacentNode));
                Double edgeWeigh = stap.getKosten(); // Berekent de kosten

                if (!settledNodes.contains(adjacentNode))
                {
                    calculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(new prioNode(adjacentNode, adjacentNode.getDistance())); // Maakt nieuwe Prionode aan voor PrioQueue
                }
            }
            settledNodes.add(currentNode);
        }
        return graaf;
    }

    private static void calculateMinimumDistance(Node evaluationNode, Double edgeWeigh, Node sourceNode) {
        Double sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getPath());
            shortestPath.add(sourceNode);
            evaluationNode.setPath(shortestPath);
        }
    }
}