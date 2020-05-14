package Opstartopdrachten.Testfile;

import java.util.ArrayList;

public class Steen {
    private String name;
    private ArrayList<Character> keys;
    private ArrayList<Steen> options;


    public Steen(String name, ArrayList<Character> keys) {
        this.name = name;
        this.keys = keys;
    }

    public void setOptions(ArrayList<Steen> options) {
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public Steen returnString(char let) {
        if (keys.contains(let)) {
            int index = keys.indexOf(let);
            System.out.println(index);
            return options.get(index);
        } else {
            return null;
        }

    }

    public String toString(){
        return name;
    }



}
