package Opstartopdrachten.main;

public class Dog extends Animal {
    private String name;

    public Dog(String n){
        this.name = n;
    }
    public String toString(){
        return this.name;
    }

    @Override
    public String color() {
        return "Bruin";
    }

    @Override
    public String race() {
        return "Labrador";
    }

    @Override
    public String sound() {
        return "Woof";
    }

    @Override
    public int year() {
        return 2015;
    }

}
