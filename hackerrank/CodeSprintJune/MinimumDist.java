import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        Hashtable<Integer,ArrayList<Integer>> ht = new Hashtable();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i ++) {
        	if (!ht.containsKey(A[i])) {
        		ArrayList<Integer> arr = new ArrayList();
        		arr.add(i);
        		ht.put(A[i],arr);
        	} else {
        		ArrayList<Integer> arr2 = ht.get(A[i]);
        		// arr2.add(i);
        		int num = arr2.get(0);
        		int finl = Math.abs(num-i);
        		// System.out.println(finl);
        		if (finl <= min) {
        			min = finl;
        		}
        	}
        }
        if (min > 100000) {
        	System.out.println("-1");
        } else {
        	System.out.println(min);
        }
    }
}
