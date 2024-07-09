import java.util.Scanner;
class Amstrong
{
	public static void main(String args[])
	{
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=scObj.nextInt();
		int tot=0,temp=n;
		while (n!=0)
		{
			int r=n%10;
			n=n/10;
			tot= tot+(r*r*r);
		}
		if (temp==tot)
			System.out.println("The given is an amstrong number");
		else
			System.out.println("The given is not an amstrong number");
	}
}