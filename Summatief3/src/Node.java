import java.util.*;

public class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Double distance = Double.MAX_VALUE; // Max_value = oneindige waarde wanneer afstand nog niet verkend is.
    private Map<Node, Double> adjacentNodes = new HashMap<>(); // Een map is het zelfde als een dictionary, key+value
    /*AdjecentNodes = Verbonden node (key), afstand (value) */
    private Map<Node,Type> typeNodes = new HashMap<>(); // Hierin staat het type stap per verbinding

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node dest, Double dist) {
        adjacentNodes.put(dest, dist);
    }

    public void setAdjacentNodes(Map<Node, Double> aN) {
        this.adjacentNodes = aN;
    }

    public void setDistance(Double dist) {
        this.distance = dist;
    } // Afstand tot begin node

    public void setPath(LinkedList<Node> path) {
        this.shortestPath = path;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void addType(Node dest, Type type) {
        typeNodes.put(dest,type);
    }

    public Map<Node, Double> getAdjacentNodes() {
        return adjacentNodes;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getFactor(Node node) {
        Type type = typeNodes.get(node);
        return type.getFactor();
    }

    public List<Node> getPath() {
        return shortestPath;
    }

    public String toString() {
        return name;
    }
}
