import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class BallCombination {
	public static void main(String[] vb) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		BigInteger numerator = new BigInteger(findFactorial(n).toString());
		BigInteger sum = new BigInteger(1 + "");
		for(int i = 2; i <= k; i = i + 2) {
			
			BigInteger denominator = new BigInteger(findFactorial(i).multiply(findFactorial(n - i)).toString());
			sum = sum.add(numerator.divide(denominator));
		}
		System.out.print(sum.toString());
		// long num2 = Math.pow(10,9)+7;
		// BigInteger mo;
		// mo = BigInteger.valueOf(num2);
		// System.out.print((sum.mod(mo))+"");
	}

	public static BigInteger findFactorial(int num) {
		BigInteger fact= BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        return fact;
	}

}