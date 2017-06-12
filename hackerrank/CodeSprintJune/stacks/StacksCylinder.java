import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StacksCylinder {
	static int finl = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        // System.out.println("output:-- "+check(h1,h2,h3););
        check(h1,h2,h3);
        System.out.println(finl);
    }
    public static void check(int[] h1, int[] h2, int[] h3) {
    	
    	int one = weight(h1);
    	int two = weight(h2);
    	int three = weight(h3);
    	
    	if (one == two && one == three) {
    		finl = one;
    		return ;
    	}
    	if (one  >= two && one >= three) {
    		h1 = pop(h1);
    	} else if (two >= one && two >= three) {
    		h2 = pop(h2);
    	}
    	 else if (three >= one && three >= two) {
    		h3 = pop(h3);
    	}
    	// couple more conditions to be checked

    	check(h1,h2,h3);
    }
    public static int weight(int[] arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i ++) {
    		sum += arr[i];
    	}
    	return sum;
    }
    public static int[] pop(int[] arr) {
    	int[] temp = new int[arr.length-1];
    	for (int i = 0; i < arr.length-1; i ++) {
    		temp[i] = arr[i+1];
    	}
    	return temp;
    }

}
