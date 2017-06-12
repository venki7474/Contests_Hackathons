import java.util.*;
public class MinProductArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		Integer[] firstArr = new Integer[Integer.parseInt(input[0])];
		Integer[] secondArr = new Integer[Integer.parseInt(input[0])];

		for(int i = 0; i < firstArr.length; i++) {
			firstArr[i] = sc.nextInt();
		}
		for(int i = 0; i < secondArr.length; i++) {
			secondArr[i] = sc.nextInt();
		}
		
		int min = 999999;

		for(int i = 0; i < firstArr.length; i++) {
			int temp = firstArr[i];
			if(firstArr[i] < 0 && secondArr[i] < 0) {
				for(int j = 0; j < Integer.parseInt(input[1]); j++) {
					firstArr[i] = firstArr[i] + 2;
				}
			} else if(firstArr[i] < 0 && secondArr[i] >= 0) {
				for(int j = 0; j < Integer.parseInt(input[1]); j++) {
					firstArr[i] = firstArr[i] - 2;
				}
			} else if(firstArr[i] >= 0 && secondArr[i] < 0) {
				for(int j = 0; j < Integer.parseInt(input[1]); j++) {
					firstArr[i] = firstArr[i] + 2;
				}
			} else if(firstArr[i] >= 0 && secondArr[i] >= 0) {
				for(int j = 0; j < Integer.parseInt(input[1]); j++) {
					firstArr[i] = firstArr[i] - 2;
				}
			}
			int sum = 0;
			for(int j = 0; j < firstArr.length; j++) {
				sum = sum + firstArr[j] * secondArr[j]; 
			}
			if(sum < min) {
				min = sum;
				// System.out.println(min);
			}
			firstArr[i] = temp;
		}
		System.out.print(min);

	}
}