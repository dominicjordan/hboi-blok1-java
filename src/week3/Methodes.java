package week3;

import java.util.Scanner;

public class Methodes {
    
    /*
    De main methode wordt altijd als eerste uitgevoerd. 
    In de main methode kunnen weer andere methodes aangeroepen worden welke uitgevoerd moeten worden.
    */
    public static void main(String[] args) {
        //Declareer variabelen (plaatsen in het geheugen)
        String naam1;
        String naam2;
        String naam3;
        Scanner lezer;
        
        //Initialiseer Scanner object
        lezer = new Scanner(System.in);
        
        //Print tekst uit, en lees de in de console getypte tekst in, wijs deze tekst toe aan een variabele
        System.out.println("Voer een naam in:");
        naam1 = lezer.nextLine();
        
        //Print tekst uit, en lees de in de console getypte tekst in, wijs deze tekst toe aan een variabele
        System.out.println("Voer een naam in:");
        naam2 = lezer.nextLine();
        
        //Print tekst uit, en lees de in de console getypte tekst in, wijs deze tekst toe aan een variabele
        System.out.println("Voer een naam in:");
        naam3 = lezer.nextLine();
        
        //Print een bericht uit om de personen welkom te heten
        System.out.println("Welkom " + naam1 + "!");
        System.out.println("Welkom " + naam2 + "!");
        System.out.println("Welkom " + naam3 + "!");
    }
    
    public static void printBericht() {
        
    }
    
    
    
}
