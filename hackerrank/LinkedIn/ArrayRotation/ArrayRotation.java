import java.util.*;
public class ArrayRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[5];
		int temp = n - k;
		while (temp < n) {
			arr[temp] = sc.nextInt();
			temp++;
		}
		if (n != k) {
			int index = 0;
			while(index < n-k) {
				arr[index] = sc.nextInt();
				index++;
			}
		}
		for (int i = 0; i < n; i ++) {
			System.out.print(arr[i]+" ");
		}
	}
}