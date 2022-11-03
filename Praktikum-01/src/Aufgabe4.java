import java.util.Scanner;

public class Aufgabe4 
{
	/* Dieses Programm zeigt den Aufbau eines JAVA-Programms mit Ein-/Ausgabe */
	public static void main(String args[])
	{		
		// Deklaration der Celsius-Variablen 
		int bocholt_celsius;
		int wesel_celsius;
		// Deklaration der Fahrenheit-Variablen
		int bocholt_fahrenheit;
		int wesel_fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		
		// Die Temperatur in Bocholt in Celsius als Ganzzahl eingeben
		System.out.print("Bitte die Temperatur in Bocholt in Celsius als Ganzzahl eingeben: ");
		bocholt_celsius = scanner.nextInt();
		System.out.print("Bitte die Temperatur in Wesel in Celsius als Ganzzahl eingeben: ");
		wesel_celsius = scanner.nextInt();
		
		bocholt_fahrenheit = (int) (bocholt_celsius * 1.8 + 32);
		wesel_fahrenheit = (int) (wesel_celsius * 1.8 + 32);

		// Die Temperatur in Celsius und Fahrenheit ausgeben 
		System.out.println("Die Temperatur in Bocholt liegt bei " + bocholt_celsius + " Grad Celsius!");
		System.out.println("Das entspricht " + bocholt_fahrenheit + " Fahrenheit!");
		System.out.println("Die Temperatur in Wesel liegt bei " + wesel_celsius + " Grad Celsius!");
		System.out.println("Das entspricht " + wesel_fahrenheit + " Fahrenheit!");
		
		//Aufgabe 4
		if (bocholt_celsius > wesel_celsius)
		{
			System.out.println("In Bocholt ist es wärmer als in Wesel!");
		}
		else 
		{
			System.out.println("In Wesel ist es wärmer als in Bocholt oder die Temperatur ist in beiden Orten gleich!");
		}
		
		scanner.close();
	}
}
