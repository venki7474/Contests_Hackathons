import java.util.*;
class ChefRrun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		// int t = sc.nextInt(); sc.nextLine(), 
		int x = 0;
		while(x < t) {
			int n = Integer.parseInt(sc.nextLine());
			// int n = sc.nextInt(); sc.nextLine();
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			// System.out.println(Arrays.toString(arr));
			int count = 0;
			for (int i = 0; i < n; i ++) {
				int j = i+Integer.parseInt(arr[i])+1;
				if (j > n-1) {
					j = j - n;
				}
				int prev = Integer.MIN_VALUE, loop = 0; boolean flag = true;
				while (i != j) {
					j = j+Integer.parseInt(arr[j])+1;
					if (j > n-1) {
						j = j - n;
						loop++;
					}
					if (prev == j) {
						flag = false;
						// System.out.println("in prev");
						break;
					}
					if ((j > i) && (loop > 0 )) {
						flag = false;
						// System.out.println("in looper");
						break;
					}
					prev = j;
					
				}
				if (flag) {
					count ++;
				}
			}
			System.out.println(count);
			x++;
		}

	}
}
/*
3
4
1 1 1 1
4
3 0 0 0
4
0 0 0 2

*/