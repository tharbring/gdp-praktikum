public class Rennen 
{
	Rennauto[] teilnehmer;
	int renndistanz;
	
	public Rennen(Rennauto[] teilnehmer, int renndistanz)
	{
		this.teilnehmer = teilnehmer;
		this.renndistanz = renndistanz;
	}
	
	public void alleFahren()
	{
		for(int i = 0; i < teilnehmer.length; i++)
		{
			teilnehmer[i].fahren();
		}
	}
	
	public boolean zuEnde(Rennauto[] teilnehmer)
	{		
		for(int i = 0; i < teilnehmer.length; i++)
		{
			if(teilnehmer[i].rundenzahl > this.renndistanz)
			{
				return true;
			}
		}
		return false;
	}
	
	public Rennauto sieger(Rennauto[] teilnehmer)
	{
		Rennauto gewinner = teilnehmer[0];
		int max = teilnehmer[0].rundenzahl;
		
		for(int i = 0; i < teilnehmer.length; i++)
		{
			if(max < teilnehmer[i].rundenzahl)
			{
				max = teilnehmer[i].rundenzahl;
				gewinner = teilnehmer[i];
			}
		}
		return gewinner;
	}
}
