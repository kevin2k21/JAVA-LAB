import java.util.*;

/*public class MyClass
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int fact = 1;
		for(int i = 1; i <= n;i++)
		{
			fact = fact * i;
		}
		System.out.println("the factorial of "+ n + " is " + fact);
	}
}*/

/*public class MyClass
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int n1 = 0, n2 = 1;
		System.out.print(n1 + "\t" + n2);
		for(int i = 0; i < n-2;i++)
		{
			int ans = n1 + n2;
			n1 = n2;
			n2 = ans;
			System.out.print("\t"+ans);
		}
		System.out.println();
	}
}*/

public class MyClass
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int n1 = n;
		int sum = 0;
		while(n1 != 0)
		{
			int d = n1 % 10;
			sum = sum + d*d*d;
			n1 = n1/10;
		}
		if(sum == n)
			System.out.println("The given number is an amstrong number");
		else
			System.out.println("The given number is not an amstrong number");
	}
}
