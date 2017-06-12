import java.util.*;
class MaxSubArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();sc.nextLine();    
    while (t -- > 0) {
            int n = sc.nextInt();sc.nextLine();
            int[] arr = new int[n];
            for (int i = 0; i < n; i ++ ) {
                arr[i] = sc.nextInt();
            }
            int newSum =arr[0];
            int max = arr[0];
            for (int i = 1; i < n; i ++) {
                newSum = Math.max(newSum + arr[i], arr[i]);
                max = Math.max(max, newSum);
            }
            if (t >= 1){
                System.out.println(max);
            } else {
                System.out.print(max);
            }
        }
    }
}
/*2
5
-1 2 3 5 -4
5
1 2 3 -4 7
*/