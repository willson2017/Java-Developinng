package question7;

import java.util.Scanner;

public class Matrics {

	public static void displayMatric(int m, int n)
	{
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] c = new int[m][n];
		
		int i = 0; 
		int j = 0;
		
		Scanner input = new Scanner(System.in);
		
		//input the value for arrays a
		for(i = 0; i < m; i++)
		{
			System.out.println("Enter the [" + (i+1) + "] rows number for A");
			for (j = 0; j < n; j++)
			{
				a[i][j] = input.nextInt();
			}
		}
		
		//input the value for arrays b
		for(i = 0; i < m; i++)
		{
			System.out.println("Enter the [" + (i+1) + "] rows number for B");
			for (j = 0; j < n; j++)
			{
				b[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Matric C's values are: ");
		for(i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");				
			}
			System.out.println();
		}
		
		input.close();		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers of rows: ");
		int row = sc.nextInt();
		System.out.println("enter numbers of columns: ");
		int col = sc.nextInt();
		
		displayMatric(row, col);
		sc.close();
	}

}
