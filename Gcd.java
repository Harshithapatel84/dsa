class Gcd{
	public static void main(String... values)
	{
		int a=6,b=5;
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println("gcd of two number is:"+a);
	}
}