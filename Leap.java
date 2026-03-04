class Leap{
	public static void main(String[] values)
	{
			int year=2024;
			if((year % 4 == 0) && (year % 100!=0))
			{
				System.out.println("leap year:"+year);
			}
			else
			{
				System.out.println("not leap year:"+year);
			}
	}

	
}