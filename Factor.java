import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{
		System.out.println("Enter any positive integer");
		Scanner scObj=new Scanner(System.in);
		int n=scObj.nextInt();
		int sumOfFactors=0,factorsCount=0;
		System.out.print("Factors of "+n+" are: ");
		for (int i=1;i<=n/2;i++)
			if (n%i==0)
			{
				System.out.print(i+" ");
				sumOfFactors+=i;
				factorsCount+=1;
			}
		System.out.println();
		System.out.println("Number of factors of "+n+" is: "+factorsCount);
		System.out.println("Sum of factors of "+n+" is: "+sumOfFactors);
	}
}