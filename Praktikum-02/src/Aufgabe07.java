import java.util.Scanner;

public class Aufgabe07
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		//Die Entfernung in km eingeben
		System.out.println("Bitte die Entfernung in Kilometer als Fliesskommazahl eingeben: ");
		double km = scanner.nextDouble();
				
		//Umrechnung in Meilen
		double mile = km * 0.60934;
			
		//Ausgabe der Meilen
		System.out.print(km + " Kilometer entsprechen " + mile + " Meilen");
				
		scanner.close();
	}
}
