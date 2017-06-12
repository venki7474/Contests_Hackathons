import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProbPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();sc.nextLine();
		int[] arr = new int[num];
		for (int i = 0; i < num; i ++) {
			arr[i] = sc.nextInt();
		}
		// System.out.println(Arrays.toString(arr));
		
		for (int i = 2; i <= num/2; i ++) {

			if (num % i == 0) {
				num = num - 1;
				i = 1;
			} 
		}
		int finl = 0, max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			finl = 0;
			for (int j = i; j < i+num && j < arr.length; j++) {
				finl += arr[j];
			}
			// System.out.println(finl);
			if (finl >= max) {
				max = finl;
			}
		}
		System.out.println(max);
	}
}