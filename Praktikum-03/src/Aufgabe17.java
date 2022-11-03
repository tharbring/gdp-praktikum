import java.util.Scanner;

public class Aufgabe17
{
    public static void main( String[] args )
    {
        int[][] schuhschrank = new int[2][2];
        int fach;
        int anzahl;
        char eingabe;
        Scanner scanner = new Scanner(System.in); 
        /*
         * schuhschrank[0][0] = flache helle Schuhe
         * schuhschrank[0][1] = flache dunkle Schuhe 
         * schuhschrank[1][0] = hohe helle Schuhe 
         * schuhschrank[1][1] = hohe dunkle Schuhe
         */

        do
        {
            System.out.println( "Aufbau des Schuhschranks:\n" );
            System.out.println( "Fach 1: flache helle Schuhe" );
            System.out.println( "Fach 2: flache dunkle Schuhe" );
            System.out.println( "Fach 3: hohe helle Schuhe" );
            System.out.println( "Fach 4: hohe dunkle Schuhe\n\n" );

            System.out.println( "In welchem Fach möchten Sie die Anzahl der Schuhe aktualisieren?" );
            fach = scanner.nextInt();

            System.out.println( "Wie lautet die aktuelle Anzahl in Fach Nr. " + fach + " ?" );
            anzahl = scanner.nextInt();

            switch ( fach )
            {
                case 1:
                    schuhschrank[0][0] = anzahl;
                    break;
                case 2:
                    schuhschrank[0][1] = anzahl;
                    break;
                case 3:
                    schuhschrank[1][0] = anzahl;
                    break;
                case 4:
                    schuhschrank[1][1] = anzahl;
                    break;
            }

            System.out.println( "Möchten Sie eine weitere Schublade aktualisieren? (j/n) " );
            eingabe = scanner.next().charAt(0);
        }
        while ( eingabe == 'j' );

        // Ausgabe der einzelnen F

        System.out.println( "\nAusgabe aller Fim Schuhschrank:\n\n" );
        System.out.println( "Fach 1 mit flachen hellen Schuhen enthhält " + schuhschrank[0][0] + " Schuhe" );
        System.out.println( "Fach 2 mit flachen dunklen Schuhen enthhält " + schuhschrank[0][1] + " Schuhe" );
        System.out.println( "Fach 3 mit hohen hellen Schuhen enthält " + schuhschrank[1][0] + " Schuhe" );
        System.out.println( "Fach 4 mit hohen dunklen Schuhen enthhält " + schuhschrank[1][1] + " Schuhe" );

        // Ausgabe der Gesamtzahl an Schuhen im Schuhschrank
        int summe = schuhschrank[0][0] + schuhschrank[0][1] + schuhschrank[1][0] + schuhschrank[1][1];
        System.out.println( "\nEs befinden sich insgesamt " + summe + " Paar Schuhe im Schuhschrank" );
        
        scanner.close();
    }
}
