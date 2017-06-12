import java.util.*;
public class NthHighest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp_str = scan.nextLine();
		int n = 0;
		StringTokenizer st = new StringTokenizer(inp_str, " ");
		String inp_parsed = "";
		while (st.hasMoreTokens()) {
			inp_parsed = st.nextToken();
			n = Integer.parseInt(st.nextToken());
		}
		inp_parsed = inp_parsed.substring(1, inp_parsed.length()-2);
		// System.out.println(n +" "+ inp_parsed);
		String[] inp_arr_str = inp_parsed.split(",");
		ArrayList<Integer> new_op_list = new ArrayList<Integer>();
		// Collections.sort(list);
		for (int i = 0; i < inp_arr_str.length; i++) {
			new_op_list.add(Integer.parseInt(inp_arr_str[i]));
		}
		// System.out.println(new_op_list);
		if (n <= new_op_list.size()) {
			System.out.println(new_op_list.get(new_op_list.size() - n ));
		} else {
			System.out.println("Entered number is out of range");
		}
	}
}
