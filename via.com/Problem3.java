/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
import java.io.*;

class Problem3 {
    public static void main(String args[] ) throws Exception {
        System.out.println("Input Format must be like: {5, 6, 2, 8, 10, 9, 8}")
        Scanner sc = new Scanner(System.in);
        String str_inp = sc.nextLine().trim();
        String parsed = str_inp.substring(1,str_inp.length()-1);
        // System.out.println(parsed);
        String[] arr = parsed.split(", ");
        //System.out.println(Arrays.toString(arr));
        int[] arr_int = new int[arr.length];
        for (int i = 0; i < arr.length ; i ++ ) {
         arr_int[i] = Integer.parseInt(arr[i]);
        }
        int start = arr_int[0], res = -1;
        loop1:for (int i = 1; i < arr_int.length; i ++) {
                if (start < arr_int[i]) {
                    res = arr_int[i];
                    i++;
                    while (i < arr_int.length) {
                        if (arr_int[i] > res) {
                            i++;
                        } else {
                            res = -1;
                            break loop1;
                        }
                    }
                
                }   
            }
            System.out.println(res);
    }
}
