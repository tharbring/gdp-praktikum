public class Praktikum05 
{
	public static void main(String[] args) 
	{
		//Aufgabe 23
		Rennauto bmw = new Rennauto(1, "Klaus", "BMW", "blau", 200);
		Rennauto opel = new Rennauto(2, "Peter", "Opel", "rot", 190);
		Rennauto vw = new Rennauto(3, "Marie", "VW", "grün", 194);

		System.out.println("Der Fahrer des " + bmw.farbe + "en " + bmw.marke + " heißt " + bmw.fahrer + "!");
		System.out.println("Die Höchstgeschwindigkeit des " + opel.farbe + "en " + opel.marke + " liegt bei " + opel.vMax + " km/h!");
		System.out.println("Der " + vw.farbe + "e " + vw.marke + " hat die Startnummer " + vw.startnummer + "!");
		
		//Aufgabe 24
		for(int i = 1; i <= 6; i++)
		{
			training(bmw, opel, vw, i);
		}		
		
		//Aufgabe 25
		Rennauto ford = new Rennauto(4, "Antje", "Ford", "gelb", 186);
		Rennauto audi = new Rennauto(5, "Stefan", "Audi", "weiß", 192);
		
		Rennauto[] teilnehmer = {bmw, opel, vw, ford, audi};
		
		Rennen gp = new Rennen(teilnehmer, 1000);
		
		while(!gp.zuEnde(teilnehmer))
		{
			gp.alleFahren();
		}
		Rennauto gewinner = gp.sieger(teilnehmer);
		System.out.println("Gewonnen hat der " + gewinner.marke + ", gefahren von " + gewinner.fahrer + "!");
		
		for(int i = 0; i < teilnehmer.length; i++)
		{
			System.out.println("Von " + teilnehmer[i].fahrer + "/" + teilnehmer[i].marke + " gefahrene Runden: " + teilnehmer[i].rundenzahl);
		}		
	}
	
	public static void training(Rennauto bmw, Rennauto opel, Rennauto vw, int session)
	{
		bmw.fahren();
		opel.fahren();
		vw.fahren();
		System.out.println("Trainingssession: " + session);
		System.out.println("===================");
		System.out.println("Der " + bmw.farbe + "e " + bmw.marke + ", gefahren von " + bmw.fahrer + ", hat jetzt " + bmw.rundenzahl + " Runden zurückgelegt.");
		System.out.println("Der " + opel.farbe + "e " + opel.marke + ", gefahren von " + opel.fahrer + ", hat jetzt " + opel.rundenzahl + " Runden zurückgelegt.");
		System.out.println("Der " + vw.farbe + "e " + vw.marke + ", gefahren von " + vw.fahrer + ", hat jetzt " + vw.rundenzahl + " Runden zurückgelegt.");
	}
}
