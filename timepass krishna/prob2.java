import java.util.*;
import java.lang.*;
public class prob2{
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words:");
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			array.add(token);
		}
		String result = "";
		for(int j = 0; j < array.size(); j++) {
			int ascii = 0;
			String item = array.get(j);
			for (int i = 1; i <= item.length(); i++) {
				// int m = i + 1;
				if ((i) % 2 == 0) {
					ascii = (int)(item.charAt(i-1)) + 3;
					result = result + (char)(ascii);
				} else {
					ascii = (int)(item.charAt(i-1)) + 2;
					result = result + (char)(ascii);
				}
			}
			result = result + " ";
		}
		
		System.out.println(result);
	}
}