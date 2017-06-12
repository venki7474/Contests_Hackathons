import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class mouse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sentences = new ArrayList<String>();
        int number = sc.nextInt();
        sc.nextLine();
        int i = 0;
        while (i < number) {
            String str = sc.nextLine();
            sentences.add(str);
            i++;
        }
        int s = 0;
        while( s < sentences.size()) {
            String str = sentences.get(s);
            ArrayList<String> list = new ArrayList<String>();
            StringTokenizer st = new StringTokenizer(str, " ,.?");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                list.add(token);
            }
            // System.out.println(list);
            for (int j = 1; j < list.size(); j ++) {
                if (list.get(j).equals("mouse")) {
                    if (list.get(j-1).equals("the")) {
                      System.out.println("animal");
                    } else if (list.get(j-1).equalsIgnoreCase("A")) {
                        if (list.get(j+1).equals("in")) {
                          System.out.println("animal");
                        } 
                        else if (list.get(j+1).equals("is")) {
                          if ( !list.get(j+2).equals("in")) {
                            System.out.println("computer-mouse");
                          } else if (list.get(j+2).length() > 2) {
                            System.out.println("animal");
                          } 
                          else {
                            System.out.println("animal");
                          }
                        } else if (list.get(j+1).equals("on")) {
                          System.out.println("animal");
                        }
                    } else {
                      System.out.println("animal");
                    }
                } else if (list.get(j).contains("-mouse")) {
                  System.out.println("computer-mouse");
                }
            }
            s++;
        }
    }
}