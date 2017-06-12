/*

Chef has a number D containing only digits 0's and 1's. He wants to make the number to have all the digits same. For that, he will change exactly one digit, i.e. from 0 to 1 or from 1 to 0. If it is possible to make all digits equal (either all 0's or all 1's) by flipping exactly 1 digit then output "Yes", else print "No" (quotes for clarity)
Input
The first line will contain an integer T representing the number of test cases.
Each test case contain a number made of only digits 1's and 0's on newline
Output
Print T lines with a "Yes" or a "No", depending on whether its possible to make it all 0s or 1s or not. 
Constraints
Subtask #1: (40 points) 
1 ≤ T ≤ 50
1 ≤ Length of the number D ≤ 50

Subtask #2: (60 points) 
1 ≤ T ≤ 10
1 ≤ Length of the number D ≤ 105
Example
Input:
2
101
11
Output:
Yes
No
Explanation
Example case 1. In 101, the 0 can be flipped to make it all 1..
Example case 2. No matter whichever digit you flip, you will not get the desired string.

*/
import java.util.*;
class FlippingCoins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n -- > 0) {
			String str = sc.nextLine();
			int one_count = 0, zero_count = 0;
			for (int i = 0; i < str.length(); i ++) {
				if (str.charAt(i) == '0') {
					zero_count += 1;
				} else if (str.charAt(i) == '1') {
					one_count += 1;
				}
			}
			// if (Math.abs(zero_count - one_count) == 1) {
			if (one_count == 1 || zero_count == 1 && one_count != zero_count) {
				if (n+1 == 1){
					System.out.print("Yes");
				} else {
					System.out.println("Yes");
				}
			} else {
				if (n+1 == 1){
					System.out.print("No");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
