import java.util.Scanner;

public class Aufgabe18 {

	public static void main(String[] args) 
	{
		int obergrenze;
		Scanner scanner = new Scanner(System.in); 
		int primzahlen_gefunden =0;
		boolean primzahl;
		int summe=0;
		
		System.out.print("Bitte geben Sie eine Obergrenze ein: ");
		obergrenze = scanner.nextInt();
		
		int[] primzahlen = new int[obergrenze];
		
		// Die ersten beiden Primzahlen werden fest in das Array eingetragen
		primzahlen[0]=2;
		primzahlen[1]=3;
		primzahlen_gefunden+=2;
		
		for(int i=4; i<=obergrenze;i++)
		{
			primzahl=true;
			for(int j=2;j<=i/2;j++)
			{
				// Wenn ohne Rest teilbar, dann handelt es sich um keine Primzahl
				if(i%j==0)
					primzahl=false;
			}
			
			// Wenn Primzahl gefunden wurde, dann in das Array 
			if(primzahl)
			{
				primzahlen[primzahlen_gefunden]=i;
				primzahlen_gefunden++;
			}	
		}
		
		
		// Ausgabe der gefundenen Primzahlen und berechnen der Summe
		for(int k=0;k<primzahlen_gefunden;k++)
		{
			System.out.println(primzahlen[k]);
			summe += primzahlen[k];
		}
		
		System.out.println("Summe: "+summe);
		
		scanner.close();
	}

}
