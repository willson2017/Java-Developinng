package question8;

import java.util.Scanner;

public class exception {
	
	public static void ChkN(int n) throws ArrayIndexOutOfBoundsException 
	{
		if (n > 3)
			throw new ArrayIndexOutOfBoundsException();
		
		int[] array = new int[3];		
		for(int i = 0; i < n; ++i)
		{
			array[i] = i;
			System.out.println(array[i]);
		}			
	}

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the value of N(N <= 3): ");		
		N = sc.nextInt();
		
		try {
			ChkN(N);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value of N should under 3!!!");
		}
		
		System.out.println("Input the value of N(N > 3): ");
		N = sc.nextInt();
		try {
			ChkN(N);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value of N should less than 3!!!");
		}
	
		sc.close();
		
	}

}
