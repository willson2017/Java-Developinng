package question9;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		ArrayList <Integer> records = new ArrayList<Integer>();
		int n = 20;
		
		for(int number = 2; number <= 20; number++)
		{
			boolean isPrime = true;
			//clear the old values
			records.clear();
			
			for(int factor = 2; factor < number; factor++)
			{				
				if (number % factor == 0)
				{
					isPrime = false;
					//add the factors to an array
					records.add(factor);
				}
			}
			if(isPrime)
			{
				System.out.println(number + " is prime.");
			}
			else
			{
				System.out.println(number + " is composite.");
				System.out.println("The factors include " + records.toString());
			}
		}

	}

}
