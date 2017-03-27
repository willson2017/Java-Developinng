package question7;

public class Vectors {

	public static void main(String[] args) {
		
		double[] x = {0.3, 0.6, 0.1};
		double[] y = {0.5, 0.1, 0.4};
		
		int N = x.length;
		
		double sum = 0.0;
		System.out.println("  i \t" + "  Sum \t");
		
		for(int i = 0; i < N; i++)
		{
			sum += x[i]*y[i];
			System.out.print("  " + i + "\t");
			System.out.print("  " + sum  + "\t" + "\n");
		}
	}

}

/*
  output:
			  i 	  	Sum 	
			  0	  		0.15	
			  1	  		0.21	
			  2	  		0.25	
*/