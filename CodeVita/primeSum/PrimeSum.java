import java.util.*;
import java.io.*;
public class PrimeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		// String  primeNumbers = "";
		int count = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {		  	  
			int counter=0; 	  
			for(int num =i; num>=1; num--) {
				if(i%num==0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				numbers.add(i);
				int sum = 0;
				
				for(int j = 0; j < numbers.indexOf(i); j++) {
					sum = sum + numbers.get(j);
					if(sum == i) {
						count++;
					} else if (sum > i) {
						break;
					}
				}
			}	
		}
		System.out.println(count);
	}
}