package Opstartopdrachten.Testfile;

import Summatief2.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> keylist = new ArrayList<>(Arrays.asList('A','B','Z'));


        Steen steen1 = new Steen("Henk", keylist);
        Steen steen2 = new Steen("Klaas", keylist);
        Steen steen3 = new Steen("Jan", keylist);

        ArrayList<Steen> options1 = new ArrayList<>(Arrays.asList(steen1,steen2,steen3));

        System.out.println(steen1.getName());
        steen1.setOptions(options1);

        System.out.println(steen1.returnString('Z'));
    }
}
