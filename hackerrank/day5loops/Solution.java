/*
Welcome to Day 5! Check out the video review of loops here, or just jump right into the problem.

In this problem you will test your knowledge of loops. Given three integers a, b, and N, output the following series:

a+2^0*b,a+2^0*b+2^1*b,......,a+2^0*b+2^1*b+...+2^N−1*b
Input Format

The first line will contain the number of testcases T. Each of the next T lines will have three integers, a, b, and N.

Constraints

0≤T≤500
0≤a,b≤50
1≤N≤15
Output Format

Print the answer to each test case in a separate line.

Sample Input

2    
5 3 5
0 2 10
Sample Output

8 14 26 50 98
2 6 14 30 62 126 254 510 1022 2046
Explanation

There are two test cases. 
In the first case: a=5, b=3 ,N=5 
1st term =   5+(20×3)=8 
2nd term = 5+(20×3)+(21×3)=14 
3rd term =  5+(20×3)+(21×3)+(22×3)=26 
4th term =  5+(20×3)+(21×3)+(22×3)+(23×3)=50 
5th term =  5+(20×3)+(21×3)+(22×3)+(23×3)+(24×3)=98

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
        int num = sc.nextInt();
        int i = 0;
        while(i < num){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int n = sc.nextInt();
        	int sum = a;
        	for (int j = 0; j < n; j++){
        		sum = sum + (((int)Math.pow(2,j))*b);
        	}
        	System.out.println();
        	i++;
        }
    }
}