class SumNumber{
	public static void main(String... value){
	int sum=0;
	int num=12345;
	for(int i=num;i>0;i=i/10)
	{
		sum+=i%10;
	}
	System.out.println(sum);
	}
}