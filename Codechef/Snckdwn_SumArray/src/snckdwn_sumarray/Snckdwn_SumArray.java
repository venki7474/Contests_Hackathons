/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snckdwn_sumarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Snckdwn_SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int num = sc.nextInt();sc.nextLine();
            int[] arr = new int[num];
            ArrayList<Long> list = new ArrayList();
            int indx = 0;
            while (num -- > 0) {
                list.add(sc.nextLong());
            }
            int k = 0;
            ArrayList<Long> frmx = new ArrayList();
            while (k < list.size()) {
                for (int i = k; i < list.size(); i ++) {
                    String str  = "";
                    ArrayList<Long> tp = new ArrayList();
                    for (int j = k; j <= i; j ++) {
//                       str += list.get(j)+"";
                        tp.add(list.get(j));
                    }
//                    System.out.println(tp);
                    long min = Long.MAX_VALUE;
                    long index = 0, sum = 0;
                    for (int m = 0; m < tp.size(); m ++) {
                        if (tp.get(m) <= min) {
                            min = tp.get(m);
                            index = m;
                        }
                    }
                    if (tp.size() > 1){
                        tp.remove(index);
                    }
                    for (int n = 0; n < tp.size(); n ++) {
                        sum += tp.get(n);
                    }
//                    sum = sum - min;
//                    System.out.println("test---: " + sum);
                    frmx.add(sum);
                }
                k++;
            }
            System.out.println(frmx);
            Collections.sort(frmx);
            System.out.println(frmx.get(frmx.size()-1));
        }
    }
}
