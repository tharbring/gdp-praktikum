public class Aufgabe22 
{
	public static void main(String[] args) 
	{
		int[] noten = {3,2,1,1,6,3,4,5,6,6,1,2,1,2};
		
		for(int temp: noten)
		{
			System.out.print(temp + ", ");
		}
		System.out.println();
		notenanpassen(noten);
		System.out.println("Nach der Anpassung: \n");
		for(int temp: noten)
		{
			System.out.print(temp + ", ");
		}
	}
	
	static void notenanpassen(int[] noten)
	{
		for(int i=0;i<noten.length;i++)
		{
			if(noten[i]==6)
				noten[i]=5;
		}
	}
	
}