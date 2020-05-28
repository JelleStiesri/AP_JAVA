public class Main {
    public static void main(String[] args){

        Steen steen1 = new Steen("Steen1",34);
        Steen steen2 = new Steen("Steen2",10);
        Steen steen3 = new Steen("Steen3",25);
        Steen steen4 = new Steen("Steen4",160);

        steen1.setAfstand(34);
        steen2.setAfstand(10);
        steen3.setAfstand(25);
        steen4.setAfstand(160);

        Machine m1 = new Machine();

        m1.addSteen(steen1,steen1.getAfstand());
        m1.addSteen(steen2,steen2.getAfstand());
        m1.addSteen(steen3,steen3.getAfstand());
        m1.addSteen(steen4,steen4.getAfstand());

        m1.printsteen();
    }
}
