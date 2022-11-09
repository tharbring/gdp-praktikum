public class Aufgabe21 
{
	public static void main(String[] args) 
	{
		druckePrimzahlZwillinge(100);
	}
	
	static void druckePrimzahlZwillinge(int n)
	{
		int p = 2;
		while (p <= n)
		{
			if (istPrimzahl(p) && istPrimzahl(p+2))
			{
				System.out.println("(" + p + "," + (p+2) + ")");
			}
			p++;
		}
	}
	
	static boolean istPrimzahl(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
