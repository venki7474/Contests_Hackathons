/*
 Consider the following algorithm to generate a sequence of numbers. Start with an  integer n. If n is even, divide by 2. If n is odd, multiply by 3 and add 1. Repeat this process with the new value of n, terminating when n = 1. For example, the following sequence of numbers will be generated for 
					n = 22: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 It is
conjectured (but not yet proven) that this algorithm will terminate at n = 1 for every integer n. Still, the conjecture holds for all integers up to at least 1, 000, 000. For an input n, the cycle-length of n is the number of numbers generated up to and including the 1. In the example above, the cycle length of 22 is 16. Given any two numbers i and j, you are to determine the maximum cycle length over all numbers between i and j, including both endpoints.

Input 
The input will consist of a series of pairs of integers i and j, one pair of integers per line. All integers will be less than 1,000,000 and greater than 0. Output For each pair of input integers i and j, output i, j in the same order in which they appeared in the input and then the maximum cycle length for integers between and including i and j. Thesethree numbers should be separated by one space, with all three numbers on one line and with one line of output for each
line of input. 

Sample Input 
1 10
100 200
201 210
900 1000

Sample Output 
1 10 20
100 200 125
201 210 89
900 1000 174

Test Cases:
===========

Input #1:
1 10
100 200
201 210
900 1000

Output #1:
1 10 20
100 200 125
201 210 89
900 1000 174

Input #2:
3 19
101 250
1 9000
1 9001

Output #2:
3 19 21
101 250 128
1 9000 262
1 9001 262

Input #3:
100 200
201 210
101 250
1 9000
900 90000
1 90000

Output #3:
100 200 125
201 210 89
101 250 128
1 9000 262
900 90000 351
1 90000 351

Input #4:
8 500
9 400
89000 90000
90000 100000
90000 90001
90000 90000
1 100000

Output #4:
8 500 144
9 400 144
89000 90000 315
90000 100000 333
90000 90001 165
90000 90000 165
1 100000 351
 */
package conjectured;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Venkatesh
 */
public class Conjectured {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
//        List<Integer> arr = new ArrayList();
        int max = Integer.MIN_VALUE;
        int i = sc.nextInt(); int j = sc.nextInt(); sc.nextLine();
        for (int m = i; m <= j; m ++){
            int temp = m;
            int count = 1;
            while(temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp /2;
                    count += 1;
                } else {
                    temp = temp * 3 + 1;
                    count += 1;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
    
}
