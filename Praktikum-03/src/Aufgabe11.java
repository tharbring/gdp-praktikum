import java.util.Scanner;

public class Aufgabe11 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine Schulnote als Zahl ein: ");
		int note = scanner.nextInt();
		System.out.print("Die eingegebene Note steht f");
		switch (note)
		{
			case 1: 
				System.out.println("Sehr gut"); break;
			case 2: 
				System.out.println("Gut "); break;
			case 3: 
				System.out.println("Befriedigend"); break;
			case 4: 
				System.out.println("Ausreichend"); break;  
			case 5:	
				System.out.println("Mangelhaft"); break;
			case 6:	
				System.out.println("Ungen�gend"); break;
			default: 
				System.out.println("Die Note gibt es nicht!");
		}
		scanner.close();
	}
}