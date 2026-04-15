class SelectName{
	public static void main(String... values)
	{
		String names[]={"kruthi","harshitha","rahul","ciya","rajath"};
		String selectedNames[]=new String[names.length];
		for(int i=0;i<names.length;i++)
		{
			selectedNames[i]=names[i];
		}
		for(String name:selectedNames)
			System.out.println(name);
	}
}