public class Pasta extends Gericht
{
	String soﬂe;
	boolean ueberbacken;
	
	public Pasta(String name, double preis, String soﬂe, boolean ueberbacken)
	{
		super(name, preis);
		
		this.setSoﬂe(soﬂe);
		this.setUeberbacken(ueberbacken);
	}
	
	public String getSoﬂe() 
	{	
		return this.soﬂe;
	}
	
	public void setSoﬂe(String soﬂe) 
	{	
		this.soﬂe = soﬂe;
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
