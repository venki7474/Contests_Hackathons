import java.io.*;
import java.util.*;
public class CandidateCode 
{ 
	public static void main(String[] args) {
		System.out.println( distributeCadbury(3,6,4,6));
	}
    public static int distributeCadbury(int input1,int input2,int input3,int input4)
    {
    	ArrayList<String> arr = new ArrayList();
    	for (int i = input1; i <= input2; i ++) {
    		for (int j = input3; j <= input4; j ++) {
    			arr.add(i+"*"+j);
    		}
    	}
    	int count = 0 ;
    	for (int i = 0; i < arr.size(); i ++) {
    		String str = arr.get(i);
    		String[] ar = new String[2];
    		StringTokenizer st = new StringTokenizer(str,"*");
    		while(st.hasMoreTokens()) {
	    		int m = Integer.parseInt(st.nextToken()); 
	    		int n = Integer.parseInt(st.nextToken());
	    		if (m == n) {
	    			count ++;
	    		} else {
		    		while (m != n) {
		    			if (m > n) {
		    				count ++;
		    				m = m - n;
		    			} else {
		    				n = n - m;
		    				count ++;
		    			}
		    		}
		    		count ++;
		    	}
	    	}
    	}
    	return count;
    }
}