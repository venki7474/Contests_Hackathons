import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Newyeargame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // your code goes here
            int s1 = 0,s2 = 0;
            for (int i = 0; i < n; i ++ ) {
                s1 = a[i];
                while(a.length != 0) {
                    s1 = s1 + a[j];
                    for (int x = 0; x < a.length; x ++){
                        if (x == j){

                        }
                    }
                    int j = rand.nextInt(a.length);
                    s2 = s2 + a[j];
                }

            }
            

        }
    }
}
