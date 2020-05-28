import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;


public class Dijkstra {
    public static Graaf ShortestPath(Graaf graaf, Node start) {
        start.setDistance(0); // Distance NodeA = altijd 0
        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        PriorityQueue<Entry> queue = new PriorityQueue<>();

        unsettledNodes.add(start);

        while (unsettledNodes.size() != 0)
        {
            Node currentNode = getLowestDistanceNode(unsettledNodes);

            unsettledNodes.remove(currentNode);
            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet())
            {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode))
                {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graaf;
    }

    private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
        Node lowestDistanceNode = null;             // Word aangemaakt
        int lowestDistance = Integer.MAX_VALUE;     // Waarde word aangemaakt
        for (Node node: unsettledNodes) {           // Voor elke node:
            int nodeDistance = node.getDistance();  // Nodedistance = afstand
            if (nodeDistance < lowestDistance) {    //wanneer lager dan laagste
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getPath());
            shortestPath.add(sourceNode);
            evaluationNode.setPath(shortestPath);
        }
    }
}


