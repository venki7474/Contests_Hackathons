/*
You are given the equation tanα=pq and a positive integer, n. Calculate tannα. There are T test cases.

Input Format

The first line contains T, the number of test cases. 
The next T lines contain three space separated integers: p,q and n, respectively.

Constraints 
0⩽p⩽109 
1⩽q⩽109 
1⩽n⩽109 
T⩽104
Output Format

If the result is defined, it is always a rational number. However, it can be very big. 
Output the answer modulo (109+7). 
If the answer is ab and b is not divisible by (109+7), there is a unique integer 0⩽x<109+7 where a≡bxmod(109+7). 
Output this integer, x. 
It is guaranteed that b is not divisible by (109+7) for all test cases.

Sample Input

2
2 1 2
5 6 7
Sample Output

666666670
237627959
Explanation

If tanα=21 then tan2α=−43 and −4≡3×666666670mod(109+7). 
So, the answer is 666666670.
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
        for(int i = 0; i < n; i++){
        	int p = sc.nextInt();
        	int q = sc.nextInt();
        	int n = sc.nextInt();
        	tan(p,q,n);
        }
    }
    static double tanX= 0;
    public static tan(int p, int q, int n){
    	tanX = p / q ;
    	double forTanNx(n);
    }
}