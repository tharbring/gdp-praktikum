public class Aufgabe09 
{

	public static void main(String[] args) 
	{
		// Der grWert im Datentyp float:
		float max_f = Float.MAX_VALUE;  
		System.out.println(max_f); 	    // Ergebnis: 3.4028235E38
		
		// Summe zweier ziemlich grofloat-Zahlen
		float a_f = 3e38f;
		float b_f = 2e38f;
		float summe_f = a_f + b_f;
		System.out.println(summe_f); 	// Ergebnis: Infinity
		
		// R
		float a_neu = summe_f - b_f;
		System.out.println(a_neu); 	    // Ergebnis: immer noch Infinity
									    // sollte doch eher wieder 3e38 sein
		
		// Der grWert im Datentyp int:
		int max_i = Integer.MAX_VALUE;  
		System.out.println(max_i); 	    // Ergebnis: 2147483647
		
		// Summe zweier ziemlich groint-Zahlen
		int a_i = 2000000000;
		int b_i = 1500000000;
		int summe_i = a_i + b_i;
		System.out.println(summe_i); 	// Ergebnis: -794967296
		
		// R
		int a_i_neu = summe_i - b_i;
		System.out.println(a_i_neu); 	// Ergebnis: wieder korrekt!
		
	}

}
