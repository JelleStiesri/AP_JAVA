package Opstartopdrachten;

public class Main {
    public static void main(String[] args) {

        Pool z1 = new Pool("z1",2.0, 5.5, 1.5);

        System.out.println("Breedte: " + z1.getBreedte());
        System.out.println("Lengte: " + z1.getLengte());
        System.out.println("Diepte: " + z1.getDiepte());
        System.out.println("Berekende Inhoud: " + z1.getInhoud());

        Pool z2 = new Pool("z2", 0,0,0); // 0 = NULL
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);


        System.out.println("Berekende Inhoud: \n" + z2.getInhoud());
        System.out.println(z2.toString());

    }

    public void getBreedte() {


    }
}
