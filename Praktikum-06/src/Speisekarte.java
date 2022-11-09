public class Speisekarte 
{
	Gericht[] gerichte = new Gericht[10];
	
	public Speisekarte()
	{
		
	}

	private Gericht[] getGerichte() 
	{
		return this.gerichte;
		
	}
	
	private void setGerichte(Gericht[] gericht) 
	{
		this.gerichte = gericht;
		
	}
}
