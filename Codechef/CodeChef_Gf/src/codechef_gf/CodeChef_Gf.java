/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef_gf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CodeChef_Gf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(Collections.nCopies(100000000,""));
//        ArrayList<String> arr = new ArrayList<>();
        String str = sc.nextLine();
        int len = str.length();
        int i = 0, count = 0, index = 0;
        while (i < len){
            if (str.charAt(i) == '(') {
                count += 1;
//                arr.set(index, "");
                index += 1;
            } else if (str.charAt(i) ==')') {
                count += -1;
                arr.set(index, arr.get(index)+(count));
                index += -1;
            } else {
                arr.set(index, arr.get(index)+str.charAt(i));
            }
            i++;
        }
//        System.out.println(arr); 
        int high = Integer.MIN_VALUE;
        String finl = "";
        for (String st : arr) {
            if (!st.equals("")) {
                if(Integer.parseInt(st.substring(st.length()-1)) >= high) {
                    finl = "";
                    finl += st.substring(0,st.length()-1);
                }
            }
        }
        System.out.println(finl);
    }
}
