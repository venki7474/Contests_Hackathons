/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joeychallenge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chotu
 */
public class JoeyChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t -- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = new int[n];
			int i = 0;
			ArrayList<Integer> list = new ArrayList();
			while (i < n) {
				// arr[i] = sc.nextInt();
				list.add(sc.nextInt());
				i++;
			}sc.nextLine();
			String s_str = sc.nextLine();
			BigInteger s = new BigInteger(s_str);
			// System.out.println(s+";");
			BigInteger res = new BigInteger("");
                        String res_str = "";
			while (list.size() > 0) {
				int temp = list.remove(0);
                                res_str = res_str + temp+" ";
                                BigInteger big_temp = new BigInteger(temp+"");
				if ((res.add(big_temp).compareTo(s))==0) {
                                    break;
                                }
                                int temp2 = list.remove(list.size()-1);
                                res_str = res_str + temp+" ";
                                BigInteger big_temp2 = new BigInteger(temp2+"");
				if ((res.add(big_temp2).compareTo(s))==0) {
                                    break;
                                }
			}
                        System.out.println(res_str);
		}
    }
    
}
