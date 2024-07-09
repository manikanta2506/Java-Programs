import java.util.Scanner;
class Factors_sum
{
	public static void main(String[] args)
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		//System.out.print("The factors of "+n+" are:");
		int sumOfFactors=0;
		for(int i=1;i<=n;++i)
			if (n%i==0) sumOfFactors+=i;
		System.out.println("Sum of the factors of "+n+" is "+sumOfFactors);
	}
}
		