package Opstartopdrachten.main;
import java.util.ArrayList;

public class Pension {
    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    private String name;

    public Pension(String name) {
        this.name = name;
    }

    public  void addAnimal(String name) {
        Dog hdog = new Dog(name); // Maakt hond met naam...
        this.dogs.add(hdog); // Voegt hond aan de array dogs
    }

        public String toString(){
        String doglist = "Pension: " + this.name + "\n" + "Lijst met honden: ";
        for (Dog hdog : this.dogs){
            doglist += hdog.toString() + ", ";
        }
        return doglist;
    }
}
