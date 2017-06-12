import java.util.*;
public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt(); sc.nextLine();
		String inp = sc.nextLine();
		String[] inp_arr = inp.split(" ");
		// System.out.println(Arrays.toString(inp_arr));
		int count = 0;
		for (int i = 0; i < n-1; i ++) {
			for (int j = i+1; j < n; j ++) {
				// System.out.println(inp_arr[i] +" "+inp_arr[j]);
				if((Integer.parseInt(inp_arr[i]) + Integer.parseInt(inp_arr[j]))%k == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
/*
6 3
1 3 2 6 1 2
*/