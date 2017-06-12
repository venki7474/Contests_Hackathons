/*
Let D(X) be a function that calculates the digit product of X in base 10 without leading zeros. For instance:

D(0)=0 
D(234)=2×3×4=24 
D(104)=1×0×4=0

You are given three positive integers A,B and K. Determine how many integers exist in the range [A,B] whose digit product equals K. Formally speaking, you are required to count the number of distinct integer solutions of X where A⩽X⩽B and D(X)=K.

Input Format

The first line contains T, the number of test cases. 
The next T lines each contain three positive integers: A, B and K, respectively.

Constraints 
T⩽10000 
1⩽A⩽B⩽10100 
1⩽K⩽1018

Output Format

For each test case, print the following line:

Case X:Y
X is the test case number, starting at 1. 
Y is the number of integers in the interval [A,B] whose digit product is equal to K.

Because Y can be a huge number, print it modulo (109+7).

Sample Input

2
1 9 3
7 37 6
Sample Output

Case 1: 1
Case 2: 3
Explanation

In the first test case, there is only one number (3) in the interval [1,9].

In the second test case, there are three numbers (16,23,32) in the interval [7,37] whose digit product equals 6.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++){
        	long a = sc.nextInt();
        	long b = sc.nextInt();
        	long k = sc.nextInt();
        	int count = calculate(a,b,k);
        	System.out.println("Case "+ (i+1) +": "+count);
        }
    }
    static int calculate(long a, long b, long k) {
    	int count = 0;
    	for (long i = a; i <= b; i ++) {
    		long res = 1;
    		if (i < 10 ) {
    			if (i == k){
    				count ++;
    			}
    		} else {
    			long temp = i;
    			while (temp > 9 ) {
    				res = res * (temp % 10);
    				temp = temp / 10;
    			}
    			res = res * temp;
    			if (res == k) {
    				count ++;
    			}
    			// System.out.println("test");
    		}
    	}
    	return count;
    }
}