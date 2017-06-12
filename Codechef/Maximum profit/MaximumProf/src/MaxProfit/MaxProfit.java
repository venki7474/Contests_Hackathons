/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxProfit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Chotu
 */
class MaxProfit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();sc.nextLine();
        PriorityQueue<Long> pq = new PriorityQueue();
	while(n-->0) {
            long x = sc.nextInt();sc.nextLine();
	// list.add(x);
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
