class Min{
	public static void main(String... values)
	{
		int num[]={5,6,8,2};
		int min=num[0];
		int max=num[0];
		for(int no:num)
		{
			if(no<min)
			{
				min=no;
			}
			if(no>max)
			{
				max=no;
			}
		}
		System.out.println(min+","+max);
	}
}