/*
Keko has N dots in a 2-D coordinate plane. He wants to measure the gap between the most distant two dots. To make the problem easier, Keko decided to change each dot's x or y coordinate to zero.

Help Keko calculate the distance!

Input Format

The first line contains an integer, N, the number of dots. 
The next N lines each contain the integer coordinates of the dots in (x,y) fashion.

Constraints 
2≤N≤106 
−109≤xi,yi≤109
It is guaranteed that all dots are distinct, and either their x or y coordinate is equal to 0.

Output Format

Print the distance between the most distant dots with an absolute error of, at most, 10−6.

Sample Input

4
-1 0
1 0
0 1
0 -1
Sample Output

2.000000
Explanation

In the sample, the most distant dots are located at (−1,0) and (1,0). 
The distance between them is 2.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static double distance = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<long[]> arr = new ArrayList<long[]>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
        	long[] xy = new long[2];
        	xy[0] = sc.nextInt();
        	xy[1] = sc.nextInt();
        	arr.add(xy);
        }
        // System.out.println(arr.get(0).length);
        // float distance = 0;
        for (int j = 0; j < num ; j++){
        	long[] p1 = arr.get(j);
        	for (int k = 0; k < num; k ++){
                if (j != k){
        		  long[] p2 = arr.get(k);
        		  double tempDis = dis(p1, p2);
        		  if (tempDis > distance){
        		  	   distance = tempDis;
        		  }
                }
        	}
        }
        System.out.println(distance);
    }
    public static double dis(long[] p1, long[] p2) {
    	long x1,x2,y1,y2;
    	double d;
    	x1 = p1[0]; y1 = p1[1];
    	x2 = p2[0]; y2 = p2[1];
    	d = (((x2-x1)*(x2-x1))+ ((y2-y1)*(y2-y1)));
    	return d;
    }
}