import java.util.*;
import java.io.*;
public class CivilWar {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        while (N -- > 0) {
        	String inp = br.readLine();
        	String inp_1 = inp.toLowerCase();
        	Hashtable<Character, Integer> hash = new Hashtable();
        	hash.put('a',0);hash.put('e',0);hash.put('i',0);hash.put('o',0);hash.put('u',0);
        	int count = 0;
        	for (int i = 0; i < inp_1.length(); i ++) {
        		if (hash.containsKey(inp_1.charAt(i))) {
        			count++;
        		}
        	}
        	System.out.println(count);
        }
	}
}
