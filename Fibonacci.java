class Fibonacci
{
	public static void main(String args[])
	{
		int a=-1,b=1,c=0;
		//System.out.println(a);
		//System.out.println(b);
		while (c<10)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		//while (c<10);
	}
}