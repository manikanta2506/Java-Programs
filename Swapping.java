class Swapping
{
	public static void main(String args[])
	{
		int a=5,b=3,temp=0;
		System.out.println("a="+a+" b="+b);
		//temp=a;
		//a=a+b;
		//b=a-b;
		//a=a-b;
		b=a+b-(a=b);
		System.out.println("a="+a+" b="+b);
	}
}	