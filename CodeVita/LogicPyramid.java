import java.util.*;
import java.io.*;
class LogicPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (n*(n+1)/2),i = 1, init = 6;
		ArrayList<String> arr = new ArrayList();
		arr.add("0000"+init);
		while (i < m) {
			int temp = init + (6 + 16*i);
			init = temp;
			// arr.add(temp+"");
			int len = (temp+"").length();
			if (len < 5) {
				String res = "";
				int j = 0;
				while(j != (5-len)) {
					res += "0";
					j++;
				}
				res += temp + "";
				arr.add(res);
			} else if (len == 5) {
				arr.add(temp+"");
			}
			i ++;
		}
		// System.out.println(arr);
		int k = 1, x = 0;
		while (k <= n) {
			int l = n - k;
			while (l -- > 0) {
				System.out.print(" ");
			}
			int count = 0;
			for (; x < arr.size(); x ++) {
				if (count < k) {
					if (count == k-1) {
						System.out.print(arr.get(x));
					} else {
						System.out.print(arr.get(x)+" ");
					}
					count++;
				} else {
					break;
				}
			}
			System.out.println();
			k++;
		}
	}
}