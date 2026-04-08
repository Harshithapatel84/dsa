class Largest{
	public static void main(String... values)
	{
		int num[]={5,7,2,4};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int no:num)
		{
			if(no > largest)
			{
				secondLargest=largest;
				largest=no;
			}
			 else if (no>secondLargest && no!=largest) 
			 {
                secondLargest = no;
			 }
		}
        System.out.println("Second Largest: " + secondLargest);
	}
}