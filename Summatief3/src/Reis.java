import java.util.*;

public class Reis extends Graaf {
    private final Node eind;
    private List<Stap> Steps = new ArrayList<>(); // 1 reis heeft 1 of meerdere stappen

    public Reis(Node eind) {
        this.eind = eind;
        List<Stap> steps = new ArrayList<>();
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.addAll(eind.getPath());
        nodeList.add(eind);

        for (int index = 0; index < nodeList.size() - 1; index++) { // Voor alle nodes op het pad naar Node E
            Node current = nodeList.get(index); // Vertrekpunt (per stap, dus van A -> B)
            Node next = nodeList.get(index + 1); // Aankomstpunt

            Map<Node, Double> nodeMap = current.getAdjacentNodes();
            Double value = nodeMap.get(next);

            Stap stap = new Stap(value, current.getFactor(next)); // Maakt stap aan
            stap.setNumber(index); // Geeft stap een id
            Steps.add(stap); // Voegt stap toe aan de Steps list
        }
    }

    /* De 3 getters/setters hieronder worden nu niet gebruikt, maar zouden wel gebruikt kunenn worden
    * bij verdere uitbreiding van dit programma*/
    public void addSteps(Stap stap) {
        Steps.add(stap);
    }

    public void setSteps(List<Stap> steps) {
        this.Steps = steps;
    }

    public void setStapReis(Reis reis) {
        for (Stap step : Steps) {
            step.setReis(reis);
        }
    }

    public List<Stap> getSteps() {
        return Steps;
    }

    public Double getAfstand() {
        Double antwoord = 0.00;
        if (Steps.size() >= 1) {
            for (Stap step : Steps) {
                System.out.println("Stap " + (step.getNumber() + 1) + " - Kosten: " + step.getKosten());
                antwoord += step.getKosten();
            }
            return antwoord;
        }else {
            return null;
        }
    }

    public String toString(){
        String antwoord ="";
        for (Stap step : Steps) {
            antwoord += step;
                    }
        return antwoord;
    }
}