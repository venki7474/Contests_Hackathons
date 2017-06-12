import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Richie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();in.nextLine();
        String number = in.nextLine();
        ArrayList<String> forChar = new ArrayList();
        for (int i = 0; i < number.length(); i ++) {
        	String str = number.substring(i,i+1);
        	if(!forChar.contains(str)) {
        		forChar.add(str);
        	}
        }
        int indx = 0;
        while()
    }
}
