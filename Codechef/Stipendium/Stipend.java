import java.util.*;
import java.io.*;

class Stipend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t -- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			int[] arr = new int[n];
			int i = 0,sum = 0;
			boolean flag = false, merit = false;;
			while (i<n){
				arr[i] = sc.nextInt();
				sum = sum+arr[i];
				if (arr[i] <= 2) {
					flag = true;
				}
				if (arr[i] == 5){
					merit = true;
				}
				i++;
			}
			double avg = 0;
			avg = sum/n;
			// System.out.println(Arrays.toString(arr));
			// System.out.println(avg);
			if (flag == false && merit == true && avg >= 4.0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}