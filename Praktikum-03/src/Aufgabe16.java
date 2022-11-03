import java.util.Scanner;

public class Aufgabe16
{
    public static void main( String[] args )
    {
        int schubladenr;
        int anzahl;
        char eingabe;
        Scanner scanner = new Scanner(System.in);
        
        
        // Schrank-Array mit 4 Schubladen
        int[] schrank= new int[4];

        do
        {
            System.out.println( "In welcher Schublade möchten Sie die Anzahl der T-Shirts aktualisieren? " );
            schubladenr = scanner.nextInt();

            System.out.println( "Wieviele T-Shirts befinden Sie aktuell in Schublade Nr." + schubladenr );
            anzahl = scanner.nextInt();
            schrank [schubladenr - 1] = anzahl;

            System.out.println( "Möchten Sie eine weitere Schublade aktualisieren? (j/n) " );
            eingabe = scanner.next().charAt(0);
        }
        while ( eingabe == 'j');
        
        // Ausgabe

        int zaehler = 1;
        int gesamt = 0;

        for ( int inhalt : schrank )// Das ist eine for-each Schleife, damit wird das Feld vollstdurchlaufen
                                     // und die einzelnen Inhalte ausgelesen
        {
            System.out.println( "\nIn der " + zaehler + ".Schublade befinden sich " + inhalt + " T-Shirts." );
            gesamt += inhalt;
            zaehler++;
        }

        System.out.println( "\nInsgesamt befinden Sich " + gesamt + " T-Shirts im Schrank!" );
        scanner.close();
    }

}
