/*Chef likes strings a lot but he likes palindromic strings even more. Today he found an old string s in his garage. The string is so old that some of its characters have faded and are unidentifiable now. Faded characters in the string are represented by '.' whereas other characters are lower case Latin alphabets i.e ['a'-'z'].

Chef being the palindrome lover decided to construct the lexicographically smallest palindrome by filling each of the faded character ('.') with a lower case Latin alphabet. Can you please help him completing the task?
Input
First line of input contains a single integer T denoting the number of test cases. T test cases follow.
First and the only line of each case contains string s denoting the old string that chef has found in his garage.
Output
For each test case, print lexicographically smallest palindrome after filling each faded character - if it possible to construct one. Print -1 otherwise.
Constraints
1 ≤ T ≤ 50
1 ≤ |s| ≤ 12345
String s consists of ['a'-'z'] and '.' only.
Subtasks
Subtask #1 (47 points) 
1 ≤ T ≤ 50, 1 ≤ |S| ≤ 123

Subtask #2 (53 points) 
1 ≤ T ≤ 50, 1 ≤ |S| ≤ 12345
Example
Input 
3
a.ba
cb.bc
a.b

Output 
abba
cbabc
-1
Explanation
In example 1, you can create a palindrome by filling the faded character by 'b'.
In example 2, you can replace the faded character by any character from 'a' to 'z'. We fill it by 'a', as it will generate the lexicographically smallest palindrome.
In example 3, it is not possible to make the string s a palindrome.
*/
import java.util.*;
class FadedPalindromes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n -- > 0) {
			String str = sc.nextLine();
			int len = str.length();
			String first = "", second = "", mid = "";
			if (len % 2 == 0) {
				first += str.substring(0, len/2);
				second += str.substring(len/2);
			} else  {
				first += str.substring(0, len/2);
				second += str.substring(len/2+1);
				mid += str.substring(len/2, len/2+1);
			}
			if (mid.equals(".")) {
				mid = "a";
			}
			String res = "", mod1 ="", mod2 = "";

			int count = 0;
			for (int i = 0, j = 0,i_2 = second.length()-1; (i < first.length() && j < second.length()) &&(i_2 >=0 && j < second.length()); j ++) {
				if (first.charAt(i) == '.') {
					if (second.charAt((second.length()-1) - i) == '.') {
						mod1 += "a";
					} else {
						mod1 += second.charAt((second.length()-1) - i)+"";
					}
				} else {
					mod1 += first.charAt(i)+"";
				}
				i ++;
				if (second.charAt(j) == '.') {
					if (first.charAt((first.length()-1) - j) == '.') {
						mod2 += "a";
					} else {
						mod2 += first.charAt((first.length()-1) - j)+"";
					}
				} else {
					mod2 += second.charAt(j)+"";
				}
				
			}
			StringBuffer st2 = new StringBuffer(mod2);
			st2.reverse();
			String mod3 = st2.toString();
			// System.out.println(st1+"  "+st2);
			if (mod1.equals(mod3)) {
				if(n+1 == 1){
					System.out.print(mod1+mid+mod2);
				} else {
					System.out.println(mod1+mid+mod2);
				}
				
			} else{
				if(n+1 == 1){
					System.out.print("-1");
				} else {
					System.out.println("-1");
				}
				
			}
		}
	}
}