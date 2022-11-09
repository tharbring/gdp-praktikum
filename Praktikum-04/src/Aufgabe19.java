public class Aufgabe19 
{
	public static void main(String[] args) 
	{
		System.out.println("Das kleinste gemeinsame Vielfache der Zahlen 4 und 7 ist: " + kgV(4,7));
		System.out.println("Das kleinste gemeinsame Vielfache der Zahlen 3 und 8 ist: " + kgV(3,8));
		System.out.println("Das kleinste gemeinsame Vielfache der Zahlen 9 und 56 ist: " + kgV(9,56));
		System.out.println("Das kleinste gemeinsame Vielfache der Zahlen 2 und 131 ist: " + kgV(2,131));
		System.out.println("Das kleinste gemeinsame Vielfache der Zahlen 123 und 5476 ist: " + kgV(123,5476));
	}
	
	static int kgV(int zahl1, int zahl2)
	{
		if (zahl1 == 0 || zahl2 == 0)
		{
			return 0;
		}
		//Beträge der Eingabewerte ermitteln
		int absZahl1 = Math.abs(zahl1);
		int absZahl2 = Math.abs(zahl2);
		// Größte bzw kleinste Zahl (Betrag) ermitteln
		int absMax = Math.max(absZahl1, absZahl2);
		int absMin = Math.min(absZahl1, absZahl2);
		// kgV ermitteln
		int kgv = absMax;
		while (kgv % absMin != 0)
		{
			kgv += absMax;
		}
		return kgv;
	}
}