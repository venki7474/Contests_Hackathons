import java.util.*;

public class Closest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int k = sc.nextInt();
		int  i = 0;
		while (i < num) {
			arr[i] = sc.nextInt();
			i++;
		}
		int n = 99999, output = 0, final1 = 0;
		for (int j = 0; j < arr.length; j ++ ) {
			// System.out.println(arr[j]);
			int m = Math.abs(arr[j] - k);
			if (m < n){
			 n = m;
			 output = arr[j];
			}
			if ( m == n) {
				if(output < arr[j]) {
					output = arr[j];
				}
			}
		}
		System.out.println(output);
	}
}