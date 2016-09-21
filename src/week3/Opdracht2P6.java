package week3;

import java.util.Scanner;

public class Opdracht2P6 {

    /*
    OPDRACHT:
    
    De hoogte van de contributie van een sportvereniging is afhankelijk van de sport die men beoefent, de leeftijd en het aantal jaren dat men lid is. Gegeven:
    - de contributie voor voetbal bedraagt € 175,00 en voor handbal € 225,00;
    - is men ouder dan 40 jaar dan krijgt men € 25,00 korting;
    - leden die langer dan 10 jaar lid zijn, krijgen een korting van € 20,00.
    Ingelezen wordt: sportsoort (voetbal of handbal, aangegeven met een ‘V’ of een ‘H’), leeftijd en duur van lidmaatschap.  Getoond wordt de te betalen contributie.
     */

 /*
    STAPPEN:
    
    lees sportsoort in (V of H)     String
    lees leeftijd in                int
    lees duur lidmaatschap in       int
    
    als sportsoort is V dan contributie is 175 euro
    als sportsoort is H dan contributie is 225 euro
    
    als leeftijd is groter dan 40 jaar dan korting van 25 euro
    
    als lidmaatschap is langer dan 10 jaar dan korting van 20 euro
    
    print contributie               int
     */
    
    public static void main(String[] args) {
        Scanner lezer = new Scanner(System.in);

        String sportSoort;
        int leeftijd;
        int duurLidmaatschap;

        System.out.println("Vul sportsoort in (V of H):");
        sportSoort = lezer.next();

        System.out.println("Vul leeftijd in:");
        leeftijd = lezer.nextInt();

        System.out.println("Vul duur lidmaatschap in:");
        duurLidmaatschap = lezer.nextInt();

        int contributie = 0;
        //als sportsoort is V dan contributie is 175 euro
        //als sportsoort is H dan contributie is 225 euro
        if ("V".equals(sportSoort)) {
            contributie = 175;
        } else if ("H".equals(sportSoort)) {
            contributie = 225;
        }

        //als leeftijd is groter dan 40 jaar dan korting van 25 euro
        if (leeftijd > 40) {
            contributie = contributie - 25;
        }

        //als lidmaatschap is langer dan 10 jaar dan korting van 20 euro
        if (duurLidmaatschap > 10) {
            contributie = contributie - 20;
        }

        System.out.println("De contributie bedraagd: €" + contributie);
    }

}
