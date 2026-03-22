class ArmStrong{
	public static void main(Strinh[] args)
	{
		int num=121;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num%10;
			if(sum==num)
			{
				System.out.println("no is armStrong");
			}
			else
				System.out.println("not armstronh");
		}
	}
}