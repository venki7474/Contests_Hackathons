import java.util.*;
import java.io.*;
public class SubMask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int[] set = new int[n+1];
		Arrays.fill(set,0);
		int m = sc.nextInt();sc.nextLine();
		while (m -- > 0) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			// System.out.println(arr.length);
			if (arr[0].equals("1")) {
				// System.out.println("check");
				int val = Integer.parseInt(arr[1]);
				String query = arr[2];
				boolean flag = false;
				for (int i = 0; i < query.length(); i ++) {
					int index = Integer.parseInt(query.substring(i, i+1));
					if (index == 0) {
						// flag = true;
						set[0] = val;
					} else {
						set[i+1] = val;
					}
				}
			} else if (arr.length == 3 && arr[0].equals("2")) {
				int val = Integer.parseInt(arr[1]);
				String query = arr[2];
				boolean flag = false;
				for (int i = 0; i < query.length(); i ++) {
					int index = Integer.parseInt(query.substring(i, i+1));
					if (index == 0) {
						// flag = true;
						set[0] = set[0] ^ val;
					} else {
						set[i+1] = set[i+1] ^ val;
					}
				}
			} else if (arr[0].equals("3")) {
				String query = arr[1];
				for (int i = 0; i < query.length(); i ++) {
					int index = Integer.parseInt(query.substring(i, i+1));
					if (index == 1) {
						System.out.println(set[i+1]);
					}
				}
			}
			// System.out.println(Arrays.toString(set));
		}
	}
}

/*
3 4
1 3 110
3 100
2 1 011
3 010

*/