
import java.util.StringTokenizer;

public class App 
{
	public static void main(String[] args) 
	{

		String str = "A quick brown fox jumps over the lazy dog";

		StringTokenizer st = new StringTokenizer(str);

		 
		while (st.hasMoreElements()) 
		{

				System.out.println(st.nextElement());

		
		}

	}
}
