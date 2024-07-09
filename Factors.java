import java.util.Scanner;
class Factors
{
	public static void main(String[] args)
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		System.out.print("The factors of "+n+" are:");
		for(int i=1;i<=n;++i)
			if (n%i==0) System.out.print(i+" ");
	}
}
		