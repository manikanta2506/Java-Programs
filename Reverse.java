import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		int rev=0;
		while (n!=0)
		{
			int r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("The Reverse of the number is "+rev);
	}
}