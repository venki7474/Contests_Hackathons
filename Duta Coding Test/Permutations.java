import java.util.*;
public class Permutations {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// String inp_str = scan.nextLine();
		// // int inp = sc.nextInt();
		// ArrayList<String> list = new ArrayList();
		// ArrayList<String> output_list = new ArrayList();
		// for (int i = 0; i < inp_str.length(); i ++ ) {
		// 	String str = inp_str.substring(i,i+1);
		// 	list.add(str);
		// }
		// // System.out.println(list+"-----");
		// int l = 0;
		// while (l < list.size()) {
		// 	String str2 = list.get(l);
		// 	for(int j = 0; j < inp_str.length(); j ++) {
		// 		String temp_str = str2;
		// 		// System.out.println(Arrays.toString(visited));
		// 		if (!temp_str.contains(inp_str.substring(j, j+1)) ){
		// 			temp_str = temp_str + inp_str.substring(j, j+1);
		// 			list.add(temp_str);
		// 			if (temp_str.length() == inp_str.length()) {
		// 				if (!output_list.contains(temp_str)) {
		// 					output_list.add(temp_str);
		// 				}
		// 			}
		// 		}
		// 	}
		// 	l ++;
		// }
		// System.out.println(output_list.toString().substring(1,output_list.toString().length()-1));
		int[] num = {1,2,3,1};
		ArrayList<ArrayList<Integer>> list = permuteUnique(num);
		for (ArrayList<Integer> lt : list) {
			System.out.println(lt);
		}

	}
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
	ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
	returnList.add(new ArrayList<Integer>());
 
	for (int i = 0; i < num.length; i++) {
		Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
		for (List<Integer> l : returnList) {
			for (int j = 0; j < l.size() + 1; j++) {
				l.add(j, num[i]);
				ArrayList<Integer> T = new ArrayList<Integer>(l);
				l.remove(j);
				currentSet.add(T);
			}
		}
		returnList = new ArrayList<ArrayList<Integer>>(currentSet);
	}
 
	return returnList;
}
}