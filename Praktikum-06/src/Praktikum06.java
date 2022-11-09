public class Praktikum06 
{
	public static void main(String[] args) 
	{
		//Aufgabe 26
		int counter = 10000;
		Beleg beleg = null;
		
		for (int i = 0; i <= 50; i++)
		{
			beleg = new Beleg(counter);
			counter++;
		}
		System.out.println("Letzte Belegnummer: " + beleg.getBelegnummer());
		System.out.println("=======================");
		//System.out.println("Nächste Belegnummer: " + counter);
		
		//Aufgabe 27
		//Testpizza erstellen und ausgeben
		String[] belaege = {"Käse", "Salami", "Pilze", "Paprika"};
		Pizza salami = new Pizza("Pizza Salami", 8.50, belaege, 12);
		
		System.out.println("Name des Gerichts: " + salami.getName());
		System.out.println("Preis des Gerichts: " + salami.getPreis() + " Euro");
		System.out.println("Anzahl der Beläge: " + salami.getBelaege());
		int anzahl = salami.getBelaege();
		for(int i = 0; i < anzahl; i++)
		{
			System.out.println("Beleg Nummer " + (i+1) + ": " + salami.getBelag(i));
		}
		System.out.println("Backzeit in Minuten: " + salami.getBackzeit());
		
		//Testpasta erstellen und ausgeben
		Pasta spaghetti = new Pasta("Spaghetti Carbonara al forno", 11.50, "Carbonara", true);
		System.out.println("Name des Gerichts: " + spaghetti.getName());
		System.out.println("Preis des Gerichts: " + spaghetti.getPreis() + " Euro");
		System.out.println("Soße: " + spaghetti.getSoße());
		if(spaghetti.getUeberbacken())
		{
			System.out.println("Überbacken: Ja");
		} else 
		{
			System.out.println("Überbacken: Nein");
		}
		System.out.println("=======================");
		
		//Aufgabe 28		
		Speisekarte karte = new Speisekarte();
		String[] belaegespeciale = {"Tomatensoße", "Salami", "Schinken", "Champignons", "Käse"};
		Pizza speciale = new Pizza("Pizza Speciale", 6.50, belaegespeciale, 11);
		karte.gerichte[0] = speciale;
		Pasta rigatoni = new Pasta("Rigatoni Bolognese", 5.00, "Hackfleischsoße", false);
		karte.gerichte[1] =  rigatoni;
		
		System.out.println("Der Preis für eine große Pizza Speciale ist: " + karte.gerichte[0].berechnePreis("groß") + " Euro");
		rigatoni.berechnePreis("klein");
		rigatoni.ueberbacken();
		System.out.println(karte.gerichte[1].getName() + " in klein kostet: " + karte.gerichte[1].getPreis() + " Euro");
		System.out.println("=======================");
	}
}
