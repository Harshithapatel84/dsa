class MinAndMax{
	public static void main(String... values)
	{
		int num[]={61,78,54,45};
		int min=num[0];int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
			if(num[i]>max)
			{
				max=num[i];
			}
			
		}
		System.out.println("min no is:"+min);
		System.out.println("max no is:"+max);
		
	}
}