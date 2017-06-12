import java.util.*;
class SubSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n -- > 0) {
			String str = sc.nextLine();
			ArrayList<String> list = new ArrayList();
			for (int i = 0; i < str.length(); i++)  {
				list.add(str.substring(i, i+1));
			}
			// System.out.println(list);
			// Collections.sort(list);
			// System.out.println(list);
			ArrayList<String> final_list = new ArrayList();
			for (int i = 0; i < list.size(); i ++) {
				String res = "";
				for (int j = i; j < list.size(); j ++) {
					res += list.get(j);
					// System.out.print(res);
					final_list.add(res);
				}
			}
			Collections.sort(final_list);
			// System.out.println(final_list);
			for (String str1 : final_list) {
				System.out.print(str1);
			}
		}
	}
}