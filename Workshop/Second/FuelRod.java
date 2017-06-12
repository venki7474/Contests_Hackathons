/*
We have found an interesting algorithm which may be used for the optimization of our fuel system.
If we will divide a fuel rod into several pieces following the Triangular numbers law, then we appear to generate more power.
Our goal is to divide the fuel rod in several pieces.
The length of the rod is N meters. All of the parts should have integer lengths (1, 2, 3 .. meters, but not 1.2).
You should divide the fuel rod so that the lengths form a consecutive fragment 
of the Triangular numbers series with the maximum quantity (fragment's length).
The parts should have different lengths (no repeating). 

For example: 64 should divided at 15, 21, 28, 
because 28, 36 is shorter and 1, 3, 15, 45 is not a consecutive fragment.
You are given the length of the fuel rod (N).
You should return a list of lengths (integers) for the parts in ascending order.
If it's not possible and the problem does not have a solution, 
then you should return an empty list.
64  ================================================================
28  ----------------------------
21  ---------------------
15  ---------------
371 =====================================
91  ---------
78  --------
66  -------
55  ------
45  -----
36  ----
Input: The length of the rod as an integer.
Output: The fragments of the fuel rod as a list of integers (sorted in ascending order) or an empty list.
Example:
64 == [15, 21, 28]
371 == [36, 45, 55, 66, 78, 91]
225 == [105, 120]
882 == []
Precondition: 
0 < length < 1000

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FuelRod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
	}
}