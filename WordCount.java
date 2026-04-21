class WordCount{
	public static void main(String... values)
	{
		
		String sentence="java is a object oriented language";
		int count=1;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)== ' '){
				count++;
			}
		}
		System.out.println("count is:"+count);
	}
}