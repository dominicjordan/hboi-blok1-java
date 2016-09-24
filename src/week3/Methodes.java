package week3;

//Importeer de Scanner package zodat de Scanner gebruikt kan worden
import java.util.Scanner;

public class Methodes {
    
    /*
    De main methode wordt altijd als eerste uitgevoerd wanneer je programma opstart. 
    In de main methode kunnen weer andere methodes aangeroepen worden die uitgevoerd moeten worden.
    */
    public static void main(String[] args) {
        //leesNamenInEnPrintUitZonderMethodes();
        leesNamenInEnPrintUit();
    }
    
    /*
    Methode die namen inleest en uitprint maar zonder het gebruik van methodes waardoor het een lange en minder nette methode is.
    */
    public static void leesNamenInEnPrintUitZonderMethodes() {
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
    
    /*
    Methode die namen inleest en uitprint.
    */ 
    public static void leesNamenInEnPrintUit() {
        //Declareer variabelen (plaatsen in het geheugen)
        String naam1;
        String naam2;
        String naam3;
        
        //Print tekst uit, en lees de in de console getypte tekst in, wijs deze tekst toe aan een variabele
        naam1 = leesNaamIn();
        naam2 = leesNaamIn();
        naam3 = leesNaamIn();
        
        //Print een bericht uit om de personen welkom te heten
        printNaamUit(naam1);
        printNaamUit(naam2);
        printNaamUit(naam3);
    }
    
    /*
    Methode die een naam inleest en deze returned.
    */
    public static String leesNaamIn() {
        String naam;
        Scanner lezer = new Scanner(System.in);
        
        System.out.println("Voer een naam in:");
        naam = lezer.nextLine();
        return naam;
    }
    
    /*
    Methode die een naam verwacht als parameter en deze uitprint.
    */
    public static void printNaamUit(String naam) {
        System.out.println("Welkom " + naam + "!");
    }
    
}
