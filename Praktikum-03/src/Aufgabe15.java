import java.util.Scanner;

public class Aufgabe15 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int[] feld = new int[10];
		
		//Befdes Feldes
		for(int i=0;i<feld.length;i++)
		{
			System.out.print("Bitte geben Sie die "+(i+1)+".Zahl ein: ");
			feld[i] = scanner.nextInt();
		}
		
		//Finden des Minimums
		int minimum = Integer.MAX_VALUE;
		
		for(int temp:feld)
		{
			if(temp < minimum)
				minimum = temp;
		}
		
		System.out.println("\nDer kleinste Wert in dem Feld ist die Zahl "+minimum);
		
		//Finden des Maximums
		int maximum = Integer.MIN_VALUE;
		
		for(int temp:feld)
		{
			if(temp > maximum)
				maximum = temp;
		}
		
		System.out.println("\nDer größte Wert in dem Feld ist die Zahl "+maximum);
		
		//Berechnen des Mittelwerts
		int summe=0;
		
		for(int temp:feld)
		{
			summe +=temp;
		}
		
		float mittelwert = summe / 10f;
		
		System.out.println("\nDer Mittelwert aller Zahlen ist: "+mittelwert);

		scanner.close();
	}

}
