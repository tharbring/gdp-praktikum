import java.util.Scanner;

public class Aufgabe08
{
    public static void main( String args[] )
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "Dieses Programm kann drei Highscores aufsteigend sortieren und den 1.Platz ermitteln!" );
        System.out.print( "Bitte Highscore Nr.1 eingeben: " );
        int highscore1 = scanner.nextInt();
        System.out.print( "Bitte Highscore Nr.2 eingeben: " );
        int highscore2 = scanner.nextInt();
        System.out.print( "Bitte Highscore Nr.3 eingeben: " );
        int highscore3 = scanner.nextInt();
        System.out.print( "\nUnd hier die Platzierung: \n\n" );
        System.out.print( "\nUnd hier die Platzierung: \n\n" );
        
        // 10 Vergleiche
        
        if ( highscore1 <= highscore2 && highscore2 <= highscore3 )
        {
            System.out.println("3.Platz: " + highscore1+"\n");
            System.out.println("2.Platz: " + highscore2+"\n");
            System.out.println("1.Platz: " + highscore3+"\n");
        }
        else if ( highscore1 <= highscore3 && highscore3 <= highscore2 )
        {
            System.out.println("3.Platz: " + highscore1+"\n");
            System.out.println("2.Platz: " + highscore3+"\n");
            System.out.println("1.Platz: " + highscore2+"\n");
        }
        else if ( highscore2 <= highscore1 && highscore1 <= highscore3 )
        {
            System.out.println("3.Platz: " + highscore2+"\n");
            System.out.println("2.Platz: " + highscore1+"\n");
            System.out.println("1.Platz: " + highscore3+"\n");
        }
        else if ( highscore2 <= highscore3 && highscore3 <= highscore1 )
        {
            System.out.println("3.Platz: " + highscore2+"\n");
            System.out.println("2.Platz: " + highscore3+"\n");
            System.out.println("1.Platz: " + highscore1+"\n");
        }
        else if ( highscore3 <= highscore1 && highscore1 <= highscore2 )
        {
            System.out.println("3.Platz: " + highscore3+"\n");
            System.out.println("2.Platz: " + highscore1+"\n");
            System.out.println("1.Platz: " + highscore2+"\n");
        }
        else
        {
            System.out.println("3.Platz: " + highscore3+"\n");
            System.out.println("2.Platz: " + highscore2+"\n");
            System.out.println("1.Platz: " + highscore1+"\n");
        }
        
        scanner.close();
    }
}
