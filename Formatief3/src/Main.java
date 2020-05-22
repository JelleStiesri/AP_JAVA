import java.util.*;


public class Main {
    public static void main(String[] args) {
        //1
        String[] toSort1 = {"C", "D", "A", "R", "S", "Z", "O"};
        List<String> arr1 = new ArrayList<String>();
        for(String x: toSort1)
            arr1.add(x);

        Bubble bub1 = new Bubble();
        bub1.bubbleSort(arr1);

        //2

        String[] toSort2 = {"Z", "D", "A", "R", "D", "Z", "O"}; // Met dubbele getallen
        List<String> arr2 = new ArrayList<String>();
        for(String x: toSort2)
            arr2.add(x);

        Bubble bub2 = new Bubble();
        bub2.bubbleSort(arr2);

        //3

        List<String> arr3 = new ArrayList<String>();
        arr3.add("Y");
        arr3.add("I");
        arr3.add("W");
        arr3.add("E");
        arr3.add("L");
        arr3.add("C");
        arr3.add("B");

        Bubble bub3 = new Bubble();
        bub3.bubbleSort(arr3);
    }
}