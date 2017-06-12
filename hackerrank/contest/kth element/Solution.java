import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int i = 0;
        int[] arr = new int[N];
        while(i < N) {
            arr[i] = sc.nextInt();
            i++;
        }
        i = 0;
        int X=0,K=0,type=0,temp=0;
        System.out.println("test: " + Q);
        while( i < Q) {
            X = sc.nextInt();
            K = sc.nextInt();
            type = sc.nextInt();
            if (type == 0) {
                for (int l = 0; l < N; l++) {
                    if (arr[l] == X ) {
                        temp = l;
                        break;
                    }
                }
                if (temp+K > N || temp ==0) {
                    System.out.println("-1");
                }else {
                    System.out.println(arr[temp+K]);
                }
            } else if (type == 1) {
                for (int l = 0; l < N; l++) {
                    if (arr[l] == X ){
                        temp = l;
                        break;
                    }
                } 
                if (temp == 0 ){
                    System.out.println("-1");
                } else{
                System.out.println(arr[temp-K]);}
            }
            i++;
        }
    }
}