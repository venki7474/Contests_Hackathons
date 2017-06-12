/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snckdwn16_kitchen;

import java.util.Scanner;

 class SnckDwn16_kitchen {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t -- > 0){
            int num = sc.nextInt(); sc.nextLine();
            long[] arr1 = new long[num];
            long[] arr2 = new long[num];
            int n = 0 , m = 0;
            while (n < num) {
                arr1[n] = sc.nextLong();
                n ++;
            }
            sc.nextLine();
            while(m < num) {
                arr2[m] = sc.nextLong();
                m ++;
            }
//            sc.nextLine();
            long temp = 0, count = 0;
            for (int i = 0; i < num; i ++) {
//                if (i == 0) {
//                    if ((arr1[i] - temp ) >= arr2[i]) {
//                    count +=1;
//                    temp = arr1[i]; 
//                    }
//                } else {
                    if ((arr1[i] - temp ) >= arr2[i]) {
                        count +=1;
                        temp = arr1[i]; 
                    }
//                }
            }
            System.out.println(count);
                    
        }
    }
    
}
