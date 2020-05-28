import java.util.*;

public class Reis extends Graaf {
    private List<Stap> Steps = new ArrayList<>(); // 1 reis heeft 1 of meerdere stappen

    public void addSteps(Stap stap) {
        Steps.add(stap);
    }

    public List<Stap> getSteps() {
        return Steps;
    }

    public void setSteps(List<Stap> steps) {
        this.Steps = steps;
    }

    public Double getAfstand() {
        Double antwoord = 0.00;
        for (Stap step : Steps) {
            System.out.println(step.getKosten());
            antwoord+= step.getKosten();
        }
        return antwoord;
    }

    public String toString(){
        String antwoord ="";
        for (Stap step : Steps) {
            antwoord += step;
                    }
        return antwoord;
    }
}