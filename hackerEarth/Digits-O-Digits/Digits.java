import java.util.*;
import java.io.*;
import java.lang.*;
public class Digits {
	public static void main(String[] args) throws IOException{
		try {
			int[] arr = new int[10];
			for (int j = 0; j < 10; j++) {
				arr[j] = 0;
			}
			// Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			String str = "";
			ArrayList<Integer> list = new ArrayList();
			for (int nu = 0; nu < num; nu ++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			for(int k = 0; k < list.size(); k++) {
				int n = 1;
				// str = new ArrayList();
				str = "";
				while (n <= list.get(k)) {
					str += n;
					n++;
				}
				for (int i = 0; i < str.length(); i ++) {
						int sub = Integer.parseInt(str.substring(i,i+1));
							arr[sub] += 1; 
				}
				for (int l = 0; l < 10; l ++) {
					System.out.print(arr[l] + " ");
				}
				System.out.println();
				for (int j = 0; j < 10; j++) {
					arr[j] = 0;
				}
			}
		}catch(IOException e) {
			// e.printStackTrace();
			return;
		}
	}
}