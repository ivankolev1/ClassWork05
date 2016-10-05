import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long s = 1;
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i=1 ; i<=M ; i++)
		{
			s*=N;
		}
		System.out.println(s);
	}

}
