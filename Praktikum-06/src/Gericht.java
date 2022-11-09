public class Gericht 
{
	String name;
	double preis;
	
	public Gericht(String name, double preis)
	{
		this.setName(name);
		this.setPreis(preis);
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
		this.name = name;		
	}
	
	public double getPreis() 
	{
		return this.preis;
	}
	
	public void setPreis(double preis) 
	{
		this.preis = preis;		
	}
	
	public double berechnePreis(String groesse)
	{
		switch(groesse) 
		{
		case "klein":
			double preis1 = this.getPreis() * 0.8;
			this.setPreis(preis1);
			break;
		case "groﬂ":
			double preis2 = this.getPreis() * 1.2;
			this.setPreis(preis2);
			break;
		default:
			break;
		}
		return this.getPreis();
	}
}














