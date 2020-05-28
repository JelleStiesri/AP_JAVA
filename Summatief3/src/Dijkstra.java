import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;


public class Dijkstra {
    public static Graaf ShortestPath(Graaf graaf, Node start) {
        start.setDistance(0); // Distance NodeA = altijd 0
        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<Stap> unsettledNodes = new PriorityQueue<>();

        unsettledNodes.add(new Stap(start, start.getDistance()));

        while (unsettledNodes.size() != 0)
        {
            Node currentNode = unsettledNodes.remove().getKey();
            unsettledNodes.remove(currentNode);
            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet())
            {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode))
                {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(new Stap(adjacentNode, adjacentNode.getDistance()));
                }
            }
            settledNodes.add(currentNode);
        }
        return graaf;
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