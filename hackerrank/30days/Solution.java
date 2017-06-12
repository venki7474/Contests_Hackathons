import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// print('5')
// print('5 3')
// print('0 -1 2 1 3')
// print('4 2')
// print('0 -1 2 1')
// print('6 4')
// print('-1 -2 0 1 3 2')
// print('3 1')
// print('0 -1 1')
// print('7 4')
// print('-2 -1 0 1 3 4 2')
public class Solution {
	public static void main(String[] args) {
		int t = 5;
		int[] n = {5,4,6,3,7};
		int[] k = {3,2,4,1,4};
		int[] a1 = {0,-1,2,1,3};
		int[] a2 = {0,-1,2,1};
		int[] a3 = {-1,-2,0,1,3,2};
		int[] a4 = {0,-1,1};
		int[] a5 = {-2,-1,0,1,3,4,2};

		System.out.println(t);
		System.out.println(n[0]+ " "+ k[0]);
		for (int i = 0; i < a1.length ; i++ ) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.println(n[1]+ " "+ k[1]);
		for (int i1 = 0; i1 < a2.length ; i1++ ) {
			System.out.print(a2[i1]+" ");
		}
		System.out.println();
		System.out.println(n[2]+ " "+ k[2]);
		for (int i2 = 0; i2 < a3.length ; i2++ ) {
			System.out.print(a3[i2]+" ");
		}
		System.out.println();
		System.out.println(n[3]+ " "+ k[3]);
		for (int i3 = 0; i3 < a4.length ; i3++ ) {
			System.out.print(a4[i3]+" ");
		}
		System.out.println();
		System.out.println(n[4]+ " "+ k[4]);
		for (int i4 = 0; i4 < a5.length ; i4++ ) {
			System.out.print(a5[i4]+" ");
		}
	}
}