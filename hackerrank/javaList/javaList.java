import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            // System.out.println("enter the "+num+" elements");
            arr.add(sc.nextInt());
            num--;
        }
        int qNum = sc.nextInt();

        while(qNum>0){
            sc.nextLine();
            // System.out.println(" "+ qNum+"----");
            String str = sc.nextLine();
            if (str.equals("Insert")) {
                int index = sc.nextInt();
                int number = sc.nextInt();
                if(index > arr.size()-1){
                    arr.add(number);
                } else {
                    arr.set(index, number);
                }
            } else if (str.equals("Delete")){
                int rmIndex = sc.nextInt();
                arr.remove(rmIndex);
            }
            qNum --;
        }
        for(int l = 0; l < arr.size(); l++){
            System.out.print(arr.get(l) + " ");
        }
    }
}
