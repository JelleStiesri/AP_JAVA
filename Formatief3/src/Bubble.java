import java.util.*;

public class Bubble {
    void bubbleSort(List<String> lijst) {
        System.out.println("\nBegin:" + lijst);
            for(int index1=0; index1 < lijst.size(); index1++){
                // Index 1 word 1 hoger bij elk getal dat hij langsloopt om te sorteren
                for(int index2=index1+1; index2 < lijst.size(); index2++){ //Index2 begint als index1+1 en stopt als de hele lijst af is gegaan
                    // Index 2 Reset wanneer index 1 hoger word. En telt vervolgens + 1 per vergelijking met ander karakter

                    if((lijst.get(index2)).compareTo(lijst.get(index1))<0){
                        /* CompareTo = Geeft hoeveel verschil qua alfabet index er tussen 2 karakters zitten
                        Als hieruit een getal kleiner dan 0 komt zit het huidig geselecteere karakter na het karakter waarmee het vergeleken word.
                        Het huidige geselecteerde karakter word vervolgens hiermee omgewisseld*/
                        String temp = lijst.get(index1);
                        lijst.set( index1, lijst.get(index2)); // Draait de karakters om
                        lijst.set(index2,temp);
                    }
                }
        }
            System.out.println("Eind:" + lijst);
    }
}