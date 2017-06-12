/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            // System.out.println("hello world");
            String str = br.readLine();
            if (str.length() == 1) {
                if ((int)str.charAt(0)>97) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
             else if (str.length() > 1) {
                int count = -1;
                int num1 = 0;
                
                int k = 0;
                while (k < str.length()) {
                    if ((int)str.charAt(k) != 97) {
                        count ++;
                    } else {
                        if ((int)str.charAt(k+1) == 97) {
                            k++;
                            count ++;
                            continue;
                        }
                        num1 = 97;
                        break;
                    }
                    k++;
                }
                for (int j = k; j < str.length(); j ++) {
                    
                    if (num1 == (int)str.charAt(j)-1 || ((int)str.charAt(j) == 97 && num1 == 99)) {
                        num1 = (int)str.charAt(j);
                        // System.out.println("in--"+num1);
                    }else {
                        count ++;
                        // num1 = num1 + 1;
                    }
                }
                System.out.println(count);
            }
        }
        // System.out.println("Hello World!");
    }
}
