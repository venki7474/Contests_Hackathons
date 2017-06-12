
/*
Problem Statement

Aleksa is having a New Year's Eve party! His house has a magic doorway that only allows 1 person to enter per 1 second, and he knows n people will show up.

If two guests arrive at same time, one guest must wait for the other to enter. If two guests arrive at different times, the guest arriving first must enter first.

Given the arrival times for all n guests, determine the entry time of the last guest.

Input Format

The first line contains an integer, n, denoting the number of guests. 
The second line contains n integers, t0,t1,...,tn−1, where ti is the arrival time of ith guest.

Constraints

1≤n≤105
1≤t0≤t1≤....≤tn−1≤106

Output Format

Print the time that the last guest enters the magic doorway.

Sample Input 1:

8
2 2 2 2 4 4 4 6 
Sample Output 1:

9
Sample Input 2:

3
2000 2015 2015
Sample Output 2:

2016
Explanation

For Sample 1: 
We know from our constraints that each arrival time ti≤ti+1. If we refer to s as the second when an event occurs, then:

Guest 0 arrives at s=2 and enters at s=2.
Guest 1 arrives at s=2 and enters at s=3.
Guest 2 arrives at s=2 and enters at s=4.
Guest 3 arrives at s=2 and enters at s=5.
Guest 4 arrives at s=3 and enters at s=6.
Guest 5 arrives at s=3 and enters at s=7.
Guest 6 arrives at s=3 and enters at s=8.
Guest 7 arrives at s=6 and enters at s=9.

Thus, the last guest (7) enters at s=9.

For Sample 2: 
Guest 0 arrives at s=2000 and enters at s=2000.
Guest 1 arrives at s=2015 and enters at s=2015.
Guest 2 arrives at s=2015 and enters at s=2016.

Thus, the last guest (3) enters at s=2016.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Newyear {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        for(int i=0; i < n; i++){
            t[i] = in.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j ++){
        	if(j == 0){
        		count = t[j];
        	} else {
        		if (t[j] <= count) {
        			count ++;
        		} else if (t[j] > count){
        			count = t[j];
        		}
        	}
        }
        System.out.println(count);
}
}