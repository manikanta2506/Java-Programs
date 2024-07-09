import java.util.Scanner;
class Patterns1
{
	public static void main(String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer to print how many number of rows:");
		int n=scObj.nextInt();
		for (int i=1;i<=n;i=i+2)
		{
			for (int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}