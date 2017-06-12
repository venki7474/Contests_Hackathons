import java.util.*;
public class ProductOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String inp_parsed = input.substring(1,input.length()-1);
		// System.out.println(inp_parsed);
		String[] inp_arr = inp_parsed.split(",");
		// System.out.println(Arrays.toString(inp_arr)); 
		int[] output_arr = new int[inp_arr.length];
		String[] output_str = new String[inp_arr.length];
		Arrays.fill(output_str,"");
		Arrays.fill(output_arr, 1);
		// System.out.println(Arrays.toString(output_arr));
		for (int i = 0; i < inp_arr.length; i ++) {
			String str = "";
			for (int j = 0 ; j < inp_arr.length; j ++) {
				if (i != j) {
					output_arr[i] = Integer.parseInt(inp_arr[j]) * output_arr[i];
					str += inp_arr[j] +"*";
				}
			}
			output_str[i] = str.substring(0,str.length()-1);
		}
		System.out.print(Arrays.toString(output_arr));
		System.out.println("("+Arrays.toString(output_str)+")");
	}
}