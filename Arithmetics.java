import java.util.Scanner;
class Arithmetics
{
	public static void main(String args[])
	{
		System.out.println("Enter any two integers to perform arithmetic operations");
		Scanner scObj=new Scanner(System.in);
		int x=scObj.nextInt();
		int y=scObj.nextInt();
		System.out.println("x"+"+"+"y"+"="+(x+y));
		System.out.println("x"+"-"+"y"+"="+(x-y));
		System.out.println("x"+"*"+"y"+"="+(x*y));
		System.out.println("x"+"%"+"y"+"="+(x%y));
		System.out.println("x"+"/"+"y"+"="+(x/y));
	}
}
		