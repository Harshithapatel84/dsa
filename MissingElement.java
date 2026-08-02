class MissingElement{
	public static void main(String args[])
	{
		int[] arr={1,2,3,5};
		int n=arr.length+1;
		int expSum=n*(n+1)/2;
		int actualSum=0;
		for(int i=0;i<arr.length;i++)
		{
			actualSum=actualSum+arr[i];
			
		}
		int missing=expSum-actualSum;
		System.out.println("missing element is:"+missing);
		
		
	}
}