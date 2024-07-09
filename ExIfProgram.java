import java.util.Scanner;
class ExIfProgram
{
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int n=keyboard.nextInt();
		if (n%2==0)System.out.println("Even");
		else System.out.println("Odd");
	}
}