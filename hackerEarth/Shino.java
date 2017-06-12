import java.util.*;
import java.io.*;
class Shino {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();sc.nextLine();
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList();
		// System.out.println(str);
		for (int i = 0; i < str.length()-k; i ++) {
			// System.out.println("check");
			for (int j = i + k; j <= str.length(); j ++) {
				String st = str.substring(i,j);
				// System.out.println(st);
				Hashtable<String,String> ht = new Hashtable();
				for (int l = 0; l < st.length(); l ++) {
					String st2 = st.substring(l,l+1);
					ht.put(st2,st2);
				}
				if (ht.size() == k) {
					if (!arr.contains(st)){
						arr.add(st);
					}
				} else if (ht.size() > k){
					break;
				}

			}
		}
		System.out.println(arr.size());
	}
}