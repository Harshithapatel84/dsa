class RemoveDuplicate{
	public static void main(String... values)
	{
		int num[]={2,5,6,7,3,4,2,5,2};
		for(int i=0;i<num.length;i++)
		{
			boolean duplicate=false;
		for(int j=0;j<i;j++)
		{
			if(num[i]==num[j])
			{
				duplicate=true;
				break;
			}
		}
			 if (!duplicate) 
			 {
                System.out.print(num[i] + " ");
            }
		}
	}
}