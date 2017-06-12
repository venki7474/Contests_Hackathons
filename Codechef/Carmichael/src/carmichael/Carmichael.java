/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmichael;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chotu
 */
public class Carmichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(true) {
            ArrayList<Integer> list = new ArrayList();
            int num = sc.nextInt();sc.nextLine();
            if (num == 0) {
                break;
            } else {
                for (int i = 3; i < num; i ++) {
                    if (num % i == 0) {
                        System.out.println(i);
                        list.add(i);
                    }
                }
                boolean flag = false;
                for (int j = 0; j < list.size(); j ++) {
                    int count = 0;
                    for (int k = 1; k < list.get(j); k ++) {
                        if (list.get(j) % k == 0) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        flag = true;
                    }
                }
                if (list.size() == 0 || list.size() == 1) {
                    System.out.println(num+" is normal");
                }else {
                    if (flag) {
                        System.out.println("The number "+num+" is Carmichael number");
                    } else {
                        System.out.println("Not Posible");
                    }
                }
                
            }
        }
    }
    
}