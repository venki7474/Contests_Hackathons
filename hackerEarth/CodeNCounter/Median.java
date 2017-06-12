import java.util.*;
import java.lang.*;
import java.text.*;
class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double median = 0.00, sum = 0.00;
		int i =1;
		ArrayList<Integer> arr = new ArrayList();
		while (i <= n) {
			int num = sc.nextInt();
			arr.add(num);
			Collections.sort(arr);
			if(arr.size() % 2 == 0) {
				int temp2_index = arr.size() / 2;
				int temp1_index = temp2_index - 1;
				median = (double)(arr.get(temp1_index) + arr.get(temp2_index)) / 2;
			} else {
				int temp_index = arr.size() / 2;
				median = (double)arr.get(temp_index);
			}
			DecimalFormat numberFormat = new DecimalFormat("#.00");
			System.out.print(numberFormat.format(median)+" ");
			i++;
		}
	}
}