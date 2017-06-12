import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInt {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Write your code here.
      boolean status = n.isProbablePrime(1);
       if (status) {
           System.out.println("prime");
       } else {
           System.out.println("not prime");
       }
   }
}
