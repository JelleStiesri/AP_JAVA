import java.util.*;

public class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private int distance = Integer.MAX_VALUE; // Max_value = oneindige waarde wanneer afstand nog niet verkend is.
    private Map<Node, Integer> adjacentNodes = new HashMap<>(); // Een map is het zelfde als een dictionary, key+value
    /*AdjecentNodes = Verbonden node (key), afstand (value) */

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node dest, int dist) {
        adjacentNodes.put(dest, dist);
    }

    public void setAdjacentNodes(Map<Node, Integer> aN) {
        this.adjacentNodes = aN;
    }

    public void setDistance(int dist) {
        this.distance = dist;
    }

    public void setPath(LinkedList<Node> path) {
        this.shortestPath = path;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public Integer getDistance() {
        return distance;
    }

    public List<Node> getPath() {
        return shortestPath;
    }

    public String toString() {
        return name;
    }
}
