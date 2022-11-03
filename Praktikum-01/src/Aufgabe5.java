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
		System.out.print("Bitte die Temperatur für Januar eingeben: ");
		january = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Februar eingeben: ");
		february = scanner.nextInt();
		System.out.print("Bitte die Temperatur für März eingeben: ");
		march = scanner.nextInt();
		System.out.print("Bitte die Temperatur für April eingeben: ");
		april = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Mai eingeben: ");
		may = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Juni eingeben: ");
		june = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Juli eingeben: ");
		july = scanner.nextInt();
		System.out.print("Bitte die Temperatur für August eingeben: ");
		august = scanner.nextInt();
		System.out.print("Bitte die Temperatur für September eingeben: ");
		september = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Oktober eingeben: ");
		october = scanner.nextInt();
		System.out.print("Bitte die Temperatur für November eingeben: ");
		november = scanner.nextInt();
		System.out.print("Bitte die Temperatur für Dezember eingeben: ");
		december = scanner.nextInt();
		
		average = (january + february + march + april + may + june + july + august + september + october + november + december) / 12;
		
		System.out.println("Die Jahresdurchschnittstemperatur liegt bei " + average + " Grad Celsius!");
	
		scanner.close();

	}

}
