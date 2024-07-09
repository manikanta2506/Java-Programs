import java.util.Scanner;
class Patterns2
{
	public static void main (String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer :");
		int n=scObj.nextInt();
		int a=0;
		if (n%2==0)
			a=n/2;
		else
			a=n/2+1;
		int i=1;
		//System.out.println(a);
		for(i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println();
		}
		for(i=a+1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
				System.out.print("*"+" ");
			System.out.println();
		}
	}
}