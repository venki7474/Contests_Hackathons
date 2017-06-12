import java.util.*;
class ShortestPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// StringTokenizer st = new StringTokenizer(input, "{}#")
		String[] input_arr = input.split("[{}\\,]");
		System.out.println(Arrays.toString(input_arr));
	}
}