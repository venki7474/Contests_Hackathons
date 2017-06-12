import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int len = S.length();
        // int count = len / 3 ;
        int i = 0, total = 0;

        while(i <= len-3) {
        	String seg = S.substring(i, i+3);
        	if (seg.equals("SOS")) {

        	} else {
        		total ++;
        	}
        	i = i+3;
        }
        System.out.println(total);
    }
}
