import java.util.*;


public class Machine {
//    PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
    PriorityQueue<Entry> q = new PriorityQueue<>();
//    PriorityQueue<Steen> priolijst = new PriorityQueue<>();

    public void addSteen(String steen, int afst) {
//        priolijst.add(Steen(steen));
        q.add(new Entry(steen,afst));
//        q.add(new Entry(steen.get(), calculateStringValue(steen.get(x))));
//        queue.offer(new AbstractMap.SimpleEntry<>(steen, afst));
        System.out.println(q);
    }

    public String printsteen(){
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        return null;
    }
}
