import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Superman {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        int h = sc.nextInt();
        // sc.nextLine();
        int i = sc.nextInt(); 
        int j = 0;
        ArrayList<ArrayList> main = new ArrayList<ArrayList>();
        while( j < n) {
        	int k = sc.nextInt(); 
        	ArrayList mini = new ArrayList();
        	for (int l = 0; l < k; l ++) {
        		int floor = sc.nextInt(); 
        		mini.add(floor);
        	}
        	Collections.sort(mini);
        	main.add(mini);
        	j++;
        } 
        for (int m = 0; m < main.size(); m++ ) {
        	System.out.println(main.get(m));
        }
    }
}