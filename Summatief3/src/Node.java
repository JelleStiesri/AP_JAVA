import java.util.*;

public class Node {
    private String name;
    private List<Stap> korstepad = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Map<Node, Integer> adjacentNodes = new HashMap<>(); // Een map is het zelfde als een dictionary, key+value

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node dest, int dist) {
        adjacentNodes.put(dest, dist);
    }

    //get en set fucnties
}
