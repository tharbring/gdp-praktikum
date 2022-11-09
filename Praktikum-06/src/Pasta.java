public class Pasta extends Gericht
{
	String so�e;
	boolean ueberbacken;
	
	public Pasta(String name, double preis, String so�e, boolean ueberbacken)
	{
		super(name, preis);
		
		this.setSo�e(so�e);
		this.setUeberbacken(ueberbacken);
	}
	
	public String getSo�e() 
	{	
		return this.so�e;
	}
	
	public void setSo�e(String so�e) 
	{	
		this.so�e = so�e;
	}
	
	public boolean getUeberbacken()
	{
		return this.ueberbacken;
	}
	
	public void setUeberbacken(boolean ueberbacken) 
	{
		this.ueberbacken = ueberbacken;
	}
	
	public String ueberbacken()
	{
		this.setUeberbacken(true);
		this.setName(getName() + " al forno");
		this.setPreis(getPreis() + 0.5);
		
		return this.getName();
	}
}
