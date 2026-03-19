class Prime{
	public static void main(String... values)
	{
		int num=5;
		int factor=0;
		for(int i=1;i<=num;i++)
		{
			if(num % i==0)
			{
				factor++;
			}
		}
		if(factor==2)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}
}