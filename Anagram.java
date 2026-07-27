class Anagram{
	public static void main(String... values)
	{
		str a="listen";
		str b="silent";
		
		char[] s1=a.toCharArray();
		char[] s2=b.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(a,b))
		{
			System.out.println("anagram");
		}
		else
			System.out.println(not anagram);
		
	}
}