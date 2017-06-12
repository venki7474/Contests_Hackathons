import java.util.*;
import java.lang.*;
public class prob1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String res ="";
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreTokens()){

			String token = st.nextToken();
			if (token.length() > 3 ){

				res = res +" "+token;
			}
			res = res.trim();

		}
		System.out.println(res);

	}
}