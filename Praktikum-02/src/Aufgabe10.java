public class Aufgabe10 {

	public static void main(String[] args) 
	{
		// Zweimal der gleiche Wert, aber doch nicht gleich...
		
		float f = 0.02f;
		double d = 0.02d;
		
		if (d==f) 
			System.out.println("Die Zahlen sind gleich, so soll es sein!");
		else
			System.out.println("Huch, die Zahlen sind nicht gleich.");	
		
		// Woran liegt das?
		
		/*
		   Exkurs:
		   
			Recherche: Wie werden double-Werte in Java dargestellt?
			-------------------------------------------------------
			
			Java verwendet das standardisierte IEEE 754 floating-point format
			(single precision 32bit ffloat, double precision 64bit fdouble)
			
			0.02f --> 00111100 10100011 11010111 00001010
			0.02d --> 00111111 10010100 01111010 11100001 01000111 10101110 00010100 01111011
			
			Aber: Zahldarstellung ist nicht exakt!!
			
			0.02f -> beste N1.99999995529651641845703125E-2
			0.02d -> beste N2.00000000000000004163336342344E-2
			
			Siehe auch: www.binaryconvert.com
			
		*/
		long d_l = Double.doubleToLongBits(d);     // IEEE 754 floating-point format als long
		double dt = Double.longBitsToDouble(d_l);  // Test, ob es auch rfunktioniert
		System.out.println(dt+" als double in Binärdarstellung:");
		String s_l = Long.toBinaryString(d_l);
		while (s_l.length() < 64)
		{
			s_l = "0" + s_l;
		}
		System.out.println(s_l);  
		
		int f_i = Float.floatToIntBits(f);     	   // IEEE 754 floating-point format als long
		float ft = Float.intBitsToFloat(f_i);      // Test, ob es auch rfunktioniert
		System.out.println(ft+" als float in Binärdarstellung:");
		String s_i = Integer.toBinaryString(f_i);
		while (s_i.length() < 32)
		{
			s_i = "0" + s_i;
		}
		System.out.println(s_i); 
			
	}

}
