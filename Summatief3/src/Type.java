public class Type {
    Double factor;
    String name;

    public Type(String name,Double fact) {
        this.name = name;
        this.factor = fact;
    }

    public Double getFactor() {
        return factor;
    }

    public String toString(){
        return name;
    }
}