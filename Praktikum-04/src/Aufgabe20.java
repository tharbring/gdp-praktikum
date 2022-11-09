public class Aufgabe20 
{

	public static void main(String[] args) 
	{
		int[] feld1 = {1,2,3,4,5,6,7,8};
		int[] feld2 = {-1,-2,-3,-4,-5,-6,-7,-8};
		int[] feld3 = {0,154,58746,95486,12156,156,648,7};
		int[] feld4 = {-564,-8456,-959,-4541,-6468,-89510,-951,-845};
		int[] feld5 = {100,200,500,-800,-900,450,50,-600};
		
		System.out.println("Das Maximum von Feld 1 ist: " + maximum(feld1));
		System.out.println("Das Maximum von Feld 2 ist: " + maximum(feld2));
		System.out.println("Das Maximum von Feld 3 ist: " + maximum(feld3));
		System.out.println("Das Maximum von Feld 4 ist: " + maximum(feld4));
		System.out.println("Das Maximum von Feld 5 ist: " + maximum(feld5));
	}
	
	static int maximum(int[] feld)
	{
		int max = Integer.MIN_VALUE;
		
		for(int temp:feld)
		{
			if(temp > max)
			{
				max = temp;
			}				
		}
		return max;
	}

}
