class Duplicate{
	public static void main(String... values)
	{
	int num[]={2,4,5,6,3,4};
	for(int i=0;i<num.length;i++)
	{
	for(int j=i+1;j<num.length;j++)	
	{
		if(num[i]==num[j])
		{
			System.out.println("duplicate number is:"+num[i]);
		}
	}
	}
	}
}