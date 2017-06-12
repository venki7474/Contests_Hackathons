import java.io.*;
import java.util.*;

public class BitSet{
	static int M ,N;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        int[] b1 = new int[M];
        int[] b2 = new int[M];
        // b1 =0;
        sc.nextLine();
        for (int i = 0; i < M; i++){
        	b1[i] = 0;
        	b2[i] = 0;
        }
        while (N > 0) {
        	String op = sc.next();
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	// sc.nextLine();
        	if (op.equals("AND")){
        		if (num1 == 1){
        			for (int j = 0; j < M; j ++) {
        				b1[j] = b1[j]*b2[j];
	        		}
	        	} else if (num1 == 2){
	        		for (int j = 0; j < M; j ++) {
        				b2[j] = b1[j]*b2[j];
	        		}
	        	}
	        	System.out.println(countSet(b1) + " " + countSet(b2));
        	}
        	if (op.equals("SET")){
        		if (num1 == 1) {
        			b1[num2] = 1;
        		} else if (num1 == 2){
        			b2[num2] = 1;
        		}
        		System.out.println(countSet(b1) + " " + countSet(b2));
        	}
        	if (op.equals("FLIP")) {
        		if(num1 == 1) {
        			b1[num2] = 1; 
        		} else if (num1 == 2) {
        			b2[num2] = 1;
        		}
        		System.out.println(countSet(b1) + " " + countSet(b2));
        	}
        	if (op.equals("OR")){
        		if (num1 == 1){
        			for (int j = 0; j < M; j ++) {
        				if (b1[j] == 1 && b2[j] == 1){
        					b1[j] = 1;
        				} else {
        					b1[j] = b1[j]+b2[j];
        				}
	        		}
	        	} else if (num1 == 2){
	        		for (int j = 0; j < M; j ++) {
	        			if (b1[j] == 1 && b2[j] == 1){
        					b2[j] = 1;
        				}else{
        					b2[j] = b1[j]+b2[j];
        				}
	        		}

	        	}
	        	System.out.println(countSet(b1) + " " + countSet(b2));
        	}
        	 else if (op.equals("XOR")) {
        		if (num1 == 1){
        			for (int j = 0; j < M; j ++) {
        				if (b1[j] == b2[j]){
        					b1[j] = 0;
        				}
        				 else {
        					b1[j] = b1[j]+b2[j];
        				}
	        		}
	        	} else if (num1 == 2){
	        		for (int j = 0; j < M; j ++) {
	        			if (b1[j] == b2[j]){
        					b2[j] = 0;
        				}else{
        					b2[j] = b1[j]+b2[j];
        				}
	        		}

	        	}
	        	System.out.println(countSet(b1) + " " + countSet(b2));
        	}
        	N --;
        }
    }
    static int countSet(int[] arr) {
        	int sum = 0;
        	for (int i = 0; i < M; i++) {
        		if (arr[i] == 1) {
        			sum +=1;
        		}
        	}
        	return sum;
        }
}