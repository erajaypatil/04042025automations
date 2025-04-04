package logicalPrograms;


public class Eg3 
{
	public static void main(String[] args)
	{
		//countwhitespace //countrepetedcharatersin string
		
	
		String name="Eng inee ri ng";
		String name1 = name.toLowerCase();
		int count=0;
		
		for(int i=0;i<=name1.length()-1;i++)
		{
			char temp = name1.charAt(i);
			if(temp=='e')
			{
				count++;
			}
		}
		System.out.println("total count is "+count);
	}
}
