package Opstartopdrachten;

public class Pool{
    private String name;
    private double Breedte;
    private double Lengte;
    private double Diepte;

    public Pool(String name, double Breedte, double Lengte, double Diepte){
        this.name = name;
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Diepte = Diepte;
    }

    // Get specs
    public double getBreedte(){
        return this.Breedte();
    }

    public double getLengte(){
        return Lengte();
    }

    public double getDiepte(){
        return Diepte();
    }

    public double getInhoud(){
        double Inhoud;
        Inhoud = getDiepte() * getBreedte() * getLengte(); // lengte x breedte x hoogte
        return Inhoud;
    }

    // Change specs
    public void setBreedte(double Breedte){
        this.Breedte = Breedte;
    }

    public void setLengte(double Lengte){
        this.Lengte = Lengte;
    }
    public void setDiepte(double Diepte){
        this.Diepte = Diepte;
    }

    // Set specs from start
    public double Breedte() {
        return Breedte;
    }

    public double Lengte() {
        return Lengte;
    }

    public double Diepte() {
        return Diepte;
    }

    public String toString(){
        String regel = "Gegevens zwembad: Dit zwembad is "+getBreedte()+" meter breed, "+
            getLengte()+" meter lang, en"+getDiepte()+" Meter diep";
        return regel;
    }
}