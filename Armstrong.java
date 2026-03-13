class Armstrong{
	public static void main(String... args)
	{
		int num=156;
		int original=num;
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(sum==original)
		{
			System.out.println("it is armstrong");
		}
		else
			System.out.println("not.....");
	}
}