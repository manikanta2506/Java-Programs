import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n=obj.nextInt();
		int sumOfFactors=0;
		for(int i=1;i<n;++i)
			if (n%i==0) sumOfFactors+=i;
		if (sumOfFactors==n) System.out.println(n+" is a perfect number");
		else System.out.println(n+" is not a perfect number");
	}
}