/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primecodechef;

import java.util.Scanner;

class PrimeCodeChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();sc.nextLine();
        while(num --> 0) {
            long start = sc.nextInt(); long end = sc.nextInt();sc.nextLine();
            for (long i = start; i <= end; i ++ ){
//                if (checkPrime(i)){
//                    System.out.println(i);
//                }
                for (long j = 2; j < i; j ++) {
                    if (Math.pow(j, i)%i == j%i){
                        System.out.println(i);
                    }
                }
            }
        }
    }
    public static boolean checkPrime(long i) {
        if (i <= 1) {
            return false;
        } else if (i <= 3) {
            return true;
        } else if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        long n = 5;
        while (n*n <= i) {
            if (i % n == 0 || i % (n+2) == 0) {
                return false;
            }
            n = n + 6;
        }
        return true;
    }
    
}
