class MissElement{
	public static void main(String... values)
	{
		int arr[]={2,4,6,8,12};
		for(int i=0;i<arr.length-1;i++)
		{
			int num=arr[i+1]-arr[i];
			if(num > 2)
			{
				System.out.println("missing element:"+(arr[i]+2));
			}
		}
	}
}

class Element{
	public static void main(String... values)
	{
		int nums[]={1,2,3,5,6,7,8};
		int n=nums.length+1;
		int sum=n*(n+1)/2;
		int totalSum=0;
		for(int num:nums)
		{
			totalSum+=num;
		}
		int missing=sum-totalSum;
		System.out.println("missing element:"+missing);
		
		
	}
}