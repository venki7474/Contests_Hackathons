import java.io.BufferedReader;
import java.io.InputStreamReader;


class Fizz {
    public static void main(String args[] ) throws Exception {
       
        // * Read input from stdin and provide input before running

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        int Num = Integer.parseInt(numStr);
        while (Num --> 0) {
            String N_str = br.readLine();
            int N = Integer.parseInt(N_str);
            for (int i = 1; i <= N; i++) {
                // System.out.println("hello world");
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }    
                 else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else if (i % 3 == 0 && i % 5 == 0 ) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}