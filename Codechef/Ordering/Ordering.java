import java.util.*;
class Ordering {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();sc.nextLine();
		while (t --> 0) {
			int num = sc.nextInt();sc.nextLine();
			int[] arr = new int[num];
			ArrayList<Integer> rank = new ArrayList();
			int indx = 0;
			while (indx < num) {
				arr[indx] = sc.nextInt();
				indx ++;
				rank.add(indx);
			}
			// System.out.println(Arrays.toString(arr));
			for ( int  i = 0 ; i < num; i ++) {
				int temp = arr[i];
				if (temp != 0) {
					int finl = i - temp;
					int ins = rank.remove(i);
					rank.add(finl, ins);
				}
			}
			// System.out.println(Arrays.toString(rank));
			for (int i = 0; i < num ; i ++ ) {
				System.out.print(rank.get(i) + " ");
			}
			System.out.println();
		}
	}
}