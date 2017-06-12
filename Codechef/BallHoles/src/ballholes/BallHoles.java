/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballholes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chotu
 */
public class BallHoles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();sc.nextLine();
        while(numTest -->0) {
            int num = sc.nextInt();sc.nextLine();
            ArrayList<String> list = new ArrayList();
            for (int i = 1; i <= num ; i ++) {
                for (int j = 1; j <= num; j ++) {
                    String str= "";
                    if (i!=j) {
                        str += i+" "+j;
                        list.add(str);
                    }
                }
            }
            System.out.println(list);
        }
    }
    
}
