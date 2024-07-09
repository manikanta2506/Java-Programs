import java.util.Scanner;
class EvenOddCount
{
	public static void main(String args[])
	{
		System.out.println("Enter a positive integer");
		Scanner scObj=new Scanner(System.in);
		int num=scObj.nextInt();
		System.out.println("Even number count = "+(num/2));
		if (num%2==0)
			System.out.println("Odd number count = "+(num/2));
		else
			System.out.println("Odd number count = "+(num/2+1));
	}
}
		