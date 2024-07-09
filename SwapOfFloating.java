import java.util.Scanner;
class SwapOfFloating
{
	public static void main(String args[])
	{
		System.out.println("Enter any two floating points");
		Scanner scObj=new Scanner(System.in);
		float x=scObj.nextFloat();
		float y=scObj.nextFloat();
		float temp=0;
		System.out.println("Before swapping x= "+x+" y= "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping x= "+x+" y= "+y);
	}
}