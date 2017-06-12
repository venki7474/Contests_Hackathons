/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;
import java.io.*;

class Problem1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max_len = 0;
        boolean res_flag = false;
        for (int i = 0; i < str.length(); i ++) {
            for (int j = i+1; j <= str.length(); j ++) {
                String sub_str = str.substring(i,j);
                System.out.println(sub_str);
                if (sub_str.length() > 0) {
                    res_flag = checkPal(sub_str);
                    if (res_flag) {
                        int temp_len = sub_str.length();
                        if (max_len < temp_len) {
                            //System.out.println(sub_str);
                            max_len = temp_len;
                        }
                    }
                }
            }
        }
        System.out.println(max_len);

        
        //combinations("", "venki");
    }
    public static boolean checkPal(String inp) {
        int last = inp.length()-1;
        int mid_len = inp.length()/2;
        for (int i = 0; i < mid_len; i ++, last --) {
            if (inp.charAt(i) != inp.charAt(last)) {
                return false;
            } 
        }
        return true;
    }
    public static void combinations(String suffix,String prefix){
        if(prefix.length()<0)return;
        System.out.println(suffix);
        for(int i=0;i<prefix.length();i++)
         combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
    }
}
