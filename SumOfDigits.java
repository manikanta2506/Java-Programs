import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter a multi digit number");
		int n=scObj.nextInt();
		int sumOfDigit=0;
		while (n!=0)
		{
			int rem=n%10;
			n=n/10;
			sumOfDigit+=rem;
		}
		System.out.println("Sum of digits of the given number is: "+sumOfDigit);
	}
}