import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) 
	{
		//Monatsvariablen anlegen
		int january;
		int february;
		int march;
		int april;
		int may;
		int june;
		int july;
		int august;
		int september;
		int october;
		int november;
		int december;
		
		int average;
		
		Scanner scanner = new Scanner(System.in);
		
		//Werte einlesen und zuweisen
		System.out.print("Bitte die Temperatur f�r Januar eingeben: ");
		january = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Februar eingeben: ");
		february = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r M�rz eingeben: ");
		march = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r April eingeben: ");
		april = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Mai eingeben: ");
		may = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Juni eingeben: ");
		june = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Juli eingeben: ");
		july = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r August eingeben: ");
		august = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r September eingeben: ");
		september = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Oktober eingeben: ");
		october = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r November eingeben: ");
		november = scanner.nextInt();
		System.out.print("Bitte die Temperatur f�r Dezember eingeben: ");
		december = scanner.nextInt();
		
		average = (january + february + march + april + may + june + july + august + september + october + november + december) / 12;
		
		System.out.println("Die Jahresdurchschnittstemperatur liegt bei " + average + " Grad Celsius!");
	
		scanner.close();

	}

}
