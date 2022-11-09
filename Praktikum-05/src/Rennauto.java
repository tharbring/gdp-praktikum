public class Rennauto 
{
	int startnummer;
	String fahrer;
	String marke;
	String farbe;
	int vMax;
	int rundenzahl = 0;
	
	public Rennauto(int startnummer, String fahrer, String marke, String farbe, int vMax)
	{
		this.startnummer = startnummer;
		this.fahrer = fahrer;
		this.marke = marke;
		this.farbe = farbe;
		this.vMax = vMax;
	}
	
	public void fahren()
	{
		double faktor = Math.random() * 0.25 + 0.25;
		int runden = (int) (this.vMax * faktor);
		this.rundenzahl += runden; 
	}
}
