import java.util.Scanner;

public class While {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int n = sc.nextInt(); 
		
		while (num<= n)
		{
			if(num%2==1)
			{
			System.out.println(num);
			}
			num ++;
		}
	}

}
