class Vowel{
	public static void main(String... args)
	{
		String str="Hello world";
		int vowels=0;
		int consonents=0;
	    str=str.toLowerCase();
	    for(char ch:str.toCharArray())
		{
		if (ch >= 'a' && ch <= 'z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else{
				consonents++;
			}
		}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("consonents:"+consonents);
		
	}
}