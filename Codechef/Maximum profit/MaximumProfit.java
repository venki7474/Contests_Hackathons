import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class MaximumProfit {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();sc.nextLine();
        PriorityQueue<Long> pq = new PriorityQueue();
	while(n-->0) {
            long x = sc.nextInt();sc.nextLine();
            pq.add(x);
	}
        ArrayList<Long> arr = new ArrayList();
        while(pq.size() != 0) {
            long temp = pq.size();
            long ext = pq.poll();
            arr.add(temp*ext);
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
    } 
}
