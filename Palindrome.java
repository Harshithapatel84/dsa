class Palindrome{
	public static void main(String[] args)
	{
	int num[]={121,123};
	for(int i=0;i<num.length;i++){
		int original=num[i];
		int rev=0;
		for(int j=num[i];j>0;j=j/10)
		{
		int digit=j%10;
	    rev=rev*10+digit;
		}
		if(rev==original)
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
	}
}