package question5;

public class Cubes {
	public static int cube(int i)
	{
		i = i*i*i;
		return i;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for(int i = 1; i <= N; i++)
		{
			System.out.println(i + " " + cube(i));
		}
	}

}
/* 
output:
		 1 1
		 2 8
		 3 27
*/