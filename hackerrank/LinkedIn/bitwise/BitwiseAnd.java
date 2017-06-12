import java.util.*;
public class BitwiseAnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t -- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();sc.nextLine();
            int min = 0;
            for (int i = n-1; i > 0; i--) {
                for (int j = i + 1; j <= n; j ++) {
                    int temp = i&j;
                    if (temp > min && temp < k){
                        min = temp;
                    }
                }
            }
            System.out.println(min);
        }
	}
}
/*
3
5 2
8 5
2 2

*/