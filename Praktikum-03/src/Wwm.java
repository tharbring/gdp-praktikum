import java.util.Scanner;

public class Wwm
{
    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

        // Deklaration der Variablen "richtige_antwort" als char
        char richtige_antwort;
        // Deklaration der Variablen "antwort_spieler" als char
        char antwort_spieler;
        // Deklaration der Variablen "richtig" als boolean
        boolean richtig;
        // Deklaration und Initialisierung der Variablen
        // "anzahl_richtige_antworten" als int
        int anzahl_richtige_antworten;
        // Deklaration der Variablen "spielen" als char
        char spielen = 1;
        // Deklaration der Variablen "durchgang" als int
        int durchgang = 0;
        // Deklaration und Initialisierung der Variablen
        // "anzahl_richtige_antworten_gesamt" als int
        int anzahl_richtige_antworten_gesamt = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "Herzlich Willkommen zum WHS - WER WIRD MILLIONÄR!");
        System.out.println( "=================================================" );
        // Eine Leerzeile ausgeben
        System.out.println();

        // do-while Schleife um mehrere Durchgzu erm
        do
        {
            // Bereitschaft zum Spielen abfragen
            if ( durchgang == 0 )
            {
                System.out.println( "Möchten Sie jetzt spielen?" );
            }
            else
            {
                System.out.println( "MSie noch einmal spielen? " );
            }
            System.out.println( "j/J - JA\nn/N - NEIN" );
            // Antwort einlesen und sicherstellen, dass nur "j" oder "n"
            // akzeptiert werden
            do
            {
                spielen = scanner.next().charAt(0);
                if ( spielen != 'j' && spielen != 'J' && spielen != 'n' && spielen != 'N')
                {
                    System.out.println( "Es ist nur die Eingabe von \"j\" / \"J\"  bzw. \"n\" / \"N\"möglich!");
                }
            }
            while ( spielen != 'j' && spielen != 'J' && spielen != 'n' && spielen != 'N');

            if ( spielen == 'j' || spielen == 'J' )
            {
                // Anzahl der DurchgerhAnzahl richtiger Antworten pro
                // Durchgang zur
                durchgang++;
                anzahl_richtige_antworten = 0;
                	
                System.out.println( "Das ist Durchgang Nr. " + durchgang );
                System.out.println( "=======================" );

                /*
                 * ########### # Frage 1 # ###########
                 */

                // Korrekte Antwort speichern
                richtige_antwort = 'd';
                // Frage stellen
                System.out.println( "Hier kommt Frage 1:" );
                System.out.println( "Wo finden Sie die Vorlesungs-, Praktikums- und Tutoriumsunterlagen?" );
                System.out.println( "a - doodle\nb - google\nc - poodle\nd - moodle" );
                // Antwort einlesen
                System.out.println( "Bitte a,b,c oder eingeben:" );
                antwort_spieler = scanner.next().charAt(0);
                // Antwort auswerten
                richtig = ( antwort_spieler == richtige_antwort ) ? true : false;
                // Ergebnis ausgeben
                if ( richtig )
                {
                    System.out.println( "Gldie Antwort ist richtig!" );
                    anzahl_richtige_antworten++;
                    anzahl_richtige_antworten_gesamt++;
                    System.out.println( "Sie haben in diesem Durchgang bis jetzt " + anzahl_richtige_antworten
                        + " richtige Antwort(en) gegeben!\n" );
                }
                else
                {
                    System.out.println( "Schade, die Antwort ist leider falsch, richtig wäre " + richtige_antwort
                        + " gewesen!" );
                    System.out.println( "Sie haben in diesem Durchgang bis jetzt " + anzahl_richtige_antworten
                        + " richtige Antwort(en) gegeben!\n" );
                }

                /*
                 * ########### # Frage 2 # ###########
                 */

                // Korrekte Antwort speichern
                richtige_antwort = 'c';
                // Frage stellen
                System.out.println( "Hier kommt Frage 2:" );
                System.out.println( "Welches der folgenden Wörter dürfen Sie nicht als Variablenbezeichner in java verwenden?" );
                System.out.println( "a - inter\nb - mint\nc - int\nd - ginter" );
                // Antwort einlesen
                System.out.println( "Bitte a,b,c oder eingeben:" );
                antwort_spieler = scanner.next().charAt(0);
                // Antwort auswerten
                richtig = ( antwort_spieler == richtige_antwort ) ? true : false;
                // Ergebnis ausgeben
                if ( richtig )
                {
                    System.out.println( "Gldie Antwort ist richtig!" );
                    anzahl_richtige_antworten++;
                    anzahl_richtige_antworten_gesamt++;
                    System.out.println( "Sie haben in diesem Durchgang bis jetzt " + anzahl_richtige_antworten
                        + " richtige Antwort(en) gegeben!\n" );
                }
                else
                {
                    System.out.println( "Schade, die Antwort ist leider falsch, richtig wäre " + richtige_antwort
                        + " gewesen!" );
                    System.out.println( "Sie haben in diesem Durchgang bis jetzt " + anzahl_richtige_antworten
                        + " richtige Antwort(en) gegeben!\n" );
                }

            }
        }
        while ( spielen != 'n' && spielen !='N');
       
        // Gesamtergebnis ausgeben
        if ( durchgang > 1 )
        {
            System.out.println( "In den " + durchgang + " Durchgängen haben Sie insgesamt "
                + anzahl_richtige_antworten_gesamt + " richtige Antwort(en) gegeben!" );
        }
    }
    
}
