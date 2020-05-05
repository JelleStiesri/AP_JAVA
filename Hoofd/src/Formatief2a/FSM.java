package Formatief2a;

import java.lang.reflect.Array;

public class FSM {
    private char[] woord;
    private String Swoord;
    private Node node0;
    private Node node1;
    private Node node2;
    private Node node3;

    public FSM(String wR, Node n0, Node n1, Node n2, Node n3) {
        this.woord = wR.toCharArray();
        this.Swoord = wR;
        this.node0 = n0;
        this.node1 = n1;
        this.node2 = n2;
        this.node3 = n3;
    }

    public String machine() {
        System.out.println("Woord: " + Swoord);
        String result = "node0";
        int index = 0;
        Node node = node0;
        while (index != woord.length) {
            String tussenresult = node.toString(woord[index]);
            if (tussenresult == "Error") { // Wanneer een overgang niet mogelijk is
                result += "\nError op teken "+ (index+1) +"\n"  + (woord.length-(index+1)) + " teken(s) niet kunnen gebruiken";
                return result;
            }
            result += " - " + tussenresult ; // Voegt de volgende overgang toe aan de result lijst

            if (result == "node0") {
                node = node0;
            } else if (tussenresult == "node1") {
                node = node1;
            } else if (tussenresult == "node2") {
                node = node2;
            } else if (tussenresult == "node3") {
                node = node3;
            }
            index += 1;  // selecteert het vololgende teken in woord

        }
        result += "\nSuccesvol afgerond";
        return result;  // Wanneer er geen error komt
    }
}
