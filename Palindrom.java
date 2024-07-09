import java.util.Scanner;
class Palindrom
{
	public static void main(String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		int rev=0,temp=n;
		while (n!=0)
		{
			int r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if (temp==rev)
			System.out.println("The number is palindrom");
		else
			System.out.println("The number is not palindrom");
	}
}