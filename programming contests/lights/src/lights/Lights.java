
package lights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lights {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> myList = new ArrayList<Integer>(Collections.nCopies(num, 0));
                
//        System.out.println(myList);
        int i = 1;
        while (i <= num) {
            for (int j = 0; j < num; j ++){
                if ((j+1)%i == 0) {
                    if (myList.get(j) == 1){
                        myList.set(j, 0);
                    } else if (myList.get(j) == 0) {
                        myList.set(j, 1);
                    }
                }
            }
            i++;
        }
        for (int k: myList) {
            if (k == 1) {
                System.out.print("Yes ");
            } else if (k == 0) {
                System.out.print("No ");
            }
        }
    }
    
}
