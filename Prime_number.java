import java.util.Scanner;
class Prime_number
{
	public static void main(String[] args)
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		int count=0;
		for (int i=1;i<=n;i++)
			if (n%i==0) count++;
		if (count==2) System.out.println("It's a prime Number");
		else System.out.println("It's not a prime Number");
	}
}