/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidsinacademy;

/**
 *
 * @author Chotu
 */
import java.util.ArrayList;
import java.util.Scanner;
public class KidsInAcademy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tCases = sc.nextInt();sc.nextLine();
        ArrayList<String> finl = new ArrayList();
        while(tCases-->0) {
            int num = sc.nextInt();sc.nextLine();
            long[] arr = new long[num];
            for (int i = 0; i < num; i ++) {
                arr[i] = sc.nextInt();
            }
            int count = 2; boolean flag = false;
            ArrayList<String> list = new ArrayList();
            for (int i = 0; i < num; i ++) {
//                System.out.println(arr[i]);
                if (i+2 <= num-1) {
                    if (arr[i+2] == arr[i]+arr[i+1]) {
//                        count +=1;
                        if (!list.contains(i)) {
                            list.add(i+"");
                        }
                        if (!list.contains(i+1)) {
                            list.add((i+1)+"");
                        }
                        if (!list.contains(i+2)) {
                            list.add((i+2)+"");
                        }
                        flag =true;
                    }
                }
            }
            if (flag) {
//                System.out.println(list.size());
                finl.add(list.size()+"");
            } else {
//                System.out.println("0");
                finl.add(list.size()+"");
            }
        }
        for (String st : finl) {
            System.out.println(st);
        }
    }
    
}
