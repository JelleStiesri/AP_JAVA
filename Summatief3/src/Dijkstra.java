//* BRON: https://www.baeldung.com/java-dijkstra *//

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class Dijkstra {
    public static Graaf ShortestPath(Graaf graaf, Node start, Node eind) {
        start.setDistance(0.00); // Distance NodeA = altijd 0
        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<PrioNode> unsettledNodes = new PriorityQueue<>(); // De Priority Queue

        unsettledNodes.add(new PrioNode(start, start.getDistance()));

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
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(new PrioNode(adjacentNode, adjacentNode.getDistance()));
                }
            }
            settledNodes.add(currentNode);
        }
        //Reis vormen
        Reis reis = new Reis();
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.addAll(eind.getPath());
        nodeList.add(eind);

        for (int index = 0; index < nodeList.size()-1; index++){ // Voor alle nodes op het pad naar Node E
            Node current = nodeList.get(index); // Vertrekpunt (per stap, dus van A -> B)
            Node next = nodeList.get(index+1); // Aankomstpunt

            Map<Node, Double> nodeMap = current.getAdjacentNodes();
            Double value = nodeMap.get(next);

            Stap stap = new Stap(value,current.getFactor(next));
            stap.setNumber(index);
            stap.setReis(reis);
            reis.addSteps(stap);
        }
        return reis;
    }

    private static void CalculateMinimumDistance(Node evaluationNode, Double edgeWeigh, Node sourceNode) {
        Double sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getPath());
            shortestPath.add(sourceNode);
            evaluationNode.setPath(shortestPath);
        }
    }
}