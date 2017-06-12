import java.util.*;
public class ConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine().trim());
		String str = Integer.toBinaryString(num);
		System.out.println(Integer.toBinaryString(num));
		int count = 0, prev = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) =='1') {
				count++;
				if (count >= prev){
					prev = count;
				}
			} else if (str.charAt(i)=='0') {
				count=0;
			}
		}
		System.out.println(prev);
	}
}