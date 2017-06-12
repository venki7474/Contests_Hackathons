public class StringToCharArray 
{
	public static void main(String[] args)
	{

		String s1 = "<HTML> <body><a href=\"http://www.google.com\"></a></body></HTML>";
		char[] s1InCharArray = s1.toCharArray();
		
		for(char temp: s1InCharArray)
		{

			System.out.println(temp);
			
		}
	}
}