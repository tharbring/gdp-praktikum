public class Pizza extends Gericht 
{
	String[] belaege;
	int backzeit;
	
	public Pizza(String name, double preis, String[] belaege, int backzeit)
	{
		super(name, preis);
		
		this.setBelaege(belaege);
		this.setBackzeit(backzeit);
	}

	public int getBelaege() 
	{	
		return this.belaege.length;
	}
	
	public String getBelag(int a)
	{
		return this.belaege[a];
	}
	
	public void setBelaege(String[] belaege) 
	{	
		this.belaege = belaege;
	}
	
	public int getBackzeit()
	{
		return this.backzeit;
	}
	
	public void setBackzeit(int backzeit) 
	{
		this.backzeit = backzeit;
	}	
}
