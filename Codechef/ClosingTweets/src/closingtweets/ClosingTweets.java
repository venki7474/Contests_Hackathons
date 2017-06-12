/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closingtweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Chotu
 */
class ClosingTweets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int m = sc.nextInt(); sc.nextLine();
        int[] arr = new int[n]; Arrays.fill(arr, 0);
        ArrayList<Integer> list = new ArrayList();
        while(m -- > 0) {
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str," ");
            while (st.hasMoreTokens()) {
                String tk = st.nextToken();
                if (tk.equals("CLICK")){
                    int indx = Integer.parseInt(st.nextToken());
                    if (arr[indx - 1] == 0) {
                        arr[indx - 1] = 1;
                    } else {
                        arr[indx - 1] = 0;
                    }
                    int count = 0;
                    for (int i = 0; i < n; i ++) {
                        if (arr[i] == 1) {
                            count++;
                        }
                    }
                    list.add(count);
                } else if (tk.equals("CLOSEALL")){
                    Arrays.fill(arr, 0);
                    list.add(0);
                }
            }
        }
//        System.out.println(list);
        for (int a : list) {
            System.out.println(a);
        }
    }
    
}
