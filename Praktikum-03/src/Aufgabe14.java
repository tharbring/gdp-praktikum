import java.util.Scanner;

public class Aufgabe14 {

	public static void main(String[] args) 
	{

		System.out.println("Bitte eine Zahl f�r die Anzahl der Durchl�ufe angeben: ");
		try (Scanner scanner = new Scanner(System.in)) 
		{
			int durchlaeufe = scanner.nextInt();
					
			// Ersetzen Sie diese while-Schleife durch eine �quivalente for-Schleife

			int i = durchlaeufe;
			System.out.println("Teil 1:\n");

			
			// Musterl�sung Teil 1
			for(int j=i;j>0;j--)
			{
				System.out.println(i--);
			}
				
			
			// Variante 2
			System.out.println("Variante 2:");
			i = durchlaeufe;
			for(;i>0;i--)
			{
				System.out.println(i);
			}
			
			
			System.out.println();
			
			// Ersetzen Sie diese for-Schleife durch eine �quivalente do-while-Schleife
			
			System.out.println("Teil 2:\n");
					
			
			// Musterl�sung Teil 2
			
			int j=0;
					
			do
			{
				if(j<durchlaeufe)
					System.out.println(j++);
			}
			while(j<durchlaeufe);
			
			scanner.close();
		}
				
		
	}

}